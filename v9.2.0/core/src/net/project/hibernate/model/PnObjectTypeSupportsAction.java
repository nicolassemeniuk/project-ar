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

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PnObjectTypeSupportsAction generated by hbm2java
 */
@Entity
@Table(name = "PN_OBJECT_TYPE_SUPPORTS_ACTION")
public class PnObjectTypeSupportsAction implements Serializable {

	private PnObjectTypeSupportsActionPK comp_id;

	private Integer presentationSeq;

	private PnSecurityAction pnSecurityAction;

	private PnObjectType pnObjectType;

	public PnObjectTypeSupportsAction() {
	}

	public PnObjectTypeSupportsAction(PnObjectTypeSupportsActionPK comp_id) {
		this.comp_id = comp_id;
	}

	public PnObjectTypeSupportsAction(PnObjectTypeSupportsActionPK comp_id, Integer presentationSeq,
			PnSecurityAction pnSecurityAction, PnObjectType pnObjectType) {
		this.comp_id = comp_id;
		this.presentationSeq = presentationSeq;
		this.pnSecurityAction = pnSecurityAction;
		this.pnObjectType = pnObjectType;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "objectType", column = @Column(name = "OBJECT_TYPE", nullable = false, length = 80)),
			@AttributeOverride(name = "actionId", column = @Column(name = "ACTION_ID", nullable = false, length = 20)) })
	public PnObjectTypeSupportsActionPK getComp_id() {
		return this.comp_id;
	}

	public void setComp_id(PnObjectTypeSupportsActionPK comp_id) {
		this.comp_id = comp_id;
	}

	@Column(name = "PRESENTATION_SEQ", length = 3)
	public Integer getPresentationSeq() {
		return this.presentationSeq;
	}

	public void setPresentationSeq(Integer presentationSeq) {
		this.presentationSeq = presentationSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnSecurityAction.class)
	@JoinColumn(name = "ACTION_ID", insertable = false, updatable = false)
	public PnSecurityAction getPnSecurityAction() {
		return this.pnSecurityAction;
	}

	public void setPnSecurityAction(PnSecurityAction pnSecurityAction) {
		this.pnSecurityAction = pnSecurityAction;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnObjectType.class)
	@JoinColumn(name = "OBJECT_TYPE", insertable = false, updatable = false)
	public PnObjectType getPnObjectType() {
		return this.pnObjectType;
	}

	public void setPnObjectType(PnObjectType pnObjectType) {
		this.pnObjectType = pnObjectType;
	}

	public String toString() {
		return new ToStringBuilder(this).append("comp_id", getComp_id()).toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof PnObjectTypeSupportsAction))
			return false;
		PnObjectTypeSupportsAction castOther = (PnObjectTypeSupportsAction) other;
		return new EqualsBuilder().append(this.getComp_id(), castOther.getComp_id()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getComp_id()).toHashCode();
	}

}
