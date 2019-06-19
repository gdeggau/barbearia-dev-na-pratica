/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Funcionario entity.
 */
@CommandDescription(name="createMergeFuncionario", kind=CommandKind.CreateMerge, requestPrimitive="createMergeFuncionario", responsePrimitive="createMergeFuncionarioResponse")
public interface CreateMergeFuncionario extends MessageHandler {
    
    public Funcionario createMergeFuncionario(Funcionario toCreateMerge);
    
}
