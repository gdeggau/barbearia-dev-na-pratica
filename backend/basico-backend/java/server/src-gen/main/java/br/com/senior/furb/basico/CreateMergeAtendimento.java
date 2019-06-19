/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Atendimento entity.
 */
@CommandDescription(name="createMergeAtendimento", kind=CommandKind.CreateMerge, requestPrimitive="createMergeAtendimento", responsePrimitive="createMergeAtendimentoResponse")
public interface CreateMergeAtendimento extends MessageHandler {
    
    public Atendimento createMergeAtendimento(Atendimento toCreateMerge);
    
}
