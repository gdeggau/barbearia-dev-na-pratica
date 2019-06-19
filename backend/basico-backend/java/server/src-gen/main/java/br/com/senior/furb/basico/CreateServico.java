/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Servico entity.
 */
@CommandDescription(name="createServico", kind=CommandKind.Create, requestPrimitive="createServico", responsePrimitive="createServicoResponse")
public interface CreateServico extends MessageHandler {
    
    public Servico createServico(Servico toCreate);
    
}
