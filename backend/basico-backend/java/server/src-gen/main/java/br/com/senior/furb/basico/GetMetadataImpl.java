/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.ErrorCategory;
import java.io.IOException;
import br.com.senior.MetadataService;
import javax.inject.Inject;

@Lazy
@HandlerImpl
@Component("furb.basico.getMetadata")
public class GetMetadataImpl implements GetMetadata, MessageHandler {
	
	private MetadataService metadataService;

	@Inject
	public GetMetadataImpl(MetadataService metadataService) {
		this.metadataService = metadataService; 
	}

	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput request) {
		String format = (request.metadataFormat == null || request.metadataFormat.isEmpty()) ? "sd.xml" : request.metadataFormat;
		try {
			String content = metadataService.getMetadata("furb", "basico", format);
			return new GetMetadataOutput(content);
		} catch (IllegalArgumentException e) {
			throw new ServiceException(ErrorCategory.BAD_REQUEST, "The metadataFormat does not exists", e);
		} catch (IOException e) {
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "Could not read metadata due to an I/O error", e);
		}
	}
}
