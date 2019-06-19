/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportServicoOutput;

/**
 * Response method for exportServico
 */
@CommandDescription(name="exportServicoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportServicoResponse")
public interface ExportServicoResponse extends MessageHandler {

	void exportServicoResponse(ExportServicoOutput response);
	
	void exportServicoResponseError(ErrorPayload error);

}
