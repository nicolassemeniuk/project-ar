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
 * QrtzJobListenerPK generated by hbm2java
 */
@Embeddable
public class QrtzJobListenerPK implements Serializable {


     private String jobName;
     private String jobGroup;
     private String jobListener;

    public QrtzJobListenerPK() {
    }

    public QrtzJobListenerPK(String jobName, String jobGroup, String jobListener) {
       this.jobName = jobName;
       this.jobGroup = jobGroup;
       this.jobListener = jobListener;
    }
   


    @Column(name="JOB_NAME", nullable=false, length=80)
    public String getJobName() {
        return this.jobName;
    }
    
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }


    @Column(name="JOB_GROUP", nullable=false, length=80)
    public String getJobGroup() {
        return this.jobGroup;
    }
    
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }


    @Column(name="JOB_LISTENER", nullable=false, length=80)
    public String getJobListener() {
        return this.jobListener;
    }
    
    public void setJobListener(String jobListener) {
        this.jobListener = jobListener;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("jobName", getJobName())
            .append("jobGroup", getJobGroup())
            .append("jobListener", getJobListener())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof QrtzJobListenerPK) ) return false;
        QrtzJobListenerPK castOther = (QrtzJobListenerPK) other;
        return new EqualsBuilder()
            .append(this.getJobName(), castOther.getJobName())
            .append(this.getJobGroup(), castOther.getJobGroup())
            .append(this.getJobListener(), castOther.getJobListener())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getJobName())
            .append(getJobGroup())
            .append(getJobListener())
            .toHashCode();
    }

}