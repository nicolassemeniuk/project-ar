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
 * DatabaseVersion generated by hbm2java
 */
@Entity
@Table(name="DATABASE_VERSION"
)
public class DatabaseVersion  implements java.io.Serializable {

    /** identifier field */
     private DatabaseVersionPK comp_id;
    /** persistent field */
    private Date timestamp;

    /** persistent field */
    private String description;

    public DatabaseVersion() {
    }

    public DatabaseVersion(DatabaseVersionPK comp_id, Date timestamp, String description) {
       this.comp_id = comp_id;
       this.timestamp = timestamp;
       this.description = description;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="majorVersion", column=@Column(name="MAJOR_VERSION", nullable=false, length=3) ), 
        @AttributeOverride(name="minorVersion", column=@Column(name="MINOR_VERSION", nullable=false, length=3) ), 
        @AttributeOverride(name="subMinorVersion", column=@Column(name="SUB_MINOR_VERSION", nullable=false, length=3) ) } )
    public DatabaseVersionPK getComp_id() {
        return this.comp_id;
    }
    
    public void setComp_id(DatabaseVersionPK comp_id) {
        this.comp_id = comp_id;
    }

    
    @Column(name="TIMESTAMP", nullable=false, length=7)
    public Date getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    
    @Column(name="DESCRIPTION", nullable=false, length=1000)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }


    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof DatabaseVersion) ) return false;
        DatabaseVersion castOther = (DatabaseVersion) other;
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

