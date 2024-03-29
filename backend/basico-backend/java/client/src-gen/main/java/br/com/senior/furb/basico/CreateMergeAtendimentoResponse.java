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
 * Response method for createMergeAtendimento
 */
@CommandDescription(name="createMergeAtendimentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeAtendimentoResponse")
public interface CreateMergeAtendimentoResponse extends MessageHandler {

	void createMergeAtendimentoResponse(Atendimento response);
	
	void createMergeAtendimentoResponseError(ErrorPayload error);

}
