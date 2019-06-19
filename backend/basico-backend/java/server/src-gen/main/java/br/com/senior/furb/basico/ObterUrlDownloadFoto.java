/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * Obtém a URL para download da foto
 */
@CommandDescription(name="obterUrlDownloadFoto", kind=CommandKind.Action, requestPrimitive="obterUrlDownloadFoto", responsePrimitive="obterUrlDownloadFotoResponse")
public interface ObterUrlDownloadFoto extends MessageHandler {
    
    public ObterUrlDownloadFotoOutput obterUrlDownloadFoto(ObterUrlDownloadFotoInput request);
    
}
