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

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnLdapDirectoryAttrMap generated by hbm2java
 */
@Entity
@Table(name = "PN_LDAP_DIRECTORY_ATTR_MAP")
public class PnLdapDirectoryAttrMap implements java.io.Serializable {

	/** identifier field */
	private PnLdapDirectoryAttrMapPK comp_id;

	/** persistent field */
	private String ldapAttributeName;

	/** nullable persistent field */
	private Integer ldapAttributeValueIndex;

	/** nullable persistent field */
	private PnLdapDirectoryConfig pnLdapDirectoryConfig;

	public PnLdapDirectoryAttrMap() {
	}

	public PnLdapDirectoryAttrMap(PnLdapDirectoryAttrMapPK comp_id, String ldapAttributeName) {
		this.comp_id = comp_id;
		this.ldapAttributeName = ldapAttributeName;
	}

	public PnLdapDirectoryAttrMap(PnLdapDirectoryAttrMapPK comp_id, String ldapAttributeName,
			Integer ldapAttributeValueIndex, PnLdapDirectoryConfig pnLdapDirectoryConfig) {
		this.comp_id = comp_id;
		this.ldapAttributeName = ldapAttributeName;
		this.ldapAttributeValueIndex = ldapAttributeValueIndex;
		this.pnLdapDirectoryConfig = pnLdapDirectoryConfig;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "contextId", column = @Column(name = "CONTEXT_ID", nullable = false, length = 20)),
			@AttributeOverride(name = "attributeId", column = @Column(name = "ATTRIBUTE_ID", nullable = false, length = 250)) })
	public PnLdapDirectoryAttrMapPK getComp_id() {
		return this.comp_id;
	}

	public void setComp_id(PnLdapDirectoryAttrMapPK comp_id) {
		this.comp_id = comp_id;
	}

	@Column(name = "LDAP_ATTRIBUTE_NAME", nullable = false, length = 1000)
	public String getLdapAttributeName() {
		return this.ldapAttributeName;
	}

	public void setLdapAttributeName(String ldapAttributeName) {
		this.ldapAttributeName = ldapAttributeName;
	}

	@Column(name = "LDAP_ATTRIBUTE_VALUE_INDEX", length = 3)
	public Integer getLdapAttributeValueIndex() {
		return this.ldapAttributeValueIndex;
	}

	public void setLdapAttributeValueIndex(Integer ldapAttributeValueIndex) {
		this.ldapAttributeValueIndex = ldapAttributeValueIndex;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnLdapDirectoryConfig.class)
	@JoinColumn(name = "CONTEXT_ID", insertable = false, updatable = false)
	public PnLdapDirectoryConfig getPnLdapDirectoryConfig() {
		return this.pnLdapDirectoryConfig;
	}

	public void setPnLdapDirectoryConfig(PnLdapDirectoryConfig pnLdapDirectoryConfig) {
		this.pnLdapDirectoryConfig = pnLdapDirectoryConfig;
	}

	public String toString() {
		return new ToStringBuilder(this).append("comp_id", getComp_id()).toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof PnLdapDirectoryAttrMap))
			return false;
		PnLdapDirectoryAttrMap castOther = (PnLdapDirectoryAttrMap) other;
		return new EqualsBuilder().append(this.getComp_id(), castOther.getComp_id()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getComp_id()).toHashCode();
	}
}