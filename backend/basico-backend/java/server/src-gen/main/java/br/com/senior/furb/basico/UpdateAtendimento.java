/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Atendimento entity.
 */
@CommandDescription(name="updateAtendimento", kind=CommandKind.Update, requestPrimitive="updateAtendimento", responsePrimitive="updateAtendimentoResponse")
public interface UpdateAtendimento extends MessageHandler {
    
    public Atendimento updateAtendimento(Atendimento toUpdate);
    
}
