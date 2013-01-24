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
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnWeblogEntry generated by hbm2java
 */
@Entity
@Table(name = "PN_WEBLOG_ENTRY")
public class PnWeblogEntry implements Serializable {

	private Integer weblogEntryId;

	private String anchor;

	private String title;

	private String text;

	private Date pubTime;

	private Date updateTime;

	private Integer publishEntry;

	private String link;

	private Integer allowComments;

	private Integer commentDays;

	private Integer rightToLeft;

	private String locale;

	private String status;

	private String summary;

	private String contentType;

	private String contentSrc;

	private java.lang.String isImportantSymbol;

	private java.lang.String workSubmitted;

	private java.lang.String pubTimeString;

	private java.lang.String updateTimeString;

	private java.lang.String imagePath;

	private boolean isEditable;

	private boolean projectEntry = false;

	private java.lang.String shortTitle;

	private java.lang.String shortContext;

	private java.lang.String changedEstimate;

	private java.lang.String contextUrl;

	private java.lang.String contextName;

	private java.lang.String contextValue;

	private Integer isImportant;

	private Set pnWeblogComment = new HashSet(0);

	private PnPerson pnPerson;

	private PnWeblog pnWeblog;

	private net.project.hibernate.model.PnProjectSpace pnProjectSpace;

	private boolean isDeletable;

	private boolean checkPerson;

	private boolean checkProject;

	private java.lang.String multipleWorkSubmitted;
	
	private java.lang.String pubDateString;

	public PnWeblogEntry() {
	}

	public PnWeblogEntry(java.lang.Integer weblogEntryId) {
		this.setWeblogEntryId(weblogEntryId);
	}

	public PnWeblogEntry(java.lang.Integer weblogEntryId, net.project.hibernate.model.PnPerson pnPerson,
			net.project.hibernate.model.PnWeblog pnWeblog, java.lang.String anchor, java.lang.String title,
			java.lang.String text, java.util.Date pubTime, java.util.Date updateTime, java.lang.Integer publishEntry,
			java.lang.String link, java.lang.Integer allowComments, java.lang.Integer commentDays,
			java.lang.Integer rightToLeft, java.lang.String status, java.util.Set pnWeblogComment) {

		this.setWeblogEntryId(weblogEntryId);
		this.setPnPerson(pnPerson);
		this.setPnWeblog(pnWeblog);
		this.setAnchor(anchor);
		this.setTitle(title);
		this.setText(text);
		this.setPubTime(pubTime);
		this.setUpdateTime(updateTime);
		this.setPublishEntry(publishEntry);
		this.setLink(link);
		this.setAllowComments(allowComments);
		this.setCommentDays(commentDays);
		this.setRightToLeft(rightToLeft);
		this.setStatus(status);
		this.setPnWeblogComment(pnWeblogComment);
	}

	public PnWeblogEntry(Integer weblogEntryId, String anchor, String title, String text, Date pubTime,
			Date updateTime, Integer publishEntry, String link, Integer allowComments, Integer commentDays,
			Integer rightToLeft, String locale, String status, String summary, String contentType, String contentSrc,
			Integer isImportant, Set pnWeblogComment, PnPerson pnPerson, PnWeblog pnWeblog) {
		this.weblogEntryId = weblogEntryId;
		this.anchor = anchor;
		this.title = title;
		this.text = text;
		this.pubTime = pubTime;
		this.updateTime = updateTime;
		this.publishEntry = publishEntry;
		this.link = link;
		this.allowComments = allowComments;
		this.commentDays = commentDays;
		this.rightToLeft = rightToLeft;
		this.locale = locale;
		this.status = status;
		this.summary = summary;
		this.contentType = contentType;
		this.contentSrc = contentSrc;
		this.isImportant = isImportant;
		this.pnWeblogComment = pnWeblogComment;
		this.pnPerson = pnPerson;
		this.pnWeblog = pnWeblog;
	}

	@Id
	@Column(name = "WEBLOG_ENTRY_ID", nullable = false)
	public Integer getWeblogEntryId() {
		return this.weblogEntryId;
	}

	public void setWeblogEntryId(Integer weblogEntryId) {
		this.weblogEntryId = weblogEntryId;
	}

	@Column(name = "ANCHOR", length = 240)
	public String getAnchor() {
		return this.anchor;
	}

	public void setAnchor(String anchor) {
		this.anchor = anchor;
	}

	@Column(name = "TITLE", length = 240)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "TEXT", nullable = false)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Column(name = "PUB_TIME")
	public Date getPubTime() {
		return this.pubTime;
	}

	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	@Column(name = "UPDATE_TIME", nullable = false)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "PUBLISH_ENTRY", nullable = false, length = 1)
	public Integer getPublishEntry() {
		return this.publishEntry;
	}

	public void setPublishEntry(Integer publishEntry) {
		this.publishEntry = publishEntry;
	}

	@Column(name = "LINK", length = 240)
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Column(name = "ALLOW_COMMENTS", nullable = false, length = 1)
	public Integer getAllowComments() {
		return this.allowComments;
	}

	public void setAllowComments(Integer allowComments) {
		this.allowComments = allowComments;
	}

	@Column(name = "COMMENT_DAYS", nullable = false, length = 11)
	public Integer getCommentDays() {
		return this.commentDays;
	}

	public void setCommentDays(Integer commentDays) {
		this.commentDays = commentDays;
	}

	@Column(name = "RIGHT_TO_LEFT", nullable = false, length = 1)
	public Integer getRightToLeft() {
		return this.rightToLeft;
	}

	public void setRightToLeft(Integer rightToLeft) {
		this.rightToLeft = rightToLeft;
	}

	@Column(name = "LOCALE", length = 20)
	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@Column(name = "STATUS", nullable = false, length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "SUMMARY")
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(name = "CONTENT_TYPE", length = 48)
	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	@Column(name = "CONTENT_SRC", length = 240)
	public String getContentSrc() {
		return this.contentSrc;
	}

	public void setContentSrc(String contentSrc) {
		this.contentSrc = contentSrc;
	}

	@Column(name = "IS_IMPORTANT", length = 1)
	public Integer getIsImportant() {
		return this.isImportant;
	}

	public void setIsImportant(Integer isImportant) {
		this.isImportant = isImportant;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnWeblogEntry", targetEntity = PnWeblogComment.class)
	public Set getPnWeblogComment() {
		return this.pnWeblogComment;
	}

	public void setPnWeblogComment(Set pnWeblogComment) {
		this.pnWeblogComment = pnWeblogComment;
	}

	@ManyToOne(targetEntity = PnPerson.class)
	@JoinColumn(name = "PERSON_ID")
	public PnPerson getPnPerson() {
		return this.pnPerson;
	}

	public void setPnPerson(PnPerson pnPerson) {
		this.pnPerson = pnPerson;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnWeblog.class)
	@JoinColumn(name = "WEBLOG_ID")
	public PnWeblog getPnWeblog() {
		return this.pnWeblog;
	}

	public void setPnWeblog(PnWeblog pnWeblog) {
		this.pnWeblog = pnWeblog;
	}

	/**
	 * @return the pubTimeString
	 */
	@Transient
	public java.lang.String getPubTimeString() {
		return pubTimeString;
	}

	/**
	 * @param pubTimeString the pubTimeString to set
	 */
	public void setPubTimeString(java.lang.String pubTimeString) {
		this.pubTimeString = pubTimeString;
	}

	/**
	 * @return the isEditable
	 */
	@Transient
	public boolean getIsEditable() {
		return isEditable;
	}

	/**
	 * @param isEditable the isEditable to set
	 */
	public void setIsEditable(boolean isEditable) {
		this.isEditable = isEditable;
	}

	/**
	 * @return the projectEntry
	 */
	@Transient
	public boolean getProjectEntry() {
		return projectEntry;
	}
	
	/**
	 * @param projectEntry
	 */
	public void setProjectEntry(boolean projectEntry) {
		this.projectEntry = projectEntry;
	}

	/**
	 * @param workSubmitted
	 */	
	@Transient
	public String getWorkSubmitted() {
		return workSubmitted;
	}

	/**
	 * @return the workSubmitted
	 */
	public void setWorkSubmitted(java.lang.String workSubmitted) {
		this.workSubmitted = workSubmitted;
	}

	/**
	 * @return the imagePath
	 */
	@Transient
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(java.lang.String imagePath) {
		this.imagePath = imagePath;
	}

	@Transient
	public String getUpdateTimeString() {
		return updateTimeString;
	}

	public void setUpdateTimeString(java.lang.String updateTimeString) {
		this.updateTimeString = updateTimeString;
	}

	/**
	 * @return the shortContext
	 */
	@Transient
	public String getShortContext() {
		return shortContext;
	}

	/**
	 * @param shortContext the shortContext to set
	 */
	public void setShortContext(java.lang.String shortContext) {
		this.shortContext = shortContext;
	}

	/**
	 * @return the shortTitle
	 */
	@Transient
	public String getShortTitle() {
		return shortTitle;
	}

	/**
	 * @param shortTitle the shortTitle to set
	 */
	public void setShortTitle(java.lang.String shortTitle) {
		this.shortTitle = shortTitle;
	}

	/**
	 * @return the changedEstimate
	 */
	@Transient
	public String getChangedEstimate() {
		return changedEstimate;
	}

	/**
	 * @param changedEstimate the changedEstimate to set
	 */
	public void setChangedEstimate(java.lang.String changedEstimate) {
		this.changedEstimate = changedEstimate;
	}

	/**
	 * @return the isDeletable
	 */
	@Transient
	public boolean getIsDeletable() {
		return isDeletable;
	}

	/**
	 * @param isDeletable the isDeletable to set
	 */
	public void setIsDeletable(boolean isDeletable) {
		this.isDeletable = isDeletable;
	}

	@Transient
	public String getContextUrl() {
		return contextUrl;
	}

	public void setContextUrl(java.lang.String contextUrl) {
		this.contextUrl = contextUrl;
	}

	@Transient
	public String getContextName() {
		return contextName;
	}

	public void setContextName(java.lang.String contextName) {
		this.contextName = contextName;
	}

	@Transient
	public String getContextValue() {
		return contextValue;
	}

	public void setContextValue(java.lang.String contextValue) {
		this.contextValue = contextValue;
	}

	/**
	 * @return the checkPerson
	 */
	@Transient
	public boolean isCheckPerson() {
		return checkPerson;
	}

	/**
	 * @param checkPerson the checkPerson to set
	 */
	public void setCheckPerson(boolean checkPerson) {
		this.checkPerson = checkPerson;
	}

	/**
	 * @return the checkProject
	 */
	@Transient
	public boolean isCheckProject() {
		return checkProject;
	}

	/**
	 * @param checkProject the checkProject to set
	 */
	public void setCheckProject(boolean checkProject) {
		this.checkProject = checkProject;
	}

	/**
	 * @return the pnProjectSpace
	 */
	@Transient
	public PnProjectSpace getPnProjectSpace() {
		return pnProjectSpace;
	}

	/**
	 * @param pnProjectSpace the pnProjectSpace to set
	 */
	public void setPnProjectSpace(net.project.hibernate.model.PnProjectSpace pnProjectSpace) {
		this.projectEntry = pnProjectSpace != null;
		this.pnProjectSpace = pnProjectSpace;
	}

	/**
	 * @return the multipleWorkSubmitted
	 */
	@Transient
	public String getMultipleWorkSubmitted() {
		return multipleWorkSubmitted;
	}

	/**
	 * @param multipleWorkSubmitted the multipleWorkSubmitted to set
	 */
	public void setMultipleWorkSubmitted(java.lang.String multipleWorkSubmitted) {
		this.multipleWorkSubmitted = multipleWorkSubmitted;
	}
	
	/**
	 * @return the isImportantSybmol
	 */
	@Transient
	public String getIsImportantSymbol() {
		return isImportantSymbol;
	}

	/**
	 * @param isImportantSymbol the isImportantSymbol to set
	 */
	public void setIsImportantSymbol(java.lang.String isImportantSymbol) {
		this.isImportantSymbol = isImportantSymbol;
	}

	@Override
	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (!(obj instanceof PnWeblogEntry))
			return false;
		else {
			PnWeblogEntry pnWeblogEntry = (PnWeblogEntry) obj;
			if (null == this.getWeblogEntryId() || null == pnWeblogEntry.getWeblogEntryId())
				return false;
			else
				return (this.getWeblogEntryId().equals(pnWeblogEntry.getWeblogEntryId()));
		}
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getWeblogEntryId()).toHashCode();
	}

	public String toString() {
		return new ToStringBuilder(this).append("weblogEntryId", getWeblogEntryId()).toString();
	}

	/**
	 * @return the pubDateString
	 */
	@Transient
	public java.lang.String getPubDateString() {
		return pubDateString;
	}

	/**
	 * @param pubDateString the pubDateString to set
	 */
	public void setPubDateString(java.lang.String pubDateString) {
		this.pubDateString = pubDateString;
	}

}