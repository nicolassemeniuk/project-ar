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
 * PnDocCheckoutLocationPK generated by hbm2java
 */
@Embeddable
public class PnDocCheckoutLocationPK  implements java.io.Serializable {

    /** identifier field */
    private Integer docId;

    /** identifier field */
    private Integer personId;

    /** identifier field */
    private Integer clientMachineId;

    public PnDocCheckoutLocationPK() {
    }

    public PnDocCheckoutLocationPK(Integer docId, Integer personId, Integer clientMachineId) {
       this.docId = docId;
       this.personId = personId;
       this.clientMachineId = clientMachineId;
    }
   


    @Column(name="DOC_ID", nullable=false, length=20)
    public Integer getDocId() {
        return this.docId;
    }
    
    public void setDocId(Integer docId) {
        this.docId = docId;
    }


    @Column(name="PERSON_ID", nullable=false, length=20)
    public Integer getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }


    @Column(name="CLIENT_MACHINE_ID", nullable=false, length=20)
    public Integer getClientMachineId() {
        return this.clientMachineId;
    }
    
    public void setClientMachineId(Integer clientMachineId) {
        this.clientMachineId = clientMachineId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("docId", getDocId())
            .append("personId", getPersonId())
            .append("clientMachineId", getClientMachineId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnDocCheckoutLocationPK) ) return false;
        PnDocCheckoutLocationPK castOther = (PnDocCheckoutLocationPK) other;
        return new EqualsBuilder()
            .append(this.getDocId(), castOther.getDocId())
            .append(this.getPersonId(), castOther.getPersonId())
            .append(this.getClientMachineId(), castOther.getClientMachineId())
            .isEquals();
    }

	public int hashCode() {
        return new HashCodeBuilder()
            .append(getDocId())
            .append(getPersonId())
            .append(getClientMachineId())
            .toHashCode();
    }
}

