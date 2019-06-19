package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class ImportError {
    
    public ErrorType errorType;
    public Long lineNumber;
    public String bean;
    public String message;
    public String exceptionClass;
    
    public ImportError() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ImportError(ErrorType errorType, Long lineNumber, String bean, String message, String exceptionClass) {
        this.errorType = errorType;
        this.lineNumber = lineNumber;
        this.bean = bean;
        this.message = message;
        this.exceptionClass = exceptionClass;
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
        if (errorType != null) {
            ret = 31 * ret + errorType.hashCode();
        }
        if (lineNumber != null) {
            ret = 31 * ret + lineNumber.hashCode();
        }
        if (bean != null) {
            ret = 31 * ret + bean.hashCode();
        }
        if (message != null) {
            ret = 31 * ret + message.hashCode();
        }
        if (exceptionClass != null) {
            ret = 31 * ret + exceptionClass.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportError)) {
            return false;
        }
        ImportError other = (ImportError) obj;
        if ((errorType == null) != (other.errorType == null)) {
            return false;
        }
        if ((errorType != null) && !errorType.equals(other.errorType)) {
            return false;
        }
        if ((lineNumber == null) != (other.lineNumber == null)) {
            return false;
        }
        if ((lineNumber != null) && !lineNumber.equals(other.lineNumber)) {
            return false;
        }
        if ((bean == null) != (other.bean == null)) {
            return false;
        }
        if ((bean != null) && !bean.equals(other.bean)) {
            return false;
        }
        if ((message == null) != (other.message == null)) {
            return false;
        }
        if ((message != null) && !message.equals(other.message)) {
            return false;
        }
        if ((exceptionClass == null) != (other.exceptionClass == null)) {
            return false;
        }
        if ((exceptionClass != null) && !exceptionClass.equals(other.exceptionClass)) {
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
    	sb.append("errorType=").append(errorType == null ? "null" : errorType).append(", ");
    	sb.append("lineNumber=").append(lineNumber == null ? "null" : lineNumber).append(", ");
    	sb.append("bean=").append(bean == null ? "null" : bean).append(", ");
    	sb.append("message=").append(message == null ? "null" : message).append(", ");
    	sb.append("exceptionClass=").append(exceptionClass == null ? "null" : exceptionClass);
    	sb.append(']');
    }
    
}
