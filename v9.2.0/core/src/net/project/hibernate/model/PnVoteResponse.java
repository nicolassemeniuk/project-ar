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
 * PnVoteResponse generated by hbm2java
 */
@Entity
@Table(name="PN_VOTE_RESPONSE"
)
public class PnVoteResponse implements Serializable {


     private Integer voteId;
     private String response;

    public PnVoteResponse() {
    }

    public PnVoteResponse(Integer voteId, String response) {
       this.voteId = voteId;
       this.response = response;
    }
   

    @Id
    @Column(name="VOTE_ID", nullable=false, length=20)
    public Integer getVoteId() {
        return this.voteId;
    }
    
    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    
    @Column(name="RESPONSE", nullable=false, length=20)
    public String getResponse() {
        return this.response;
    }
    
    public void setResponse(String response) {
        this.response = response;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("voteId", getVoteId())
            .append("response", getResponse())
            .toString();
    }

}
