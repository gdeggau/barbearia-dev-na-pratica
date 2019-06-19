package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class Hookdto {
    
    public HookFunction hookFunction;
    public String script;
    
    public Hookdto() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Hookdto(HookFunction hookFunction, String script) {
        this.hookFunction = hookFunction;
        this.script = script;
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
        if (hookFunction != null) {
            ret = 31 * ret + hookFunction.hashCode();
        }
        if (script != null) {
            ret = 31 * ret + script.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hookdto)) {
            return false;
        }
        Hookdto other = (Hookdto) obj;
        if ((hookFunction == null) != (other.hookFunction == null)) {
            return false;
        }
        if ((hookFunction != null) && !hookFunction.equals(other.hookFunction)) {
            return false;
        }
        if ((script == null) != (other.script == null)) {
            return false;
        }
        if ((script != null) && !script.equals(other.script)) {
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
    	sb.append("hookFunction=").append(hookFunction == null ? "null" : hookFunction).append(", ");
    	sb.append("script=").append(script == null ? "null" : script);
    	sb.append(']');
    }
    
}
