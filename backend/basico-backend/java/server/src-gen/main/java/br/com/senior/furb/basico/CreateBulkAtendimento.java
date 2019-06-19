/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkAtendimento", kind = CommandKind.Create, requestPrimitive = "createBulkAtendimento", responsePrimitive="")
public interface CreateBulkAtendimento extends MessageHandler {
    public CreateBulkAtendimentoOutput createBulkAtendimento(CreateBulkAtendimentoInput toCreate);
}
