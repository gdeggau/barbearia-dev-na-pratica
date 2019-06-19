/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importFregues", kind=CommandKind.Action, requestPrimitive="importFregues", responsePrimitive="importFreguesResponse")
public interface ImportFregues extends MessageHandler {
    
    public ImportFreguesOutput importFregues(ImportFreguesInput request);
    
}
