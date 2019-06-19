package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class GetMetadataOutput {
    
    public String metadata;
    
    public GetMetadataOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public GetMetadataOutput(String metadata) {
        this.metadata = metadata;
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
        if (metadata != null) {
            ret = 31 * ret + metadata.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetMetadataOutput)) {
            return false;
        }
        GetMetadataOutput other = (GetMetadataOutput) obj;
        if ((metadata == null) != (other.metadata == null)) {
            return false;
        }
        if ((metadata != null) && !metadata.equals(other.metadata)) {
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
    	sb.append("metadata=").append(metadata == null ? "null" : metadata);
    	sb.append(']');
    }
    
}
