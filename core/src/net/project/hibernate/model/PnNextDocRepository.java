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

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PnNextDocRepository generated by hbm2java
 */
@Entity
@Table(name="PN_NEXT_DOC_REPOSITORY"
)
public class PnNextDocRepository implements Serializable {


     private Integer repositorySequence;

    public PnNextDocRepository() {
    }

    public PnNextDocRepository(Integer repositorySequence) {
       this.repositorySequence = repositorySequence;
    }
   
     @Id 
    @Column(name="REPOSITORY_SEQUENCE", nullable=false)
    public Integer getRepositorySequence() {
        return this.repositorySequence;
    }
    
    public void setRepositorySequence(Integer repositorySequence) {
        this.repositorySequence = repositorySequence;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("repositorySequence", getRepositorySequence())
            .toString();
    }

}