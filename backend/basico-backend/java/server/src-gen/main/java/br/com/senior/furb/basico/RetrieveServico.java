/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Servico entity.
 */
@CommandDescription(name="retrieveServico", kind=CommandKind.Retrieve, requestPrimitive="retrieveServico", responsePrimitive="retrieveServicoResponse")
public interface RetrieveServico extends MessageHandler {
    
    public Servico retrieveServico(Servico.Id id);
    
}
