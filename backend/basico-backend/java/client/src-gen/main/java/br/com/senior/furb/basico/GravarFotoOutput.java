package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class GravarFotoOutput {
    
    /**
     * resultado da operação
     */
    public FotoOperationResult result;
    
    public GravarFotoOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public GravarFotoOutput(FotoOperationResult result) {
        this.result = result;
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
        if (result != null) {
            ret = 31 * ret + result.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GravarFotoOutput)) {
            return false;
        }
        GravarFotoOutput other = (GravarFotoOutput) obj;
        if ((result == null) != (other.result == null)) {
            return false;
        }
        if ((result != null) && !result.equals(other.result)) {
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
    	sb.append("result=").append(result == null ? "null" : result);
    	sb.append(']');
    }
    
}
