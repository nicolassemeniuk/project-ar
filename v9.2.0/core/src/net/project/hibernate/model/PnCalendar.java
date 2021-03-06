package net.project.hibernate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnCalendar generated by hbm2java
 */
@Entity
@Table(name = "PN_CALENDAR")
public class PnCalendar implements java.io.Serializable {

	/** identifier field */
	private Integer calendarId;

	/** nullable persistent field */
	private String calendarName;

	/** nullable persistent field */
	private String calendarDescription;

	/** persistent field */
	private int isBaseCalendar;

	/** persistent field */
	private String recordStatus;

	/** nullable persistent field */
	private PnObject pnObject;

	/** persistent field */
	private Set pnSpaceHasCalendars = new HashSet(0);

	/** persistent field */
	private Set pnCalendarHasEvents = new HashSet(0);

	public PnCalendar() {
	}

	public PnCalendar(Integer calendarId, int isBaseCalendar, String recordStatus) {
		this.calendarId = calendarId;
		this.isBaseCalendar = isBaseCalendar;
		this.recordStatus = recordStatus;
	}

	public PnCalendar(Integer calendarId, String calendarName, String calendarDescription, int isBaseCalendar,
			String recordStatus, PnObject pnObject, Set pnSpaceHasCalendars, Set pnCalendarHasEvents) {
		this.calendarId = calendarId;
		this.calendarName = calendarName;
		this.calendarDescription = calendarDescription;
		this.isBaseCalendar = isBaseCalendar;
		this.recordStatus = recordStatus;
		this.pnObject = pnObject;
		this.pnSpaceHasCalendars = pnSpaceHasCalendars;
		this.pnCalendarHasEvents = pnCalendarHasEvents;
	}

	public PnCalendar(Integer calendarId, int isBaseCalendar, String calendarName, String calendarDescription,
			String recordStatus) {

		this.calendarId = calendarId;
		this.calendarName = calendarName;
		this.calendarDescription = calendarDescription;
		this.isBaseCalendar = isBaseCalendar;
		this.recordStatus = recordStatus;
	}

	/** minimal constructor */
	public PnCalendar(Integer calendarId, int isBaseCalendar, String recordStatus, Set pnSpaceHasCalendars,
			Set pnCalendarHasEvents) {
		this.calendarId = calendarId;
		this.isBaseCalendar = isBaseCalendar;
		this.recordStatus = recordStatus;
		this.pnSpaceHasCalendars = pnSpaceHasCalendars;
		this.pnCalendarHasEvents = pnCalendarHasEvents;
	}

	@Id
	@Column(name = "CALENDAR_ID", nullable = false)
	public Integer getCalendarId() {
		return this.calendarId;
	}

	public void setCalendarId(Integer calendarId) {
		this.calendarId = calendarId;
	}

	@Column(name = "CALENDAR_NAME")
	public String getCalendarName() {
		return this.calendarName;
	}

	public void setCalendarName(String calendarName) {
		this.calendarName = calendarName;
	}

	@Column(name = "CALENDAR_DESCRIPTION", length = 500)
	public String getCalendarDescription() {
		return this.calendarDescription;
	}

	public void setCalendarDescription(String calendarDescription) {
		this.calendarDescription = calendarDescription;
	}

	@Column(name = "IS_BASE_CALENDAR", nullable = false, length = 1)
	public int getIsBaseCalendar() {
		return this.isBaseCalendar;
	}

	public void setIsBaseCalendar(int isBaseCalendar) {
		this.isBaseCalendar = isBaseCalendar;
	}

	@Column(name = "RECORD_STATUS", nullable = false, length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	//@OneToOne(fetch = FetchType.LAZY, targetEntity = PnObject.class)
	//@JoinColumn(name = "CALENDAR_ID")
	@Transient
	public PnObject getPnObject() {
		return this.pnObject;
	}

	public void setPnObject(PnObject pnObject) {
		this.pnObject = pnObject;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnCalendar", targetEntity = PnSpaceHasCalendar.class)
	@Transient
	public Set getPnSpaceHasCalendars() {
		return this.pnSpaceHasCalendars;
	}

	public void setPnSpaceHasCalendars(Set pnSpaceHasCalendars) {
		this.pnSpaceHasCalendars = pnSpaceHasCalendars;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnCalendar", targetEntity = PnCalendarHasEvent.class)
	@Transient
	public Set getPnCalendarHasEvents() {
		return this.pnCalendarHasEvents;
	}

	public void setPnCalendarHasEvents(Set pnCalendarHasEvents) {
		this.pnCalendarHasEvents = pnCalendarHasEvents;
	}

	public String toString() {
		return new ToStringBuilder(this).append("calendarId", getCalendarId()).toString();
	}

}
