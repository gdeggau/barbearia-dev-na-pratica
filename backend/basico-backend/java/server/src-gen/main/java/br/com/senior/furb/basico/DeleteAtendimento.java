/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Atendimento entity.
 */
@CommandDescription(name="deleteAtendimento", kind=CommandKind.Delete, requestPrimitive="deleteAtendimento", responsePrimitive="deleteAtendimentoResponse")
public interface DeleteAtendimento extends MessageHandler {
    
    public void deleteAtendimento(Atendimento.Id id);
    
}
