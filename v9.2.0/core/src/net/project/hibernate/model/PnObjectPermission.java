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
 * PnObjectPermission generated by hbm2java
 */
@Entity
@Table(name = "PN_OBJECT_PERMISSION")
public class PnObjectPermission implements Serializable {

	private PnObjectPermissionPK comp_id;

	private long actions;

	private PnGroup pnGroup;

	private PnObject pnObject;

	public PnObjectPermission() {
	}

	public PnObjectPermission(PnObjectPermissionPK comp_id, long actions) {
		this.comp_id = comp_id;
		this.actions = actions;
	}

	public PnObjectPermission(PnObjectPermissionPK comp_id, long actions, PnGroup pnGroup, PnObject pnObject) {
		this.comp_id = comp_id;
		this.actions = actions;
		this.pnGroup = pnGroup;
		this.pnObject = pnObject;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "objectId", column = @Column(name = "OBJECT_ID", nullable = false, length = 20)),
			@AttributeOverride(name = "groupId", column = @Column(name = "GROUP_ID", nullable = false, length = 20)) })
	public PnObjectPermissionPK getComp_id() {
		return this.comp_id;
	}

	public void setComp_id(PnObjectPermissionPK comp_id) {
		this.comp_id = comp_id;
	}

	@Column(name = "ACTIONS", nullable = false, length = 10)
	public long getActions() {
		return this.actions;
	}

	public void setActions(long actions) {
		this.actions = actions;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnGroup.class)
	@JoinColumn(name = "GROUP_ID", insertable = false, updatable = false)
	public PnGroup getPnGroup() {
		return this.pnGroup;
	}

	public void setPnGroup(PnGroup pnGroup) {
		this.pnGroup = pnGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnObject.class)
	@JoinColumn(name = "OBJECT_ID", insertable = false, updatable = false)
	public PnObject getPnObject() {
		return this.pnObject;
	}

	public void setPnObject(PnObject pnObject) {
		this.pnObject = pnObject;
	}

	public String toString() {
		return new ToStringBuilder(this).append("comp_id", getComp_id()).toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof PnObjectPermission))
			return false;
		PnObjectPermission castOther = (PnObjectPermission) other;
		return new EqualsBuilder().append(this.getComp_id(), castOther.getComp_id()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getComp_id()).toHashCode();
	}

}
