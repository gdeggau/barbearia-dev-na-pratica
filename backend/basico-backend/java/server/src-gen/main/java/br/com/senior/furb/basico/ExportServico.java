/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportServico", kind=CommandKind.Query, requestPrimitive="exportServico", responsePrimitive="exportServicoResponse")
public interface ExportServico extends MessageHandler {
    
    public ExportServicoOutput exportServico(ExportServicoInput request);
    
}
