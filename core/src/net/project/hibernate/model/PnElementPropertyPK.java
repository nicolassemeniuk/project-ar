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
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnElementPropertyPK generated by hbm2java
 */
@Embeddable
public class PnElementPropertyPK  implements java.io.Serializable {

    /** identifier field */
    private Integer elementId;

    /** identifier field */
    private Integer propertyId;

    /** identifier field */
    private Integer clientTypeId;

    public PnElementPropertyPK() {
    }

    public PnElementPropertyPK(Integer elementId, Integer propertyId, Integer clientTypeId) {
       this.elementId = elementId;
       this.propertyId = propertyId;
       this.clientTypeId = clientTypeId;
    }
   


    @Column(name="ELEMENT_ID", nullable=false, length=20)
    public Integer getElementId() {
        return this.elementId;
    }
    
    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }


    @Column(name="PROPERTY_ID", nullable=false, length=20)
    public Integer getPropertyId() {
        return this.propertyId;
    }
    
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }


    @Column(name="CLIENT_TYPE_ID", nullable=false, length=20)
    public Integer getClientTypeId() {
        return this.clientTypeId;
    }
    
    public void setClientTypeId(Integer clientTypeId) {
        this.clientTypeId = clientTypeId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("elementId", getElementId())
            .append("propertyId", getPropertyId())
            .append("clientTypeId", getClientTypeId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnElementPropertyPK) ) return false;
        PnElementPropertyPK castOther = (PnElementPropertyPK) other;
        return new EqualsBuilder()
            .append(this.getElementId(), castOther.getElementId())
            .append(this.getPropertyId(), castOther.getPropertyId())
            .append(this.getClientTypeId(), castOther.getClientTypeId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getElementId())
            .append(getPropertyId())
            .append(getClientTypeId())
            .toHashCode();
    }
}

