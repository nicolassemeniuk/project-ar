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


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnClassInstance generated by hbm2java
 */
@Entity
@Table(name="PN_CLASS_INSTANCE"
)
public class PnClassInstance  implements java.io.Serializable {

    /** identifier field */
    private Integer classInstanceId;

    /** persistent field */
    private Integer classId;

    /** persistent field */
    private Date crc;

    /** persistent field */
    private String recordStatus;

    /** persistent field */
    private Integer spaceId;
    
    /** persistent field */
    private Integer sequenceNo;

    public PnClassInstance() {
    }

    public PnClassInstance(Integer classInstanceId, Integer classId, Date crc, String recordStatus, Integer spaceId) {
       this.classInstanceId = classInstanceId;
       this.classId = classId;
       this.crc = crc;
       this.recordStatus = recordStatus;
       this.spaceId = spaceId;
    }
   
     @Id 

    
    @Column(name="CLASS_INSTANCE_ID", nullable=false)
    public Integer getClassInstanceId() {
        return this.classInstanceId;
    }
    
    public void setClassInstanceId(Integer classInstanceId) {
        this.classInstanceId = classInstanceId;
    }

    
    @Column(name="CLASS_ID", nullable=false, length=20)
    public Integer getClassId() {
        return this.classId;
    }
    
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    
    @Column(name="CRC", nullable=false, length=7)
    public Date getCrc() {
        return this.crc;
    }
    
    public void setCrc(Date crc) {
        this.crc = crc;
    }

    
    @Column(name="RECORD_STATUS", nullable=false, length=1)
    public String getRecordStatus() {
        return this.recordStatus;
    }
    
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    
    @Column(name="SPACE_ID", nullable=false, length=20)
    public Integer getSpaceId() {
        return this.spaceId;
    }
    
    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }
    
    @Column(name="SEQ_NUM", nullable=true)
	public Integer getSequenceNo() {
		return this.sequenceNo;
	}
    
    public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

    public String toString() {
        return new ToStringBuilder(this)
            .append("classInstanceId", getClassInstanceId())
            .toString();
    }

}

