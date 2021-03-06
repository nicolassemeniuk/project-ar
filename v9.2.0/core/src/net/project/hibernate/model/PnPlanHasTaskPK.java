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
 * PnPlanHasTaskPK generated by hbm2java
 */
@Embeddable
public class PnPlanHasTaskPK implements Serializable {

     private Integer planId;

     private Integer taskId;

    public PnPlanHasTaskPK() {
    }

    public PnPlanHasTaskPK(Integer planId, Integer taskId) {
       this.planId = planId;
       this.taskId = taskId;
    }
   
    @Column(name="PLAN_ID", nullable=false, length=20)
    public Integer getPlanId() {
        return this.planId;
    }
    
    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    @Column(name="TASK_ID", nullable=false, length=20)
    public Integer getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("planId", getPlanId())
            .append("taskId", getTaskId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnPlanHasTaskPK) ) return false;
        PnPlanHasTaskPK castOther = (PnPlanHasTaskPK) other;
        return new EqualsBuilder()
            .append(this.getPlanId(), castOther.getPlanId())
            .append(this.getTaskId(), castOther.getTaskId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getPlanId())
            .append(getTaskId())
            .toHashCode();
    }

}
