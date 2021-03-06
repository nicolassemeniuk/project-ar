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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnBusiness generated by hbm2java
 */
@Entity
@Table(name = "PN_BUSINESS")
public class PnBusiness implements java.io.Serializable {

	/** identifier field */
	private Integer businessId;

	/** nullable persistent field */
	private String businessName;

	/** nullable persistent field */
	private String businessDesc;

	/** nullable persistent field */
	private String businessType;

	/** nullable persistent field */
	private Integer logoImageId;

	/** persistent field */
	private int isLocal;

	/** nullable persistent field */
	private Integer remoteHostId;

	/** nullable persistent field */
	private Integer remoteBusinessId;

	/** persistent field */
	private String recordStatus;

	/** persistent field */
	private int isMaster;

	/** nullable persistent field */
	private Integer businessCategoryId;

	/** nullable persistent field */
	private Integer brandId;

	/** nullable persistent field */
	private Integer billingAccountId;

	/** nullable persistent field */
	private PnObject pnObject;

	/** persistent field */
	private PnAddress pnAddress;

	/** persistent field */
	private Set pnBusinessSpaces = new HashSet(0);

	public PnBusiness() {
	}

	public PnBusiness(Integer businessId, int isLocal, String recordStatus, int isMaster) {
		this.businessId = businessId;
		this.isLocal = isLocal;
		this.recordStatus = recordStatus;
		this.isMaster = isMaster;
	}

	public PnBusiness(Integer businessId, String businessName, String businessDesc, String businessType,
			Integer logoImageId, int isLocal, Integer remoteHostId, Integer remoteBusinessId, String recordStatus,
			int isMaster, Integer businessCategoryId, Integer brandId, Integer billingAccountId, PnObject pnObject,
			PnAddress pnAddress, Set pnBusinessSpaces) {
		this.businessId = businessId;
		this.businessName = businessName;
		this.businessDesc = businessDesc;
		this.businessType = businessType;
		this.logoImageId = logoImageId;
		this.isLocal = isLocal;
		this.remoteHostId = remoteHostId;
		this.remoteBusinessId = remoteBusinessId;
		this.recordStatus = recordStatus;
		this.isMaster = isMaster;
		this.businessCategoryId = businessCategoryId;
		this.brandId = brandId;
		this.billingAccountId = billingAccountId;
		this.pnObject = pnObject;
		this.pnAddress = pnAddress;
		this.pnBusinessSpaces = pnBusinessSpaces;
	}

	/** minimal constructor */
	public PnBusiness(Integer businessId, int isLocal, String recordStatus, int isMaster,
			net.project.hibernate.model.PnAddress pnAddress, Set pnBusinessSpaces) {
		this.businessId = businessId;
		this.isLocal = isLocal;
		this.recordStatus = recordStatus;
		this.isMaster = isMaster;
		this.pnAddress = pnAddress;
		this.pnBusinessSpaces = pnBusinessSpaces;
	}

	public PnBusiness(Integer businessId, String businessName) {
		this.businessId = businessId;
		this.businessName = businessName;
	}

	@Id
	@Column(name = "BUSINESS_ID", nullable = false)
	public Integer getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	@Column(name = "BUSINESS_NAME", length = 80)
	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	@Column(name = "BUSINESS_DESC", length = 1000)
	public String getBusinessDesc() {
		return this.businessDesc;
	}

	public void setBusinessDesc(String businessDesc) {
		this.businessDesc = businessDesc;
	}

	@Column(name = "BUSINESS_TYPE", length = 80)
	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	@Column(name = "LOGO_IMAGE_ID", length = 20)
	public Integer getLogoImageId() {
		return this.logoImageId;
	}

	public void setLogoImageId(Integer logoImageId) {
		this.logoImageId = logoImageId;
	}

	@Column(name = "IS_LOCAL", nullable = false, length = 1)
	public int getIsLocal() {
		return this.isLocal;
	}

	public void setIsLocal(int isLocal) {
		this.isLocal = isLocal;
	}

	@Column(name = "REMOTE_HOST_ID", length = 20)
	public Integer getRemoteHostId() {
		return this.remoteHostId;
	}

	public void setRemoteHostId(Integer remoteHostId) {
		this.remoteHostId = remoteHostId;
	}

	@Column(name = "REMOTE_BUSINESS_ID", length = 20)
	public Integer getRemoteBusinessId() {
		return this.remoteBusinessId;
	}

	public void setRemoteBusinessId(Integer remoteBusinessId) {
		this.remoteBusinessId = remoteBusinessId;
	}

	@Column(name = "RECORD_STATUS", nullable = false, length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	@Column(name = "IS_MASTER", nullable = false, length = 1)
	public int getIsMaster() {
		return this.isMaster;
	}

	public void setIsMaster(int isMaster) {
		this.isMaster = isMaster;
	}

	@Column(name = "BUSINESS_CATEGORY_ID", length = 20)
	public Integer getBusinessCategoryId() {
		return this.businessCategoryId;
	}

	public void setBusinessCategoryId(Integer businessCategoryId) {
		this.businessCategoryId = businessCategoryId;
	}

	@Column(name = "BRAND_ID", length = 20)
	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	@Column(name = "BILLING_ACCOUNT_ID", length = 20)
	public Integer getBillingAccountId() {
		return this.billingAccountId;
	}

	public void setBillingAccountId(Integer billingAccountId) {
		this.billingAccountId = billingAccountId;
	}

	//@OneToOne(fetch = FetchType.LAZY, targetEntity = PnObject.class)
	//@JoinColumn(name = "BUSINESS_ID")
	@Transient
	public PnObject getPnObject() {
		return this.pnObject;
	}

	public void setPnObject(PnObject pnObject) {
		this.pnObject = pnObject;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnAddress.class)
	@JoinColumn(name = "ADDRESS_ID")
	public PnAddress getPnAddress() {
		return this.pnAddress;
	}

	public void setPnAddress(PnAddress pnAddress) {
		this.pnAddress = pnAddress;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnBusiness", targetEntity = PnBusinessSpace.class)
	@Transient
	public Set getPnBusinessSpaces() {
		return this.pnBusinessSpaces;
	}

	public void setPnBusinessSpaces(Set pnBusinessSpaces) {
		this.pnBusinessSpaces = pnBusinessSpaces;
	}

	public String toString() {
		return new ToStringBuilder(this).append("businessId", getBusinessId()).toString();
	}

}
