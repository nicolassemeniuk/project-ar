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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnAddress generated by hbm2java
 */
@Entity
@Table(name = "PN_ADDRESS")
public class PnAddress implements java.io.Serializable {

	private Integer addressId;

	private String address1;

	/** nullable persistent field */
	private String address2;

	/** nullable persistent field */
	private String address3;

	/** nullable persistent field */
	private String address4;

	/** nullable persistent field */
	private String address5;

	/** nullable persistent field */
	private String address6;

	/** nullable persistent field */
	private String address7;

	/** nullable persistent field */
	private String city;

	/** nullable persistent field */
	private String cityDistrict;

	/** nullable persistent field */
	private String region;

	/** nullable persistent field */
	private String stateProvence;

	/** nullable persistent field */
	private String zipcode;

	/** nullable persistent field */
	private String officePhone;

	/** nullable persistent field */
	private String faxPhone;

	/** nullable persistent field */
	private String homePhone;

	/** nullable persistent field */
	private String mobilePhone;

	/** nullable persistent field */
	private String pagerPhone;

	/** nullable persistent field */
	private String pagerEmail;

	/** nullable persistent field */
	private String websiteUrl;

	/** persistent field */
	private String recordStatus;

	private String countryCode;

	private PnObject pnObject;

	/** persistent field */
	private Set pnFacilities = new HashSet(0);

	/** persistent field */
	private Set pnBusinesses = new HashSet(0);

	public PnAddress() {
	}

	public PnAddress(Integer addressId, String recordStatus) {
		this.addressId = addressId;
		this.recordStatus = recordStatus;
	}

	public PnAddress(Integer addressId, String address1, String address2, String address3, String address4,
			String address5, String address6, String address7, String city, String cityDistrict, String region,
			String stateProvence, String zipcode, String officePhone, String faxPhone, String homePhone,
			String mobilePhone, String pagerPhone, String pagerEmail, String websiteUrl, String recordStatus,
			String countryCode, PnObject pnObject, Set pnFacilities, Set pnBusinesses) {
		this.addressId = addressId;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.address5 = address5;
		this.address6 = address6;
		this.address7 = address7;
		this.city = city;
		this.cityDistrict = cityDistrict;
		this.region = region;
		this.stateProvence = stateProvence;
		this.zipcode = zipcode;
		this.officePhone = officePhone;
		this.faxPhone = faxPhone;
		this.homePhone = homePhone;
		this.mobilePhone = mobilePhone;
		this.pagerPhone = pagerPhone;
		this.pagerEmail = pagerEmail;
		this.websiteUrl = websiteUrl;
		this.recordStatus = recordStatus;
		this.countryCode = countryCode;
		this.pnObject = pnObject;
		this.pnFacilities = pnFacilities;
		this.pnBusinesses = pnBusinesses;
	}

	public PnAddress(Integer addressId, String address1, String address2, String address3, String address4,
			String address5, String address6, String address7, String city, String cityDistrict, String region,
			String stateProvence, String zipcode, String countryCode, String officePhone, String faxPhone,
			String recordStatus) {
		this.addressId = addressId;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.address5 = address5;
		this.address6 = address6;
		this.address7 = address7;
		this.city = city;
		this.cityDistrict = cityDistrict;
		this.region = region;
		this.stateProvence = stateProvence;
		this.zipcode = zipcode;
		this.countryCode = countryCode;
		this.officePhone = officePhone;
		this.faxPhone = faxPhone;
		this.recordStatus = recordStatus;
	}

	/** minimal constructor */
	public PnAddress(Integer addressId, String recordStatus, String countryCode, Set pnFacilities, Set pnBusinesses) {
		this.addressId = addressId;
		this.recordStatus = recordStatus;
		this.countryCode = countryCode;
		this.pnFacilities = pnFacilities;
		this.pnBusinesses = pnBusinesses;
	}

	@Id
	@Column(name = "ADDRESS_ID", nullable = false)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "ADDRESS1", length = 80)
	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name = "ADDRESS2", length = 80)
	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name = "ADDRESS3", length = 80)
	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	@Column(name = "ADDRESS4", length = 80)
	public String getAddress4() {
		return this.address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	@Column(name = "ADDRESS5", length = 80)
	public String getAddress5() {
		return this.address5;
	}

	public void setAddress5(String address5) {
		this.address5 = address5;
	}

	@Column(name = "ADDRESS6", length = 80)
	public String getAddress6() {
		return this.address6;
	}

	public void setAddress6(String address6) {
		this.address6 = address6;
	}

	@Column(name = "ADDRESS7", length = 80)
	public String getAddress7() {
		return this.address7;
	}

	public void setAddress7(String address7) {
		this.address7 = address7;
	}

	@Column(name = "CITY", length = 320)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "CITY_DISTRICT", length = 50)
	public String getCityDistrict() {
		return this.cityDistrict;
	}

	public void setCityDistrict(String cityDistrict) {
		this.cityDistrict = cityDistrict;
	}

	@Column(name = "REGION", length = 50)
	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Column(name = "STATE_PROVENCE", length = 80)
	public String getStateProvence() {
		return this.stateProvence;
	}

	public void setStateProvence(String stateProvence) {
		this.stateProvence = stateProvence;
	}

	@Column(name = "ZIPCODE", length = 20)
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "OFFICE_PHONE", length = 20)
	public String getOfficePhone() {
		return this.officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	@Column(name = "FAX_PHONE", length = 20)
	public String getFaxPhone() {
		return this.faxPhone;
	}

	public void setFaxPhone(String faxPhone) {
		this.faxPhone = faxPhone;
	}

	@Column(name = "HOME_PHONE", length = 20)
	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	@Column(name = "MOBILE_PHONE", length = 20)
	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@Column(name = "PAGER_PHONE", length = 20)
	public String getPagerPhone() {
		return this.pagerPhone;
	}

	public void setPagerPhone(String pagerPhone) {
		this.pagerPhone = pagerPhone;
	}

	@Column(name = "PAGER_EMAIL", length = 240)
	public String getPagerEmail() {
		return this.pagerEmail;
	}

	public void setPagerEmail(String pagerEmail) {
		this.pagerEmail = pagerEmail;
	}

	@Column(name = "WEBSITE_URL", length = 240)
	public String getWebsiteUrl() {
		return this.websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	@Column(name = "RECORD_STATUS", nullable = false, length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	@Column(name = "COUNTRY_CODE", length = 2)
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	//@OneToOne(fetch = FetchType.LAZY, targetEntity=PnObject.class)
	//@JoinColumn(name="ADDRESS_ID")
	@Transient
	public PnObject getPnObject() {
		return this.pnObject;
	}

	public void setPnObject(PnObject pnObject) {
		this.pnObject = pnObject;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnAddress", targetEntity=PnFacility.class)
	@Transient
	public Set getPnFacilities() {
		return this.pnFacilities;
	}

	public void setPnFacilities(Set pnFacilities) {
		this.pnFacilities = pnFacilities;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnAddress", targetEntity=PnBusiness.class)
	public Set getPnBusinesses() {
		return this.pnBusinesses;
	}

	public void setPnBusinesses(Set pnBusinesses) {
		this.pnBusinesses = pnBusinesses;
	}

	public String toString() {
		return new ToStringBuilder(this).append("addressId", getAddressId()).toString();
	}

}