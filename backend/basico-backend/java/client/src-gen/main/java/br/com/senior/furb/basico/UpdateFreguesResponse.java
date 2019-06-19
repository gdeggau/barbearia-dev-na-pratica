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
 * Response method for updateFregues
 */
@CommandDescription(name="updateFreguesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateFreguesResponse")
public interface UpdateFreguesResponse extends MessageHandler {

	void updateFreguesResponse(Fregues response);
	
	void updateFreguesResponseError(ErrorPayload error);

}
