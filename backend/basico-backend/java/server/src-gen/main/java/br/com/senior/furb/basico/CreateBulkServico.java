/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkServico", kind = CommandKind.Create, requestPrimitive = "createBulkServico", responsePrimitive="")
public interface CreateBulkServico extends MessageHandler {
    public CreateBulkServicoOutput createBulkServico(CreateBulkServicoInput toCreate);
}
