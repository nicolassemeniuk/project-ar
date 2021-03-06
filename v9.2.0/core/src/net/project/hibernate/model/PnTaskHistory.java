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
 * PnTaskHistory generated by hbm2java
 */
@Entity
@Table(name = "PN_TASK_HISTORY")
public class PnTaskHistory implements Serializable {

	private PnTaskHistoryPK comp_id;

	private String actionComment;

	private Date actionDate;

	private String actionName;

	private PnTask pnTask;

	private PnPerson pnPerson;

	private PnTaskActionLookup pnTaskActionLookup;

	public PnTaskHistory() {
	}

	public PnTaskHistory(PnTaskHistoryPK comp_id) {
		this.comp_id = comp_id;
	}

	public PnTaskHistory(net.project.hibernate.model.PnTaskHistoryPK comp_id,
			net.project.hibernate.model.PnPerson pnPerson,
			net.project.hibernate.model.PnTaskActionLookup pnTaskActionLookup) {
		this.comp_id = comp_id;
		this.pnPerson = pnPerson;
		this.pnTaskActionLookup = pnTaskActionLookup;
	}

	public PnTaskHistory(PnTaskHistoryPK comp_id, String actionComment, Date actionDate, String actionName,
			PnTask pnTask, PnPerson pnPerson, PnTaskActionLookup pnTaskActionLookup) {
		this.comp_id = comp_id;
		this.actionComment = actionComment;
		this.actionDate = actionDate;
		this.actionName = actionName;
		this.pnTask = pnTask;
		this.pnPerson = pnPerson;
		this.pnTaskActionLookup = pnTaskActionLookup;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "taskId", column = @Column(name = "TASK_ID", nullable = false, length = 20)),
			@AttributeOverride(name = "taskHistoryId", column = @Column(name = "TASK_HISTORY_ID", nullable = false, length = 20)) })
	public PnTaskHistoryPK getComp_id() {
		return this.comp_id;
	}

	public void setComp_id(PnTaskHistoryPK comp_id) {
		this.comp_id = comp_id;
	}

	@Column(name = "ACTION_COMMENT", length = 500)
	public String getActionComment() {
		return this.actionComment;
	}

	public void setActionComment(String actionComment) {
		this.actionComment = actionComment;
	}

	@Column(name = "ACTION_DATE", length = 7)
	public Date getActionDate() {
		return this.actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	@Column(name = "ACTION_NAME", length = 80)
	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnTask.class)
	@JoinColumn(name = "TASK_ID", insertable = false, updatable = false)
	public PnTask getPnTask() {
		return this.pnTask;
	}

	public void setPnTask(PnTask pnTask) {
		this.pnTask = pnTask;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnPerson.class)
	@JoinColumn(name = "ACTION_BY_ID")
	public PnPerson getPnPerson() {
		return this.pnPerson;
	}

	public void setPnPerson(PnPerson pnPerson) {
		this.pnPerson = pnPerson;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnTaskActionLookup.class)
	@JoinColumn(name = "ACTION")
	public PnTaskActionLookup getPnTaskActionLookup() {
		return this.pnTaskActionLookup;
	}

	public void setPnTaskActionLookup(PnTaskActionLookup pnTaskActionLookup) {
		this.pnTaskActionLookup = pnTaskActionLookup;
	}

	public String toString() {
		return new ToStringBuilder(this).append("comp_id", getComp_id()).toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof PnTaskHistory))
			return false;
		PnTaskHistory castOther = (PnTaskHistory) other;
		return new EqualsBuilder().append(this.getComp_id(), castOther.getComp_id()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getComp_id()).toHashCode();
	}

}
