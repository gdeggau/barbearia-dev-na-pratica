package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

/**
 * Default blob reference type. Every service defines its own.
 */
public class BlobReference {
    
    /**
     * The domain the blob belongs to.
     */
    public String domainName;
    /**
     * The service the blob belongs to.
     */
    public String serviceName;
    /**
     * The basic id of the blob.
     */
    public String targetObjectId;
    /**
     * The id of the blob copy.
     */
    public String targetCopyId;
    
    public BlobReference() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public BlobReference(String domainName, String serviceName, String targetObjectId, String targetCopyId) {
        this.domainName = domainName;
        this.serviceName = serviceName;
        this.targetObjectId = targetObjectId;
        this.targetCopyId = targetCopyId;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public BlobReference(String targetObjectId) {
        this.targetObjectId = targetObjectId;
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
        if (domainName != null) {
            ret = 31 * ret + domainName.hashCode();
        }
        if (serviceName != null) {
            ret = 31 * ret + serviceName.hashCode();
        }
        if (targetObjectId != null) {
            ret = 31 * ret + targetObjectId.hashCode();
        }
        if (targetCopyId != null) {
            ret = 31 * ret + targetCopyId.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlobReference)) {
            return false;
        }
        BlobReference other = (BlobReference) obj;
        if ((domainName == null) != (other.domainName == null)) {
            return false;
        }
        if ((domainName != null) && !domainName.equals(other.domainName)) {
            return false;
        }
        if ((serviceName == null) != (other.serviceName == null)) {
            return false;
        }
        if ((serviceName != null) && !serviceName.equals(other.serviceName)) {
            return false;
        }
        if ((targetObjectId == null) != (other.targetObjectId == null)) {
            return false;
        }
        if ((targetObjectId != null) && !targetObjectId.equals(other.targetObjectId)) {
            return false;
        }
        if ((targetCopyId == null) != (other.targetCopyId == null)) {
            return false;
        }
        if ((targetCopyId != null) && !targetCopyId.equals(other.targetCopyId)) {
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
    	sb.append("domainName=").append(domainName == null ? "null" : domainName).append(", ");
    	sb.append("serviceName=").append(serviceName == null ? "null" : serviceName).append(", ");
    	sb.append("targetObjectId=").append(targetObjectId == null ? "null" : targetObjectId).append(", ");
    	sb.append("targetCopyId=").append(targetCopyId == null ? "null" : targetCopyId);
    	sb.append(']');
    }
    
}
