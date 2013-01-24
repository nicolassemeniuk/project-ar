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
 * PnWorkflowStatus generated by hbm2java
 */
@Entity
@Table(name = "PN_WORKFLOW_STATUS")
public class PnWorkflowStatus implements Serializable {

	private Integer statusId;

	private String statusName;

	private String statusDescription;

	private int isInactive;

	private Integer createdById;

	private Date createdDatetime;

	private Integer modifiedById;

	private Date modifiedDatetime;

	private Date crc;

	private String recordStatus;

	private Set pnEnvelopeVersions = new HashSet(0);

	public PnWorkflowStatus() {
	}

	public PnWorkflowStatus(Integer statusId, int isInactive, Integer createdById, Date createdDatetime, Date crc,
			String recordStatus) {
		this.statusId = statusId;
		this.isInactive = isInactive;
		this.createdById = createdById;
		this.createdDatetime = createdDatetime;
		this.crc = crc;
		this.recordStatus = recordStatus;
	}

	public PnWorkflowStatus(Integer statusId, int isInactive, Integer createdById, Date createdDatetime, Date crc,
			String recordStatus, Set pnEnvelopeVersions) {
		this.statusId = statusId;
		this.isInactive = isInactive;
		this.createdById = createdById;
		this.createdDatetime = createdDatetime;
		this.crc = crc;
		this.recordStatus = recordStatus;
		this.pnEnvelopeVersions = pnEnvelopeVersions;
	}

	public PnWorkflowStatus(Integer statusId, String statusName, String statusDescription, int isInactive,
			Integer createdById, Date createdDatetime, Integer modifiedById, Date modifiedDatetime, Date crc,
			String recordStatus, Set pnEnvelopeVersions) {
		this.statusId = statusId;
		this.statusName = statusName;
		this.statusDescription = statusDescription;
		this.isInactive = isInactive;
		this.createdById = createdById;
		this.createdDatetime = createdDatetime;
		this.modifiedById = modifiedById;
		this.modifiedDatetime = modifiedDatetime;
		this.crc = crc;
		this.recordStatus = recordStatus;
		this.pnEnvelopeVersions = pnEnvelopeVersions;
	}

	@Id
	@Column(name = "STATUS_ID", nullable = false)
	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	@Column(name = "STATUS_NAME", length = 80)
	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Column(name = "STATUS_DESCRIPTION", length = 500)
	public String getStatusDescription() {
		return this.statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	@Column(name = "IS_INACTIVE", nullable = false, length = 1)
	public int getIsInactive() {
		return this.isInactive;
	}

	public void setIsInactive(int isInactive) {
		this.isInactive = isInactive;
	}

	@Column(name = "CREATED_BY_ID", nullable = false, length = 20)
	public Integer getCreatedById() {
		return this.createdById;
	}

	public void setCreatedById(Integer createdById) {
		this.createdById = createdById;
	}

	@Column(name = "CREATED_DATETIME", nullable = false, length = 7)
	public Date getCreatedDatetime() {
		return this.createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	@Column(name = "MODIFIED_BY_ID", length = 20)
	public Integer getModifiedById() {
		return this.modifiedById;
	}

	public void setModifiedById(Integer modifiedById) {
		this.modifiedById = modifiedById;
	}

	@Column(name = "MODIFIED_DATETIME", length = 7)
	public Date getModifiedDatetime() {
		return this.modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	@Column(name = "CRC", nullable = false, length = 7)
	public Date getCrc() {
		return this.crc;
	}

	public void setCrc(Date crc) {
		this.crc = crc;
	}

	@Column(name = "RECORD_STATUS", nullable = false, length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnWorkflowStatus", targetEntity = PnEnvelopeVersion.class)
	@Transient
	public Set getPnEnvelopeVersions() {
		return this.pnEnvelopeVersions;
	}

	public void setPnEnvelopeVersions(Set pnEnvelopeVersions) {
		this.pnEnvelopeVersions = pnEnvelopeVersions;
	}

	public String toString() {
		return new ToStringBuilder(this).append("statusId", getStatusId()).toString();
	}

}