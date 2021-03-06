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
 * PnGroupHistory generated by hbm2java
 */
@Entity
@Table(name = "PN_GROUP_HISTORY")
public class PnGroupHistory implements java.io.Serializable {

	/** identifier field */
	private PnGroupHistoryPK comp_id;

	/** nullable persistent field */
	private String actionComment;

	/** nullable persistent field */
	private Date actionDate;

	/** nullable persistent field */
	private String actionName;

	/** nullable persistent field */
	private PnGroup pnGroup;

	/** persistent field */
	private PnGroupActionLookup pnGroupActionLookup;

	private PnPerson pnPerson;

	public PnGroupHistory() {
	}

	public PnGroupHistory(PnGroupHistoryPK comp_id) {
		this.comp_id = comp_id;
	}

	public PnGroupHistory(PnGroupHistoryPK comp_id, String actionComment, Date actionDate, String actionName,
			PnGroup pnGroup, PnGroupActionLookup pnGroupActionLookup, PnPerson pnPerson) {
		this.comp_id = comp_id;
		this.actionComment = actionComment;
		this.actionDate = actionDate;
		this.actionName = actionName;
		this.pnGroup = pnGroup;
		this.pnGroupActionLookup = pnGroupActionLookup;
		this.pnPerson = pnPerson;
	}

	/** minimal constructor */
	public PnGroupHistory(net.project.hibernate.model.PnGroupHistoryPK comp_id,
			net.project.hibernate.model.PnGroupActionLookup pnGroupActionLookup,
			net.project.hibernate.model.PnPerson pnPerson) {
		this.comp_id = comp_id;
		this.pnGroupActionLookup = pnGroupActionLookup;
		this.pnPerson = pnPerson;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "groupId", column = @Column(name = "GROUP_ID", nullable = false, length = 20)),
			@AttributeOverride(name = "groupHistoryId", column = @Column(name = "GROUP_HISTORY_ID", nullable = false, length = 20)) })
	public PnGroupHistoryPK getComp_id() {
		return this.comp_id;
	}

	public void setComp_id(PnGroupHistoryPK comp_id) {
		this.comp_id = comp_id;
	}

	@Column(name = "ACTION_COMMENT")
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

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnGroup.class)
	@JoinColumn(name = "GROUP_ID", insertable = false, updatable = false)
	public PnGroup getPnGroup() {
		return this.pnGroup;
	}

	public void setPnGroup(PnGroup pnGroup) {
		this.pnGroup = pnGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnGroupActionLookup.class)
	@JoinColumn(name = "ACTION")
	public PnGroupActionLookup getPnGroupActionLookup() {
		return this.pnGroupActionLookup;
	}

	public void setPnGroupActionLookup(PnGroupActionLookup pnGroupActionLookup) {
		this.pnGroupActionLookup = pnGroupActionLookup;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnPerson.class)
	@JoinColumn(name = "ACTION_BY_ID")
	public PnPerson getPnPerson() {
		return this.pnPerson;
	}

	public void setPnPerson(PnPerson pnPerson) {
		this.pnPerson = pnPerson;
	}

	public String toString() {
		return new ToStringBuilder(this).append("comp_id", getComp_id()).toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof PnGroupHistory))
			return false;
		PnGroupHistory castOther = (PnGroupHistory) other;
		return new EqualsBuilder().append(this.getComp_id(), castOther.getComp_id()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getComp_id()).toHashCode();
	}
}
