/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Funcionario;

/**
 * Response method for createFuncionario
 */
@CommandDescription(name="createFuncionarioResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createFuncionarioResponse")
public interface CreateFuncionarioResponse extends MessageHandler {

	void createFuncionarioResponse(Funcionario response);
	
	void createFuncionarioResponseError(ErrorPayload error);

}
