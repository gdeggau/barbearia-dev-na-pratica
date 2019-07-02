/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.TotalLucroOutput;

/**
 * Response method for totalLucro
 */
@CommandDescription(name="totalLucroResponse", kind=CommandKind.ResponseCommand, requestPrimitive="totalLucroResponse")
public interface TotalLucroResponse extends MessageHandler {

	void totalLucroResponse(TotalLucroOutput response);
	
	void totalLucroResponseError(ErrorPayload error);

}
