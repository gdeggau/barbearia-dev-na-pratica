/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Fregues;

/**
 * Response method for createFregues
 */
@CommandDescription(name="createFreguesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createFreguesResponse")
public interface CreateFreguesResponse extends MessageHandler {

	void createFreguesResponse(Fregues response);
	
	void createFreguesResponseError(ErrorPayload error);

}
