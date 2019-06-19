/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Atendimento;

/**
 * Response method for retrieveAtendimento
 */
@CommandDescription(name="retrieveAtendimentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveAtendimentoResponse")
public interface RetrieveAtendimentoResponse extends MessageHandler {

	void retrieveAtendimentoResponse(Atendimento response);
	
	void retrieveAtendimentoResponseError(ErrorPayload error);

}
