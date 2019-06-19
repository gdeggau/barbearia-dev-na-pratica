/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importAtendimento", kind=CommandKind.Action, requestPrimitive="importAtendimento", responsePrimitive="importAtendimentoResponse")
public interface ImportAtendimento extends MessageHandler {
    
    public ImportAtendimentoOutput importAtendimento(ImportAtendimentoInput request);
    
}
