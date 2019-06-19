/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportFreguesOutput;

/**
 * Response method for exportFregues
 */
@CommandDescription(name="exportFreguesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportFreguesResponse")
public interface ExportFreguesResponse extends MessageHandler {

	void exportFreguesResponse(ExportFreguesOutput response);
	
	void exportFreguesResponseError(ErrorPayload error);

}
