/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Fregues entity.
 */
@CommandDescription(name="createMergeFregues", kind=CommandKind.CreateMerge, requestPrimitive="createMergeFregues", responsePrimitive="createMergeFreguesResponse")
public interface CreateMergeFregues extends MessageHandler {
    
    public Fregues createMergeFregues(Fregues toCreateMerge);
    
}
