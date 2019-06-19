/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportAtendimentoOutput;

/**
 * Response method for exportAtendimento
 */
@CommandDescription(name="exportAtendimentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportAtendimentoResponse")
public interface ExportAtendimentoResponse extends MessageHandler {

	void exportAtendimentoResponse(ExportAtendimentoOutput response);
	
	void exportAtendimentoResponseError(ErrorPayload error);

}
