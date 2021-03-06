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
import javax.persistence.Transient;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnDiscussionHistory generated by hbm2java
 */
@Entity
@Table(name = "PN_DISCUSSION_HISTORY")
public class PnDiscussionHistory implements java.io.Serializable {

	/** identifier field */
	private PnDiscussionHistoryPK comp_id;

	/** nullable persistent field */
	private String actionComment;

	/** nullable persistent field */
	private Date actionDate;

	/** nullable persistent field */
	private String actionName;

	/** nullable persistent field */
	private PnDiscussionGroup pnDiscussionGroup;

	/** persistent field */
	private PnPerson pnPerson;

	/** persistent field */
	private PnDiscussionActionLookup pnDiscussionActionLookup;

	public PnDiscussionHistory() {
	}

	public PnDiscussionHistory(PnDiscussionHistoryPK comp_id) {
		this.comp_id = comp_id;
	}

	public PnDiscussionHistory(PnDiscussionHistoryPK comp_id, String actionComment, Date actionDate, String actionName,
			PnDiscussionGroup pnDiscussionGroup, PnPerson pnPerson, PnDiscussionActionLookup pnDiscussionActionLookup) {
		this.comp_id = comp_id;
		this.actionComment = actionComment;
		this.actionDate = actionDate;
		this.actionName = actionName;
		this.pnDiscussionGroup = pnDiscussionGroup;
		this.pnPerson = pnPerson;
		this.pnDiscussionActionLookup = pnDiscussionActionLookup;
	}

	/** minimal constructor */
	public PnDiscussionHistory(net.project.hibernate.model.PnDiscussionHistoryPK comp_id,
			net.project.hibernate.model.PnPerson pnPerson,
			net.project.hibernate.model.PnDiscussionActionLookup pnDiscussionActionLookup) {
		this.comp_id = comp_id;
		this.pnPerson = pnPerson;
		this.pnDiscussionActionLookup = pnDiscussionActionLookup;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "discussionGroupId", column = @Column(name = "DISCUSSION_GROUP_ID", nullable = false, length = 20)),
			@AttributeOverride(name = "discussionGroupHistoryId", column = @Column(name = "DISCUSSION_GROUP_HISTORY_ID", nullable = false, length = 20)) })
	public PnDiscussionHistoryPK getComp_id() {
		return this.comp_id;
	}

	public void setComp_id(PnDiscussionHistoryPK comp_id) {
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

	//@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnDiscussionGroup.class)
	//@JoinColumn(name = "DISCUSSION_GROUP_ID", insertable = false, updatable = false)
	@Transient
	public PnDiscussionGroup getPnDiscussionGroup() {
		return this.pnDiscussionGroup;
	}

	public void setPnDiscussionGroup(PnDiscussionGroup pnDiscussionGroup) {
		this.pnDiscussionGroup = pnDiscussionGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnPerson.class)
	@JoinColumn(name = "ACTION_BY_ID")
	public PnPerson getPnPerson() {
		return this.pnPerson;
	}

	public void setPnPerson(PnPerson pnPerson) {
		this.pnPerson = pnPerson;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnDiscussionActionLookup.class)
	@JoinColumn(name = "ACTION")
	public PnDiscussionActionLookup getPnDiscussionActionLookup() {
		return this.pnDiscussionActionLookup;
	}

	public void setPnDiscussionActionLookup(PnDiscussionActionLookup pnDiscussionActionLookup) {
		this.pnDiscussionActionLookup = pnDiscussionActionLookup;
	}

	public String toString() {
		return new ToStringBuilder(this).append("comp_id", getComp_id()).toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof PnDiscussionHistory))
			return false;
		PnDiscussionHistory castOther = (PnDiscussionHistory) other;
		return new EqualsBuilder().append(this.getComp_id(), castOther.getComp_id()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getComp_id()).toHashCode();
	}
}
