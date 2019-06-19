/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Servico entity.
 */
@CommandDescription(name="listServico", kind=CommandKind.List, requestPrimitive="listServico", responsePrimitive="listServicoResponse")
public interface ListServico extends MessageHandler {
    
    public Servico.PagedResults listServico(Servico.PageRequest pageRequest);
    
}
