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

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PnModuleHasObjectTypePK generated by hbm2java
 */
@Embeddable
public class PnModuleHasObjectTypePK implements Serializable {


     private Integer moduleId;
     private String objectType;

    public PnModuleHasObjectTypePK() {
    }

    public PnModuleHasObjectTypePK(Integer moduleId, String objectType) {
       this.moduleId = moduleId;
       this.objectType = objectType;
    }
   
    @Column(name="MODULE_ID", nullable=false, length=20)
    public Integer getModuleId() {
        return this.moduleId;
    }
    
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    @Column(name="OBJECT_TYPE", nullable=false, length=80)
    public String getObjectType() {
        return this.objectType;
    }
    
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("moduleId", getModuleId())
            .append("objectType", getObjectType())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnModuleHasObjectTypePK) ) return false;
        PnModuleHasObjectTypePK castOther = (PnModuleHasObjectTypePK) other;
        return new EqualsBuilder()
            .append(this.getModuleId(), castOther.getModuleId())
            .append(this.getObjectType(), castOther.getObjectType())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getModuleId())
            .append(getObjectType())
            .toHashCode();
    }

}
