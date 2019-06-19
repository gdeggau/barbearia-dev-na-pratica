package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class ImportReport {
    
    public String id;
    public java.time.Instant startTime;
    public java.time.Instant endTime;
    public String uri;
    public String beanClass;
    public String serviceClass;
    public Layoutdto layout;
    public Long sucessCount;
    public Long errorsCount;
    public Long filteredCount;
    public Long skippedCount;
    public java.util.List<ImportError> importErrors;
    
    public ImportReport() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ImportReport(String id, java.time.Instant startTime, java.time.Instant endTime, String uri, String beanClass, String serviceClass, Layoutdto layout, Long sucessCount, Long errorsCount, Long filteredCount, Long skippedCount, java.util.List<ImportError> importErrors) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.uri = uri;
        this.beanClass = beanClass;
        this.serviceClass = serviceClass;
        this.layout = layout;
        this.sucessCount = sucessCount;
        this.errorsCount = errorsCount;
        this.filteredCount = filteredCount;
        this.skippedCount = skippedCount;
        this.importErrors = importErrors;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public ImportReport(String id, java.time.Instant startTime, java.time.Instant endTime, String uri, String beanClass, String serviceClass, Layoutdto layout, Long sucessCount, Long errorsCount, Long filteredCount, Long skippedCount) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.uri = uri;
        this.beanClass = beanClass;
        this.serviceClass = serviceClass;
        this.layout = layout;
        this.sucessCount = sucessCount;
        this.errorsCount = errorsCount;
        this.filteredCount = filteredCount;
        this.skippedCount = skippedCount;
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
        if (id != null) {
            ret = 31 * ret + id.hashCode();
        }
        if (startTime != null) {
            ret = 31 * ret + startTime.hashCode();
        }
        if (endTime != null) {
            ret = 31 * ret + endTime.hashCode();
        }
        if (uri != null) {
            ret = 31 * ret + uri.hashCode();
        }
        if (beanClass != null) {
            ret = 31 * ret + beanClass.hashCode();
        }
        if (serviceClass != null) {
            ret = 31 * ret + serviceClass.hashCode();
        }
        if (layout != null) {
            ret = 31 * ret + layout.hashCode();
        }
        if (sucessCount != null) {
            ret = 31 * ret + sucessCount.hashCode();
        }
        if (errorsCount != null) {
            ret = 31 * ret + errorsCount.hashCode();
        }
        if (filteredCount != null) {
            ret = 31 * ret + filteredCount.hashCode();
        }
        if (skippedCount != null) {
            ret = 31 * ret + skippedCount.hashCode();
        }
        if (importErrors != null) {
            ret = 31 * ret + importErrors.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportReport)) {
            return false;
        }
        ImportReport other = (ImportReport) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
            return false;
        }
        if ((startTime == null) != (other.startTime == null)) {
            return false;
        }
        if ((startTime != null) && !startTime.equals(other.startTime)) {
            return false;
        }
        if ((endTime == null) != (other.endTime == null)) {
            return false;
        }
        if ((endTime != null) && !endTime.equals(other.endTime)) {
            return false;
        }
        if ((uri == null) != (other.uri == null)) {
            return false;
        }
        if ((uri != null) && !uri.equals(other.uri)) {
            return false;
        }
        if ((beanClass == null) != (other.beanClass == null)) {
            return false;
        }
        if ((beanClass != null) && !beanClass.equals(other.beanClass)) {
            return false;
        }
        if ((serviceClass == null) != (other.serviceClass == null)) {
            return false;
        }
        if ((serviceClass != null) && !serviceClass.equals(other.serviceClass)) {
            return false;
        }
        if ((layout == null) != (other.layout == null)) {
            return false;
        }
        if ((layout != null) && !layout.equals(other.layout)) {
            return false;
        }
        if ((sucessCount == null) != (other.sucessCount == null)) {
            return false;
        }
        if ((sucessCount != null) && !sucessCount.equals(other.sucessCount)) {
            return false;
        }
        if ((errorsCount == null) != (other.errorsCount == null)) {
            return false;
        }
        if ((errorsCount != null) && !errorsCount.equals(other.errorsCount)) {
            return false;
        }
        if ((filteredCount == null) != (other.filteredCount == null)) {
            return false;
        }
        if ((filteredCount != null) && !filteredCount.equals(other.filteredCount)) {
            return false;
        }
        if ((skippedCount == null) != (other.skippedCount == null)) {
            return false;
        }
        if ((skippedCount != null) && !skippedCount.equals(other.skippedCount)) {
            return false;
        }
        if ((importErrors == null) != (other.importErrors == null)) {
            return false;
        }
        if ((importErrors != null) && !importErrors.equals(other.importErrors)) {
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
    	sb.append("id=").append(id == null ? "null" : id).append(", ");
    	sb.append("startTime=").append(startTime == null ? "null" : startTime).append(", ");
    	sb.append("endTime=").append(endTime == null ? "null" : endTime).append(", ");
    	sb.append("uri=").append(uri == null ? "null" : uri).append(", ");
    	sb.append("beanClass=").append(beanClass == null ? "null" : beanClass).append(", ");
    	sb.append("serviceClass=").append(serviceClass == null ? "null" : serviceClass).append(", ");
    	sb.append("layout=<");
    	if (layout == null) {
    		sb.append("null");
    	} else {
    		layout.toString(sb, appended);
    	}
    	sb.append('>').append(", ");
    	sb.append("sucessCount=").append(sucessCount == null ? "null" : sucessCount).append(", ");
    	sb.append("errorsCount=").append(errorsCount == null ? "null" : errorsCount).append(", ");
    	sb.append("filteredCount=").append(filteredCount == null ? "null" : filteredCount).append(", ");
    	sb.append("skippedCount=").append(skippedCount == null ? "null" : skippedCount).append(", ");
    	sb.append("importErrors=<");
    	if (importErrors == null) {
    		sb.append("null");
    	} else {
    		sb.append('[');
    		int last = importErrors.size() - 1;
    		for (int i = 0; i <= last; i++) {
    			importErrors.get(i).toString(sb, appended);
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
