package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class TotalDespesasOutput {
    
    public Double totalGastos;
    public String message;
    
    public TotalDespesasOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public TotalDespesasOutput(Double totalGastos, String message) {
        this.totalGastos = totalGastos;
        this.message = message;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public TotalDespesasOutput(Double totalGastos) {
        this.totalGastos = totalGastos;
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
        if (totalGastos != null) {
            ret = 31 * ret + totalGastos.hashCode();
        }
        if (message != null) {
            ret = 31 * ret + message.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalDespesasOutput)) {
            return false;
        }
        TotalDespesasOutput other = (TotalDespesasOutput) obj;
        if ((totalGastos == null) != (other.totalGastos == null)) {
            return false;
        }
        if ((totalGastos != null) && !totalGastos.equals(other.totalGastos)) {
            return false;
        }
        if ((message == null) != (other.message == null)) {
            return false;
        }
        if ((message != null) && !message.equals(other.message)) {
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
    	sb.append("totalGastos=").append(totalGastos == null ? "null" : totalGastos).append(", ");
    	sb.append("message=").append(message == null ? "null" : message);
    	sb.append(']');
    }
    
}
