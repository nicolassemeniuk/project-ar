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


import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnLdapDirectoryAttrMapPK generated by hbm2java
 */
@Embeddable
public class PnLdapDirectoryAttrMapPK  implements java.io.Serializable {

    /** identifier field */
    private Integer contextId;

    /** identifier field */
    private String attributeId;

    public PnLdapDirectoryAttrMapPK() {
    }

    public PnLdapDirectoryAttrMapPK(Integer contextId, String attributeId) {
       this.contextId = contextId;
       this.attributeId = attributeId;
    }

    @Column(name="CONTEXT_ID", nullable=false, length=20)
    public Integer getContextId() {
        return this.contextId;
    }
    
    public void setContextId(Integer contextId) {
        this.contextId = contextId;
    }

    @Column(name="ATTRIBUTE_ID", nullable=false, length=250)
    public String getAttributeId() {
        return this.attributeId;
    }
    
    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("contextId", getContextId())
            .append("attributeId", getAttributeId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnLdapDirectoryAttrMapPK) ) return false;
        PnLdapDirectoryAttrMapPK castOther = (PnLdapDirectoryAttrMapPK) other;
        return new EqualsBuilder()
            .append(this.getContextId(), castOther.getContextId())
            .append(this.getAttributeId(), castOther.getAttributeId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getContextId())
            .append(getAttributeId())
            .toHashCode();
    }

}
