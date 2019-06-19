/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Servico;

/**
 * Response method for createServico
 */
@CommandDescription(name="createServicoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createServicoResponse")
public interface CreateServicoResponse extends MessageHandler {

	void createServicoResponse(Servico response);
	
	void createServicoResponseError(ErrorPayload error);

}
