/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Servico entity.
 */
@CommandDescription(name="deleteServico", kind=CommandKind.Delete, requestPrimitive="deleteServico", responsePrimitive="deleteServicoResponse")
public interface DeleteServico extends MessageHandler {
    
    public void deleteServico(Servico.Id id);
    
}
