package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

/**
 * Represents a regular user event notification payload
 */
public class NotifyUserEventPayload {
    
    /**
     * Class of notification
     */
    public String notificationClass;
    /**
     * Origin of notification. Free text. Optional.
     */
    public String notificationOrigin;
    /**
     * Notification kind.
     */
    public UserNotificationKind notificationKind;
    /**
     * Notification priority.
     */
    public UserNotificationPriority notificationPriority;
    /**
     * Notification subject.
     */
    public String notificationSubject;
    /**
     * Notification content.
     */
    public String notificationContent;
    /**
     * Domain that generates the notification.
     */
    public String sourceDomain;
    /**
     * Service that generates the notification.
     */
    public String sourceService;
    /**
     * Username of the destination user.
     */
    public String destinationUser;
    /**
     * Notification link
     */
    public String link;
    
    public NotifyUserEventPayload() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public NotifyUserEventPayload(String notificationClass, String notificationOrigin, UserNotificationKind notificationKind, UserNotificationPriority notificationPriority, String notificationSubject, String notificationContent, String sourceDomain, String sourceService, String destinationUser, String link) {
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
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public NotifyUserEventPayload(UserNotificationKind notificationKind, UserNotificationPriority notificationPriority, String notificationSubject, String notificationContent, String sourceDomain, String sourceService, String destinationUser) {
        this.notificationKind = notificationKind;
        this.notificationPriority = notificationPriority;
        this.notificationSubject = notificationSubject;
        this.notificationContent = notificationContent;
        this.sourceDomain = sourceDomain;
        this.sourceService = sourceService;
        this.destinationUser = destinationUser;
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
        if (notificationClass != null) {
            ret = 31 * ret + notificationClass.hashCode();
        }
        if (notificationOrigin != null) {
            ret = 31 * ret + notificationOrigin.hashCode();
        }
        if (notificationKind != null) {
            ret = 31 * ret + notificationKind.hashCode();
        }
        if (notificationPriority != null) {
            ret = 31 * ret + notificationPriority.hashCode();
        }
        if (notificationSubject != null) {
            ret = 31 * ret + notificationSubject.hashCode();
        }
        if (notificationContent != null) {
            ret = 31 * ret + notificationContent.hashCode();
        }
        if (sourceDomain != null) {
            ret = 31 * ret + sourceDomain.hashCode();
        }
        if (sourceService != null) {
            ret = 31 * ret + sourceService.hashCode();
        }
        if (destinationUser != null) {
            ret = 31 * ret + destinationUser.hashCode();
        }
        if (link != null) {
            ret = 31 * ret + link.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotifyUserEventPayload)) {
            return false;
        }
        NotifyUserEventPayload other = (NotifyUserEventPayload) obj;
        if ((notificationClass == null) != (other.notificationClass == null)) {
            return false;
        }
        if ((notificationClass != null) && !notificationClass.equals(other.notificationClass)) {
            return false;
        }
        if ((notificationOrigin == null) != (other.notificationOrigin == null)) {
            return false;
        }
        if ((notificationOrigin != null) && !notificationOrigin.equals(other.notificationOrigin)) {
            return false;
        }
        if ((notificationKind == null) != (other.notificationKind == null)) {
            return false;
        }
        if ((notificationKind != null) && !notificationKind.equals(other.notificationKind)) {
            return false;
        }
        if ((notificationPriority == null) != (other.notificationPriority == null)) {
            return false;
        }
        if ((notificationPriority != null) && !notificationPriority.equals(other.notificationPriority)) {
            return false;
        }
        if ((notificationSubject == null) != (other.notificationSubject == null)) {
            return false;
        }
        if ((notificationSubject != null) && !notificationSubject.equals(other.notificationSubject)) {
            return false;
        }
        if ((notificationContent == null) != (other.notificationContent == null)) {
            return false;
        }
        if ((notificationContent != null) && !notificationContent.equals(other.notificationContent)) {
            return false;
        }
        if ((sourceDomain == null) != (other.sourceDomain == null)) {
            return false;
        }
        if ((sourceDomain != null) && !sourceDomain.equals(other.sourceDomain)) {
            return false;
        }
        if ((sourceService == null) != (other.sourceService == null)) {
            return false;
        }
        if ((sourceService != null) && !sourceService.equals(other.sourceService)) {
            return false;
        }
        if ((destinationUser == null) != (other.destinationUser == null)) {
            return false;
        }
        if ((destinationUser != null) && !destinationUser.equals(other.destinationUser)) {
            return false;
        }
        if ((link == null) != (other.link == null)) {
            return false;
        }
        if ((link != null) && !link.equals(other.link)) {
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
    	sb.append("link=").append(link == null ? "null" : link);
    	sb.append(']');
    }
    
}
