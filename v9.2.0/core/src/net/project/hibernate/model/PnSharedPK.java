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
 * PnSharedPK generated by hbm2java
 */
@Embeddable
public class PnSharedPK implements Serializable {


     private Integer exportedObjectId;
     private Integer importContainerId;

    public PnSharedPK() {
    }

    public PnSharedPK(Integer exportedObjectId, Integer importContainerId) {
       this.exportedObjectId = exportedObjectId;
       this.importContainerId = importContainerId;
    }
   


    @Column(name="EXPORTED_OBJECT_ID", nullable=false, length=20)
    public Integer getExportedObjectId() {
        return this.exportedObjectId;
    }
    
    public void setExportedObjectId(Integer exportedObjectId) {
        this.exportedObjectId = exportedObjectId;
    }


    @Column(name="IMPORT_CONTAINER_ID", nullable=false, length=20)
    public Integer getImportContainerId() {
        return this.importContainerId;
    }
    
    public void setImportContainerId(Integer importContainerId) {
        this.importContainerId = importContainerId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("exportedObjectId", getExportedObjectId())
            .append("importContainerId", getImportContainerId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnSharedPK) ) return false;
        PnSharedPK castOther = (PnSharedPK) other;
        return new EqualsBuilder()
            .append(this.getExportedObjectId(), castOther.getExportedObjectId())
            .append(this.getImportContainerId(), castOther.getImportContainerId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getExportedObjectId())
            .append(getImportContainerId())
            .toHashCode();
    }

}
