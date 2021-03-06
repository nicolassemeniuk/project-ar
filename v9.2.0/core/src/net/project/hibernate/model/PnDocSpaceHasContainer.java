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
 * PnDocSpaceHasContainer generated by hbm2java
 */
@Entity
@Table(name="PN_DOC_SPACE_HAS_CONTAINER"
)
public class PnDocSpaceHasContainer  implements java.io.Serializable {

    /** identifier field */
     private PnDocSpaceHasContainerPK comp_id;
    /** persistent field */
     private int isRoot;
    /** nullable persistent field */
     private PnDocContainer pnDocContainer;
    /** nullable persistent field */
     private PnDocSpace pnDocSpace;

    public PnDocSpaceHasContainer() {
    }

	
    public PnDocSpaceHasContainer(PnDocSpaceHasContainerPK comp_id, int isRoot) {
        this.comp_id = comp_id;
        this.isRoot = isRoot;
    }
    public PnDocSpaceHasContainer(PnDocSpaceHasContainerPK comp_id, int isRoot, PnDocContainer pnDocContainer, PnDocSpace pnDocSpace) {
       this.comp_id = comp_id;
       this.isRoot = isRoot;
       this.pnDocContainer = pnDocContainer;
       this.pnDocSpace = pnDocSpace;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="docSpaceId", column=@Column(name="DOC_SPACE_ID", nullable=false, length=20) ), 
        @AttributeOverride(name="docContainerId", column=@Column(name="DOC_CONTAINER_ID", nullable=false, length=20) ) } )
    public PnDocSpaceHasContainerPK getComp_id() {
        return this.comp_id;
    }
    
    public void setComp_id(PnDocSpaceHasContainerPK comp_id) {
        this.comp_id = comp_id;
    }

    
    @Column(name="IS_ROOT", nullable=false, length=1)
    public int getIsRoot() {
        return this.isRoot;
    }
    
    public void setIsRoot(int isRoot) {
        this.isRoot = isRoot;
    }

@ManyToOne(fetch=FetchType.LAZY, targetEntity=PnDocContainer.class)
    @JoinColumn(name="DOC_CONTAINER_ID", insertable=false, updatable=false)
    public PnDocContainer getPnDocContainer() {
        return this.pnDocContainer;
    }
    
    public void setPnDocContainer(PnDocContainer pnDocContainer) {
        this.pnDocContainer = pnDocContainer;
    }

@ManyToOne(fetch=FetchType.LAZY, targetEntity=PnDocSpace.class)
    @JoinColumn(name="DOC_SPACE_ID", insertable=false, updatable=false)
    public PnDocSpace getPnDocSpace() {
        return this.pnDocSpace;
    }
    
    public void setPnDocSpace(PnDocSpace pnDocSpace) {
        this.pnDocSpace = pnDocSpace;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnDocSpaceHasContainer) ) return false;
        PnDocSpaceHasContainer castOther = (PnDocSpaceHasContainer) other;
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


