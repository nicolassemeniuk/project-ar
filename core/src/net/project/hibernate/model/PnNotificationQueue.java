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
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnNotificationQueue generated by hbm2java
 */
@Entity
@Table(name = "PN_NOTIFICATION_QUEUE")
public class PnNotificationQueue implements Serializable {

	private Integer notificationId;

	private Date postedDate;

	private String postedById;

	private String recordStatus;

	private Integer batchId;

	private String deliveryStatus;

	private Integer numberOfRetries;

	private Integer isImmediate;

	private PnNotification pnNotification;

	public PnNotificationQueue() {
	}

	public PnNotificationQueue(Integer notificationId) {
		this.notificationId = notificationId;
	}

	public PnNotificationQueue(Integer notificationId, Date postedDate, String postedById, String recordStatus,
			Integer batchId, String deliveryStatus, Integer numberOfRetries, Integer isImmediate,
			PnNotification pnNotification) {
		this.notificationId = notificationId;
		this.postedDate = postedDate;
		this.postedById = postedById;
		this.recordStatus = recordStatus;
		this.batchId = batchId;
		this.deliveryStatus = deliveryStatus;
		this.numberOfRetries = numberOfRetries;
		this.isImmediate = isImmediate;
		this.pnNotification = pnNotification;
	}

	@Id
	@Column(name = "NOTIFICATION_ID", nullable = false)
	public Integer getNotificationId() {
		return this.notificationId;
	}

	public void setNotificationId(Integer notificationId) {
		this.notificationId = notificationId;
	}

	@Column(name = "POSTED_DATE", length = 7)
	public Date getPostedDate() {
		return this.postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

	@Column(name = "POSTED_BY_ID", length = 80)
	public String getPostedById() {
		return this.postedById;
	}

	public void setPostedById(String postedById) {
		this.postedById = postedById;
	}

	@Column(name = "RECORD_STATUS", length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	@Column(name = "BATCH_ID", length = 20)
	public Integer getBatchId() {
		return this.batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	@Column(name = "DELIVERY_STATUS", length = 80)
	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	@Column(name = "NUMBER_OF_RETRIES", length = 22)
	public Integer getNumberOfRetries() {
		return this.numberOfRetries;
	}

	public void setNumberOfRetries(Integer numberOfRetries) {
		this.numberOfRetries = numberOfRetries;
	}

	@Column(name = "IS_IMMEDIATE", length = 1)
	public Integer getIsImmediate() {
		return this.isImmediate;
	}

	public void setIsImmediate(Integer isImmediate) {
		this.isImmediate = isImmediate;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnNotificationQueue", targetEntity = PnNotification.class)
	@Transient
	public PnNotification getPnNotification() {
		return this.pnNotification;
	}

	public void setPnNotification(PnNotification pnNotification) {
		this.pnNotification = pnNotification;
	}

	public String toString() {
		return new ToStringBuilder(this).append("notificationId", getNotificationId()).toString();
	}

}