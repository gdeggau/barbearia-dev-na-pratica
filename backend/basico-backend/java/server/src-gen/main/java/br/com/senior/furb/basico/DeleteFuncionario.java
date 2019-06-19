/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Funcionario entity.
 */
@CommandDescription(name="deleteFuncionario", kind=CommandKind.Delete, requestPrimitive="deleteFuncionario", responsePrimitive="deleteFuncionarioResponse")
public interface DeleteFuncionario extends MessageHandler {
    
    public void deleteFuncionario(Funcionario.Id id);
    
}
