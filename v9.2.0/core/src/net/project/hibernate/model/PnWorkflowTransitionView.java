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
 * PnWorkflowTransitionView generated by hbm2java
 */
@Entity
@Table(name="PN_WORKFLOW_TRANSITION_VIEW"
)
public class PnWorkflowTransitionView implements Serializable {


     private BigDecimal transitionId;
     private BigDecimal workflowId;
     private String workflowName;
     private String transitionVerb;
     private String transitionDescription;
     private BigDecimal beginStepId;
     private String beginStepName;
     private BigDecimal endStepId;
     private String endStepName;
     private BigDecimal createdById;
     private String createdByFullName;
     private Date createdDatetime;
     private BigDecimal modifiedById;
     private String modifiedByFullName;
     private Date modifiedDatetime;
     private Date crc;
     private String recordStatus;

    public PnWorkflowTransitionView() {
    }

    public PnWorkflowTransitionView(BigDecimal transitionId, BigDecimal workflowId, String workflowName, String transitionVerb, String transitionDescription, BigDecimal beginStepId, String beginStepName, BigDecimal endStepId, String endStepName, BigDecimal createdById, String createdByFullName, Date createdDatetime, BigDecimal modifiedById, String modifiedByFullName, Date modifiedDatetime, Date crc, String recordStatus) {
       this.transitionId = transitionId;
       this.workflowId = workflowId;
       this.workflowName = workflowName;
       this.transitionVerb = transitionVerb;
       this.transitionDescription = transitionDescription;
       this.beginStepId = beginStepId;
       this.beginStepName = beginStepName;
       this.endStepId = endStepId;
       this.endStepName = endStepName;
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
    @Column(name="TRANSITION_ID", nullable=false, length=20)
    public BigDecimal getTransitionId() {
        return this.transitionId;
    }
    
    public void setTransitionId(BigDecimal transitionId) {
        this.transitionId = transitionId;
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

    
    @Column(name="TRANSITION_VERB", nullable=false, length=80)
    public String getTransitionVerb() {
        return this.transitionVerb;
    }
    
    public void setTransitionVerb(String transitionVerb) {
        this.transitionVerb = transitionVerb;
    }

    
    @Column(name="TRANSITION_DESCRIPTION", nullable=false, length=500)
    public String getTransitionDescription() {
        return this.transitionDescription;
    }
    
    public void setTransitionDescription(String transitionDescription) {
        this.transitionDescription = transitionDescription;
    }

    
    @Column(name="BEGIN_STEP_ID", nullable=false, length=20)
    public BigDecimal getBeginStepId() {
        return this.beginStepId;
    }
    
    public void setBeginStepId(BigDecimal beginStepId) {
        this.beginStepId = beginStepId;
    }

    
    @Column(name="BEGIN_STEP_NAME", nullable=false, length=80)
    public String getBeginStepName() {
        return this.beginStepName;
    }
    
    public void setBeginStepName(String beginStepName) {
        this.beginStepName = beginStepName;
    }

    
    @Column(name="END_STEP_ID", nullable=false, length=20)
    public BigDecimal getEndStepId() {
        return this.endStepId;
    }
    
    public void setEndStepId(BigDecimal endStepId) {
        this.endStepId = endStepId;
    }

    
    @Column(name="END_STEP_NAME", nullable=false, length=80)
    public String getEndStepName() {
        return this.endStepName;
    }
    
    public void setEndStepName(String endStepName) {
        this.endStepName = endStepName;
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
            .append("transitionId", getTransitionId())
            .append("workflowId", getWorkflowId())
            .append("workflowName", getWorkflowName())
            .append("transitionVerb", getTransitionVerb())
            .append("transitionDescription", getTransitionDescription())
            .append("beginStepId", getBeginStepId())
            .append("beginStepName", getBeginStepName())
            .append("endStepId", getEndStepId())
            .append("endStepName", getEndStepName())
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
