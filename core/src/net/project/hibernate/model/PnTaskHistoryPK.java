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
 * PnTaskHistoryPK generated by hbm2java
 */
@Embeddable
public class PnTaskHistoryPK implements Serializable {


     private Integer taskId;
     private Integer taskHistoryId;

    public PnTaskHistoryPK() {
    }

    public PnTaskHistoryPK(Integer taskId, Integer taskHistoryId) {
       this.taskId = taskId;
       this.taskHistoryId = taskHistoryId;
    }
   


    @Column(name="TASK_ID", nullable=false, length=20)
    public Integer getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }


    @Column(name="TASK_HISTORY_ID", nullable=false, length=20)
    public Integer getTaskHistoryId() {
        return this.taskHistoryId;
    }
    
    public void setTaskHistoryId(Integer taskHistoryId) {
        this.taskHistoryId = taskHistoryId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("taskId", getTaskId())
            .append("taskHistoryId", getTaskHistoryId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnTaskHistoryPK) ) return false;
        PnTaskHistoryPK castOther = (PnTaskHistoryPK) other;
        return new EqualsBuilder()
            .append(this.getTaskId(), castOther.getTaskId())
            .append(this.getTaskHistoryId(), castOther.getTaskHistoryId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getTaskId())
            .append(getTaskHistoryId())
            .toHashCode();
    }

}