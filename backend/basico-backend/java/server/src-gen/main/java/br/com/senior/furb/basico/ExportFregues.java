/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportFregues", kind=CommandKind.Query, requestPrimitive="exportFregues", responsePrimitive="exportFreguesResponse")
public interface ExportFregues extends MessageHandler {
    
    public ExportFreguesOutput exportFregues(ExportFreguesInput request);
    
}
