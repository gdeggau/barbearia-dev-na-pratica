/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportFuncionarioOutput;

/**
 * Response method for exportFuncionario
 */
@CommandDescription(name="exportFuncionarioResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportFuncionarioResponse")
public interface ExportFuncionarioResponse extends MessageHandler {

	void exportFuncionarioResponse(ExportFuncionarioOutput response);
	
	void exportFuncionarioResponseError(ErrorPayload error);

}
