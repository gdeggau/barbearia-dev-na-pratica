/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importFuncionario", kind=CommandKind.Action, requestPrimitive="importFuncionario", responsePrimitive="importFuncionarioResponse")
public interface ImportFuncionario extends MessageHandler {
    
    public ImportFuncionarioOutput importFuncionario(ImportFuncionarioInput request);
    
}
