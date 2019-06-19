/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Fregues entity.
 */
@CommandDescription(name="deleteFregues", kind=CommandKind.Delete, requestPrimitive="deleteFregues", responsePrimitive="deleteFreguesResponse")
public interface DeleteFregues extends MessageHandler {
    
    public void deleteFregues(Fregues.Id id);
    
}
