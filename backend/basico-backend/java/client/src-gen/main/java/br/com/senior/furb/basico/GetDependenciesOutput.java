package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class GetDependenciesOutput {
    
    /**
     * List with this service dependencies
     */
    public java.util.List<Dependency> dependencies;
    
    public GetDependenciesOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public GetDependenciesOutput(java.util.List<Dependency> dependencies) {
        this.dependencies = dependencies;
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
        if (dependencies != null) {
            ret = 31 * ret + dependencies.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDependenciesOutput)) {
            return false;
        }
        GetDependenciesOutput other = (GetDependenciesOutput) obj;
        if ((dependencies == null) != (other.dependencies == null)) {
            return false;
        }
        if ((dependencies != null) && !dependencies.equals(other.dependencies)) {
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
    	sb.append("dependencies=<");
    	if (dependencies == null) {
    		sb.append("null");
    	} else {
    		sb.append('[');
    		int last = dependencies.size() - 1;
    		for (int i = 0; i <= last; i++) {
    			dependencies.get(i).toString(sb, appended);
    			if (i < last) {
    				sb.append(", ");
    			}
    		}
    		sb.append(']');
    	}
    	sb.append('>');
    	sb.append(']');
    }
    
}
