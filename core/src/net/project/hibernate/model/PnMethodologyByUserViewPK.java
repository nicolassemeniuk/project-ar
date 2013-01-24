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

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnMethodologyByUserView generated by hbm2java
 */
@Embeddable
public class PnMethodologyByUserViewPK implements java.io.Serializable {

	/** identifier field */
	private BigDecimal methodologyId;

	/** identifier field */
	private String methodologyName;

	/** identifier field */
	private String methodologyDesc;

	/** identifier field */
	private Integer isGlobal;

	/** identifier field */
	private BigDecimal parentSpaceId;

	/** identifier field */
	private BigDecimal childSpaceId;

	/** identifier field */
	private BigDecimal personId;

	/** identifier field */
	private String person;

	/** identifier field */
	private String recordStatus;

	public PnMethodologyByUserViewPK() {
	}

	public PnMethodologyByUserViewPK(BigDecimal methodologyId, String methodologyName, String methodologyDesc,
			int isGlobal, BigDecimal parentSpaceId, BigDecimal childSpaceId, BigDecimal personId, String person,
			String recordStatus) {
		this.methodologyId = methodologyId;
		this.methodologyName = methodologyName;
		this.methodologyDesc = methodologyDesc;
		this.isGlobal = isGlobal;
		this.parentSpaceId = parentSpaceId;
		this.childSpaceId = childSpaceId;
		this.personId = personId;
		this.person = person;
		this.recordStatus = recordStatus;
	}

	@Column(name = "METHODOLOGY_ID", nullable = false, length = 20)
	public BigDecimal getMethodologyId() {
		return this.methodologyId;
	}

	public void setMethodologyId(BigDecimal methodologyId) {
		this.methodologyId = methodologyId;
	}

	@Column(name = "METHODOLOGY_NAME", nullable = false, length = 80)
	public String getMethodologyName() {
		return this.methodologyName;
	}

	public void setMethodologyName(String methodologyName) {
		this.methodologyName = methodologyName;
	}

	@Column(name = "METHODOLOGY_DESC", nullable = false, length = 1000)
	public String getMethodologyDesc() {
		return this.methodologyDesc;
	}

	public void setMethodologyDesc(String methodologyDesc) {
		this.methodologyDesc = methodologyDesc;
	}

	@Column(name = "IS_GLOBAL", nullable = false, length = 1)
	public int getIsGlobal() {
		return this.isGlobal;
	}

	public void setIsGlobal(int isGlobal) {
		this.isGlobal = isGlobal;
	}

	@Column(name = "PARENT_SPACE_ID", nullable = false, length = 20)
	public BigDecimal getParentSpaceId() {
		return this.parentSpaceId;
	}

	public void setParentSpaceId(BigDecimal parentSpaceId) {
		this.parentSpaceId = parentSpaceId;
	}

	@Column(name = "CHILD_SPACE_ID", nullable = false, length = 20)
	public BigDecimal getChildSpaceId() {
		return this.childSpaceId;
	}

	public void setChildSpaceId(BigDecimal childSpaceId) {
		this.childSpaceId = childSpaceId;
	}

	@Column(name = "PERSON_ID", nullable = false, length = 20)
	public BigDecimal getPersonId() {
		return this.personId;
	}

	public void setPersonId(BigDecimal personId) {
		this.personId = personId;
	}

	@Column(name = "PERSON", nullable = false, length = 4000)
	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	@Column(name = "RECORD_STATUS", nullable = false, length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String toString() {
		return new ToStringBuilder(this).append("methodologyId", getMethodologyId()).append("methodologyName",
				getMethodologyName()).append("methodologyDesc", getMethodologyDesc()).append("isGlobal", getIsGlobal())
				.append("parentSpaceId", getParentSpaceId()).append("childSpaceId", getChildSpaceId()).append(
						"personId", getPersonId()).append("person", getPerson()).append("recordStatus",
						getRecordStatus()).toString();
	}

}