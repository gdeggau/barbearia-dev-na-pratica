/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportFuncionario", kind=CommandKind.Query, requestPrimitive="exportFuncionario", responsePrimitive="exportFuncionarioResponse")
public interface ExportFuncionario extends MessageHandler {
    
    public ExportFuncionarioOutput exportFuncionario(ExportFuncionarioInput request);
    
}
