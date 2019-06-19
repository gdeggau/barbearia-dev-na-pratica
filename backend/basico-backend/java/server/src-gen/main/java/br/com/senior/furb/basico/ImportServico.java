/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importServico", kind=CommandKind.Action, requestPrimitive="importServico", responsePrimitive="importServicoResponse")
public interface ImportServico extends MessageHandler {
    
    public ImportServicoOutput importServico(ImportServicoInput request);
    
}
