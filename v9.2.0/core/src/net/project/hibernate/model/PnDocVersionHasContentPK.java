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
 * PnDocVersionHasContentPK generated by hbm2java
 */
@Embeddable
public class PnDocVersionHasContentPK  implements java.io.Serializable {

    /** identifier field */
    private Integer docVersionId;

    /** identifier field */
    private Integer docContentId;

    public PnDocVersionHasContentPK() {
    }

    public PnDocVersionHasContentPK(Integer docVersionId, Integer docContentId) {
       this.docVersionId = docVersionId;
       this.docContentId = docContentId;
    }
   


    @Column(name="DOC_VERSION_ID", nullable=false, length=20)
    public Integer getDocVersionId() {
        return this.docVersionId;
    }
    
    public void setDocVersionId(Integer docVersionId) {
        this.docVersionId = docVersionId;
    }


    @Column(name="DOC_CONTENT_ID", nullable=false, length=20)
    public Integer getDocContentId() {
        return this.docContentId;
    }
    
    public void setDocContentId(Integer docContentId) {
        this.docContentId = docContentId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("docVersionId", getDocVersionId())
            .append("docContentId", getDocContentId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnDocVersionHasContentPK) ) return false;
        PnDocVersionHasContentPK castOther = (PnDocVersionHasContentPK) other;
        return new EqualsBuilder()
            .append(this.getDocVersionId(), castOther.getDocVersionId())
            .append(this.getDocContentId(), castOther.getDocContentId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getDocVersionId())
            .append(getDocContentId())
            .toHashCode();
    }
}


