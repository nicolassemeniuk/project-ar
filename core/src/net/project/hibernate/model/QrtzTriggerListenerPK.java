/* 
 * Copyright 2000-2009 Project.net Inc.
 *
 * This file is part of Project.net.
 * Project.net is free software: you can redistribute it and/or modify it under the terms of 
 * the GNU General Public License as published by the Free Software Foundation, version 3 of the License.
 * 
 * Project.net is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Project.net.
 * If not, see http://www.gnu.org/licenses/gpl-3.0.html
*/
package net.project.hibernate.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QrtzTriggerListenerPK generated by hbm2java
 */
@Embeddable
public class QrtzTriggerListenerPK implements Serializable {


     private String triggerName;
     private String triggerGroup;
     private String triggerListener;

    public QrtzTriggerListenerPK() {
    }

    public QrtzTriggerListenerPK(String triggerName, String triggerGroup, String triggerListener) {
       this.triggerName = triggerName;
       this.triggerGroup = triggerGroup;
       this.triggerListener = triggerListener;
    }
   


    @Column(name="TRIGGER_NAME", nullable=false, length=80)
    public String getTriggerName() {
        return this.triggerName;
    }
    
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }


    @Column(name="TRIGGER_GROUP", nullable=false, length=80)
    public String getTriggerGroup() {
        return this.triggerGroup;
    }
    
    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }


    @Column(name="TRIGGER_LISTENER", nullable=false, length=80)
    public String getTriggerListener() {
        return this.triggerListener;
    }
    
    public void setTriggerListener(String triggerListener) {
        this.triggerListener = triggerListener;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("triggerName", getTriggerName())
            .append("triggerGroup", getTriggerGroup())
            .append("triggerListener", getTriggerListener())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof QrtzTriggerListenerPK) ) return false;
        QrtzTriggerListenerPK castOther = (QrtzTriggerListenerPK) other;
        return new EqualsBuilder()
            .append(this.getTriggerName(), castOther.getTriggerName())
            .append(this.getTriggerGroup(), castOther.getTriggerGroup())
            .append(this.getTriggerListener(), castOther.getTriggerListener())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getTriggerName())
            .append(getTriggerGroup())
            .append(getTriggerListener())
            .toHashCode();
    }

}