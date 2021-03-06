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
 * PnWfStepHasGroupView generated by hbm2java
 */
@Entity
@Table(name="PN_WF_STEP_HAS_GROUP_VIEW"
)
public class PnWfStepHasGroupView implements Serializable {


     private BigDecimal stepId;
     private BigDecimal workflowId;
     private BigDecimal groupId;
     private String groupName;
     private String groupDesc;
    private Integer isPrincipal;
    private Integer isParticipant;
     private BigDecimal createdById;
     private String createdByFullName;
     private Date createdDatetime;
     private BigDecimal modifiedById;
     private String modifiedByFullName;
     private Date modifiedDatetime;
     private Date crc;
     private String recordStatus;

    public PnWfStepHasGroupView() {
    }

    public PnWfStepHasGroupView(BigDecimal stepId, BigDecimal workflowId, BigDecimal groupId, String groupName, String groupDesc, Integer isPrincipal, Integer isParticipant, BigDecimal createdById, String createdByFullName, Date createdDatetime, BigDecimal modifiedById, String modifiedByFullName, Date modifiedDatetime, Date crc, String recordStatus) {
       this.stepId = stepId;
       this.workflowId = workflowId;
       this.groupId = groupId;
       this.groupName = groupName;
       this.groupDesc = groupDesc;
       this.isPrincipal = isPrincipal;
       this.isParticipant = isParticipant;
       this.createdById = createdById;
       this.createdByFullName = createdByFullName;
       this.createdDatetime = createdDatetime;
       this.modifiedById = modifiedById;
       this.modifiedByFullName = modifiedByFullName;
       this.modifiedDatetime = modifiedDatetime;
       this.crc = crc;
       this.recordStatus = recordStatus;
    }
   

    @Id
    @Column(name="STEP_ID", nullable=false, length=20)
    public BigDecimal getStepId() {
        return this.stepId;
    }
    
    public void setStepId(BigDecimal stepId) {
        this.stepId = stepId;
    }

    
    @Column(name="WORKFLOW_ID", nullable=false, length=20)
    public BigDecimal getWorkflowId() {
        return this.workflowId;
    }
    
    public void setWorkflowId(BigDecimal workflowId) {
        this.workflowId = workflowId;
    }

    
    @Column(name="GROUP_ID", nullable=false, length=20)
    public BigDecimal getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(BigDecimal groupId) {
        this.groupId = groupId;
    }

    
    @Column(name="GROUP_NAME", nullable=false, length=240)
    public String getGroupName() {
        return this.groupName;
    }
    
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    
    @Column(name="GROUP_DESC", nullable=false)
    public String getGroupDesc() {
        return this.groupDesc;
    }
    
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    
    @Column(name="IS_PRINCIPAL", nullable=false, length=1)
    public int getIsPrincipal() {
        return this.isPrincipal;
    }
    
    public void setIsPrincipal(int isPrincipal) {
        this.isPrincipal = isPrincipal;
    }

    
    @Column(name="IS_PARTICIPANT", nullable=false, length=1)
    public int getIsParticipant() {
        return this.isParticipant;
    }
    
    public void setIsParticipant(int isParticipant) {
        this.isParticipant = isParticipant;
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

    public String toString() {
        return new ToStringBuilder(this)
            .append("stepId", getStepId())
            .append("workflowId", getWorkflowId())
            .append("groupId", getGroupId())
            .append("groupName", getGroupName())
            .append("groupDesc", getGroupDesc())
            .append("isPrincipal", getIsPrincipal())
            .append("isParticipant", getIsParticipant())
            .append("createdById", getCreatedById())
            .append("createdByFullName", getCreatedByFullName())
            .append("createdDatetime", getCreatedDatetime())
            .append("modifiedById", getModifiedById())
            .append("modifiedByFullName", getModifiedByFullName())
            .append("modifiedDatetime", getModifiedDatetime())
            .append("crc", getCrc())
            .append("recordStatus", getRecordStatus())
            .toString();
    }

}
