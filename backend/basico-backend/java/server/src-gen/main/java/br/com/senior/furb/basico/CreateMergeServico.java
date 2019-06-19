/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Servico entity.
 */
@CommandDescription(name="createMergeServico", kind=CommandKind.CreateMerge, requestPrimitive="createMergeServico", responsePrimitive="createMergeServicoResponse")
public interface CreateMergeServico extends MessageHandler {
    
    public Servico createMergeServico(Servico toCreateMerge);
    
}
