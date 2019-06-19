/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportAtendimento", kind=CommandKind.Query, requestPrimitive="exportAtendimento", responsePrimitive="exportAtendimentoResponse")
public interface ExportAtendimento extends MessageHandler {
    
    public ExportAtendimentoOutput exportAtendimento(ExportAtendimentoInput request);
    
}
