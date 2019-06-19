/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkServicoOutput;

/**
 * Response method for createBulkServico
 */
@CommandDescription(name="createBulkServicoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkServicoResponse")
public interface CreateBulkServicoResponse extends MessageHandler {

	void createBulkServicoResponse(CreateBulkServicoOutput response);
	
	void createBulkServicoResponseError(ErrorPayload error);

}
