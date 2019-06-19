/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listFuncionario
 */
@CommandDescription(name="listFuncionarioResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listFuncionarioResponse")
public interface ListFuncionarioResponse extends MessageHandler {

	void listFuncionarioResponse(Funcionario.PagedResults response);
	
	void listFuncionarioResponseError(ErrorPayload error);

}
