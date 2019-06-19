/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Fregues entity.
 */
@CommandDescription(name="updateMergeFregues", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeFregues", responsePrimitive="updateMergeFreguesResponse")
public interface UpdateMergeFregues extends MessageHandler {
    
    public Fregues updateMergeFregues(Fregues toUpdateMerge);
    
}
