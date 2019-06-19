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
 * Response method for retrieveFregues
 */
@CommandDescription(name="retrieveFreguesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveFreguesResponse")
public interface RetrieveFreguesResponse extends MessageHandler {

	void retrieveFreguesResponse(Fregues response);
	
	void retrieveFreguesResponseError(ErrorPayload error);

}
