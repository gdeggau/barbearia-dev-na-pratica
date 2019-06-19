/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Fregues entity.
 */
@CommandDescription(name="createFregues", kind=CommandKind.Create, requestPrimitive="createFregues", responsePrimitive="createFreguesResponse")
public interface CreateFregues extends MessageHandler {
    
    public Fregues createFregues(Fregues toCreate);
    
}
