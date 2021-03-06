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


import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnGroupHistoryPK generated by hbm2java
 */
@Embeddable
public class PnGroupHistoryPK  implements java.io.Serializable {

    /** identifier field */
    private Integer groupId;

    /** identifier field */
    private Integer groupHistoryId;

    public PnGroupHistoryPK() {
    }

    public PnGroupHistoryPK(Integer groupId, Integer groupHistoryId) {
       this.groupId = groupId;
       this.groupHistoryId = groupHistoryId;
    }

    @Column(name="GROUP_ID", nullable=false, length=20)
    public Integer getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Column(name="GROUP_HISTORY_ID", nullable=false, length=20)
    public Integer getGroupHistoryId() {
        return this.groupHistoryId;
    }
    
    public void setGroupHistoryId(Integer groupHistoryId) {
        this.groupHistoryId = groupHistoryId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("groupId", getGroupId())
            .append("groupHistoryId", getGroupHistoryId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnGroupHistoryPK) ) return false;
        PnGroupHistoryPK castOther = (PnGroupHistoryPK) other;
        return new EqualsBuilder()
            .append(this.getGroupId(), castOther.getGroupId())
            .append(this.getGroupHistoryId(), castOther.getGroupHistoryId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getGroupId())
            .append(getGroupHistoryId())
            .toHashCode();
    }
}

