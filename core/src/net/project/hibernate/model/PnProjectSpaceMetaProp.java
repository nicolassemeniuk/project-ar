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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PnProjectSpaceMetaProp generated by hbm2java
 */
@Entity
@Table(name="PN_PROJECT_SPACE_META_PROP"
)
public class PnProjectSpaceMetaProp  implements java.io.Serializable {


     private Integer propertyId;
     private String propertyName;
     private Integer propertyType;

    public PnProjectSpaceMetaProp() {
    }
	
    public PnProjectSpaceMetaProp(Integer propertyId) {
        this.propertyId = propertyId;
    }
    public PnProjectSpaceMetaProp(Integer propertyId, String propertyName, Integer propertyType) {
       this.propertyId = propertyId;
       this.propertyName = propertyName;
       this.propertyType = propertyType;
    }
   
     @Id 
    @Column(name="PROPERTY_ID", nullable=false, length=20)
    public Integer getPropertyId() {
        return this.propertyId;
    }
    
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }
    
    @Column(name="PROPERTY_NAME", length=1000)
    public String getPropertyName() {
        return this.propertyName;
    }
    
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    
    @Column(name="PROPERTY_TYPE", length=5)
    public Integer getPropertyType() {
        return this.propertyType;
    }
    
    public void setPropertyType(Integer propertyType) {
        this.propertyType = propertyType;
    }

}

