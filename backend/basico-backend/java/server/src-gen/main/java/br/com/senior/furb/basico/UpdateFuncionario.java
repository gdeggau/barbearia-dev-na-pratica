/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Funcionario entity.
 */
@CommandDescription(name="updateFuncionario", kind=CommandKind.Update, requestPrimitive="updateFuncionario", responsePrimitive="updateFuncionarioResponse")
public interface UpdateFuncionario extends MessageHandler {
    
    public Funcionario updateFuncionario(Funcionario toUpdate);
    
}
