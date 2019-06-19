/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Fregues entity.
 */
@CommandDescription(name="listFregues", kind=CommandKind.List, requestPrimitive="listFregues", responsePrimitive="listFreguesResponse")
public interface ListFregues extends MessageHandler {
    
    public Fregues.PagedResults listFregues(Fregues.PageRequest pageRequest);
    
}
