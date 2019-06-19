/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Atendimento entity.
 */
@CommandDescription(name="retrieveAtendimento", kind=CommandKind.Retrieve, requestPrimitive="retrieveAtendimento", responsePrimitive="retrieveAtendimentoResponse")
public interface RetrieveAtendimento extends MessageHandler {
    
    public Atendimento retrieveAtendimento(Atendimento.Id id);
    
}
