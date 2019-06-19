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
 * Response method for createAtendimento
 */
@CommandDescription(name="createAtendimentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createAtendimentoResponse")
public interface CreateAtendimentoResponse extends MessageHandler {

	void createAtendimentoResponse(Atendimento response);
	
	void createAtendimentoResponseError(ErrorPayload error);

}
