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
import java.sql.Clob;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnNews generated by hbm2java
 */
@Entity
@Table(name = "PN_NEWS")
public class PnNews implements Serializable {

	private Integer newsId;

	private String topic;

	private Integer priorityId;

	private Integer postedById;

	private Date postedDatetime;

	private Integer createdById;

	private Date createdDatetime;

	private Integer modifiedById;

	private Date modifiedDatetime;

	private Date crc;

	private String recordStatus;

	private Integer notificationId;

	private Clob messageClob;

	private Set pnSpaceHasNews = new HashSet(0);

	private Set pnNewsHistories = new HashSet(0);

	public PnNews() {
	}

	public PnNews(Integer newsId, String topic, String recordStatus) {
		this.newsId = newsId;
		this.topic = topic;
		this.recordStatus = recordStatus;
	}

	public PnNews(Integer newsId, Integer priorityId, Integer createdById, Date createdDatetime, Date crc,
			String recordStatus, Set pnSpaceHasNews, Set pnNewsHistories) {
		this.newsId = newsId;
		this.priorityId = priorityId;
		this.createdById = createdById;
		this.createdDatetime = createdDatetime;
		this.crc = crc;
		this.recordStatus = recordStatus;
		this.pnSpaceHasNews = pnSpaceHasNews;
		this.pnNewsHistories = pnNewsHistories;
	}

	public PnNews(Integer newsId, String topic, Integer priorityId, Integer postedById, Date postedDatetime,
			Integer createdById, Date createdDatetime, Integer modifiedById, Date modifiedDatetime, Date crc,
			String recordStatus, Integer notificationId, Clob messageClob, Set pnSpaceHasNews, Set pnNewsHistories) {
		this.newsId = newsId;
		this.topic = topic;
		this.priorityId = priorityId;
		this.postedById = postedById;
		this.postedDatetime = postedDatetime;
		this.createdById = createdById;
		this.createdDatetime = createdDatetime;
		this.modifiedById = modifiedById;
		this.modifiedDatetime = modifiedDatetime;
		this.crc = crc;
		this.recordStatus = recordStatus;
		this.notificationId = notificationId;
		this.messageClob = messageClob;
		this.pnSpaceHasNews = pnSpaceHasNews;
		this.pnNewsHistories = pnNewsHistories;
	}

	@Id
	@Column(name = "NEWS_ID", nullable = false)
	public Integer getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	@Column(name = "TOPIC", length = 80)
	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Column(name = "PRIORITY_ID", nullable = false, length = 20)
	public Integer getPriorityId() {
		return this.priorityId;
	}

	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
	}

	@Column(name = "POSTED_BY_ID", length = 20)
	public Integer getPostedById() {
		return this.postedById;
	}

	public void setPostedById(Integer postedById) {
		this.postedById = postedById;
	}

	@Column(name = "POSTED_DATETIME", length = 7)
	public Date getPostedDatetime() {
		return this.postedDatetime;
	}

	public void setPostedDatetime(Date postedDatetime) {
		this.postedDatetime = postedDatetime;
	}

	@Column(name = "CREATED_BY_ID", nullable = false, length = 20)
	public Integer getCreatedById() {
		return this.createdById;
	}

	public void setCreatedById(Integer createdById) {
		this.createdById = createdById;
	}

	@Column(name = "CREATED_DATETIME", nullable = false, length = 7)
	public Date getCreatedDatetime() {
		return this.createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	@Column(name = "MODIFIED_BY_ID", length = 20)
	public Integer getModifiedById() {
		return this.modifiedById;
	}

	public void setModifiedById(Integer modifiedById) {
		this.modifiedById = modifiedById;
	}

	@Column(name = "MODIFIED_DATETIME", length = 7)
	public Date getModifiedDatetime() {
		return this.modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	@Column(name = "CRC", nullable = false, length = 7)
	public Date getCrc() {
		return this.crc;
	}

	public void setCrc(Date crc) {
		this.crc = crc;
	}

	@Column(name = "RECORD_STATUS", nullable = false, length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	@Column(name = "NOTIFICATION_ID", length = 22)
	public Integer getNotificationId() {
		return this.notificationId;
	}

	public void setNotificationId(Integer notificationId) {
		this.notificationId = notificationId;
	}

	@Column(name = "MESSAGE_CLOB", length = 4000)
	public Clob getMessageClob() {
		return this.messageClob;
	}

	public void setMessageClob(Clob messageClob) {
		this.messageClob = messageClob;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnNew", targetEntity = PnSpaceHasNew.class)
	@Transient
	public Set getPnSpaceHasNews() {
		return this.pnSpaceHasNews;
	}

	public void setPnSpaceHasNews(Set pnSpaceHasNews) {
		this.pnSpaceHasNews = pnSpaceHasNews;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnNew", targetEntity = PnNewsHistory.class)
	@Transient
	public Set getPnNewsHistories() {
		return this.pnNewsHistories;
	}

	public void setPnNewsHistories(Set pnNewsHistories) {
		this.pnNewsHistories = pnNewsHistories;
	}

	public String toString() {
		return new ToStringBuilder(this).append("newsId", getNewsId()).toString();
	}

}
