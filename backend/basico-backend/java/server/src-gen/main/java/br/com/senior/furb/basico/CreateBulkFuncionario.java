/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkFuncionario", kind = CommandKind.Create, requestPrimitive = "createBulkFuncionario", responsePrimitive="")
public interface CreateBulkFuncionario extends MessageHandler {
    public CreateBulkFuncionarioOutput createBulkFuncionario(CreateBulkFuncionarioInput toCreate);
}
