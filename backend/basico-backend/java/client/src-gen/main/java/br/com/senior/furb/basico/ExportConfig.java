package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class ExportConfig {
    
    public String uri;
    public Layoutdto layout;
    public Boolean async;
    public String errorStrategy;
    
    public ExportConfig() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ExportConfig(String uri, Layoutdto layout, Boolean async, String errorStrategy) {
        this.uri = uri;
        this.layout = layout;
        this.async = async;
        this.errorStrategy = errorStrategy;
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
        if (uri != null) {
            ret = 31 * ret + uri.hashCode();
        }
        if (layout != null) {
            ret = 31 * ret + layout.hashCode();
        }
        if (async != null) {
            ret = 31 * ret + async.hashCode();
        }
        if (errorStrategy != null) {
            ret = 31 * ret + errorStrategy.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExportConfig)) {
            return false;
        }
        ExportConfig other = (ExportConfig) obj;
        if ((uri == null) != (other.uri == null)) {
            return false;
        }
        if ((uri != null) && !uri.equals(other.uri)) {
            return false;
        }
        if ((layout == null) != (other.layout == null)) {
            return false;
        }
        if ((layout != null) && !layout.equals(other.layout)) {
            return false;
        }
        if ((async == null) != (other.async == null)) {
            return false;
        }
        if ((async != null) && !async.equals(other.async)) {
            return false;
        }
        if ((errorStrategy == null) != (other.errorStrategy == null)) {
            return false;
        }
        if ((errorStrategy != null) && !errorStrategy.equals(other.errorStrategy)) {
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
    	sb.append("uri=").append(uri == null ? "null" : uri).append(", ");
    	sb.append("layout=<");
    	if (layout == null) {
    		sb.append("null");
    	} else {
    		layout.toString(sb, appended);
    	}
    	sb.append('>').append(", ");
    	sb.append("async=").append(async == null ? "null" : async).append(", ");
    	sb.append("errorStrategy=").append(errorStrategy == null ? "null" : errorStrategy);
    	sb.append(']');
    }
    
}
