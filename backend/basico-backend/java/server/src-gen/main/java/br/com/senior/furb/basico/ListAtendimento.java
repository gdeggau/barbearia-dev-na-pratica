/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Atendimento entity.
 */
@CommandDescription(name="listAtendimento", kind=CommandKind.List, requestPrimitive="listAtendimento", responsePrimitive="listAtendimentoResponse")
public interface ListAtendimento extends MessageHandler {
    
    public Atendimento.PagedResults listAtendimento(Atendimento.PageRequest pageRequest);
    
}
