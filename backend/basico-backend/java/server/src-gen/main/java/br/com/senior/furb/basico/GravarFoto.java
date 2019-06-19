/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * Grava a foto que foi upada
 */
@CommandDescription(name="gravarFoto", kind=CommandKind.Action, requestPrimitive="gravarFoto", responsePrimitive="gravarFotoResponse")
public interface GravarFoto extends MessageHandler {
    
    public GravarFotoOutput gravarFoto(GravarFotoInput request);
    
}
