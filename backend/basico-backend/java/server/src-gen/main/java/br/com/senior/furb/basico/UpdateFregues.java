/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Fregues entity.
 */
@CommandDescription(name="updateFregues", kind=CommandKind.Update, requestPrimitive="updateFregues", responsePrimitive="updateFreguesResponse")
public interface UpdateFregues extends MessageHandler {
    
    public Fregues updateFregues(Fregues toUpdate);
    
}
