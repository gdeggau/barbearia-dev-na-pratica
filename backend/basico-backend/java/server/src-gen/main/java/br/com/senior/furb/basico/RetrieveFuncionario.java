/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Funcionario entity.
 */
@CommandDescription(name="retrieveFuncionario", kind=CommandKind.Retrieve, requestPrimitive="retrieveFuncionario", responsePrimitive="retrieveFuncionarioResponse")
public interface RetrieveFuncionario extends MessageHandler {
    
    public Funcionario retrieveFuncionario(Funcionario.Id id);
    
}
