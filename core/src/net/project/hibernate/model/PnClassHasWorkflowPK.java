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


import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnClassHasWorkflowPK generated by hbm2java
 */
@Embeddable
public class PnClassHasWorkflowPK  implements java.io.Serializable {

    /** identifier field */
    private Integer classId;

    /** identifier field */
    private Integer workflowId;

    public PnClassHasWorkflowPK() {
    }

    public PnClassHasWorkflowPK(Integer classId, Integer workflowId) {
       this.classId = classId;
       this.workflowId = workflowId;
    }
   


    @Column(name="CLASS_ID", nullable=false, length=20)
    public Integer getClassId() {
        return this.classId;
    }
    
    public void setClassId(Integer classId) {
        this.classId = classId;
    }


    @Column(name="WORKFLOW_ID", nullable=false, length=20)
    public Integer getWorkflowId() {
        return this.workflowId;
    }
    
    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("classId", getClassId())
            .append("workflowId", getWorkflowId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnClassHasWorkflowPK) ) return false;
        PnClassHasWorkflowPK castOther = (PnClassHasWorkflowPK) other;
        return new EqualsBuilder()
            .append(this.getClassId(), castOther.getClassId())
            .append(this.getWorkflowId(), castOther.getWorkflowId())
            .isEquals();
    }

	public int hashCode() {
        return new HashCodeBuilder()
            .append(getClassId())
            .append(getWorkflowId())
            .toHashCode();
    }
}

