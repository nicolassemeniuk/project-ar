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
 * PnObjectHasSubscription generated by hbm2java
 */
@Entity
@Table(name = "PN_OBJECT_HAS_SUBSCRIPTION")
public class PnObjectHasSubscription implements Serializable {

	private PnObjectHasSubscriptionPK comp_id;

	private PnSubscription pnSubscription;

	public PnObjectHasSubscription() {
	}

	public PnObjectHasSubscription(PnObjectHasSubscriptionPK comp_id) {
		this.comp_id = comp_id;
	}

	public PnObjectHasSubscription(PnObjectHasSubscriptionPK comp_id, PnSubscription pnSubscription) {
		this.comp_id = comp_id;
		this.pnSubscription = pnSubscription;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "subscriptionId", column = @Column(name = "SUBSCRIPTION_ID", nullable = false, length = 20)),
			@AttributeOverride(name = "objectId", column = @Column(name = "OBJECT_ID", nullable = false, length = 20)) })
	public PnObjectHasSubscriptionPK getComp_id() {
		return this.comp_id;
	}

	public void setComp_id(PnObjectHasSubscriptionPK comp_id) {
		this.comp_id = comp_id;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnSubscription.class)
	@JoinColumn(name = "SUBSCRIPTION_ID", insertable = false, updatable = false)
	public PnSubscription getPnSubscription() {
		return this.pnSubscription;
	}

	public void setPnSubscription(PnSubscription pnSubscription) {
		this.pnSubscription = pnSubscription;
	}

	public String toString() {
		return new ToStringBuilder(this).append("comp_id", getComp_id()).toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof PnObjectHasSubscription))
			return false;
		PnObjectHasSubscription castOther = (PnObjectHasSubscription) other;
		return new EqualsBuilder().append(this.getComp_id(), castOther.getComp_id()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getComp_id()).toHashCode();
	}

}