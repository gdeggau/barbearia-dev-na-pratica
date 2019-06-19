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
 * Response method for updateMergeAtendimento
 */
@CommandDescription(name="updateMergeAtendimentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeAtendimentoResponse")
public interface UpdateMergeAtendimentoResponse extends MessageHandler {

	void updateMergeAtendimentoResponse(Atendimento response);
	
	void updateMergeAtendimentoResponseError(ErrorPayload error);

}
