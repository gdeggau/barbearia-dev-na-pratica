/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkAtendimentoOutput;

/**
 * Response method for createBulkAtendimento
 */
@CommandDescription(name="createBulkAtendimentoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkAtendimentoResponse")
public interface CreateBulkAtendimentoResponse extends MessageHandler {

	void createBulkAtendimentoResponse(CreateBulkAtendimentoOutput response);
	
	void createBulkAtendimentoResponseError(ErrorPayload error);

}
