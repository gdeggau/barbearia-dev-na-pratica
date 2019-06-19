/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Servico entity.
 */
@CommandDescription(name="updateServico", kind=CommandKind.Update, requestPrimitive="updateServico", responsePrimitive="updateServicoResponse")
public interface UpdateServico extends MessageHandler {
    
    public Servico updateServico(Servico toUpdate);
    
}
