/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Atendimento entity.
 */
@CommandDescription(name="createAtendimento", kind=CommandKind.Create, requestPrimitive="createAtendimento", responsePrimitive="createAtendimentoResponse")
public interface CreateAtendimento extends MessageHandler {
    
    public Atendimento createAtendimento(Atendimento toCreate);
    
}
