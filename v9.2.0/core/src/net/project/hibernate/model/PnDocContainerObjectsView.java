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


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnDocContainerObjectsView generated by hbm2java
 */
@Entity
@Table(name="PN_DOC_CONTAINER_OBJECTS_VIEW"
)
public class PnDocContainerObjectsView  implements java.io.Serializable {

    /** identifier field */
    private BigDecimal docContainerId;

    /** identifier field */
    private String docContainerName;

    /** identifier field */
    private BigDecimal objectId;

    /** identifier field */
    private String objectType;

    /** identifier field */
    private Date dateCreated;

    /** identifier field */
    private BigDecimal createdBy;

    public PnDocContainerObjectsView() {
    }

    public PnDocContainerObjectsView(BigDecimal docContainerId, String docContainerName, BigDecimal objectId, String objectType, Date dateCreated, BigDecimal createdBy) {
       this.docContainerId = docContainerId;
       this.docContainerName = docContainerName;
       this.objectId = objectId;
       this.objectType = objectType;
       this.dateCreated = dateCreated;
       this.createdBy = createdBy;
    }
   

    
    @Column(name="DOC_CONTAINER_ID", nullable=false, length=20)
    public BigDecimal getDocContainerId() {
        return this.docContainerId;
    }
    
    public void setDocContainerId(BigDecimal docContainerId) {
        this.docContainerId = docContainerId;
    }

    
    @Column(name="DOC_CONTAINER_NAME", nullable=false, length=80)
    public String getDocContainerName() {
        return this.docContainerName;
    }
    
    public void setDocContainerName(String docContainerName) {
        this.docContainerName = docContainerName;
    }

    
    @Column(name="OBJECT_ID", nullable=false, length=20)
    public BigDecimal getObjectId() {
        return this.objectId;
    }
    
    public void setObjectId(BigDecimal objectId) {
        this.objectId = objectId;
    }

    
    @Column(name="OBJECT_TYPE", nullable=false, length=80)
    public String getObjectType() {
        return this.objectType;
    }
    
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_CREATED", nullable=false, length=7)
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    
    @Column(name="CREATED_BY", nullable=false, length=20)
    public BigDecimal getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("docContainerId", getDocContainerId())
            .append("docContainerName", getDocContainerName())
            .append("objectId", getObjectId())
            .append("objectType", getObjectType())
            .append("dateCreated", getDateCreated())
            .append("createdBy", getCreatedBy())
            .toString();
    }

}


