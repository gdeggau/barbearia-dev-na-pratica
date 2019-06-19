/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportAtendimentoOutput;

/**
 * Response method for importAtendimento
 */
@CommandDescription(name="importAtendimentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importAtendimentoResponse")
public interface ImportAtendimentoResponse extends MessageHandler {

	void importAtendimentoResponse(ImportAtendimentoOutput response);
	
	void importAtendimentoResponseError(ErrorPayload error);

}
