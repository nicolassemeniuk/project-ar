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
 * PnWorkflowRuleType generated by hbm2java
 */
@Entity
@Table(name = "PN_WORKFLOW_RULE_TYPE")
public class PnWorkflowRuleType implements Serializable {

	private Integer ruleTypeId;

	private String tableName;

	private String ruleTypeName;

	private String ruleTypeDescription;

	private String notes;

	private Integer createdById;

	private Date createdDatetime;

	private Integer modifiedById;

	private Date modifiedDatetime;

	private Date crc;

	private String recordStatus;

	private Set pnWorkflowRules = new HashSet(0);

	public PnWorkflowRuleType() {
	}

	public PnWorkflowRuleType(Integer ruleTypeId, String tableName, Integer createdById, Date createdDatetime,
			Date crc, String recordStatus) {
		this.ruleTypeId = ruleTypeId;
		this.tableName = tableName;
		this.createdById = createdById;
		this.createdDatetime = createdDatetime;
		this.crc = crc;
		this.recordStatus = recordStatus;
	}

	public PnWorkflowRuleType(Integer ruleTypeId, String tableName, Integer createdById, Date createdDatetime,
			Date crc, String recordStatus, Set pnWorkflowRules) {
		this.ruleTypeId = ruleTypeId;
		this.tableName = tableName;
		this.createdById = createdById;
		this.createdDatetime = createdDatetime;
		this.crc = crc;
		this.recordStatus = recordStatus;
		this.pnWorkflowRules = pnWorkflowRules;
	}

	public PnWorkflowRuleType(Integer ruleTypeId, String tableName, String ruleTypeName, String ruleTypeDescription,
			String notes, Integer createdById, Date createdDatetime, Integer modifiedById, Date modifiedDatetime,
			Date crc, String recordStatus, Set pnWorkflowRules) {
		this.ruleTypeId = ruleTypeId;
		this.tableName = tableName;
		this.ruleTypeName = ruleTypeName;
		this.ruleTypeDescription = ruleTypeDescription;
		this.notes = notes;
		this.createdById = createdById;
		this.createdDatetime = createdDatetime;
		this.modifiedById = modifiedById;
		this.modifiedDatetime = modifiedDatetime;
		this.crc = crc;
		this.recordStatus = recordStatus;
		this.pnWorkflowRules = pnWorkflowRules;
	}

	@Id
	@Column(name = "RULE_TYPE_ID", nullable = false)
	public Integer getRuleTypeId() {
		return this.ruleTypeId;
	}

	public void setRuleTypeId(Integer ruleTypeId) {
		this.ruleTypeId = ruleTypeId;
	}

	@Column(name = "TABLE_NAME", nullable = false, length = 80)
	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Column(name = "RULE_TYPE_NAME", length = 80)
	public String getRuleTypeName() {
		return this.ruleTypeName;
	}

	public void setRuleTypeName(String ruleTypeName) {
		this.ruleTypeName = ruleTypeName;
	}

	@Column(name = "RULE_TYPE_DESCRIPTION", length = 500)
	public String getRuleTypeDescription() {
		return this.ruleTypeDescription;
	}

	public void setRuleTypeDescription(String ruleTypeDescription) {
		this.ruleTypeDescription = ruleTypeDescription;
	}

	@Column(name = "NOTES", length = 4000)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnWorkflowRuleType", targetEntity = PnWorkflowRule.class)
	@Transient
	public Set getPnWorkflowRules() {
		return this.pnWorkflowRules;
	}

	public void setPnWorkflowRules(Set pnWorkflowRules) {
		this.pnWorkflowRules = pnWorkflowRules;
	}

	public String toString() {
		return new ToStringBuilder(this).append("ruleTypeId", getRuleTypeId()).toString();
	}

}