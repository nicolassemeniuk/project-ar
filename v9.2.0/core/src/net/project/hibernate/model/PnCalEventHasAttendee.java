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
// Generated Jun 13, 2009 11:41:49 PM by Hibernate Tools 3.2.4.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnCalEventHasAttendee generated by hbm2java
 */
@Entity
@Table(name="PN_CAL_EVENT_HAS_ATTENDEE"
)
public class PnCalEventHasAttendee  implements java.io.Serializable {

	 /** identifier field */
    private PnCalEventHasAttendeePK comp_id;
    /** persistent field */
    private Integer statusId;

    /** nullable persistent field */
    private String attendeeComment;
    
    /** nullable persistent field */
    private PnPerson pnPerson;
    
    /** nullable persistent field */
    private PnCalendarEvent pnCalendarEvent;

    public PnCalEventHasAttendee() {
    }

	
    public PnCalEventHasAttendee(PnCalEventHasAttendeePK comp_id, Integer statusId) {
        this.comp_id = comp_id;
        this.statusId = statusId;
    }
    public PnCalEventHasAttendee(PnCalEventHasAttendeePK comp_id, Integer statusId, String attendeeComment, PnPerson pnPerson, PnCalendarEvent pnCalendarEvent) {
       this.comp_id = comp_id;
       this.statusId = statusId;
       this.attendeeComment = attendeeComment;
       this.pnPerson = pnPerson;
       this.pnCalendarEvent = pnCalendarEvent;
    }
   
    @EmbeddedId
    @AttributeOverrides( {
    @AttributeOverride(name="personId", column=@Column(name="PERSON_ID", nullable=false, length=20) ), 
    @AttributeOverride(name="calendarEventId", column=@Column(name="CALENDAR_EVENT_ID", nullable=false, length=20) ) } )
    public PnCalEventHasAttendeePK getComp_id() {
        return this.comp_id;
    }
    
    public void setComp_id(PnCalEventHasAttendeePK comp_id) {
        this.comp_id = comp_id;
    }

    
    @Column(name="STATUS_ID", nullable=false, length=20)
    public Integer getStatusId() {
        return this.statusId;
    }
    
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    
    @Column(name="ATTENDEE_COMMENT", length=80)
    public String getAttendeeComment() {
        return this.attendeeComment;
    }
    
    public void setAttendeeComment(String attendeeComment) {
        this.attendeeComment = attendeeComment;
    }

    @ManyToOne(fetch=FetchType.LAZY, targetEntity=PnPerson.class)
    @JoinColumn(name="PERSON_ID", insertable=false, updatable=false)
    public PnPerson getPnPerson() {
        return this.pnPerson;
    }
    
    public void setPnPerson(PnPerson pnPerson) {
        this.pnPerson = pnPerson;
    }

    @ManyToOne(fetch=FetchType.LAZY, targetEntity=PnCalendarEvent.class)
    @JoinColumn(name="CALENDAR_EVENT_ID", insertable=false, updatable=false)
    public PnCalendarEvent getPnCalendarEvent() {
        return this.pnCalendarEvent;
    }
    
    public void setPnCalendarEvent(PnCalendarEvent pnCalendarEvent) {
        this.pnCalendarEvent = pnCalendarEvent;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnCalEventHasAttendee) ) return false;
        PnCalEventHasAttendee castOther = (PnCalEventHasAttendee) other;
        return new EqualsBuilder()
            .append(this.getComp_id(), castOther.getComp_id())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getComp_id())
            .toHashCode();
    }
}


