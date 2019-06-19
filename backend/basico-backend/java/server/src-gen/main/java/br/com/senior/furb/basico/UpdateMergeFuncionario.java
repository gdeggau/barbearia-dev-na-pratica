/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Funcionario entity.
 */
@CommandDescription(name="updateMergeFuncionario", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeFuncionario", responsePrimitive="updateMergeFuncionarioResponse")
public interface UpdateMergeFuncionario extends MessageHandler {
    
    public Funcionario updateMergeFuncionario(Funcionario toUpdateMerge);
    
}
