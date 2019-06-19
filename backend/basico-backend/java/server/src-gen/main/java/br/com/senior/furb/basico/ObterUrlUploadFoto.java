/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * Obtém a URL para upload da foto
 */
@CommandDescription(name="obterUrlUploadFoto", kind=CommandKind.Action, requestPrimitive="obterUrlUploadFoto", responsePrimitive="obterUrlUploadFotoResponse")
public interface ObterUrlUploadFoto extends MessageHandler {
    
    public ObterUrlUploadFotoOutput obterUrlUploadFoto(ObterUrlUploadFotoInput request);
    
}
