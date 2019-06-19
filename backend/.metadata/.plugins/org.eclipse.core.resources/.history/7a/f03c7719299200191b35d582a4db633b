/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.messaging.model.ServiceRunner;
import br.com.senior.furb.basico.BasicoConstants;
import br.com.senior.furb.basico.EventType;
import br.com.senior.furb.basico.ImportServicoEventPayload;
import br.com.senior.furb.basico.ImportEventStatus;
import br.com.senior.furb.basico.Status;
import br.com.senior.furb.basico.ReportLogConverter;

import br.com.senior.springbatchintegration.importer.ImporterListener;
import br.com.senior.springbatchintegration.model.BatchLog;
import br.com.senior.springbatchintegration.model.ImportLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServicoImporterListener implements ImporterListener {
	
	private static final Logger logger = LoggerFactory.getLogger(ServicoImporterListener.class);

    @Override
    public void chunck(String id, int recordCount) {
        ImportEventStatus stat = new ImportEventStatus(id, EventType.CHUNK, Status.RUNNING, Long.valueOf(recordCount));
        publishEventStatus(stat);
    }

    @Override
    public void download(String id) {
        ImportEventStatus stat = new ImportEventStatus(id, EventType.DOWNLOAD, Status.DOWNLOADING, Long.valueOf(0));
        publishEventStatus(stat);
    }

    @Override
    public void error(String id, String message, int recordCount, BatchLog log) {
        ImportEventStatus stat = new ImportEventStatus(id, EventType.ERROR, Status.ERROR, Long.valueOf(recordCount));
        stat.errorMessage = message;
        
        stat.importReport = ReportLogConverter.toDTO((ImportLog) log, id);
        publishEventStatus(stat);
    }

    @Override
    public void finish(String id, int recordCount, br.com.senior.springbatchintegration.control.Status status, BatchLog log){
        ImportEventStatus stat = new ImportEventStatus(id, EventType.FINISH, Status.valueOf(status.name()), Long.valueOf(recordCount));
        
        stat.importReport = ReportLogConverter.toDTO((ImportLog) log, id);
        publishEventStatus(stat);
    }

    @Override
    public void start(String id) {
        ImportEventStatus stat = new ImportEventStatus(id, EventType.START, Status.RUNNING, Long.valueOf(0));
        publishEventStatus(stat);
    }
    
    @SuppressWarnings("static-method")		    
	private void publishEventStatus(ImportEventStatus status) {
		ServiceRunner runner = getServiceRunner();
		if (runner != null) {
			runner.publish(ServiceContext.get().getCurrentTenant(),  BasicoConstants.Events.IMPORT_SERVICO_EVENT, new ImportServicoEventPayload(status));
		}
	}
        
	private ServiceRunner getServiceRunner() {
		ServiceRunner runner = ServiceContext.get().getServiceRunner(BasicoConstants.DOMAIN, BasicoConstants.SERVICE);
		if (runner == null) {
			logger.warn("Cannot get service runner for domain: " + BasicoConstants.DOMAIN + " and service: " + BasicoConstants.SERVICE);
		}
		return runner;
	}
}
