package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class ObterUrlUploadFotoOutput {
    
    /**
     * identificador da foto
     */
    public String id;
    /**
     * versão do arquivo para commit
     */
    public String version;
    /**
     * url para upload da foto
     */
    public String url;
    
    public ObterUrlUploadFotoOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ObterUrlUploadFotoOutput(String id, String version, String url) {
        this.id = id;
        this.version = version;
        this.url = url;
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
        if (version != null) {
            ret = 31 * ret + version.hashCode();
        }
        if (url != null) {
            ret = 31 * ret + url.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObterUrlUploadFotoOutput)) {
            return false;
        }
        ObterUrlUploadFotoOutput other = (ObterUrlUploadFotoOutput) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
            return false;
        }
        if ((version == null) != (other.version == null)) {
            return false;
        }
        if ((version != null) && !version.equals(other.version)) {
            return false;
        }
        if ((url == null) != (other.url == null)) {
            return false;
        }
        if ((url != null) && !url.equals(other.url)) {
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
    	sb.append("version=").append(version == null ? "null" : version).append(", ");
    	sb.append("url=").append(url == null ? "null" : url);
    	sb.append(']');
    }
    
}
