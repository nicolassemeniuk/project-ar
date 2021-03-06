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
 * PnLanguage generated by hbm2java
 */
@Entity
@Table(name = "PN_LANGUAGE")
public class PnLanguage implements java.io.Serializable {

	/** identifier field */
	private String languageCode;

	/** persistent field */
	private String languageName;

	/** persistent field */
	private String characterSet;

	/** persistent field */
	private int isActive;

	/** persistent field */
	private Set pnProperties = new HashSet(0);

	private Set pnBrandSupportsLanguages = new HashSet(0);

	private Set pnBrands = new HashSet(0);

	public PnLanguage() {
	}

	public PnLanguage(String languageCode, String languageName, String characterSet, int isActive) {
		this.languageCode = languageCode;
		this.languageName = languageName;
		this.characterSet = characterSet;
		this.isActive = isActive;
	}

	public PnLanguage(String languageCode, String languageName, String characterSet, int isActive, Set pnProperties,
			Set pnBrandSupportsLanguages, Set pnBrands) {
		this.languageCode = languageCode;
		this.languageName = languageName;
		this.characterSet = characterSet;
		this.isActive = isActive;
		this.pnProperties = pnProperties;
		this.pnBrandSupportsLanguages = pnBrandSupportsLanguages;
		this.pnBrands = pnBrands;
	}

	@Id
	@Column(name = "LANGUAGE_CODE", nullable = false)
	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	@Column(name = "LANGUAGE_NAME", nullable = false, length = 500)
	public String getLanguageName() {
		return this.languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	@Column(name = "CHARACTER_SET", nullable = false, length = 500)
	public String getCharacterSet() {
		return this.characterSet;
	}

	public void setCharacterSet(String characterSet) {
		this.characterSet = characterSet;
	}

	@Column(name = "IS_ACTIVE", nullable = false, length = 1)
	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnLanguage", targetEntity = PnProperty.class)
	@Transient
	public Set getPnProperties() {
		return this.pnProperties;
	}

	public void setPnProperties(Set pnProperties) {
		this.pnProperties = pnProperties;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnLanguage", targetEntity = PnBrandSupportsLanguage.class)
	@Transient
	public Set getPnBrandSupportsLanguages() {
		return this.pnBrandSupportsLanguages;
	}

	public void setPnBrandSupportsLanguages(Set pnBrandSupportsLanguages) {
		this.pnBrandSupportsLanguages = pnBrandSupportsLanguages;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnLanguage", targetEntity = PnBrand.class)
	@Transient
	public Set getPnBrands() {
		return this.pnBrands;
	}

	public void setPnBrands(Set pnBrands) {
		this.pnBrands = pnBrands;
	}

	public String toString() {
		return new ToStringBuilder(this).append("languageCode", getLanguageCode()).toString();
	}

}
