/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportFreguesOutput;

/**
 * Response method for importFregues
 */
@CommandDescription(name="importFreguesResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importFreguesResponse")
public interface ImportFreguesResponse extends MessageHandler {

	void importFreguesResponse(ImportFreguesOutput response);
	
	void importFreguesResponseError(ErrorPayload error);

}
