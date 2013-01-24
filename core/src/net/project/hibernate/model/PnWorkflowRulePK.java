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
 * PnWorkflowRulePK generated by hbm2java
 */
@Embeddable
public class PnWorkflowRulePK implements Serializable {


     private Integer ruleId;
     private Integer transitionId;
     private Integer workflowId;

    public PnWorkflowRulePK() {
    }

    public PnWorkflowRulePK(Integer ruleId, Integer transitionId, Integer workflowId) {
       this.ruleId = ruleId;
       this.transitionId = transitionId;
       this.workflowId = workflowId;
    }
   


    @Column(name="RULE_ID", nullable=false, length=20)
    public Integer getRuleId() {
        return this.ruleId;
    }
    
    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }


    @Column(name="TRANSITION_ID", nullable=false, length=20)
    public Integer getTransitionId() {
        return this.transitionId;
    }
    
    public void setTransitionId(Integer transitionId) {
        this.transitionId = transitionId;
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
            .append("ruleId", getRuleId())
            .append("transitionId", getTransitionId())
            .append("workflowId", getWorkflowId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnWorkflowRulePK) ) return false;
        PnWorkflowRulePK castOther = (PnWorkflowRulePK) other;
        return new EqualsBuilder()
            .append(this.getRuleId(), castOther.getRuleId())
            .append(this.getTransitionId(), castOther.getTransitionId())
            .append(this.getWorkflowId(), castOther.getWorkflowId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getRuleId())
            .append(getTransitionId())
            .append(getWorkflowId())
            .toHashCode();
    }

}