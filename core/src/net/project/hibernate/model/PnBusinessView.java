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
// Generated Jun 13, 2009 11:41:49 PM by Hibernate Tools 3.2.4.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnBusinessView generated by hbm2java
 */
@Entity
@Table(name="PN_BUSINESS_VIEW"
)
public class PnBusinessView  implements java.io.Serializable {

    /** identifier field */
    private Integer businessId;

    /** identifier field */
    private String recordStatus;

    /** identifier field */
    private Integer isMaster;

    /** identifier field */
    private Integer businessCategoryId;

    /** identifier field */
    private Integer brandId;

    /** identifier field */
    private Integer billingAccountId;

    /** identifier field */
    private Integer addressId;

    /** identifier field */
    private String businessName;

    /** identifier field */
    private String businessDesc;

    /** identifier field */
    private String businessType;

    /** identifier field */
    private Integer logoImageId;

    /** identifier field */
    private Integer isLocal;

    /** identifier field */
    private Integer remoteHostId;

    /** identifier field */
    private Integer remoteBusinessId;

    /** identifier field */
    private Integer numProjects;

    /** identifier field */
    private Integer numPeople;

    public PnBusinessView() {
    }

	
    public PnBusinessView(Integer businessId) {
        this.businessId = businessId;
    }
    public PnBusinessView(Integer businessId, String recordStatus, int isMaster, Integer businessCategoryId, Integer brandId, Integer billingAccountId, Integer addressId, String businessName, String businessDesc, String businessType, Integer logoImageId, int isLocal, Integer remoteHostId, Integer remoteBusinessId, Integer numProjects, Integer numPeople) {
       this.businessId = businessId;
       this.recordStatus = recordStatus;
       this.isMaster = isMaster;
       this.businessCategoryId = businessCategoryId;
       this.brandId = brandId;
       this.billingAccountId = billingAccountId;
       this.addressId = addressId;
       this.businessName = businessName;
       this.businessDesc = businessDesc;
       this.businessType = businessType;
       this.logoImageId = logoImageId;
       this.isLocal = isLocal;
       this.remoteHostId = remoteHostId;
       this.remoteBusinessId = remoteBusinessId;
       this.numProjects = numProjects;
       this.numPeople = numPeople;
    }
   
     @Id 

    
    @Column(name="BUSINESS_ID", nullable=false, length=20)
    public Integer getBusinessId() {
        return this.businessId;
    }
    
    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    
    @Column(name="RECORD_STATUS", length=1)
    public String getRecordStatus() {
        return this.recordStatus;
    }
    
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    
    @Column(name="IS_MASTER", length=1)
    public int getIsMaster() {
        return this.isMaster;
    }
    
    public void setIsMaster(int isMaster) {
        this.isMaster = isMaster;
    }

    
    @Column(name="BUSINESS_CATEGORY_ID", length=20)
    public Integer getBusinessCategoryId() {
        return this.businessCategoryId;
    }
    
    public void setBusinessCategoryId(Integer businessCategoryId) {
        this.businessCategoryId = businessCategoryId;
    }

    
    @Column(name="BRAND_ID", length=20)
    public Integer getBrandId() {
        return this.brandId;
    }
    
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    
    @Column(name="BILLING_ACCOUNT_ID", length=20)
    public Integer getBillingAccountId() {
        return this.billingAccountId;
    }
    
    public void setBillingAccountId(Integer billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    
    @Column(name="ADDRESS_ID", length=20)
    public Integer getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    
    @Column(name="BUSINESS_NAME", length=80)
    public String getBusinessName() {
        return this.businessName;
    }
    
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    
    @Column(name="BUSINESS_DESC", length=1000)
    public String getBusinessDesc() {
        return this.businessDesc;
    }
    
    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
    }

    
    @Column(name="BUSINESS_TYPE", length=80)
    public String getBusinessType() {
        return this.businessType;
    }
    
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    
    @Column(name="LOGO_IMAGE_ID", length=20)
    public Integer getLogoImageId() {
        return this.logoImageId;
    }
    
    public void setLogoImageId(Integer logoImageId) {
        this.logoImageId = logoImageId;
    }

    
    @Column(name="IS_LOCAL", length=1)
    public int getIsLocal() {
        return this.isLocal;
    }
    
    public void setIsLocal(int isLocal) {
        this.isLocal = isLocal;
    }

    
    @Column(name="REMOTE_HOST_ID", length=20)
    public Integer getRemoteHostId() {
        return this.remoteHostId;
    }
    
    public void setRemoteHostId(Integer remoteHostId) {
        this.remoteHostId = remoteHostId;
    }

    
    @Column(name="REMOTE_BUSINESS_ID", length=20)
    public Integer getRemoteBusinessId() {
        return this.remoteBusinessId;
    }
    
    public void setRemoteBusinessId(Integer remoteBusinessId) {
        this.remoteBusinessId = remoteBusinessId;
    }

    
    @Column(name="NUM_PROJECTS", length=22)
    public Integer getNumProjects() {
        return this.numProjects;
    }
    
    public void setNumProjects(Integer numProjects) {
        this.numProjects = numProjects;
    }

    
    @Column(name="NUM_PEOPLE", length=22)
    public Integer getNumPeople() {
        return this.numPeople;
    }
    
    public void setNumPeople(Integer numPeople) {
        this.numPeople = numPeople;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("businessId", getBusinessId())
            .append("recordStatus", getRecordStatus())
            .append("isMaster", getIsMaster())
            .append("businessCategoryId", getBusinessCategoryId())
            .append("brandId", getBrandId())
            .append("billingAccountId", getBillingAccountId())
            .append("addressId", getAddressId())
            .append("businessName", getBusinessName())
            .append("businessDesc", getBusinessDesc())
            .append("businessType", getBusinessType())
            .append("logoImageId", getLogoImageId())
            .append("isLocal", getIsLocal())
            .append("remoteHostId", getRemoteHostId())
            .append("remoteBusinessId", getRemoteBusinessId())
            .append("numProjects", getNumProjects())
            .append("numPeople", getNumPeople())
            .toString();
    }

}

