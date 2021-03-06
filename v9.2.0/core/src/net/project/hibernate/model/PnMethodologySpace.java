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

import java.sql.Clob;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnMethodologySpace generated by hbm2java
 */
@Entity
@Table(name = "PN_METHODOLOGY_SPACE")
public class PnMethodologySpace implements java.io.Serializable {

	/** identifier field */
	private Integer methodologyId;

	/** nullable persistent field */
	private String methodologyName;

	/** nullable persistent field */
	private String methodologyDesc;

	/** nullable persistent field */
	private Integer statusId;

	/** persistent field */
	private Integer createdById;

	/** nullable persistent field */
	private Date createdDate;

	/** persistent field */
	private Integer modifiedById;

	/** nullable persistent field */
	private Date modifiedDate;

	/** nullable persistent field */
	private String recordStatus;

	/** nullable persistent field */
	private Date crc;

	/** nullable persistent field */
	private Clob useScenarioClob;

	/** persistent field */
	private int isGlobal;

	/** persistent field */
	private Integer isUsed;

	private Set pnSpaceHasMethodologies = new HashSet(0);

	public PnMethodologySpace() {
	}

	public PnMethodologySpace(Integer methodologyId, Integer createdById, Integer modifiedById, int isGlobal,
			Integer isUsed) {
		this.methodologyId = methodologyId;
		this.createdById = createdById;
		this.modifiedById = modifiedById;
		this.isGlobal = isGlobal;
		this.isUsed = isUsed;
	}

	public PnMethodologySpace(Integer methodologyId, String methodologyName, String methodologyDesc, Integer statusId,
			Integer createdById, Date createdDate, Integer modifiedById, Date modifiedDate, String recordStatus,
			Date crc, Clob useScenarioClob, int isGlobal, Integer isUsed, Set pnSpaceHasMethodologies) {
		this.methodologyId = methodologyId;
		this.methodologyName = methodologyName;
		this.methodologyDesc = methodologyDesc;
		this.statusId = statusId;
		this.createdById = createdById;
		this.createdDate = createdDate;
		this.modifiedById = modifiedById;
		this.modifiedDate = modifiedDate;
		this.recordStatus = recordStatus;
		this.crc = crc;
		this.useScenarioClob = useScenarioClob;
		this.isGlobal = isGlobal;
		this.isUsed = isUsed;
		this.pnSpaceHasMethodologies = pnSpaceHasMethodologies;
	}

	/** minimal constructor */
	public PnMethodologySpace(Integer methodologyId, Integer createdById, Integer modifiedById, int isGlobal,
			Set pnSpaceHasMethodologies) {
		this.methodologyId = methodologyId;
		this.createdById = createdById;
		this.modifiedById = modifiedById;
		this.isGlobal = isGlobal;
		this.pnSpaceHasMethodologies = pnSpaceHasMethodologies;
	}

	@Id
	@Column(name = "METHODOLOGY_ID", nullable = false)
	public Integer getMethodologyId() {
		return this.methodologyId;
	}

	public void setMethodologyId(Integer methodologyId) {
		this.methodologyId = methodologyId;
	}

	@Column(name = "METHODOLOGY_NAME", length = 80)
	public String getMethodologyName() {
		return this.methodologyName;
	}

	public void setMethodologyName(String methodologyName) {
		this.methodologyName = methodologyName;
	}

	@Column(name = "METHODOLOGY_DESC", length = 1000)
	public String getMethodologyDesc() {
		return this.methodologyDesc;
	}

	public void setMethodologyDesc(String methodologyDesc) {
		this.methodologyDesc = methodologyDesc;
	}

	@Column(name = "STATUS_ID", length = 20)
	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	@Column(name = "CREATED_BY_ID", nullable = false, length = 20)
	public Integer getCreatedById() {
		return this.createdById;
	}

	public void setCreatedById(Integer createdById) {
		this.createdById = createdById;
	}

	@Column(name = "CREATED_DATE", length = 7)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "MODIFIED_BY_ID", nullable = false, length = 20)
	public Integer getModifiedById() {
		return this.modifiedById;
	}

	public void setModifiedById(Integer modifiedById) {
		this.modifiedById = modifiedById;
	}

	@Column(name = "MODIFIED_DATE", length = 7)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Column(name = "RECORD_STATUS", length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	@Column(name = "CRC", length = 7)
	public Date getCrc() {
		return this.crc;
	}

	public void setCrc(Date crc) {
		this.crc = crc;
	}

	@Column(name = "USE_SCENARIO_CLOB", length = 4000)
	public Clob getUseScenarioClob() {
		return this.useScenarioClob;
	}

	public void setUseScenarioClob(Clob useScenarioClob) {
		this.useScenarioClob = useScenarioClob;
	}

	@Column(name = "IS_GLOBAL", nullable = false, length = 1)
	public int getIsGlobal() {
		return this.isGlobal;
	}

	public void setIsGlobal(int isGlobal) {
		this.isGlobal = isGlobal;
	}

	@Column(name = "IS_USED", nullable = false, length = 1)
	public Integer getIsUsed() {
		return this.isUsed;
	}

	public void setIsUsed(Integer isUsed) {
		this.isUsed = isUsed;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnMethodologySpace", targetEntity = PnSpaceHasMethodology.class)
	@Transient
	public Set getPnSpaceHasMethodologies() {
		return this.pnSpaceHasMethodologies;
	}

	public void setPnSpaceHasMethodologies(Set pnSpaceHasMethodologies) {
		this.pnSpaceHasMethodologies = pnSpaceHasMethodologies;
	}

	public String toString() {
		return new ToStringBuilder(this).append("methodologyId", getMethodologyId()).toString();
	}

}
