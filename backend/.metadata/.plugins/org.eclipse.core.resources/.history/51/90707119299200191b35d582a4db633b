package br.com.senior;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.senior.messaging.Message;
import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.messaging.utils.DtoJsonConverter;

public class EventPublisher {
	
	private static final Logger logger = LoggerFactory.getLogger(EventPublisher.class);
	
	private static void publish(String eventName, byte[] payload) {
		final ServiceContext serviceContext = ServiceContext.get();
			
		final String domain = serviceContext.getCurrentService().getDomain();
		final String service = serviceContext.getCurrentService().getName();
		final String tenant = serviceContext.getCurrentTenant();
			
		serviceContext.getServiceRunner(domain, service).runAsync(x -> {
			try {
				serviceContext.getCurrentMessenger().publish(new Message(tenant, eventName, payload));
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		});
	}
	
	public static <T> void publish(String eventName, T dto) {
		publish(eventName, DtoJsonConverter.toJSON(dto));
	}
}
