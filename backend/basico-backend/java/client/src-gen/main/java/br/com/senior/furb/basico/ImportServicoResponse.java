/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportServicoOutput;

/**
 * Response method for importServico
 */
@CommandDescription(name="importServicoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importServicoResponse")
public interface ImportServicoResponse extends MessageHandler {

	void importServicoResponse(ImportServicoOutput response);
	
	void importServicoResponseError(ErrorPayload error);

}
