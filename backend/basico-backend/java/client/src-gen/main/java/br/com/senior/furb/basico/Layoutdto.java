package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class Layoutdto {
    
    public Long id;
    public String description;
    public FileFormat fileFormat;
    public ErrorStrategy errorStrategy;
    public String delimiter;
    public Long skipLines;
    public java.util.List<Fielddto> fields;
    public java.util.List<Hookdto> hooks;
    
    public Layoutdto() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Layoutdto(Long id, String description, FileFormat fileFormat, ErrorStrategy errorStrategy, String delimiter, Long skipLines, java.util.List<Fielddto> fields, java.util.List<Hookdto> hooks) {
        this.id = id;
        this.description = description;
        this.fileFormat = fileFormat;
        this.errorStrategy = errorStrategy;
        this.delimiter = delimiter;
        this.skipLines = skipLines;
        this.fields = fields;
        this.hooks = hooks;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Layoutdto(Long id, String description, FileFormat fileFormat, ErrorStrategy errorStrategy, Long skipLines, java.util.List<Fielddto> fields) {
        this.id = id;
        this.description = description;
        this.fileFormat = fileFormat;
        this.errorStrategy = errorStrategy;
        this.skipLines = skipLines;
        this.fields = fields;
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
        if (description != null) {
            ret = 31 * ret + description.hashCode();
        }
        if (fileFormat != null) {
            ret = 31 * ret + fileFormat.hashCode();
        }
        if (errorStrategy != null) {
            ret = 31 * ret + errorStrategy.hashCode();
        }
        if (delimiter != null) {
            ret = 31 * ret + delimiter.hashCode();
        }
        if (skipLines != null) {
            ret = 31 * ret + skipLines.hashCode();
        }
        if (fields != null) {
            ret = 31 * ret + fields.hashCode();
        }
        if (hooks != null) {
            ret = 31 * ret + hooks.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Layoutdto)) {
            return false;
        }
        Layoutdto other = (Layoutdto) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
            return false;
        }
        if ((description == null) != (other.description == null)) {
            return false;
        }
        if ((description != null) && !description.equals(other.description)) {
            return false;
        }
        if ((fileFormat == null) != (other.fileFormat == null)) {
            return false;
        }
        if ((fileFormat != null) && !fileFormat.equals(other.fileFormat)) {
            return false;
        }
        if ((errorStrategy == null) != (other.errorStrategy == null)) {
            return false;
        }
        if ((errorStrategy != null) && !errorStrategy.equals(other.errorStrategy)) {
            return false;
        }
        if ((delimiter == null) != (other.delimiter == null)) {
            return false;
        }
        if ((delimiter != null) && !delimiter.equals(other.delimiter)) {
            return false;
        }
        if ((skipLines == null) != (other.skipLines == null)) {
            return false;
        }
        if ((skipLines != null) && !skipLines.equals(other.skipLines)) {
            return false;
        }
        if ((fields == null) != (other.fields == null)) {
            return false;
        }
        if ((fields != null) && !fields.equals(other.fields)) {
            return false;
        }
        if ((hooks == null) != (other.hooks == null)) {
            return false;
        }
        if ((hooks != null) && !hooks.equals(other.hooks)) {
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
    	sb.append("description=").append(description == null ? "null" : description).append(", ");
    	sb.append("fileFormat=").append(fileFormat == null ? "null" : fileFormat).append(", ");
    	sb.append("errorStrategy=").append(errorStrategy == null ? "null" : errorStrategy).append(", ");
    	sb.append("delimiter=").append(delimiter == null ? "null" : delimiter).append(", ");
    	sb.append("skipLines=").append(skipLines == null ? "null" : skipLines).append(", ");
    	sb.append("fields=<");
    	if (fields == null) {
    		sb.append("null");
    	} else {
    		sb.append('[');
    		int last = fields.size() - 1;
    		for (int i = 0; i <= last; i++) {
    			fields.get(i).toString(sb, appended);
    			if (i < last) {
    				sb.append(", ");
    			}
    		}
    		sb.append(']');
    	}
    	sb.append('>').append(", ");
    	sb.append("hooks=<");
    	if (hooks == null) {
    		sb.append("null");
    	} else {
    		sb.append('[');
    		int last = hooks.size() - 1;
    		for (int i = 0; i <= last; i++) {
    			hooks.get(i).toString(sb, appended);
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
