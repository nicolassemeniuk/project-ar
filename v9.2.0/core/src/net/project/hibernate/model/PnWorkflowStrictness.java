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
 * PnWorkflowStrictness generated by hbm2java
 */
@Entity
@Table(name = "PN_WORKFLOW_STRICTNESS")
public class PnWorkflowStrictness implements Serializable {

	private Integer strictnessId;

	private String strictnessName;

	private String strictnessDescription;

	private Integer createdById;

	private Date createdDatetime;

	private Integer modifiedById;

	private Date modifiedDatetime;

	private Date crc;

	private String recordStatus;

	private Set pnWorkflowEnvelopes = new HashSet(0);

	private Set pnWorkflows = new HashSet(0);

	public PnWorkflowStrictness() {
	}

	public PnWorkflowStrictness(Integer strictnessId, Integer createdById, Date createdDatetime, Date crc,
			String recordStatus) {
		this.strictnessId = strictnessId;
		this.createdById = createdById;
		this.createdDatetime = createdDatetime;
		this.crc = crc;
		this.recordStatus = recordStatus;
	}

	public PnWorkflowStrictness(Integer strictnessId, Integer createdById, Date createdDatetime, Date crc,
			String recordStatus, Set pnWorkflowEnvelopes, Set pnWorkflows) {
		this.strictnessId = strictnessId;
		this.createdById = createdById;
		this.createdDatetime = createdDatetime;
		this.crc = crc;
		this.recordStatus = recordStatus;
		this.pnWorkflowEnvelopes = pnWorkflowEnvelopes;
		this.pnWorkflows = pnWorkflows;
	}

	public PnWorkflowStrictness(Integer strictnessId, String strictnessName, String strictnessDescription,
			Integer createdById, Date createdDatetime, Integer modifiedById, Date modifiedDatetime, Date crc,
			String recordStatus, Set pnWorkflowEnvelopes, Set pnWorkflows) {
		this.strictnessId = strictnessId;
		this.strictnessName = strictnessName;
		this.strictnessDescription = strictnessDescription;
		this.createdById = createdById;
		this.createdDatetime = createdDatetime;
		this.modifiedById = modifiedById;
		this.modifiedDatetime = modifiedDatetime;
		this.crc = crc;
		this.recordStatus = recordStatus;
		this.pnWorkflowEnvelopes = pnWorkflowEnvelopes;
		this.pnWorkflows = pnWorkflows;
	}

	@Id
	@Column(name = "STRICTNESS_ID", nullable = false)
	public Integer getStrictnessId() {
		return this.strictnessId;
	}

	public void setStrictnessId(Integer strictnessId) {
		this.strictnessId = strictnessId;
	}

	@Column(name = "STRICTNESS_NAME", length = 80)
	public String getStrictnessName() {
		return this.strictnessName;
	}

	public void setStrictnessName(String strictnessName) {
		this.strictnessName = strictnessName;
	}

	@Column(name = "STRICTNESS_DESCRIPTION", length = 500)
	public String getStrictnessDescription() {
		return this.strictnessDescription;
	}

	public void setStrictnessDescription(String strictnessDescription) {
		this.strictnessDescription = strictnessDescription;
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

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnWorkflowStrictness", targetEntity = PnWorkflowEnvelope.class)
	@Transient
	public Set getPnWorkflowEnvelopes() {
		return this.pnWorkflowEnvelopes;
	}

	public void setPnWorkflowEnvelopes(Set pnWorkflowEnvelopes) {
		this.pnWorkflowEnvelopes = pnWorkflowEnvelopes;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnWorkflowStrictness", targetEntity = PnWorkflow.class)
	@Transient
	public Set getPnWorkflows() {
		return this.pnWorkflows;
	}

	public void setPnWorkflows(Set pnWorkflows) {
		this.pnWorkflows = pnWorkflows;
	}

	public String toString() {
		return new ToStringBuilder(this).append("strictnessId", getStrictnessId()).toString();
	}

}
