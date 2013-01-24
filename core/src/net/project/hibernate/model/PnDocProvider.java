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
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnDocProvider generated by hbm2java
 */
@Entity
@Table(name = "PN_DOC_PROVIDER")
public class PnDocProvider implements java.io.Serializable {

	/** identifier field */
	private Integer docProviderId;

	/** nullable persistent field */
	private String docProviderName;

	/** nullable persistent field */
	private String docProviderDescription;

	/** persistent field */
	private int isDefault;

	/** persistent field */
	private Date crc;

	/** persistent field */
	private String recordStatus;

	/** persistent field */
	private PnDocProviderType pnDocProviderType;

	/** persistent field */
	private Set pnDocProviderHasDocSpaces = new HashSet(0);

	/** persistent field */
	private Set pnSpaceHasDocProviders = new HashSet(0);

	public PnDocProvider() {
	}

	public PnDocProvider(Integer docProviderId, int isDefault, Date crc, String recordStatus) {
		this.docProviderId = docProviderId;
		this.isDefault = isDefault;
		this.crc = crc;
		this.recordStatus = recordStatus;
	}

	public PnDocProvider(Integer docProviderId, String docProviderName, String docProviderDescription, int isDefault,
			Date crc, String recordStatus, PnDocProviderType pnDocProviderType, Set pnDocProviderHasDocSpaces,
			Set pnSpaceHasDocProviders) {
		this.docProviderId = docProviderId;
		this.docProviderName = docProviderName;
		this.docProviderDescription = docProviderDescription;
		this.isDefault = isDefault;
		this.crc = crc;
		this.recordStatus = recordStatus;
		this.pnDocProviderType = pnDocProviderType;
		this.pnDocProviderHasDocSpaces = pnDocProviderHasDocSpaces;
		this.pnSpaceHasDocProviders = pnSpaceHasDocProviders;
	}

	public PnDocProvider(Integer docProviderId) {
		this.docProviderId = docProviderId;
	}

	/** minimal constructor */
	public PnDocProvider(Integer docProviderId, int isDefault, Date crc, String recordStatus,
			net.project.hibernate.model.PnDocProviderType pnDocProviderType, Set pnDocProviderHasDocSpaces,
			Set pnSpaceHasDocProviders) {
		this.docProviderId = docProviderId;
		this.isDefault = isDefault;
		this.crc = crc;
		this.recordStatus = recordStatus;
		this.pnDocProviderType = pnDocProviderType;
		this.pnDocProviderHasDocSpaces = pnDocProviderHasDocSpaces;
		this.pnSpaceHasDocProviders = pnSpaceHasDocProviders;
	}

	@Id
	@Column(name = "DOC_PROVIDER_ID", nullable = false)
	public Integer getDocProviderId() {
		return this.docProviderId;
	}

	public void setDocProviderId(Integer docProviderId) {
		this.docProviderId = docProviderId;
	}

	@Column(name = "DOC_PROVIDER_NAME", length = 240)
	public String getDocProviderName() {
		return this.docProviderName;
	}

	public void setDocProviderName(String docProviderName) {
		this.docProviderName = docProviderName;
	}

	@Column(name = "DOC_PROVIDER_DESCRIPTION", length = 500)
	public String getDocProviderDescription() {
		return this.docProviderDescription;
	}

	public void setDocProviderDescription(String docProviderDescription) {
		this.docProviderDescription = docProviderDescription;
	}

	@Column(name = "IS_DEFAULT", nullable = false, length = 1)
	public int getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
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

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnDocProviderType.class)
	@JoinColumn(name = "DOC_PROVIDER_TYPE_ID")
	public PnDocProviderType getPnDocProviderType() {
		return this.pnDocProviderType;
	}

	public void setPnDocProviderType(PnDocProviderType pnDocProviderType) {
		this.pnDocProviderType = pnDocProviderType;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnDocProvider", targetEntity = PnDocProviderHasDocSpace.class)
	@Transient
	public Set getPnDocProviderHasDocSpaces() {
		return this.pnDocProviderHasDocSpaces;
	}

	public void setPnDocProviderHasDocSpaces(Set pnDocProviderHasDocSpaces) {
		this.pnDocProviderHasDocSpaces = pnDocProviderHasDocSpaces;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnDocProvider", targetEntity = PnSpaceHasDocProvider.class)
	@Transient
	public Set getPnSpaceHasDocProviders() {
		return this.pnSpaceHasDocProviders;
	}

	public void setPnSpaceHasDocProviders(Set pnSpaceHasDocProviders) {
		this.pnSpaceHasDocProviders = pnSpaceHasDocProviders;
	}

	public String toString() {
		return new ToStringBuilder(this).append("docProviderId", getDocProviderId()).toString();
	}

}