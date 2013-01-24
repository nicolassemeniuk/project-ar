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
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnNewsHistoryView generated by hbm2java
 */
@Embeddable
public class PnNewsHistoryViewPK implements Serializable {

	private BigDecimal newsId;

	private String topic;

	private BigDecimal newsHistoryId;

	private String action;

	private String actionName;

	private BigDecimal actionById;

	private String actionBy;

	private Date actionDate;

	private String actionComment;

	public PnNewsHistoryViewPK() {
	}

	public PnNewsHistoryViewPK(BigDecimal newsId, String topic, BigDecimal newsHistoryId, String action,
			String actionName, BigDecimal actionById, String actionBy, Date actionDate, String actionComment) {
		this.newsId = newsId;
		this.topic = topic;
		this.newsHistoryId = newsHistoryId;
		this.action = action;
		this.actionName = actionName;
		this.actionById = actionById;
		this.actionBy = actionBy;
		this.actionDate = actionDate;
		this.actionComment = actionComment;
	}

	@Column(name = "NEWS_ID", nullable = false, length = 20)
	public BigDecimal getNewsId() {
		return this.newsId;
	}

	public void setNewsId(BigDecimal newsId) {
		this.newsId = newsId;
	}

	@Column(name = "TOPIC", nullable = false, length = 80)
	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Column(name = "NEWS_HISTORY_ID", nullable = false, length = 20)
	public BigDecimal getNewsHistoryId() {
		return this.newsHistoryId;
	}

	public void setNewsHistoryId(BigDecimal newsHistoryId) {
		this.newsHistoryId = newsHistoryId;
	}

	@Column(name = "ACTION", nullable = false, length = 80)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "ACTION_NAME", nullable = false, length = 80)
	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	@Column(name = "ACTION_BY_ID", nullable = false, length = 20)
	public BigDecimal getActionById() {
		return this.actionById;
	}

	public void setActionById(BigDecimal actionById) {
		this.actionById = actionById;
	}

	@Column(name = "ACTION_BY", nullable = false, length = 240)
	public String getActionBy() {
		return this.actionBy;
	}

	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ACTION_DATE", nullable = false, length = 7)
	public Date getActionDate() {
		return this.actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	@Column(name = "ACTION_COMMENT", nullable = false)
	public String getActionComment() {
		return this.actionComment;
	}

	public void setActionComment(String actionComment) {
		this.actionComment = actionComment;
	}

	public String toString() {
		return new ToStringBuilder(this).append("newsId", getNewsId()).append("topic", getTopic()).append(
				"newsHistoryId", getNewsHistoryId()).append("action", getAction())
				.append("actionName", getActionName()).append("actionById", getActionById()).append("actionBy",
						getActionBy()).append("actionDate", getActionDate())
				.append("actionComment", getActionComment()).toString();
	}

}