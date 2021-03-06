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

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * QrtzSchedulerState generated by hbm2java
 */
@Entity
@Table(name="QRTZ_SCHEDULER_STATE"
)
public class QrtzSchedulerState implements Serializable {


     private String instanceName;
     private long lastCheckinTime;
     private long checkinInterval;
     private String recoverer;

    public QrtzSchedulerState() {
    }

	
    public QrtzSchedulerState(String instanceName, long lastCheckinTime, long checkinInterval) {
        this.instanceName = instanceName;
        this.lastCheckinTime = lastCheckinTime;
        this.checkinInterval = checkinInterval;
    }
    public QrtzSchedulerState(String instanceName, long lastCheckinTime, long checkinInterval, String recoverer) {
       this.instanceName = instanceName;
       this.lastCheckinTime = lastCheckinTime;
       this.checkinInterval = checkinInterval;
       this.recoverer = recoverer;
    }
   
     @Id 

    
    @Column(name="INSTANCE_NAME", nullable=false)
    public String getInstanceName() {
        return this.instanceName;
    }
    
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    
    @Column(name="LAST_CHECKIN_TIME", nullable=false, length=13)
    public long getLastCheckinTime() {
        return this.lastCheckinTime;
    }
    
    public void setLastCheckinTime(long lastCheckinTime) {
        this.lastCheckinTime = lastCheckinTime;
    }

    
    @Column(name="CHECKIN_INTERVAL", nullable=false, length=13)
    public long getCheckinInterval() {
        return this.checkinInterval;
    }
    
    public void setCheckinInterval(long checkinInterval) {
        this.checkinInterval = checkinInterval;
    }

    
    @Column(name="RECOVERER", length=80)
    public String getRecoverer() {
        return this.recoverer;
    }
    
    public void setRecoverer(String recoverer) {
        this.recoverer = recoverer;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("instanceName", getInstanceName())
            .toString();
    }

}
