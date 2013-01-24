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
 * PnTaskVersionPK generated by hbm2java
 */
@Embeddable
public class PnTaskVersionPK implements Serializable {


     private Integer taskId;
     private Integer taskVersionId;

    public PnTaskVersionPK() {
    }

    public PnTaskVersionPK(Integer taskId, Integer taskVersionId) {
       this.taskId = taskId;
       this.taskVersionId = taskVersionId;
    }
   


    @Column(name="TASK_ID", nullable=false, length=20)
    public Integer getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }


    @Column(name="TASK_VERSION_ID", nullable=false, length=20)
    public Integer getTaskVersionId() {
        return this.taskVersionId;
    }
    
    public void setTaskVersionId(Integer taskVersionId) {
        this.taskVersionId = taskVersionId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("taskId", getTaskId())
            .append("taskVersionId", getTaskVersionId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnTaskVersionPK) ) return false;
        PnTaskVersionPK castOther = (PnTaskVersionPK) other;
        return new EqualsBuilder()
            .append(this.getTaskId(), castOther.getTaskId())
            .append(this.getTaskVersionId(), castOther.getTaskVersionId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getTaskId())
            .append(getTaskVersionId())
            .toHashCode();
    }

}