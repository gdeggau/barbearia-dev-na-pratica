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
 * Response method for createMergeFregues
 */
@CommandDescription(name="createMergeFreguesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeFreguesResponse")
public interface CreateMergeFreguesResponse extends MessageHandler {

	void createMergeFreguesResponse(Fregues response);
	
	void createMergeFreguesResponseError(ErrorPayload error);

}
