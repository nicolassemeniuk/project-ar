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


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnFormsHistoryView generated by hbm2java
 */
@Entity
@Table(name="PN_FORMS_HISTORY_VIEW"
)
public class PnFormsHistoryView  implements java.io.Serializable {

    /** identifier field */
    private BigDecimal objectId;

    /** identifier field */
    private BigDecimal formsHistoryId;

    /** identifier field */
    private String action;

    /** identifier field */
    private String actionName;

    /** identifier field */
    private BigDecimal actionById;

    /** identifier field */
    private String actionBy;

    /** identifier field */
    private Date actionDate;

    /** identifier field */
    private String actionComment;

    public PnFormsHistoryView() {
    }

    public PnFormsHistoryView(BigDecimal objectId, BigDecimal formsHistoryId, String action, String actionName, BigDecimal actionById, String actionBy, Date actionDate, String actionComment) {
       this.objectId = objectId;
       this.formsHistoryId = formsHistoryId;
       this.action = action;
       this.actionName = actionName;
       this.actionById = actionById;
       this.actionBy = actionBy;
       this.actionDate = actionDate;
       this.actionComment = actionComment;
    }
   

    
    @Column(name="OBJECT_ID", nullable=false, length=20)
    public BigDecimal getObjectId() {
        return this.objectId;
    }
    
    public void setObjectId(BigDecimal objectId) {
        this.objectId = objectId;
    }

    
    @Column(name="FORMS_HISTORY_ID", nullable=false, length=20)
    public BigDecimal getFormsHistoryId() {
        return this.formsHistoryId;
    }
    
    public void setFormsHistoryId(BigDecimal formsHistoryId) {
        this.formsHistoryId = formsHistoryId;
    }

    
    @Column(name="ACTION", nullable=false, length=80)
    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }

    
    @Column(name="ACTION_NAME", nullable=false, length=80)
    public String getActionName() {
        return this.actionName;
    }
    
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    
    @Column(name="ACTION_BY_ID", nullable=false, length=20)
    public BigDecimal getActionById() {
        return this.actionById;
    }
    
    public void setActionById(BigDecimal actionById) {
        this.actionById = actionById;
    }

    
    @Column(name="ACTION_BY", nullable=false, length=240)
    public String getActionBy() {
        return this.actionBy;
    }
    
    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ACTION_DATE", nullable=false, length=7)
    public Date getActionDate() {
        return this.actionDate;
    }
    
    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    
    @Column(name="ACTION_COMMENT", nullable=false)
    public String getActionComment() {
        return this.actionComment;
    }
    
    public void setActionComment(String actionComment) {
        this.actionComment = actionComment;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("objectId", getObjectId())
            .append("formsHistoryId", getFormsHistoryId())
            .append("action", getAction())
            .append("actionName", getActionName())
            .append("actionById", getActionById())
            .append("actionBy", getActionBy())
            .append("actionDate", getActionDate())
            .append("actionComment", getActionComment())
            .toString();
    }

}


