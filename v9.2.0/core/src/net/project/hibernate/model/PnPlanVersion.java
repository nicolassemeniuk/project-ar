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
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnPlanVersion generated by hbm2java
 */
@Entity
@Table(name="PN_PLAN_VERSION"
)
public class PnPlanVersion implements Serializable {


     private PnPlanVersionPK comp_id;
     private String planName;
     private String planDesc;
     private Date dateStart;
     private Date dateEnd;
     private Integer autocalculateTaskEndpoints;
     private Integer overallocationWarning;
     private Integer defaultCalendarId;
     private String timezoneId;
     private Date baselineStart;
     private Date baselineEnd;
     private Date modifiedDate;
     private Integer modifiedBy;
     private Integer baselineId;
     private Integer defaultTaskCalcTypeId;
     private Date earliestStartDate;
     private Date earliestFinishDate;
     private Date latestStartDate;
     private Date latestFinishDate;
     private String constraintTypeId;
     private Date constraintDate;

    public PnPlanVersion() {
    }

	
    public PnPlanVersion(PnPlanVersionPK comp_id, String planName, Integer defaultTaskCalcTypeId) {
        this.comp_id = comp_id;
        this.planName = planName;
        this.defaultTaskCalcTypeId = defaultTaskCalcTypeId;
    }

    public PnPlanVersion(PnPlanVersionPK comp_id, String planName, String planDesc, Date dateStart, Date dateEnd, Integer autocalculateTaskEndpoints, Integer overallocationWarning, Integer defaultCalendarId, String timezoneId, Date baselineStart, Date baselineEnd, Date modifiedDate, Integer modifiedBy, Integer baselineId, Integer defaultTaskCalcTypeId, Date earliestStartDate, Date earliestFinishDate, Date latestStartDate, Date latestFinishDate, String constraintTypeId, Date constraintDate) {
       this.comp_id = comp_id;
       this.planName = planName;
       this.planDesc = planDesc;
       this.dateStart = dateStart;
       this.dateEnd = dateEnd;
       this.autocalculateTaskEndpoints = autocalculateTaskEndpoints;
       this.overallocationWarning = overallocationWarning;
       this.defaultCalendarId = defaultCalendarId;
       this.timezoneId = timezoneId;
       this.baselineStart = baselineStart;
       this.baselineEnd = baselineEnd;
       this.modifiedDate = modifiedDate;
       this.modifiedBy = modifiedBy;
       this.baselineId = baselineId;
       this.defaultTaskCalcTypeId = defaultTaskCalcTypeId;
       this.earliestStartDate = earliestStartDate;
       this.earliestFinishDate = earliestFinishDate;
       this.latestStartDate = latestStartDate;
       this.latestFinishDate = latestFinishDate;
       this.constraintTypeId = constraintTypeId;
       this.constraintDate = constraintDate;
    }
   
     @EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="planId", column=@Column(name="PLAN_ID", nullable=false, length=20) ), 
        @AttributeOverride(name="planVersionId", column=@Column(name="PLAN_VERSION_ID", nullable=false, length=20) ) } )
    public PnPlanVersionPK getComp_id() {
        return this.comp_id;
    }
    
    public void setComp_id(PnPlanVersionPK comp_id) {
        this.comp_id = comp_id;
    }

    @Column(name="PLAN_NAME", nullable=false, length=80)
    public String getPlanName() {
        return this.planName;
    }
    
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    @Column(name="PLAN_DESC", length=500)
    public String getPlanDesc() {
        return this.planDesc;
    }
    
    public void setPlanDesc(String planDesc) {
        this.planDesc = planDesc;
    }

    @Column(name="DATE_START", length=7)
    public Date getDateStart() {
        return this.dateStart;
    }
    
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    @Column(name="DATE_END", length=7)
    public Date getDateEnd() {
        return this.dateEnd;
    }
    
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Column(name="AUTOCALCULATE_TASK_ENDPOINTS", length=22)
    public Integer getAutocalculateTaskEndpoints() {
        return this.autocalculateTaskEndpoints;
    }
    
    public void setAutocalculateTaskEndpoints(Integer autocalculateTaskEndpoints) {
        this.autocalculateTaskEndpoints = autocalculateTaskEndpoints;
    }

    @Column(name="OVERALLOCATION_WARNING", length=22)
    public Integer getOverallocationWarning() {
        return this.overallocationWarning;
    }
    
    public void setOverallocationWarning(Integer overallocationWarning) {
        this.overallocationWarning = overallocationWarning;
    }

    @Column(name="DEFAULT_CALENDAR_ID", length=22)
    public Integer getDefaultCalendarId() {
        return this.defaultCalendarId;
    }
    
    public void setDefaultCalendarId(Integer defaultCalendarId) {
        this.defaultCalendarId = defaultCalendarId;
    }

    @Column(name="TIMEZONE_ID", length=1000)
    public String getTimezoneId() {
        return this.timezoneId;
    }
    
    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
    }

    @Column(name="BASELINE_START", length=7)
    public Date getBaselineStart() {
        return this.baselineStart;
    }
    
    public void setBaselineStart(Date baselineStart) {
        this.baselineStart = baselineStart;
    }

    @Column(name="BASELINE_END", length=7)
    public Date getBaselineEnd() {
        return this.baselineEnd;
    }
    
    public void setBaselineEnd(Date baselineEnd) {
        this.baselineEnd = baselineEnd;
    }

    @Column(name="MODIFIED_DATE", length=7)
    public Date getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Column(name="MODIFIED_BY", length=22)
    public Integer getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Column(name="BASELINE_ID", length=22)
    public Integer getBaselineId() {
        return this.baselineId;
    }
    
    public void setBaselineId(Integer baselineId) {
        this.baselineId = baselineId;
    }

    @Column(name="DEFAULT_TASK_CALC_TYPE_ID", nullable=false, length=20)
    public Integer getDefaultTaskCalcTypeId() {
        return this.defaultTaskCalcTypeId;
    }
    
    public void setDefaultTaskCalcTypeId(Integer defaultTaskCalcTypeId) {
        this.defaultTaskCalcTypeId = defaultTaskCalcTypeId;
    }

    @Column(name="EARLIEST_START_DATE", length=7)
    public Date getEarliestStartDate() {
        return this.earliestStartDate;
    }
    
    public void setEarliestStartDate(Date earliestStartDate) {
        this.earliestStartDate = earliestStartDate;
    }

    @Column(name="EARLIEST_FINISH_DATE", length=7)
    public Date getEarliestFinishDate() {
        return this.earliestFinishDate;
    }
    
    public void setEarliestFinishDate(Date earliestFinishDate) {
        this.earliestFinishDate = earliestFinishDate;
    }

    @Column(name="LATEST_START_DATE", length=7)
    public Date getLatestStartDate() {
        return this.latestStartDate;
    }
    
    public void setLatestStartDate(Date latestStartDate) {
        this.latestStartDate = latestStartDate;
    }

    @Column(name="LATEST_FINISH_DATE", length=7)
    public Date getLatestFinishDate() {
        return this.latestFinishDate;
    }
    
    public void setLatestFinishDate(Date latestFinishDate) {
        this.latestFinishDate = latestFinishDate;
    }

    @Column(name="CONSTRAINT_TYPE_ID", length=10)
    public String getConstraintTypeId() {
        return this.constraintTypeId;
    }
    
    public void setConstraintTypeId(String constraintTypeId) {
        this.constraintTypeId = constraintTypeId;
    }

    @Column(name="CONSTRAINT_DATE", length=7)
    public Date getConstraintDate() {
        return this.constraintDate;
    }
    
    public void setConstraintDate(Date constraintDate) {
        this.constraintDate = constraintDate;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnPlanVersion) ) return false;
        PnPlanVersion castOther = (PnPlanVersion) other;
        return new EqualsBuilder()
            .append(this.getComp_id(), castOther.getComp_id())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getComp_id())
            .toHashCode();
    }

}
