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
 * Response method for updateAtendimento
 */
@CommandDescription(name="updateAtendimentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateAtendimentoResponse")
public interface UpdateAtendimentoResponse extends MessageHandler {

	void updateAtendimentoResponse(Atendimento response);
	
	void updateAtendimentoResponseError(ErrorPayload error);

}
