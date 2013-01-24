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


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnClassTypeElement generated by hbm2java
 */
@Entity
@Table(name="PN_CLASS_TYPE_ELEMENT"
)
public class PnClassTypeElement  implements java.io.Serializable {

	/** identifier field */
    private PnClassTypeElementPK comp_id;
    
    /** persistent field */
    private String recordStatus;
    
    /** nullable persistent field */
    private PnElement pnElement;
    
    private PnClassType pnClassType;

    public PnClassTypeElement() {
    }

	
    public PnClassTypeElement(PnClassTypeElementPK comp_id, String recordStatus) {
        this.comp_id = comp_id;
        this.recordStatus = recordStatus;
    }
    public PnClassTypeElement(PnClassTypeElementPK comp_id, String recordStatus, PnElement pnElement, PnClassType pnClassType) {
       this.comp_id = comp_id;
       this.recordStatus = recordStatus;
       this.pnElement = pnElement;
       this.pnClassType = pnClassType;
    }
   
    @EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="classTypeId", column=@Column(name="CLASS_TYPE_ID", nullable=false, length=20) ), 
        @AttributeOverride(name="elementId", column=@Column(name="ELEMENT_ID", nullable=false, length=20) ) } )
    public PnClassTypeElementPK getComp_id() {
        return this.comp_id;
    }
    
    public void setComp_id(PnClassTypeElementPK comp_id) {
        this.comp_id = comp_id;
    }

    
    @Column(name="RECORD_STATUS", nullable=false, length=1)
    public String getRecordStatus() {
        return this.recordStatus;
    }
    
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    @ManyToOne(fetch=FetchType.LAZY, targetEntity=PnElement.class)
    @JoinColumn(name="ELEMENT_ID", insertable=false, updatable=false)
    public PnElement getPnElement() {
        return this.pnElement;
    }
    
    public void setPnElement(PnElement pnElement) {
        this.pnElement = pnElement;
    }

    @ManyToOne(fetch=FetchType.LAZY, targetEntity=PnClassType.class)
    @JoinColumn(name="CLASS_TYPE_ID", insertable=false, updatable=false)
    public PnClassType getPnClassType() {
        return this.pnClassType;
    }
    
    public void setPnClassType(PnClassType pnClassType) {
        this.pnClassType = pnClassType;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnClassTypeElement) ) return false;
        PnClassTypeElement castOther = (PnClassTypeElement) other;
        return new EqualsBuilder()
            .append(this.getComp_id(), castOther.getComp_id())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getComp_id())
            .toHashCode();
    }
}

