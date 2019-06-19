/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Fregues entity.
 */
@CommandDescription(name="retrieveFregues", kind=CommandKind.Retrieve, requestPrimitive="retrieveFregues", responsePrimitive="retrieveFreguesResponse")
public interface RetrieveFregues extends MessageHandler {
    
    public Fregues retrieveFregues(Fregues.Id id);
    
}
