/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@SubscriptionDescription(domain="furb", service="basico", event="importFuncionarioEvent")
public interface ImportFuncionarioEvent extends MessageHandler {
    public void importFuncionarioEvent(ImportFuncionarioEventPayload payload);
    
}
