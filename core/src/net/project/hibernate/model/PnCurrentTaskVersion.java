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
 * PnCurrentTaskVersion generated by hbm2java
 */
@Entity
@Table(name="PN_CURRENT_TASK_VERSION"
)
public class PnCurrentTaskVersion  implements java.io.Serializable {

    /** identifier field */
    private BigDecimal baselineId;

    /** identifier field */
    private BigDecimal planId;

    /** identifier field */
    private BigDecimal taskId;

    /** identifier field */
    private BigDecimal taskVersionId;

    /** identifier field */
    private BigDecimal work;

    /** identifier field */
    private BigDecimal workUnits;

    /** identifier field */
    private BigDecimal duration;

    /** identifier field */
    private BigDecimal durationUnits;

    /** identifier field */
    private Date dateStart;

    /** identifier field */
    private Date dateFinish;

    public PnCurrentTaskVersion() {
    }

    public PnCurrentTaskVersion(BigDecimal baselineId, BigDecimal planId, BigDecimal taskId, BigDecimal taskVersionId, BigDecimal work, BigDecimal workUnits, BigDecimal duration, BigDecimal durationUnits, Date dateStart, Date dateFinish) {
       this.baselineId = baselineId;
       this.planId = planId;
       this.taskId = taskId;
       this.taskVersionId = taskVersionId;
       this.work = work;
       this.workUnits = workUnits;
       this.duration = duration;
       this.durationUnits = durationUnits;
       this.dateStart = dateStart;
       this.dateFinish = dateFinish;
    }
   

    
    @Column(name="BASELINE_ID", nullable=false, length=20)
    public BigDecimal getBaselineId() {
        return this.baselineId;
    }
    
    public void setBaselineId(BigDecimal baselineId) {
        this.baselineId = baselineId;
    }

    
    @Column(name="PLAN_ID", nullable=false, length=20)
    public BigDecimal getPlanId() {
        return this.planId;
    }
    
    public void setPlanId(BigDecimal planId) {
        this.planId = planId;
    }

    
    @Column(name="TASK_ID", nullable=false, length=20)
    public BigDecimal getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(BigDecimal taskId) {
        this.taskId = taskId;
    }

    
    @Column(name="TASK_VERSION_ID", nullable=false, length=20)
    public BigDecimal getTaskVersionId() {
        return this.taskVersionId;
    }
    
    public void setTaskVersionId(BigDecimal taskVersionId) {
        this.taskVersionId = taskVersionId;
    }

    
    @Column(name="WORK", nullable=false, length=22)
    public BigDecimal getWork() {
        return this.work;
    }
    
    public void setWork(BigDecimal work) {
        this.work = work;
    }

    
    @Column(name="WORK_UNITS", nullable=false, length=20)
    public BigDecimal getWorkUnits() {
        return this.workUnits;
    }
    
    public void setWorkUnits(BigDecimal workUnits) {
        this.workUnits = workUnits;
    }

    
    @Column(name="DURATION", nullable=false, length=22)
    public BigDecimal getDuration() {
        return this.duration;
    }
    
    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    
    @Column(name="DURATION_UNITS", nullable=false, length=20)
    public BigDecimal getDurationUnits() {
        return this.durationUnits;
    }
    
    public void setDurationUnits(BigDecimal durationUnits) {
        this.durationUnits = durationUnits;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_START", nullable=false, length=7)
    public Date getDateStart() {
        return this.dateStart;
    }
    
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_FINISH", nullable=false, length=7)
    public Date getDateFinish() {
        return this.dateFinish;
    }
    
    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("baselineId", getBaselineId())
            .append("planId", getPlanId())
            .append("taskId", getTaskId())
            .append("taskVersionId", getTaskVersionId())
            .append("work", getWork())
            .append("workUnits", getWorkUnits())
            .append("duration", getDuration())
            .append("durationUnits", getDurationUnits())
            .append("dateStart", getDateStart())
            .append("dateFinish", getDateFinish())
            .toString();
    }

}

