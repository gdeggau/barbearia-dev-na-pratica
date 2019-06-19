package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

/**
 * Represents an email notification payload
 */
public class EmailNotifyUserEventPayload extends NotifyUserEventPayload {
    
    /**
     * Email sender address
     */
    public String from;
    /**
     * Additional recipients to send the email to
     */
    public java.util.List<String> sendTo;
    /**
     * Email format
     */
    public EventEmailFormat format;
    
    public EmailNotifyUserEventPayload() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public EmailNotifyUserEventPayload(String notificationClass, String notificationOrigin, UserNotificationKind notificationKind, UserNotificationPriority notificationPriority, String notificationSubject, String notificationContent, String sourceDomain, String sourceService, String destinationUser, String link, String from, java.util.List<String> sendTo, EventEmailFormat format) {
        this.notificationClass = notificationClass;
        this.notificationOrigin = notificationOrigin;
        this.notificationKind = notificationKind;
        this.notificationPriority = notificationPriority;
        this.notificationSubject = notificationSubject;
        this.notificationContent = notificationContent;
        this.sourceDomain = sourceDomain;
        this.sourceService = sourceService;
        this.destinationUser = destinationUser;
        this.link = link;
        this.from = from;
        this.sendTo = sendTo;
        this.format = format;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public EmailNotifyUserEventPayload(UserNotificationKind notificationKind, UserNotificationPriority notificationPriority, String notificationSubject, String notificationContent, String sourceDomain, String sourceService, String destinationUser, String from) {
        this.notificationKind = notificationKind;
        this.notificationPriority = notificationPriority;
        this.notificationSubject = notificationSubject;
        this.notificationContent = notificationContent;
        this.sourceDomain = sourceDomain;
        this.sourceService = sourceService;
        this.destinationUser = destinationUser;
        this.from = from;
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
        int ret = super.hashCode();
        if (from != null) {
            ret = 31 * ret + from.hashCode();
        }
        if (sendTo != null) {
            ret = 31 * ret + sendTo.hashCode();
        }
        if (format != null) {
            ret = 31 * ret + format.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailNotifyUserEventPayload)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        EmailNotifyUserEventPayload other = (EmailNotifyUserEventPayload) obj;
        if ((from == null) != (other.from == null)) {
            return false;
        }
        if ((from != null) && !from.equals(other.from)) {
            return false;
        }
        if ((sendTo == null) != (other.sendTo == null)) {
            return false;
        }
        if ((sendTo != null) && !sendTo.equals(other.sendTo)) {
            return false;
        }
        if ((format == null) != (other.format == null)) {
            return false;
        }
        if ((format != null) && !format.equals(other.format)) {
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
    	sb.append("notificationClass=").append(notificationClass == null ? "null" : notificationClass).append(", ");
    	sb.append("notificationOrigin=").append(notificationOrigin == null ? "null" : notificationOrigin).append(", ");
    	sb.append("notificationKind=").append(notificationKind == null ? "null" : notificationKind).append(", ");
    	sb.append("notificationPriority=").append(notificationPriority == null ? "null" : notificationPriority).append(", ");
    	sb.append("notificationSubject=").append(notificationSubject == null ? "null" : notificationSubject).append(", ");
    	sb.append("notificationContent=").append(notificationContent == null ? "null" : notificationContent).append(", ");
    	sb.append("sourceDomain=").append(sourceDomain == null ? "null" : sourceDomain).append(", ");
    	sb.append("sourceService=").append(sourceService == null ? "null" : sourceService).append(", ");
    	sb.append("destinationUser=").append(destinationUser == null ? "null" : destinationUser).append(", ");
    	sb.append("link=").append(link == null ? "null" : link).append(", ");
    	sb.append("from=").append(from == null ? "null" : from).append(", ");
    	sb.append("sendTo=").append(sendTo == null ? "null" : sendTo).append(", ");
    	sb.append("format=").append(format == null ? "null" : format);
    	sb.append(']');
    }
    
}
