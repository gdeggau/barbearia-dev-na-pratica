package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class ImportEventStatus {
    
    public String importerId;
    public EventType eventType;
    public Status status;
    public String errorMessage;
    public Long recordCount;
    public ImportReport importReport;
    
    public ImportEventStatus() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ImportEventStatus(String importerId, EventType eventType, Status status, String errorMessage, Long recordCount, ImportReport importReport) {
        this.importerId = importerId;
        this.eventType = eventType;
        this.status = status;
        this.errorMessage = errorMessage;
        this.recordCount = recordCount;
        this.importReport = importReport;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public ImportEventStatus(String importerId, EventType eventType, Status status, Long recordCount) {
        this.importerId = importerId;
        this.eventType = eventType;
        this.status = status;
        this.recordCount = recordCount;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	BasicoValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (importerId != null) {
            ret = 31 * ret + importerId.hashCode();
        }
        if (eventType != null) {
            ret = 31 * ret + eventType.hashCode();
        }
        if (status != null) {
            ret = 31 * ret + status.hashCode();
        }
        if (errorMessage != null) {
            ret = 31 * ret + errorMessage.hashCode();
        }
        if (recordCount != null) {
            ret = 31 * ret + recordCount.hashCode();
        }
        if (importReport != null) {
            ret = 31 * ret + importReport.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportEventStatus)) {
            return false;
        }
        ImportEventStatus other = (ImportEventStatus) obj;
        if ((importerId == null) != (other.importerId == null)) {
            return false;
        }
        if ((importerId != null) && !importerId.equals(other.importerId)) {
            return false;
        }
        if ((eventType == null) != (other.eventType == null)) {
            return false;
        }
        if ((eventType != null) && !eventType.equals(other.eventType)) {
            return false;
        }
        if ((status == null) != (other.status == null)) {
            return false;
        }
        if ((status != null) && !status.equals(other.status)) {
            return false;
        }
        if ((errorMessage == null) != (other.errorMessage == null)) {
            return false;
        }
        if ((errorMessage != null) && !errorMessage.equals(other.errorMessage)) {
            return false;
        }
        if ((recordCount == null) != (other.recordCount == null)) {
            return false;
        }
        if ((recordCount != null) && !recordCount.equals(other.recordCount)) {
            return false;
        }
        if ((importReport == null) != (other.importReport == null)) {
            return false;
        }
        if ((importReport != null) && !importReport.equals(other.importReport)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    void toString(StringBuilder sb, List<Object> appended) {
    	sb.append(getClass().getSimpleName()).append(" [");
    	if (appended.contains(this)) {
    		sb.append("<Previously appended object>").append(']');
    		return;
    	}
    	appended.add(this);
    	sb.append("importerId=").append(importerId == null ? "null" : importerId).append(", ");
    	sb.append("eventType=").append(eventType == null ? "null" : eventType).append(", ");
    	sb.append("status=").append(status == null ? "null" : status).append(", ");
    	sb.append("errorMessage=").append(errorMessage == null ? "null" : errorMessage).append(", ");
    	sb.append("recordCount=").append(recordCount == null ? "null" : recordCount).append(", ");
    	sb.append("importReport=<");
    	if (importReport == null) {
    		sb.append("null");
    	} else {
    		importReport.toString(sb, appended);
    	}
    	sb.append('>');
    	sb.append(']');
    }
    
}
