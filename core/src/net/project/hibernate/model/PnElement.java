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
 * PnElement generated by hbm2java
 */
@Entity
@Table(name = "PN_ELEMENT")
public class PnElement implements java.io.Serializable {

	/** identifier field */
	private Integer elementId;

	/** persistent field */
	private String elementName;

	/** nullable persistent field */
	private String elementDesc;

	/** nullable persistent field */
	private Integer elementType;

	/** nullable persistent field */
	private String elementLabel;

	/** nullable persistent field */
	private String dbFieldDatatype;

	/** persistent field */
	private String recordStatus;

	/** persistent field */
	private Set pnElementProperties = new HashSet(0);

	/** persistent field */
	private Set pnClassFields = new HashSet(0);

	/** persistent field */
	private Set pnClassTypeElements = new HashSet(0);

	/** persistent field */
	private Set pnElementDisplayClasses = new HashSet(0);

	public PnElement() {
	}

	public PnElement(Integer elementId, String elementName, String recordStatus) {
		this.elementId = elementId;
		this.elementName = elementName;
		this.recordStatus = recordStatus;
	}

	public PnElement(Integer elementId, String elementName, String elementDesc, Integer elementType,
			String elementLabel, String dbFieldDatatype, String recordStatus, Set pnElementProperties,
			Set pnClassFields, Set pnClassTypeElements, Set pnElementDisplayClasses) {
		this.elementId = elementId;
		this.elementName = elementName;
		this.elementDesc = elementDesc;
		this.elementType = elementType;
		this.elementLabel = elementLabel;
		this.dbFieldDatatype = dbFieldDatatype;
		this.recordStatus = recordStatus;
		this.pnElementProperties = pnElementProperties;
		this.pnClassFields = pnClassFields;
		this.pnClassTypeElements = pnClassTypeElements;
		this.pnElementDisplayClasses = pnElementDisplayClasses;
	}

	/** minimal constructor */
	public PnElement(Integer elementId, String elementName, String recordStatus, Set pnElementProperties,
			Set pnClassFields, Set pnClassTypeElements, Set pnElementDisplayClasses) {
		this.elementId = elementId;
		this.elementName = elementName;
		this.recordStatus = recordStatus;
		this.pnElementProperties = pnElementProperties;
		this.pnClassFields = pnClassFields;
		this.pnClassTypeElements = pnClassTypeElements;
		this.pnElementDisplayClasses = pnElementDisplayClasses;
	}

	@Id
	@Column(name = "ELEMENT_ID", nullable = false)
	public Integer getElementId() {
		return this.elementId;
	}

	public void setElementId(Integer elementId) {
		this.elementId = elementId;
	}

	@Column(name = "ELEMENT_NAME", nullable = false, length = 80)
	public String getElementName() {
		return this.elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	@Column(name = "ELEMENT_DESC", length = 500)
	public String getElementDesc() {
		return this.elementDesc;
	}

	public void setElementDesc(String elementDesc) {
		this.elementDesc = elementDesc;
	}

	@Column(name = "ELEMENT_TYPE", length = 20)
	public Integer getElementType() {
		return this.elementType;
	}

	public void setElementType(Integer elementType) {
		this.elementType = elementType;
	}

	@Column(name = "ELEMENT_LABEL", length = 80)
	public String getElementLabel() {
		return this.elementLabel;
	}

	public void setElementLabel(String elementLabel) {
		this.elementLabel = elementLabel;
	}

	@Column(name = "DB_FIELD_DATATYPE", length = 80)
	public String getDbFieldDatatype() {
		return this.dbFieldDatatype;
	}

	public void setDbFieldDatatype(String dbFieldDatatype) {
		this.dbFieldDatatype = dbFieldDatatype;
	}

	@Column(name = "RECORD_STATUS", nullable = false, length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnElement", targetEntity = PnElementProperty.class)
	@Transient
	public Set getPnElementProperties() {
		return this.pnElementProperties;
	}

	public void setPnElementProperties(Set pnElementProperties) {
		this.pnElementProperties = pnElementProperties;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnElement", targetEntity = PnClassField.class)
	@Transient
	public Set getPnClassFields() {
		return this.pnClassFields;
	}

	public void setPnClassFields(Set pnClassFields) {
		this.pnClassFields = pnClassFields;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnElement", targetEntity = PnClassTypeElement.class)
	@Transient
	public Set getPnClassTypeElements() {
		return this.pnClassTypeElements;
	}

	public void setPnClassTypeElements(Set pnClassTypeElements) {
		this.pnClassTypeElements = pnClassTypeElements;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnElement", targetEntity = PnElementDisplayClass.class)
	@Transient
	public Set getPnElementDisplayClasses() {
		return this.pnElementDisplayClasses;
	}

	public void setPnElementDisplayClasses(Set pnElementDisplayClasses) {
		this.pnElementDisplayClasses = pnElementDisplayClasses;
	}

	public String toString() {
		return new ToStringBuilder(this).append("elementId", getElementId()).toString();
	}

}