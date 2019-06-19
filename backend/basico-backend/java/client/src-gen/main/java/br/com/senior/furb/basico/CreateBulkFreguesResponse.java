/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkFreguesOutput;

/**
 * Response method for createBulkFregues
 */
@CommandDescription(name="createBulkFreguesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkFreguesResponse")
public interface CreateBulkFreguesResponse extends MessageHandler {

	void createBulkFreguesResponse(CreateBulkFreguesOutput response);
	
	void createBulkFreguesResponseError(ErrorPayload error);

}
