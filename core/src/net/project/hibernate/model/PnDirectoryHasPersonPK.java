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
 * PnDirectoryHasPersonPK generated by hbm2java
 */
@Embeddable
public class PnDirectoryHasPersonPK  implements java.io.Serializable {

    /** identifier field */
    private Integer directoryId;

    /** identifier field */
    private Integer personId;

    public PnDirectoryHasPersonPK() {
    }

    public PnDirectoryHasPersonPK(Integer directoryId, Integer personId) {
       this.directoryId = directoryId;
       this.personId = personId;
    }
   


    @Column(name="DIRECTORY_ID", nullable=false, length=20)
    public Integer getDirectoryId() {
        return this.directoryId;
    }
    
    public void setDirectoryId(Integer directoryId) {
        this.directoryId = directoryId;
    }


    @Column(name="PERSON_ID", nullable=false, length=20)
    public Integer getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("directoryId", getDirectoryId())
            .append("personId", getPersonId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnDirectoryHasPersonPK) ) return false;
        PnDirectoryHasPersonPK castOther = (PnDirectoryHasPersonPK) other;
        return new EqualsBuilder()
            .append(this.getDirectoryId(), castOther.getDirectoryId())
            .append(this.getPersonId(), castOther.getPersonId())
            .isEquals();
    }

	public int hashCode() {
        return new HashCodeBuilder()
            .append(getDirectoryId())
            .append(getPersonId())
            .toHashCode();
    }
}

