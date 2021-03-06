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
 * PnGroupHasGroupPK generated by hbm2java
 */
@Embeddable
public class PnGroupHasGroupPK  implements java.io.Serializable {

    /** identifier field */
    private Integer groupId;

    /** identifier field */
    private Integer memberGroupId;

    public PnGroupHasGroupPK() {
    }

    public PnGroupHasGroupPK(Integer groupId, Integer memberGroupId) {
       this.groupId = groupId;
       this.memberGroupId = memberGroupId;
    }
   
    @Column(name="GROUP_ID", nullable=false, length=20)
    public Integer getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Column(name="MEMBER_GROUP_ID", nullable=false, length=20)
    public Integer getMemberGroupId() {
        return this.memberGroupId;
    }
    
    public void setMemberGroupId(Integer memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("groupId", getGroupId())
            .append("memberGroupId", getMemberGroupId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnGroupHasGroupPK) ) return false;
        PnGroupHasGroupPK castOther = (PnGroupHasGroupPK) other;
        return new EqualsBuilder()
            .append(this.getGroupId(), castOther.getGroupId())
            .append(this.getMemberGroupId(), castOther.getMemberGroupId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getGroupId())
            .append(getMemberGroupId())
            .toHashCode();
    }
}


