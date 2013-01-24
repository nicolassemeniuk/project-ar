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

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnClass generated by hbm2java
 */
@Entity
@Table(name = "PN_CLASS")
public class PnClass implements java.io.Serializable {

	/** identifier field */
	private Integer classId;

	/** nullable persistent field */
	private String className;

	/** nullable persistent field */
	private String classDesc;

	/** nullable persistent field */
	private String classAbbreviation;

	/** nullable persistent field */
	private Integer ownerSpaceId;

	/** nullable persistent field */
	private Integer methodologyId;

	/** persistent field */
	private int maxRow;

	/** persistent field */
	private int maxColumn;

	/** persistent field */
	private int nextDataSeq;

	/** persistent field */
	private int dataTableSeq;

	/** nullable persistent field */
	private String masterTableName;

	/** nullable persistent field */
	private String dataTableKey;

	/** persistent field */
	private int isSequenced;

	/** persistent field */
	private int isSystemClass;

	/** nullable persistent field */
	private Date crc;

	/** persistent field */
	private String recordStatus;

	/** nullable persistent field */
	private Integer supportsDiscussionGroup;

	/** nullable persistent field */
	private Integer supportsDocumentVault;

	/** nullable persistent field */
	private net.project.hibernate.model.PnObject pnObject;

	/** persistent field */
	private net.project.hibernate.model.PnClassType pnClassType;

	/** persistent field */
	private Set pnSpaceHasClasses;

	/** persistent field */
	private Set pnClassFields;

	/** persistent field */
	private Set pnClassLists;

	/** persistent field */
	private Set pnElementDisplayClasses;

	public PnClass() {
	}

	public PnClass(Integer classId, int maxRow, int maxColumn, int nextDataSeq, int dataTableSeq, int isSequenced,
			int isSystemClass, String recordStatus) {
		this.classId = classId;
		this.maxRow = maxRow;
		this.maxColumn = maxColumn;
		this.nextDataSeq = nextDataSeq;
		this.dataTableSeq = dataTableSeq;
		this.isSequenced = isSequenced;
		this.isSystemClass = isSystemClass;
		this.recordStatus = recordStatus;
	}

	public PnClass(Integer classId, String className, String classDesc, String classAbbreviation, Integer ownerSpaceId,
			Integer methodologyId, int maxRow, int maxColumn, int nextDataSeq, int dataTableSeq,
			String masterTableName, String dataTableKey, int isSequenced, int isSystemClass, Date crc,
			String recordStatus, Integer supportsDiscussionGroup, Integer supportsDocumentVault, PnObject pnObject,
			Set pnSpaceHasClasses, Set pnClassFields, Set pnClassLists, Set pnElementDisplayClasses,
			PnClassType pnClassType) {
		this.classId = classId;
		this.className = className;
		this.classDesc = classDesc;
		this.classAbbreviation = classAbbreviation;
		this.ownerSpaceId = ownerSpaceId;
		this.methodologyId = methodologyId;
		this.maxRow = maxRow;
		this.maxColumn = maxColumn;
		this.nextDataSeq = nextDataSeq;
		this.dataTableSeq = dataTableSeq;
		this.masterTableName = masterTableName;
		this.dataTableKey = dataTableKey;
		this.isSequenced = isSequenced;
		this.isSystemClass = isSystemClass;
		this.crc = crc;
		this.recordStatus = recordStatus;
		this.supportsDiscussionGroup = supportsDiscussionGroup;
		this.supportsDocumentVault = supportsDocumentVault;
		this.pnObject = pnObject;
		this.pnSpaceHasClasses = pnSpaceHasClasses;
		this.pnClassFields = pnClassFields;
		this.pnClassLists = pnClassLists;
		this.pnElementDisplayClasses = pnElementDisplayClasses;
		this.pnClassType = pnClassType;
	}

	public PnClass(Integer classId, int maxRow, int maxColumn, int nextDataSeq, int dataTableSeq, int isSequenced,
			int isSystemClass, String recordStatus, net.project.hibernate.model.PnClassType pnClassType,
			Set pnSpaceHasClasses, Set pnClassFields, Set pnClassLists, Set pnElementDisplayClasses) {
		this.classId = classId;
		this.maxRow = maxRow;
		this.maxColumn = maxColumn;
		this.nextDataSeq = nextDataSeq;
		this.dataTableSeq = dataTableSeq;
		this.isSequenced = isSequenced;
		this.isSystemClass = isSystemClass;
		this.recordStatus = recordStatus;
		this.pnClassType = pnClassType;
		this.pnSpaceHasClasses = pnSpaceHasClasses;
		this.pnClassFields = pnClassFields;
		this.pnClassLists = pnClassLists;
		this.pnElementDisplayClasses = pnElementDisplayClasses;
	}

	/** minimal Constructor*/
	public PnClass(Integer classId, String className, String recordStatus) {
		this.classId = classId;
		this.className = className;
		this.recordStatus = recordStatus;
	}

	@Id
	@Column(name = "CLASS_ID", nullable = false)
	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Column(name = "CLASS_NAME", length = 80)
	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Column(name = "CLASS_DESC", length = 500)
	public String getClassDesc() {
		return this.classDesc;
	}

	public void setClassDesc(String classDesc) {
		this.classDesc = classDesc;
	}

	@Column(name = "CLASS_ABBREVIATION", length = 20)
	public String getClassAbbreviation() {
		return this.classAbbreviation;
	}

	public void setClassAbbreviation(String classAbbreviation) {
		this.classAbbreviation = classAbbreviation;
	}

	@Column(name = "OWNER_SPACE_ID", length = 20)
	public Integer getOwnerSpaceId() {
		return this.ownerSpaceId;
	}

	public void setOwnerSpaceId(Integer ownerSpaceId) {
		this.ownerSpaceId = ownerSpaceId;
	}

	@Column(name = "METHODOLOGY_ID", length = 20)
	public Integer getMethodologyId() {
		return this.methodologyId;
	}

	public void setMethodologyId(Integer methodologyId) {
		this.methodologyId = methodologyId;
	}

	@Column(name = "MAX_ROW", nullable = false, length = 8)
	public int getMaxRow() {
		return this.maxRow;
	}

	public void setMaxRow(int maxRow) {
		this.maxRow = maxRow;
	}

	@Column(name = "MAX_COLUMN", nullable = false, length = 8)
	public int getMaxColumn() {
		return this.maxColumn;
	}

	public void setMaxColumn(int maxColumn) {
		this.maxColumn = maxColumn;
	}

	@Column(name = "NEXT_DATA_SEQ", nullable = false, length = 8)
	public int getNextDataSeq() {
		return this.nextDataSeq;
	}

	public void setNextDataSeq(int nextDataSeq) {
		this.nextDataSeq = nextDataSeq;
	}

	@Column(name = "DATA_TABLE_SEQ", nullable = false, length = 7)
	public int getDataTableSeq() {
		return this.dataTableSeq;
	}

	public void setDataTableSeq(int dataTableSeq) {
		this.dataTableSeq = dataTableSeq;
	}

	@Column(name = "MASTER_TABLE_NAME", length = 80)
	public String getMasterTableName() {
		return this.masterTableName;
	}

	public void setMasterTableName(String masterTableName) {
		this.masterTableName = masterTableName;
	}

	@Column(name = "DATA_TABLE_KEY", length = 80)
	public String getDataTableKey() {
		return this.dataTableKey;
	}

	public void setDataTableKey(String dataTableKey) {
		this.dataTableKey = dataTableKey;
	}

	@Column(name = "IS_SEQUENCED", nullable = false, length = 1)
	public int getIsSequenced() {
		return this.isSequenced;
	}

	public void setIsSequenced(int isSequenced) {
		this.isSequenced = isSequenced;
	}

	@Column(name = "IS_SYSTEM_CLASS", nullable = false, length = 1)
	public int getIsSystemClass() {
		return this.isSystemClass;
	}

	public void setIsSystemClass(int isSystemClass) {
		this.isSystemClass = isSystemClass;
	}

	@Column(name = "CRC", length = 7)
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

	@Column(name = "SUPPORTS_DISCUSSION_GROUP", length = 1)
	public Integer getSupportsDiscussionGroup() {
		return this.supportsDiscussionGroup;
	}

	public void setSupportsDiscussionGroup(Integer supportsDiscussionGroup) {
		this.supportsDiscussionGroup = supportsDiscussionGroup;
	}

	@Column(name = "SUPPORTS_DOCUMENT_VAULT", length = 1)
	public Integer getSupportsDocumentVault() {
		return this.supportsDocumentVault;
	}

	public void setSupportsDocumentVault(Integer supportsDocumentVault) {
		this.supportsDocumentVault = supportsDocumentVault;
	}

	//@OneToOne(fetch = FetchType.LAZY, targetEntity = PnObject.class)
	//@JoinColumn(name = "CLASS_ID")
	@Transient
	public PnObject getPnObject() {
		return this.pnObject;
	}

	public void setPnObject(PnObject pnObject) {
		this.pnObject = pnObject;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnClass", targetEntity = PnSpaceHasClass.class)
	@Transient
	public Set getPnSpaceHasClasses() {
		return this.pnSpaceHasClasses;
	}

	public void setPnSpaceHasClasses(Set pnSpaceHasClasses) {
		this.pnSpaceHasClasses = pnSpaceHasClasses;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnClass", targetEntity = PnClassField.class)
	@Transient
	public Set getPnClassFields() {
		return this.pnClassFields;
	}

	public void setPnClassFields(Set pnClassFields) {
		this.pnClassFields = pnClassFields;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnClass", targetEntity = PnClassList.class)
	@Transient
	public Set getPnClassLists() {
		return this.pnClassLists;
	}

	public void setPnClassLists(Set pnClassLists) {
		this.pnClassLists = pnClassLists;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnClass", targetEntity = PnElementDisplayClass.class)
	@Transient
	public Set getPnElementDisplayClasses() {
		return this.pnElementDisplayClasses;
	}

	public void setPnElementDisplayClasses(Set pnElementDisplayClasses) {
		this.pnElementDisplayClasses = pnElementDisplayClasses;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnClassType.class)
	@JoinColumn(name = "CLASS_TYPE_ID")
	public PnClassType getPnClassType() {
		return this.pnClassType;
	}

	public void setPnClassType(PnClassType pnClassType) {
		this.pnClassType = pnClassType;
	}

	public String toString() {
		return new ToStringBuilder(this).append("classId", getClassId()).toString();
	}

}