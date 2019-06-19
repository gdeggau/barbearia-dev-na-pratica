/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listAtendimento
 */
@CommandDescription(name="listAtendimentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listAtendimentoResponse")
public interface ListAtendimentoResponse extends MessageHandler {

	void listAtendimentoResponse(Atendimento.PagedResults response);
	
	void listAtendimentoResponseError(ErrorPayload error);

}
