/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Funcionario entity.
 */
@CommandDescription(name="listFuncionario", kind=CommandKind.List, requestPrimitive="listFuncionario", responsePrimitive="listFuncionarioResponse")
public interface ListFuncionario extends MessageHandler {
    
    public Funcionario.PagedResults listFuncionario(Funcionario.PageRequest pageRequest);
    
}
