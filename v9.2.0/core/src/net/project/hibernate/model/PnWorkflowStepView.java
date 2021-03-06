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
import java.sql.Clob;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnWorkflowStepView generated by hbm2java
 */
@Entity
@Table(name="PN_WORKFLOW_STEP_VIEW"
)
public class PnWorkflowStepView implements Serializable {


     private BigDecimal stepId;
     private BigDecimal workflowId;
     private String workflowName;
     private String stepName;
     private Integer stepSequence;
     private String stepDescription;
     private Clob notesClob;
     private int isInitialStep;
     private int isFinalStep;
     private BigDecimal entryStatusId;
     private String entryStatusName;
     private String entryStatusDescription;
     private BigDecimal subscriptionId;
     private BigDecimal createdById;
     private Date createdDatetime;
     private String createdByFullName;
     private BigDecimal modifiedById;
     private Date modifiedDatetime;
     private String modifiedByFullName;
     private Date crc;
     private String recordStatus;
     private BigDecimal beginTransitionCount;
     private BigDecimal endTransitionCount;

    public PnWorkflowStepView() {
    }

    public PnWorkflowStepView(BigDecimal stepId, BigDecimal workflowId, String workflowName, String stepName, Integer stepSequence, String stepDescription, Clob notesClob, int isInitialStep, int isFinalStep, BigDecimal entryStatusId, String entryStatusName, String entryStatusDescription, BigDecimal subscriptionId, BigDecimal createdById, Date createdDatetime, String createdByFullName, BigDecimal modifiedById, Date modifiedDatetime, String modifiedByFullName, Date crc, String recordStatus, BigDecimal beginTransitionCount, BigDecimal endTransitionCount) {
       this.stepId = stepId;
       this.workflowId = workflowId;
       this.workflowName = workflowName;
       this.stepName = stepName;
       this.stepSequence = stepSequence;
       this.stepDescription = stepDescription;
       this.notesClob = notesClob;
       this.isInitialStep = isInitialStep;
       this.isFinalStep = isFinalStep;
       this.entryStatusId = entryStatusId;
       this.entryStatusName = entryStatusName;
       this.entryStatusDescription = entryStatusDescription;
       this.subscriptionId = subscriptionId;
       this.createdById = createdById;
       this.createdDatetime = createdDatetime;
       this.createdByFullName = createdByFullName;
       this.modifiedById = modifiedById;
       this.modifiedDatetime = modifiedDatetime;
       this.modifiedByFullName = modifiedByFullName;
       this.crc = crc;
       this.recordStatus = recordStatus;
       this.beginTransitionCount = beginTransitionCount;
       this.endTransitionCount = endTransitionCount;
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

    
    @Column(name="WORKFLOW_NAME", nullable=false, length=80)
    public String getWorkflowName() {
        return this.workflowName;
    }
    
    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    
    @Column(name="STEP_NAME", nullable=false, length=80)
    public String getStepName() {
        return this.stepName;
    }
    
    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    
    @Column(name="STEP_SEQUENCE", nullable=false, length=5)
    public Integer getStepSequence() {
        return this.stepSequence;
    }
    
    public void setStepSequence(Integer stepSequence) {
        this.stepSequence = stepSequence;
    }

    
    @Column(name="STEP_DESCRIPTION", nullable=false, length=500)
    public String getStepDescription() {
        return this.stepDescription;
    }
    
    public void setStepDescription(String stepDescription) {
        this.stepDescription = stepDescription;
    }

    
    @Column(name="NOTES_CLOB", nullable=false, length=4000)
    public Clob getNotesClob() {
        return this.notesClob;
    }
    
    public void setNotesClob(Clob notesClob) {
        this.notesClob = notesClob;
    }

    
    @Column(name="IS_INITIAL_STEP", nullable=false, length=1)
    public int getIsInitialStep() {
        return this.isInitialStep;
    }
    
    public void setIsInitialStep(int isInitialStep) {
        this.isInitialStep = isInitialStep;
    }

    
    @Column(name="IS_FINAL_STEP", nullable=false, length=1)
    public int getIsFinalStep() {
        return this.isFinalStep;
    }
    
    public void setIsFinalStep(int isFinalStep) {
        this.isFinalStep = isFinalStep;
    }

    
    @Column(name="ENTRY_STATUS_ID", nullable=false, length=20)
    public BigDecimal getEntryStatusId() {
        return this.entryStatusId;
    }
    
    public void setEntryStatusId(BigDecimal entryStatusId) {
        this.entryStatusId = entryStatusId;
    }

    
    @Column(name="ENTRY_STATUS_NAME", nullable=false, length=80)
    public String getEntryStatusName() {
        return this.entryStatusName;
    }
    
    public void setEntryStatusName(String entryStatusName) {
        this.entryStatusName = entryStatusName;
    }

    
    @Column(name="ENTRY_STATUS_DESCRIPTION", nullable=false, length=500)
    public String getEntryStatusDescription() {
        return this.entryStatusDescription;
    }
    
    public void setEntryStatusDescription(String entryStatusDescription) {
        this.entryStatusDescription = entryStatusDescription;
    }

    
    @Column(name="SUBSCRIPTION_ID", nullable=false, length=20)
    public BigDecimal getSubscriptionId() {
        return this.subscriptionId;
    }
    
    public void setSubscriptionId(BigDecimal subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    
    @Column(name="CREATED_BY_ID", nullable=false, length=20)
    public BigDecimal getCreatedById() {
        return this.createdById;
    }
    
    public void setCreatedById(BigDecimal createdById) {
        this.createdById = createdById;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CREATED_DATETIME", nullable=false, length=7)
    public Date getCreatedDatetime() {
        return this.createdDatetime;
    }
    
    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    
    @Column(name="CREATED_BY_FULL_NAME", nullable=false, length=240)
    public String getCreatedByFullName() {
        return this.createdByFullName;
    }
    
    public void setCreatedByFullName(String createdByFullName) {
        this.createdByFullName = createdByFullName;
    }

    
    @Column(name="MODIFIED_BY_ID", nullable=false, length=20)
    public BigDecimal getModifiedById() {
        return this.modifiedById;
    }
    
    public void setModifiedById(BigDecimal modifiedById) {
        this.modifiedById = modifiedById;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="MODIFIED_DATETIME", nullable=false, length=7)
    public Date getModifiedDatetime() {
        return this.modifiedDatetime;
    }
    
    public void setModifiedDatetime(Date modifiedDatetime) {
        this.modifiedDatetime = modifiedDatetime;
    }

    
    @Column(name="MODIFIED_BY_FULL_NAME", nullable=false, length=240)
    public String getModifiedByFullName() {
        return this.modifiedByFullName;
    }
    
    public void setModifiedByFullName(String modifiedByFullName) {
        this.modifiedByFullName = modifiedByFullName;
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

    
    @Column(name="BEGIN_TRANSITION_COUNT", nullable=false, length=22)
    public BigDecimal getBeginTransitionCount() {
        return this.beginTransitionCount;
    }
    
    public void setBeginTransitionCount(BigDecimal beginTransitionCount) {
        this.beginTransitionCount = beginTransitionCount;
    }

    
    @Column(name="END_TRANSITION_COUNT", nullable=false, length=22)
    public BigDecimal getEndTransitionCount() {
        return this.endTransitionCount;
    }
    
    public void setEndTransitionCount(BigDecimal endTransitionCount) {
        this.endTransitionCount = endTransitionCount;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("stepId", getStepId())
            .append("workflowId", getWorkflowId())
            .append("workflowName", getWorkflowName())
            .append("stepName", getStepName())
            .append("stepSequence", getStepSequence())
            .append("stepDescription", getStepDescription())
            .append("notesClob", getNotesClob())
            .append("isInitialStep", getIsInitialStep())
            .append("isFinalStep", getIsFinalStep())
            .append("entryStatusId", getEntryStatusId())
            .append("entryStatusName", getEntryStatusName())
            .append("entryStatusDescription", getEntryStatusDescription())
            .append("subscriptionId", getSubscriptionId())
            .append("createdById", getCreatedById())
            .append("createdDatetime", getCreatedDatetime())
            .append("createdByFullName", getCreatedByFullName())
            .append("modifiedById", getModifiedById())
            .append("modifiedDatetime", getModifiedDatetime())
            .append("modifiedByFullName", getModifiedByFullName())
            .append("crc", getCrc())
            .append("recordStatus", getRecordStatus())
            .append("beginTransitionCount", getBeginTransitionCount())
            .append("endTransitionCount", getEndTransitionCount())
            .toString();
    }

}
