package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class ServiceStartedPayload {
    
    public String domain;
    public String service;
    
    public ServiceStartedPayload() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ServiceStartedPayload(String domain, String service) {
        this.domain = domain;
        this.service = service;
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
        if (domain != null) {
            ret = 31 * ret + domain.hashCode();
        }
        if (service != null) {
            ret = 31 * ret + service.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceStartedPayload)) {
            return false;
        }
        ServiceStartedPayload other = (ServiceStartedPayload) obj;
        if ((domain == null) != (other.domain == null)) {
            return false;
        }
        if ((domain != null) && !domain.equals(other.domain)) {
            return false;
        }
        if ((service == null) != (other.service == null)) {
            return false;
        }
        if ((service != null) && !service.equals(other.service)) {
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
    	sb.append("domain=").append(domain == null ? "null" : domain).append(", ");
    	sb.append("service=").append(service == null ? "null" : service);
    	sb.append(']');
    }
    
}
