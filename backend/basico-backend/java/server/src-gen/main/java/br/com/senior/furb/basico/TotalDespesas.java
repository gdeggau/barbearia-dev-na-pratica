/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="totalDespesas", kind=CommandKind.Query, requestPrimitive="totalDespesas", responsePrimitive="totalDespesasResponse")
public interface TotalDespesas extends MessageHandler {
    
    public TotalDespesasOutput totalDespesas(TotalDespesasInput request);
    
}
