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
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnCustomDomain generated by hbm2java
 */
@Entity
@Table(name="PN_CUSTOM_DOMAIN"
)
public class PnCustomDomain  implements java.io.Serializable {

	/** identifier field */
     private PnCustomDomainPK comp_id;
    /** persistent field */
    private String codeName;

    /** nullable persistent field */
    private String codeDesc;

    /** nullable persistent field */
    private String codeUrl;

    /** nullable persistent field */
    private Integer presentationSequence;

    /** persistent field */
    private int isDefault;

    /** persistent field */
    private String recordStatus;

    public PnCustomDomain() {
    }

	
    public PnCustomDomain(PnCustomDomainPK comp_id, String codeName, int isDefault, String recordStatus) {
        this.comp_id = comp_id;
        this.codeName = codeName;
        this.isDefault = isDefault;
        this.recordStatus = recordStatus;
    }
    public PnCustomDomain(PnCustomDomainPK comp_id, String codeName, String codeDesc, String codeUrl, Integer presentationSequence, int isDefault, String recordStatus) {
       this.comp_id = comp_id;
       this.codeName = codeName;
       this.codeDesc = codeDesc;
       this.codeUrl = codeUrl;
       this.presentationSequence = presentationSequence;
       this.isDefault = isDefault;
       this.recordStatus = recordStatus;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="objectId", column=@Column(name="OBJECT_ID", nullable=false, length=20) ), 
        @AttributeOverride(name="tableName", column=@Column(name="TABLE_NAME", nullable=false, length=80) ), 
        @AttributeOverride(name="columnName", column=@Column(name="COLUMN_NAME", nullable=false, length=80) ), 
        @AttributeOverride(name="code", column=@Column(name="CODE", nullable=false, length=8) ) } )
    public PnCustomDomainPK getComp_id() {
        return this.comp_id;
    }
    
    public void setComp_id(PnCustomDomainPK comp_id) {
        this.comp_id = comp_id;
    }

    
    @Column(name="CODE_NAME", nullable=false, length=80)
    public String getCodeName() {
        return this.codeName;
    }
    
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    
    @Column(name="CODE_DESC", length=80)
    public String getCodeDesc() {
        return this.codeDesc;
    }
    
    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }

    
    @Column(name="CODE_URL", length=240)
    public String getCodeUrl() {
        return this.codeUrl;
    }
    
    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    
    @Column(name="PRESENTATION_SEQUENCE", length=8)
    public Integer getPresentationSequence() {
        return this.presentationSequence;
    }
    
    public void setPresentationSequence(Integer presentationSequence) {
        this.presentationSequence = presentationSequence;
    }

    
    @Column(name="IS_DEFAULT", nullable=false, length=1)
    public int getIsDefault() {
        return this.isDefault;
    }
    
    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    
    @Column(name="RECORD_STATUS", nullable=false, length=1)
    public String getRecordStatus() {
        return this.recordStatus;
    }
    
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnCustomDomain) ) return false;
        PnCustomDomain castOther = (PnCustomDomain) other;
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


