/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Atendimento entity.
 */
@CommandDescription(name="updateMergeAtendimento", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeAtendimento", responsePrimitive="updateMergeAtendimentoResponse")
public interface UpdateMergeAtendimento extends MessageHandler {
    
    public Atendimento updateMergeAtendimento(Atendimento toUpdateMerge);
    
}
