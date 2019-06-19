/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Servico entity.
 */
@CommandDescription(name="updateMergeServico", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeServico", responsePrimitive="updateMergeServicoResponse")
public interface UpdateMergeServico extends MessageHandler {
    
    public Servico updateMergeServico(Servico toUpdateMerge);
    
}
