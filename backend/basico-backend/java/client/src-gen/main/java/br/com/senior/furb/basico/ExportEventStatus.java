package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class ExportEventStatus {
    
    public String importerId;
    public EventType eventType;
    public Long recordCount;
    
    public ExportEventStatus() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ExportEventStatus(String importerId, EventType eventType, Long recordCount) {
        this.importerId = importerId;
        this.eventType = eventType;
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
        if (recordCount != null) {
            ret = 31 * ret + recordCount.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExportEventStatus)) {
            return false;
        }
        ExportEventStatus other = (ExportEventStatus) obj;
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
        if ((recordCount == null) != (other.recordCount == null)) {
            return false;
        }
        if ((recordCount != null) && !recordCount.equals(other.recordCount)) {
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
    	sb.append("recordCount=").append(recordCount == null ? "null" : recordCount);
    	sb.append(']');
    }
    
}
