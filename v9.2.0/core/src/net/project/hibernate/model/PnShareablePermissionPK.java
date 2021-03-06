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
 * PnShareablePermissionPK generated by hbm2java
 */
@Embeddable
public class PnShareablePermissionPK implements Serializable {


     private Integer objectId;
     private Integer permittedObjectId;

    public PnShareablePermissionPK() {
    }

    public PnShareablePermissionPK(Integer objectId, Integer permittedObjectId) {
       this.objectId = objectId;
       this.permittedObjectId = permittedObjectId;
    }
   


    @Column(name="OBJECT_ID", nullable=false, length=20)
    public Integer getObjectId() {
        return this.objectId;
    }
    
    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }


    @Column(name="PERMITTED_OBJECT_ID", nullable=false, length=20)
    public Integer getPermittedObjectId() {
        return this.permittedObjectId;
    }
    
    public void setPermittedObjectId(Integer permittedObjectId) {
        this.permittedObjectId = permittedObjectId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("objectId", getObjectId())
            .append("permittedObjectId", getPermittedObjectId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnShareablePermissionPK) ) return false;
        PnShareablePermissionPK castOther = (PnShareablePermissionPK) other;
        return new EqualsBuilder()
            .append(this.getObjectId(), castOther.getObjectId())
            .append(this.getPermittedObjectId(), castOther.getPermittedObjectId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getObjectId())
            .append(getPermittedObjectId())
            .toHashCode();
    }

}
