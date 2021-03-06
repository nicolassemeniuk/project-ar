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
 * PnDeliverable generated by hbm2java
 */
@Entity
@Table(name = "PN_DELIVERABLE")
public class PnDeliverable implements java.io.Serializable {

	/** identifier field */
	private Integer deliverableId;

	/** persistent field */
	private String deliverableName;

	/** nullable persistent field */
	private String deliverableDesc;

	/** persistent field */
	private int statusId;

	/** nullable persistent field */
	private Integer methodologyDeliverableId;

	/** persistent field */
	private int isOptional;

	/** persistent field */
	private String recordStatus;

	/** nullable persistent field */
	private Clob deliverableCommentsClob;

	private PnObject pnObject;

	private Set pnPhaseHasDeliverables = new HashSet(0);

	public PnDeliverable() {
	}

	public PnDeliverable(Integer deliverableId, String deliverableName, int statusId, int isOptional,
			String recordStatus) {
		this.deliverableId = deliverableId;
		this.deliverableName = deliverableName;
		this.statusId = statusId;
		this.isOptional = isOptional;
		this.recordStatus = recordStatus;
	}

	public PnDeliverable(Integer deliverableId, String deliverableName, String deliverableDesc, int statusId,
			Integer methodologyDeliverableId, int isOptional, String recordStatus, Clob deliverableCommentsClob,
			PnObject pnObject, Set pnPhaseHasDeliverables) {
		this.deliverableId = deliverableId;
		this.deliverableName = deliverableName;
		this.deliverableDesc = deliverableDesc;
		this.statusId = statusId;
		this.methodologyDeliverableId = methodologyDeliverableId;
		this.isOptional = isOptional;
		this.recordStatus = recordStatus;
		this.deliverableCommentsClob = deliverableCommentsClob;
		this.pnObject = pnObject;
		this.pnPhaseHasDeliverables = pnPhaseHasDeliverables;
	}

	/** minimal constructor */
	public PnDeliverable(Integer deliverableId, String deliverableName, int statusId, int isOptional,
			String recordStatus, Set pnPhaseHasDeliverables) {
		this.deliverableId = deliverableId;
		this.deliverableName = deliverableName;
		this.statusId = statusId;
		this.isOptional = isOptional;
		this.recordStatus = recordStatus;
		this.pnPhaseHasDeliverables = pnPhaseHasDeliverables;
	}

	@Id
	@Column(name = "DELIVERABLE_ID", nullable = false)
	public Integer getDeliverableId() {
		return this.deliverableId;
	}

	public void setDeliverableId(Integer deliverableId) {
		this.deliverableId = deliverableId;
	}

	@Column(name = "DELIVERABLE_NAME", nullable = false, length = 80)
	public String getDeliverableName() {
		return this.deliverableName;
	}

	public void setDeliverableName(String deliverableName) {
		this.deliverableName = deliverableName;
	}

	@Column(name = "DELIVERABLE_DESC", length = 4000)
	public String getDeliverableDesc() {
		return this.deliverableDesc;
	}

	public void setDeliverableDesc(String deliverableDesc) {
		this.deliverableDesc = deliverableDesc;
	}

	@Column(name = "STATUS_ID", nullable = false, length = 8)
	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	@Column(name = "METHODOLOGY_DELIVERABLE_ID", length = 20)
	public Integer getMethodologyDeliverableId() {
		return this.methodologyDeliverableId;
	}

	public void setMethodologyDeliverableId(Integer methodologyDeliverableId) {
		this.methodologyDeliverableId = methodologyDeliverableId;
	}

	@Column(name = "IS_OPTIONAL", nullable = false, length = 1)
	public int getIsOptional() {
		return this.isOptional;
	}

	public void setIsOptional(int isOptional) {
		this.isOptional = isOptional;
	}

	@Column(name = "RECORD_STATUS", nullable = false, length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	@Column(name = "DELIVERABLE_COMMENTS_CLOB", length = 4000)
	public Clob getDeliverableCommentsClob() {
		return this.deliverableCommentsClob;
	}

	public void setDeliverableCommentsClob(Clob deliverableCommentsClob) {
		this.deliverableCommentsClob = deliverableCommentsClob;
	}

	//@OneToOne(fetch = FetchType.LAZY, targetEntity = PnObject.class)
	//@JoinColumn(name="DELIVERABLE_ID")
	@Transient
	public PnObject getPnObject() {
		return this.pnObject;
	}

	public void setPnObject(PnObject pnObject) {
		this.pnObject = pnObject;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnDeliverable", targetEntity = PnPhaseHasDeliverable.class)
	@Transient
	public Set getPnPhaseHasDeliverables() {
		return this.pnPhaseHasDeliverables;
	}

	public void setPnPhaseHasDeliverables(Set pnPhaseHasDeliverables) {
		this.pnPhaseHasDeliverables = pnPhaseHasDeliverables;
	}

	public String toString() {
		return new ToStringBuilder(this).append("deliverableId", getDeliverableId()).toString();
	}

}
