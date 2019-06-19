/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.GravarFotoOutput;

/**
 * Response method for gravarFoto
 */
@CommandDescription(name="gravarFotoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="gravarFotoResponse")
public interface GravarFotoResponse extends MessageHandler {

	void gravarFotoResponse(GravarFotoOutput response);
	
	void gravarFotoResponseError(ErrorPayload error);

}
