package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class TotalLucroInput {
    
    public java.time.LocalDate dataInicial;
    public java.time.LocalDate dataFinal;
    
    public TotalLucroInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public TotalLucroInput(java.time.LocalDate dataInicial, java.time.LocalDate dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
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
        if (dataInicial != null) {
            ret = 31 * ret + dataInicial.hashCode();
        }
        if (dataFinal != null) {
            ret = 31 * ret + dataFinal.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalLucroInput)) {
            return false;
        }
        TotalLucroInput other = (TotalLucroInput) obj;
        if ((dataInicial == null) != (other.dataInicial == null)) {
            return false;
        }
        if ((dataInicial != null) && !dataInicial.equals(other.dataInicial)) {
            return false;
        }
        if ((dataFinal == null) != (other.dataFinal == null)) {
            return false;
        }
        if ((dataFinal != null) && !dataFinal.equals(other.dataFinal)) {
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
    	sb.append("dataInicial=").append(dataInicial == null ? "null" : dataInicial).append(", ");
    	sb.append("dataFinal=").append(dataFinal == null ? "null" : dataFinal);
    	sb.append(']');
    }
    
}
