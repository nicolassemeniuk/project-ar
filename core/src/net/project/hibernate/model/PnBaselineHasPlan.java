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
 * PnBaselineHasPlan generated by hbm2java
 */
@Entity
@Table(name = "PN_BASELINE_HAS_PLAN")
public class PnBaselineHasPlan implements java.io.Serializable {

	private PnBaselineHasPlanPK comp_id;

	private Integer planVersionId;

	private PnBaseline pnBaseline;

	public PnBaselineHasPlan() {
	}

	public PnBaselineHasPlan(PnBaselineHasPlanPK comp_id, Integer planVersionId) {
		this.comp_id = comp_id;
		this.planVersionId = planVersionId;
	}

	public PnBaselineHasPlan(PnBaselineHasPlanPK comp_id, Integer planVersionId, PnBaseline pnBaseline) {
		this.comp_id = comp_id;
		this.planVersionId = planVersionId;
		this.pnBaseline = pnBaseline;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "baselineId", column = @Column(name = "BASELINE_ID", nullable = false, length = 20)),
			@AttributeOverride(name = "planId", column = @Column(name = "PLAN_ID", nullable = false, length = 20)) })
	public PnBaselineHasPlanPK getComp_id() {
		return this.comp_id;
	}

	public void setComp_id(PnBaselineHasPlanPK comp_id) {
		this.comp_id = comp_id;
	}

	@Column(name = "PLAN_VERSION_ID", nullable = false, length = 20)
	public Integer getPlanVersionId() {
		return this.planVersionId;
	}

	public void setPlanVersionId(Integer planVersionId) {
		this.planVersionId = planVersionId;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnBaseline.class)
	@JoinColumn(name = "BASELINE_ID", insertable = false, updatable = false)
	public PnBaseline getPnBaseline() {
		return this.pnBaseline;
	}

	public void setPnBaseline(PnBaseline pnBaseline) {
		this.pnBaseline = pnBaseline;
	}

	public String toString() {
		return new ToStringBuilder(this).append("comp_id", getComp_id()).toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof PnBaselineHasPlan))
			return false;
		PnBaselineHasPlan castOther = (PnBaselineHasPlan) other;
		return new EqualsBuilder().append(this.getComp_id(), castOther.getComp_id()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getComp_id()).toHashCode();
	}

}