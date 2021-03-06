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


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnLoginHistoryPK generated by hbm2java
 */
@Embeddable
public class PnLoginHistoryPK  implements java.io.Serializable {

    /** identifier field */
    private Integer personId;

    /** identifier field */
    private Date loginDate;

    /** identifier field */
    private Integer loginConcurrency;

    public PnLoginHistoryPK() {
    }

    public PnLoginHistoryPK(Integer personId, Date loginDate, Integer loginConcurrency) {
       this.personId = personId;
       this.loginDate = loginDate;
       this.loginConcurrency = loginConcurrency;
    }

    @Column(name="PERSON_ID", nullable=false, length=20)
    public Integer getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }


    @Column(name="LOGIN_DATE", nullable=false, length=7)
    public Date getLoginDate() {
        return this.loginDate;
    }
    
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }


    @Column(name="LOGIN_CONCURRENCY", nullable=false, length=20)
    public Integer getLoginConcurrency() {
        return this.loginConcurrency;
    }
    
    public void setLoginConcurrency(Integer loginConcurrency) {
        this.loginConcurrency = loginConcurrency;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("personId", getPersonId())
            .append("loginDate", getLoginDate())
            .append("loginConcurrency", getLoginConcurrency())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnLoginHistoryPK) ) return false;
        PnLoginHistoryPK castOther = (PnLoginHistoryPK) other;
        return new EqualsBuilder()
            .append(this.getPersonId(), castOther.getPersonId())
            .append(this.getLoginDate(), castOther.getLoginDate())
            .append(this.getLoginConcurrency(), castOther.getLoginConcurrency())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getPersonId())
            .append(getLoginDate())
            .append(getLoginConcurrency())
            .toHashCode();
    }
}

