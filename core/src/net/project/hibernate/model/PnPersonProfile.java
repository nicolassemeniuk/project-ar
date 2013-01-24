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

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * PnPersonProfile generated by hbm2java
 */
@Entity
@Table(name = "PN_PERSON_PROFILE")
public class PnPersonProfile implements Serializable {

	private Integer personId;

	private String prefixName;

	private String middleName;

	private String secondLastName;

	private String suffixName;

	private String companyName;

	private String companyDivision;

	private Integer jobDescriptionCode;

	private Integer addressId;

	private String languageCode;

	private String timezoneCode;

	private String personalSpaceName;

	private String verificationCode;

	private String alternateEmail1;

	private String alternateEmail2;

	private String alternateEmail3;

	private String skype;

	private String skillsBio;

	private String localeCode;

	private PnPerson pnPerson;

	public PnPersonProfile() {
	}

	public PnPersonProfile(Integer personId, Integer addressId, String timezoneCode, String personalSpaceName) {
		this.personId = personId;
		this.addressId = addressId;
		this.timezoneCode = timezoneCode;
		this.personalSpaceName = personalSpaceName;
	}

	public PnPersonProfile(Integer personId, String prefixName, String middleName, String secondLastName,
			String suffixName, String localeCode, String languageCode, String timezoneCode, String personalSpaceName,
			String verificationCode, Integer addressId, String alternateEmail1, String alternateEmail2,
			String alternateEmail3) {
		this.personId = personId;
		this.prefixName = prefixName;
		this.middleName = middleName;
		this.secondLastName = secondLastName;
		this.suffixName = suffixName;
		this.localeCode = localeCode;
		this.addressId = addressId;
		this.languageCode = languageCode;
		this.timezoneCode = timezoneCode;
		this.personalSpaceName = personalSpaceName;
		this.verificationCode = verificationCode;
		this.alternateEmail1 = alternateEmail1;
		this.alternateEmail2 = alternateEmail2;
		this.alternateEmail3 = alternateEmail3;
	}

	public PnPersonProfile(Integer personId, String prefixName, String middleName, String secondLastName,
			String suffixName, String companyName, String companyDivision, Integer jobDescriptionCode,
			Integer addressId, String languageCode, String timezoneCode, String personalSpaceName,
			String verificationCode, String alternateEmail1, String alternateEmail2, String alternateEmail3,
			String localeCode, net.project.hibernate.model.PnPerson pnPerson) {
		this.personId = personId;
		this.prefixName = prefixName;
		this.middleName = middleName;
		this.secondLastName = secondLastName;
		this.suffixName = suffixName;
		this.companyName = companyName;
		this.companyDivision = companyDivision;
		this.jobDescriptionCode = jobDescriptionCode;
		this.addressId = addressId;
		this.languageCode = languageCode;
		this.timezoneCode = timezoneCode;
		this.personalSpaceName = personalSpaceName;
		this.verificationCode = verificationCode;
		this.alternateEmail1 = alternateEmail1;
		this.alternateEmail2 = alternateEmail2;
		this.alternateEmail3 = alternateEmail3;
		this.localeCode = localeCode;
		this.pnPerson = pnPerson;
	}

	public PnPersonProfile(Integer personId, String prefixName, String middleName, String secondLastName,
			String suffixName, String companyName, String companyDivision, Integer jobDescriptionCode,
			Integer addressId, String languageCode, String timezoneCode, String personalSpaceName,
			String verificationCode, String alternateEmail1, String alternateEmail2, String alternateEmail3,
			String skype, String skillsBio, String localeCode, PnPerson pnPerson) {
		this.personId = personId;
		this.prefixName = prefixName;
		this.middleName = middleName;
		this.secondLastName = secondLastName;
		this.suffixName = suffixName;
		this.companyName = companyName;
		this.companyDivision = companyDivision;
		this.jobDescriptionCode = jobDescriptionCode;
		this.addressId = addressId;
		this.languageCode = languageCode;
		this.timezoneCode = timezoneCode;
		this.personalSpaceName = personalSpaceName;
		this.verificationCode = verificationCode;
		this.alternateEmail1 = alternateEmail1;
		this.alternateEmail2 = alternateEmail2;
		this.alternateEmail3 = alternateEmail3;
		this.skype = skype;
		this.skillsBio = skillsBio;
		this.localeCode = localeCode;
		this.pnPerson = pnPerson;
	}

	@Id
	@Column(name = "PERSON_ID", nullable = false)
	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	@Column(name = "PREFIX_NAME", length = 80)
	public String getPrefixName() {
		return this.prefixName;
	}

	public void setPrefixName(String prefixName) {
		this.prefixName = prefixName;
	}

	@Column(name = "MIDDLE_NAME", length = 80)
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Column(name = "SECOND_LAST_NAME", length = 80)
	public String getSecondLastName() {
		return this.secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	@Column(name = "SUFFIX_NAME", length = 80)
	public String getSuffixName() {
		return this.suffixName;
	}

	public void setSuffixName(String suffixName) {
		this.suffixName = suffixName;
	}

	@Column(name = "COMPANY_NAME", length = 120)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "COMPANY_DIVISION", length = 120)
	public String getCompanyDivision() {
		return this.companyDivision;
	}

	public void setCompanyDivision(String companyDivision) {
		this.companyDivision = companyDivision;
	}

	@Column(name = "JOB_DESCRIPTION_CODE", length = 4)
	public Integer getJobDescriptionCode() {
		return this.jobDescriptionCode;
	}

	public void setJobDescriptionCode(Integer jobDescriptionCode) {
		this.jobDescriptionCode = jobDescriptionCode;
	}

	@Column(name = "ADDRESS_ID", nullable = false, length = 20)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "LANGUAGE_CODE", length = 80)
	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	@Column(name = "TIMEZONE_CODE", nullable = false, length = 60)
	public String getTimezoneCode() {
		return this.timezoneCode;
	}

	public void setTimezoneCode(String timezoneCode) {
		this.timezoneCode = timezoneCode;
	}

	@Column(name = "PERSONAL_SPACE_NAME", nullable = false, length = 240)
	public String getPersonalSpaceName() {
		return this.personalSpaceName;
	}

	public void setPersonalSpaceName(String personalSpaceName) {
		this.personalSpaceName = personalSpaceName;
	}

	@Column(name = "VERIFICATION_CODE", length = 80)
	public String getVerificationCode() {
		return this.verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	@Column(name = "ALTERNATE_EMAIL_1", length = 240)
	public String getAlternateEmail1() {
		return this.alternateEmail1;
	}

	public void setAlternateEmail1(String alternateEmail1) {
		this.alternateEmail1 = alternateEmail1;
	}

	@Column(name = "ALTERNATE_EMAIL_2", length = 240)
	public String getAlternateEmail2() {
		return this.alternateEmail2;
	}

	public void setAlternateEmail2(String alternateEmail2) {
		this.alternateEmail2 = alternateEmail2;
	}

	@Column(name = "ALTERNATE_EMAIL_3", length = 240)
	public String getAlternateEmail3() {
		return this.alternateEmail3;
	}

	public void setAlternateEmail3(String alternateEmail3) {
		this.alternateEmail3 = alternateEmail3;
	}

	@Column(name = "SKYPE", length = 240)
	public String getSkype() {
		return this.skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	@Column(name = "SKILLS_BIO", length = 300)
	public String getSkillsBio() {
		return this.skillsBio;
	}

	public void setSkillsBio(String skillsBio) {
		this.skillsBio = skillsBio;
	}

	@Column(name = "LOCALE_CODE", length = 20)
	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	@OneToOne(fetch = FetchType.LAZY, targetEntity = PnPerson.class)
	@JoinColumn(name = "PERSON_ID")
	public PnPerson getPnPerson() {
		return this.pnPerson;
	}

	public void setPnPerson(PnPerson pnPerson) {
		this.pnPerson = pnPerson;
	}

	public String toString() {
		return new ToStringBuilder(this).append("personId", getPersonId()).toString();
	}

}