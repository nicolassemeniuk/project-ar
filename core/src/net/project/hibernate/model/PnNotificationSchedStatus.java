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
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnNotificationSchedStatus generated by hbm2java
 */
@Entity
@Table(name = "PN_NOTIFICATION_SCHED_STATUS")
public class PnNotificationSchedStatus implements Serializable {

	private Integer schedulerId;

	private Date lastCheckDatetime;

	public PnNotificationSchedStatus() {
	}

	public PnNotificationSchedStatus(Integer schedulerId, Date lastCheckDatetime) {
		this.schedulerId = schedulerId;
		this.lastCheckDatetime = lastCheckDatetime;
	}

	@Id
	@Column(name = "SCHEDULER_ID", nullable = false)
	public Integer getSchedulerId() {
		return this.schedulerId;
	}

	public void setSchedulerId(Integer schedulerId) {
		this.schedulerId = schedulerId;
	}

	@Column(name = "LAST_CHECK_DATETIME", nullable = false, length = 7)
	public Date getLastCheckDatetime() {
		return this.lastCheckDatetime;
	}

	public void setLastCheckDatetime(Date lastCheckDatetime) {
		this.lastCheckDatetime = lastCheckDatetime;
	}

	public String toString() {
		return new ToStringBuilder(this).append("schedulerId", getSchedulerId()).toString();
	}

}