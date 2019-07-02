/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="totalLucro", kind=CommandKind.Query, requestPrimitive="totalLucro", responsePrimitive="totalLucroResponse")
public interface TotalLucro extends MessageHandler {
    
    public TotalLucroOutput totalLucro(TotalLucroInput request);
    
}
