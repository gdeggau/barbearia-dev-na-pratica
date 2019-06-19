/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listFregues
 */
@CommandDescription(name="listFreguesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listFreguesResponse")
public interface ListFreguesResponse extends MessageHandler {

	void listFreguesResponse(Fregues.PagedResults response);
	
	void listFreguesResponseError(ErrorPayload error);

}
