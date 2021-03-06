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
 * PnTaskDependencyPK generated by hbm2java
 */
@Embeddable
public class PnTaskDependencyPK implements Serializable {


     private Integer taskId;
     private Integer dependencyId;
     private Integer dependencyTypeId;

    public PnTaskDependencyPK() {
    }

    public PnTaskDependencyPK(Integer taskId, Integer dependencyId, Integer dependencyTypeId) {
       this.taskId = taskId;
       this.dependencyId = dependencyId;
       this.dependencyTypeId = dependencyTypeId;
    }
   


    @Column(name="TASK_ID", nullable=false, length=20)
    public Integer getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }


    @Column(name="DEPENDENCY_ID", nullable=false, length=20)
    public Integer getDependencyId() {
        return this.dependencyId;
    }
    
    public void setDependencyId(Integer dependencyId) {
        this.dependencyId = dependencyId;
    }


    @Column(name="DEPENDENCY_TYPE_ID", nullable=false, length=20)
    public Integer getDependencyTypeId() {
        return this.dependencyTypeId;
    }
    
    public void setDependencyTypeId(Integer dependencyTypeId) {
        this.dependencyTypeId = dependencyTypeId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("taskId", getTaskId())
            .append("dependencyId", getDependencyId())
            .append("dependencyTypeId", getDependencyTypeId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnTaskDependencyPK) ) return false;
        PnTaskDependencyPK castOther = (PnTaskDependencyPK) other;
        return new EqualsBuilder()
            .append(this.getTaskId(), castOther.getTaskId())
            .append(this.getDependencyId(), castOther.getDependencyId())
            .append(this.getDependencyTypeId(), castOther.getDependencyTypeId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getTaskId())
            .append(getDependencyId())
            .append(getDependencyTypeId())
            .toHashCode();
    }

}
