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
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnWorkflowView generated by hbm2java
 */
@Entity
@Table(name="PN_WORKFLOW_VIEW"
)
public class PnWorkflowView implements Serializable {


     private BigDecimal spaceId;
     private BigDecimal workflowId;
     private String workflowName;
     private BigDecimal strictnessId;
     private String strictnessName;
     private String workflowDescription;
     private String notes;
    private Integer isPublished;
     private BigDecimal ownerId;
     private String ownerFullName;
     private BigDecimal createdById;
     private String createdByFullName;
     private Date createdDatetime;
     private BigDecimal modifiedById;
     private String modifiedByFullName;
     private Date modifiedDatetime;
    private Integer isGeneric;
     private Date crc;
     private String recordStatus;
     private BigDecimal activeEnvelopeCount;

    public PnWorkflowView() {
    }

    public PnWorkflowView(BigDecimal spaceId, BigDecimal workflowId, String workflowName, BigDecimal strictnessId, String strictnessName, String workflowDescription, String notes, int isPublished, BigDecimal ownerId, String ownerFullName, BigDecimal createdById, String createdByFullName, Date createdDatetime, BigDecimal modifiedById, String modifiedByFullName, Date modifiedDatetime, int isGeneric, Date crc, String recordStatus, BigDecimal activeEnvelopeCount) {
       this.spaceId = spaceId;
       this.workflowId = workflowId;
       this.workflowName = workflowName;
       this.strictnessId = strictnessId;
       this.strictnessName = strictnessName;
       this.workflowDescription = workflowDescription;
       this.notes = notes;
       this.isPublished = isPublished;
       this.ownerId = ownerId;
       this.ownerFullName = ownerFullName;
       this.createdById = createdById;
       this.createdByFullName = createdByFullName;
       this.createdDatetime = createdDatetime;
       this.modifiedById = modifiedById;
       this.modifiedByFullName = modifiedByFullName;
       this.modifiedDatetime = modifiedDatetime;
       this.isGeneric = isGeneric;
       this.crc = crc;
       this.recordStatus = recordStatus;
       this.activeEnvelopeCount = activeEnvelopeCount;
    }
   

    @Id
    @Column(name="SPACE_ID", nullable=false, length=20)
    public BigDecimal getSpaceId() {
        return this.spaceId;
    }
    
    public void setSpaceId(BigDecimal spaceId) {
        this.spaceId = spaceId;
    }

    
    @Column(name="WORKFLOW_ID", nullable=false, length=20)
    public BigDecimal getWorkflowId() {
        return this.workflowId;
    }
    
    public void setWorkflowId(BigDecimal workflowId) {
        this.workflowId = workflowId;
    }

    
    @Column(name="WORKFLOW_NAME", nullable=false, length=80)
    public String getWorkflowName() {
        return this.workflowName;
    }
    
    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    
    @Column(name="STRICTNESS_ID", nullable=false, length=20)
    public BigDecimal getStrictnessId() {
        return this.strictnessId;
    }
    
    public void setStrictnessId(BigDecimal strictnessId) {
        this.strictnessId = strictnessId;
    }

    
    @Column(name="STRICTNESS_NAME", nullable=false, length=80)
    public String getStrictnessName() {
        return this.strictnessName;
    }
    
    public void setStrictnessName(String strictnessName) {
        this.strictnessName = strictnessName;
    }

    
    @Column(name="WORKFLOW_DESCRIPTION", nullable=false, length=500)
    public String getWorkflowDescription() {
        return this.workflowDescription;
    }
    
    public void setWorkflowDescription(String workflowDescription) {
        this.workflowDescription = workflowDescription;
    }

    
    @Column(name="NOTES", nullable=false, length=4000)
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }

    
    @Column(name="IS_PUBLISHED", nullable=false, length=1)
    public Integer getIsPublished() {
        return this.isPublished;
    }
    
    public void setIsPublished(Integer isPublished) {
        this.isPublished = isPublished;
    }

    
    @Column(name="OWNER_ID", nullable=false, length=20)
    public BigDecimal getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(BigDecimal ownerId) {
        this.ownerId = ownerId;
    }

    
    @Column(name="OWNER_FULL_NAME", nullable=false, length=240)
    public String getOwnerFullName() {
        return this.ownerFullName;
    }
    
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    
    @Column(name="CREATED_BY_ID", nullable=false, length=20)
    public BigDecimal getCreatedById() {
        return this.createdById;
    }
    
    public void setCreatedById(BigDecimal createdById) {
        this.createdById = createdById;
    }

    
    @Column(name="CREATED_BY_FULL_NAME", nullable=false, length=240)
    public String getCreatedByFullName() {
        return this.createdByFullName;
    }
    
    public void setCreatedByFullName(String createdByFullName) {
        this.createdByFullName = createdByFullName;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CREATED_DATETIME", nullable=false, length=7)
    public Date getCreatedDatetime() {
        return this.createdDatetime;
    }
    
    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    
    @Column(name="MODIFIED_BY_ID", nullable=false, length=20)
    public BigDecimal getModifiedById() {
        return this.modifiedById;
    }
    
    public void setModifiedById(BigDecimal modifiedById) {
        this.modifiedById = modifiedById;
    }

    
    @Column(name="MODIFIED_BY_FULL_NAME", nullable=false, length=240)
    public String getModifiedByFullName() {
        return this.modifiedByFullName;
    }
    
    public void setModifiedByFullName(String modifiedByFullName) {
        this.modifiedByFullName = modifiedByFullName;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="MODIFIED_DATETIME", nullable=false, length=7)
    public Date getModifiedDatetime() {
        return this.modifiedDatetime;
    }
    
    public void setModifiedDatetime(Date modifiedDatetime) {
        this.modifiedDatetime = modifiedDatetime;
    }

    
    @Column(name="IS_GENERIC", nullable=false, length=1)
    public Integer getIsGeneric() {
        return this.isGeneric;
    }
    
    public void setIsGeneric(Integer isGeneric) {
        this.isGeneric = isGeneric;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CRC", nullable=false, length=7)
    public Date getCrc() {
        return this.crc;
    }
    
    public void setCrc(Date crc) {
        this.crc = crc;
    }

    
    @Column(name="RECORD_STATUS", nullable=false, length=1)
    public String getRecordStatus() {
        return this.recordStatus;
    }
    
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    
    @Column(name="ACTIVE_ENVELOPE_COUNT", nullable=false, length=22)
    public BigDecimal getActiveEnvelopeCount() {
        return this.activeEnvelopeCount;
    }
    
    public void setActiveEnvelopeCount(BigDecimal activeEnvelopeCount) {
        this.activeEnvelopeCount = activeEnvelopeCount;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("spaceId", getSpaceId())
            .append("workflowId", getWorkflowId())
            .append("workflowName", getWorkflowName())
            .append("strictnessId", getStrictnessId())
            .append("strictnessName", getStrictnessName())
            .append("workflowDescription", getWorkflowDescription())
            .append("notes", getNotes())
            .append("isPublished", getIsPublished())
            .append("ownerId", getOwnerId())
            .append("ownerFullName", getOwnerFullName())
            .append("createdById", getCreatedById())
            .append("createdByFullName", getCreatedByFullName())
            .append("createdDatetime", getCreatedDatetime())
            .append("modifiedById", getModifiedById())
            .append("modifiedByFullName", getModifiedByFullName())
            .append("modifiedDatetime", getModifiedDatetime())
            .append("isGeneric", getIsGeneric())
            .append("crc", getCrc())
            .append("recordStatus", getRecordStatus())
            .append("activeEnvelopeCount", getActiveEnvelopeCount())
            .toString();
    }

}