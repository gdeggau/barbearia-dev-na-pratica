/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listServico
 */
@CommandDescription(name="listServicoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listServicoResponse")
public interface ListServicoResponse extends MessageHandler {

	void listServicoResponse(Servico.PagedResults response);
	
	void listServicoResponseError(ErrorPayload error);

}
