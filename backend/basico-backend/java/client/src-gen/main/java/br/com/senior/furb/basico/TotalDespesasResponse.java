/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.TotalDespesasOutput;

/**
 * Response method for totalDespesas
 */
@CommandDescription(name="totalDespesasResponse", kind=CommandKind.ResponseCommand, requestPrimitive="totalDespesasResponse")
public interface TotalDespesasResponse extends MessageHandler {

	void totalDespesasResponse(TotalDespesasOutput response);
	
	void totalDespesasResponseError(ErrorPayload error);

}
