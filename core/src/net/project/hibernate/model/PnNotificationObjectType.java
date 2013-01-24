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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnNotificationObjectType generated by hbm2java
 */
@Entity
@Table(name = "PN_NOTIFICATION_OBJECT_TYPE")
public class PnNotificationObjectType implements Serializable {

	private String objectType;

	private String displayName;

	private String isSubscribable;

	private PnObjectType pnObjectType;

	private Set pnNotificationTypes = new HashSet(0);

	public PnNotificationObjectType() {
	}

	public PnNotificationObjectType(String objectType, Set pnNotificationTypes) {
		this.objectType = objectType;
		this.pnNotificationTypes = pnNotificationTypes;
	}

	public PnNotificationObjectType(String objectType, String displayName, String isSubscribable,
			PnObjectType pnObjectType, Set pnNotificationTypes) {
		this.objectType = objectType;
		this.displayName = displayName;
		this.isSubscribable = isSubscribable;
		this.pnObjectType = pnObjectType;
		this.pnNotificationTypes = pnNotificationTypes;
	}

	@Id
	@Column(name = "OBJECT_TYPE", nullable = false)
	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	@Column(name = "DISPLAY_NAME", length = 80)
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Column(name = "IS_SUBSCRIBABLE", length = 1)
	public String getIsSubscribable() {
		return this.isSubscribable;
	}

	public void setIsSubscribable(String isSubscribable) {
		this.isSubscribable = isSubscribable;
	}

	@OneToOne(fetch = FetchType.LAZY, targetEntity = PnObjectType.class)
	@JoinColumn(name="OBJECT_TYPE")
	public PnObjectType getPnObjectType() {
		return this.pnObjectType;
	}

	public void setPnObjectType(PnObjectType pnObjectType) {
		this.pnObjectType = pnObjectType;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnNotificationObjectType", targetEntity = PnNotificationType.class)
	@Transient
	public Set getPnNotificationTypes() {
		return this.pnNotificationTypes;
	}

	public void setPnNotificationTypes(Set pnNotificationTypes) {
		this.pnNotificationTypes = pnNotificationTypes;
	}

	public String toString() {
		return new ToStringBuilder(this).append("objectType", getObjectType()).toString();
	}

}