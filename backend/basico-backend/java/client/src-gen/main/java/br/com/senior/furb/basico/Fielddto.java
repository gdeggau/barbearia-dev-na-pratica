package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class Fielddto {
    
    public Long id;
    public String name;
    public FieldType fieldType;
    public Long start;
    public Long size;
    public String maskPattern;
    
    public Fielddto() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Fielddto(Long id, String name, FieldType fieldType, Long start, Long size, String maskPattern) {
        this.id = id;
        this.name = name;
        this.fieldType = fieldType;
        this.start = start;
        this.size = size;
        this.maskPattern = maskPattern;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Fielddto(Long id, String name, FieldType fieldType) {
        this.id = id;
        this.name = name;
        this.fieldType = fieldType;
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
        if (name != null) {
            ret = 31 * ret + name.hashCode();
        }
        if (fieldType != null) {
            ret = 31 * ret + fieldType.hashCode();
        }
        if (start != null) {
            ret = 31 * ret + start.hashCode();
        }
        if (size != null) {
            ret = 31 * ret + size.hashCode();
        }
        if (maskPattern != null) {
            ret = 31 * ret + maskPattern.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fielddto)) {
            return false;
        }
        Fielddto other = (Fielddto) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
            return false;
        }
        if ((name == null) != (other.name == null)) {
            return false;
        }
        if ((name != null) && !name.equals(other.name)) {
            return false;
        }
        if ((fieldType == null) != (other.fieldType == null)) {
            return false;
        }
        if ((fieldType != null) && !fieldType.equals(other.fieldType)) {
            return false;
        }
        if ((start == null) != (other.start == null)) {
            return false;
        }
        if ((start != null) && !start.equals(other.start)) {
            return false;
        }
        if ((size == null) != (other.size == null)) {
            return false;
        }
        if ((size != null) && !size.equals(other.size)) {
            return false;
        }
        if ((maskPattern == null) != (other.maskPattern == null)) {
            return false;
        }
        if ((maskPattern != null) && !maskPattern.equals(other.maskPattern)) {
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
    	sb.append("name=").append(name == null ? "null" : name).append(", ");
    	sb.append("fieldType=").append(fieldType == null ? "null" : fieldType).append(", ");
    	sb.append("start=").append(start == null ? "null" : start).append(", ");
    	sb.append("size=").append(size == null ? "null" : size).append(", ");
    	sb.append("maskPattern=").append(maskPattern == null ? "null" : maskPattern);
    	sb.append(']');
    }
    
}
