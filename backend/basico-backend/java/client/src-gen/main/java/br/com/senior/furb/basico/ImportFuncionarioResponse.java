/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportFuncionarioOutput;

/**
 * Response method for importFuncionario
 */
@CommandDescription(name="importFuncionarioResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importFuncionarioResponse")
public interface ImportFuncionarioResponse extends MessageHandler {

	void importFuncionarioResponse(ImportFuncionarioOutput response);
	
	void importFuncionarioResponseError(ErrorPayload error);

}
