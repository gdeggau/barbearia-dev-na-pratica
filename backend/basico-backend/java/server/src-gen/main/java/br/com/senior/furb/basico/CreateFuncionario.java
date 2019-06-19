/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Funcionario entity.
 */
@CommandDescription(name="createFuncionario", kind=CommandKind.Create, requestPrimitive="createFuncionario", responsePrimitive="createFuncionarioResponse")
public interface CreateFuncionario extends MessageHandler {
    
    public Funcionario createFuncionario(Funcionario toCreate);
    
}
