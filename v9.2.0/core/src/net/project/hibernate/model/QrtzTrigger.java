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
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * QrtzTrigger generated by hbm2java
 */
@Entity
@Table(name = "QRTZ_TRIGGERS")
public class QrtzTrigger implements Serializable {

	private QrtzTriggerPK comp_id;

	private String isVolatile;

	private String description;

	private Long nextFireTime;

	private Long prevFireTime;

	private String triggerState;

	private String triggerType;

	private long startTime;

	private Long endTime;

	private String calendarName;

	private Integer misfireInstr;

	private Set qrtzTriggerListeners = new HashSet(0);

	private QrtzBlobTrigger qrtzBlobTrigger;

	private QrtzSimpleTrigger qrtzSimpleTrigger;

	private QrtzCronTrigger qrtzCronTrigger;

	private QrtzJobDetail qrtzJobDetail;

	public QrtzTrigger() {
	}

	public QrtzTrigger(QrtzTriggerPK comp_id, String isVolatile, String triggerState, String triggerType, long startTime) {
		this.comp_id = comp_id;
		this.isVolatile = isVolatile;
		this.triggerState = triggerState;
		this.triggerType = triggerType;
		this.startTime = startTime;
	}

	public QrtzTrigger(QrtzTriggerPK comp_id, String isVolatile, String description, Long nextFireTime,
			Long prevFireTime, String triggerState, String triggerType, long startTime, Long endTime,
			String calendarName, Integer misfireInstr, Set qrtzTriggerListeners, QrtzBlobTrigger qrtzBlobTrigger,
			QrtzSimpleTrigger qrtzSimpleTrigger, QrtzCronTrigger qrtzCronTrigger, QrtzJobDetail qrtzJobDetail) {
		this.comp_id = comp_id;
		this.isVolatile = isVolatile;
		this.description = description;
		this.nextFireTime = nextFireTime;
		this.prevFireTime = prevFireTime;
		this.triggerState = triggerState;
		this.triggerType = triggerType;
		this.startTime = startTime;
		this.endTime = endTime;
		this.calendarName = calendarName;
		this.misfireInstr = misfireInstr;
		this.qrtzTriggerListeners = qrtzTriggerListeners;
		this.qrtzBlobTrigger = qrtzBlobTrigger;
		this.qrtzSimpleTrigger = qrtzSimpleTrigger;
		this.qrtzCronTrigger = qrtzCronTrigger;
		this.qrtzJobDetail = qrtzJobDetail;
	}

	/** minimal constructor */
	public QrtzTrigger(net.project.hibernate.model.QrtzTriggerPK comp_id, String isVolatile, String triggerState,
			String triggerType, long startTime, net.project.hibernate.model.QrtzJobDetail qrtzJobDetail,
			Set qrtzTriggerListeners) {
		this.comp_id = comp_id;
		this.isVolatile = isVolatile;
		this.triggerState = triggerState;
		this.triggerType = triggerType;
		this.startTime = startTime;
		this.qrtzJobDetail = qrtzJobDetail;
		this.qrtzTriggerListeners = qrtzTriggerListeners;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "triggerName", column = @Column(name = "TRIGGER_NAME", nullable = false, length = 80)),
			@AttributeOverride(name = "triggerGroup", column = @Column(name = "TRIGGER_GROUP", nullable = false, length = 80)) })
	public QrtzTriggerPK getComp_id() {
		return this.comp_id;
	}

	public void setComp_id(QrtzTriggerPK comp_id) {
		this.comp_id = comp_id;
	}

	@Column(name = "IS_VOLATILE", nullable = false, length = 1)
	public String getIsVolatile() {
		return this.isVolatile;
	}

	public void setIsVolatile(String isVolatile) {
		this.isVolatile = isVolatile;
	}

	@Column(name = "DESCRIPTION", length = 120)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "NEXT_FIRE_TIME", length = 13)
	public Long getNextFireTime() {
		return this.nextFireTime;
	}

	public void setNextFireTime(Long nextFireTime) {
		this.nextFireTime = nextFireTime;
	}

	@Column(name = "PREV_FIRE_TIME", length = 13)
	public Long getPrevFireTime() {
		return this.prevFireTime;
	}

	public void setPrevFireTime(Long prevFireTime) {
		this.prevFireTime = prevFireTime;
	}

	@Column(name = "TRIGGER_STATE", nullable = false, length = 16)
	public String getTriggerState() {
		return this.triggerState;
	}

	public void setTriggerState(String triggerState) {
		this.triggerState = triggerState;
	}

	@Column(name = "TRIGGER_TYPE", nullable = false, length = 8)
	public String getTriggerType() {
		return this.triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

	@Column(name = "START_TIME", nullable = false, length = 13)
	public long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	@Column(name = "END_TIME", length = 13)
	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	@Column(name = "CALENDAR_NAME", length = 80)
	public String getCalendarName() {
		return this.calendarName;
	}

	public void setCalendarName(String calendarName) {
		this.calendarName = calendarName;
	}

	@Column(name = "MISFIRE_INSTR", length = 2)
	public Integer getMisfireInstr() {
		return this.misfireInstr;
	}

	public void setMisfireInstr(Integer misfireInstr) {
		this.misfireInstr = misfireInstr;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "qrtzTrigger", targetEntity = QrtzTriggerListener.class)
	@Transient
	public Set getQrtzTriggerListeners() {
		return this.qrtzTriggerListeners;
	}

	public void setQrtzTriggerListeners(Set qrtzTriggerListeners) {
		this.qrtzTriggerListeners = qrtzTriggerListeners;
	}

	@OneToOne(fetch = FetchType.LAZY, targetEntity = QrtzBlobTrigger.class)
	public QrtzBlobTrigger getQrtzBlobTrigger() {
		return this.qrtzBlobTrigger;
	}

	public void setQrtzBlobTrigger(QrtzBlobTrigger qrtzBlobTrigger) {
		this.qrtzBlobTrigger = qrtzBlobTrigger;
	}

	@OneToOne(fetch = FetchType.LAZY, targetEntity = QrtzSimpleTrigger.class)
	public QrtzSimpleTrigger getQrtzSimpleTrigger() {
		return this.qrtzSimpleTrigger;
	}

	public void setQrtzSimpleTrigger(QrtzSimpleTrigger qrtzSimpleTrigger) {
		this.qrtzSimpleTrigger = qrtzSimpleTrigger;
	}

	@OneToOne(fetch = FetchType.LAZY, targetEntity = QrtzCronTrigger.class)
	public QrtzCronTrigger getQrtzCronTrigger() {
		return this.qrtzCronTrigger;
	}

	public void setQrtzCronTrigger(QrtzCronTrigger qrtzCronTrigger) {
		this.qrtzCronTrigger = qrtzCronTrigger;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = QrtzJobDetail.class)
	@JoinColumns( { @JoinColumn(name = "JOB_NAME", referencedColumnName = "JOB_NAME"),
			@JoinColumn(name = "JOB_GROUP", referencedColumnName = "JOB_GROUP") })
	public QrtzJobDetail getQrtzJobDetail() {
		return this.qrtzJobDetail;
	}

	public void setQrtzJobDetail(QrtzJobDetail qrtzJobDetail) {
		this.qrtzJobDetail = qrtzJobDetail;
	}

	public String toString() {
		return new ToStringBuilder(this).append("comp_id", getComp_id()).toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof QrtzTrigger))
			return false;
		QrtzTrigger castOther = (QrtzTrigger) other;
		return new EqualsBuilder().append(this.getComp_id(), castOther.getComp_id()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getComp_id()).toHashCode();
	}

}
