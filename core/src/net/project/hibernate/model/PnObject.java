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

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnObject generated by hbm2java
 */
@Entity
@Table(name = "PN_OBJECT")
public class PnObject implements Serializable {

	private Integer objectId;

	private Date dateCreated;

	private String recordStatus;

	private PnPerson pnPerson;

	private PnMeeting pnMeeting;

	private PnCalendar pnCalendar;

	private PnPortfolio pnPortfolio;

	private PnDiscussionGroup pnDiscussionGroup;

	private Set pnCustomCodes = new HashSet(0);

	private Set pnObjectHasDiscussions = new HashSet(0);

	private Set pnObjectLinksByToObjectId = new HashSet(0);

	private Set pnObjectLinksByFromObjectId = new HashSet(0);

	private PnDocContainer pnDocContainer;

	private Set pnAssignments = new HashSet(0);

	private Set pnPosts = new HashSet(0);

	private PnPhase pnPhase;

	private PnClassDomain pnClassDomain;

	private Set pnAgendaItems = new HashSet(0);

	private PnFacility pnFacility;

	private PnGroup pnGroup;

	private Set pnObjectPermissions = new HashSet(0);

	private PnClass pnClass;

	private PnProcess pnProcess;

	private PnDocVersion pnDocVersion;

	private Set pnClassDomainValues = new HashSet(0);

	private PnGate pnGate;

	private Set pnShareablePermissions = new HashSet(0);

	private Set pnEnvelopeHasObjects = new HashSet(0);

	private PnProjectSpace pnProjectSpace;

	private Set pnFormsHistories = new HashSet(0);

	private PnDeliverable pnDeliverable;

	private PnDocument pnDocument;

	private PnDocSpace pnDocSpace;

	private PnShareable pnShareable;

	private Set pnDocContainerHasObjects = new HashSet(0);

	private PnBusiness pnBusiness;

	private PnPerson pnPerson2;

	private PnAddress pnAddress;

	private Set pnClassFields = new HashSet(0);

	private Set pnSpaceHasFeaturedMenuitemsBySpaceId = new HashSet(0);

	private Set pnSpaceHasFeaturedMenuitemsByObjectId = new HashSet(0);

	private PnPlan pnPlan;

	private PnTask pnTask;

	private PnObjectType pnObjectType;
	
	private Set pnSpaceHasSpace;
	/**
	 * Page assigned from the project to a task or form.
	 */
	private PnWikiPage assignedWikiPage;

	public PnObject() {
	}

	public PnObject(Integer objectId) {
		this.objectId = objectId;
	}

	public PnObject(String objectType, Integer personId, Date dateCreated, String recordStatus) {
		PnObjectType pnObjectType = new PnObjectType();
		pnObjectType.setObjectType(objectType);
		this.pnObjectType = pnObjectType;
		PnPerson pnPerson = new PnPerson();
		pnPerson.setPersonId(personId);
		this.pnPerson = pnPerson;
		this.dateCreated = dateCreated;
		this.recordStatus = recordStatus;
	}

	public PnObject(Integer objectId, Date dateCreated, String recordStatus,
			net.project.hibernate.model.PnPerson pnPerson, net.project.hibernate.model.PnObjectType pnObjectType,
			Set pnCustomCodes, Set pnObjectHasDiscussions, Set pnObjectLinksByToObjectId,
			Set pnObjectLinksByFromObjectId, Set pnAssignments, Set pnPosts, Set pnAgendaItems,
			Set pnObjectPermissions, Set pnClassDomainValues, Set pnShareablePermissions, Set pnEnvelopeHasObjects,
			Set pnFormsHistories, Set pnDocContainerHasObjects, Set pnClassFields,
			Set pnSpaceHasFeaturedMenuitemsBySpaceId, Set pnSpaceHasFeaturedMenuitemsByObjectId) {
		this.objectId = objectId;
		this.dateCreated = dateCreated;
		this.recordStatus = recordStatus;
		this.pnPerson = pnPerson;
		this.pnObjectType = pnObjectType;
		this.pnCustomCodes = pnCustomCodes;
		this.pnObjectHasDiscussions = pnObjectHasDiscussions;
		this.pnObjectLinksByToObjectId = pnObjectLinksByToObjectId;
		this.pnObjectLinksByFromObjectId = pnObjectLinksByFromObjectId;
		this.pnAssignments = pnAssignments;
		this.pnPosts = pnPosts;
		this.pnAgendaItems = pnAgendaItems;
		this.pnObjectPermissions = pnObjectPermissions;
		this.pnClassDomainValues = pnClassDomainValues;
		this.pnShareablePermissions = pnShareablePermissions;
		this.pnEnvelopeHasObjects = pnEnvelopeHasObjects;
		this.pnFormsHistories = pnFormsHistories;
		this.pnDocContainerHasObjects = pnDocContainerHasObjects;
		this.pnClassFields = pnClassFields;
		this.pnSpaceHasFeaturedMenuitemsBySpaceId = pnSpaceHasFeaturedMenuitemsBySpaceId;
		this.pnSpaceHasFeaturedMenuitemsByObjectId = pnSpaceHasFeaturedMenuitemsByObjectId;
	}

	public PnObject(Integer objectId, Date dateCreated, String recordStatus,
			net.project.hibernate.model.PnMeeting pnMeeting, net.project.hibernate.model.PnCalendar pnCalendar,
			net.project.hibernate.model.PnPortfolio pnPortfolio,
			net.project.hibernate.model.PnDiscussionGroup pnDiscussionGroup,
			net.project.hibernate.model.PnDocContainer pnDocContainer, net.project.hibernate.model.PnPhase pnPhase,
			net.project.hibernate.model.PnClassDomain pnClassDomain, net.project.hibernate.model.PnFacility pnFacility,
			net.project.hibernate.model.PnGroup pnGroup, net.project.hibernate.model.PnClass pnClass,
			net.project.hibernate.model.PnProcess pnProcess, net.project.hibernate.model.PnDocVersion pnDocVersion,
			net.project.hibernate.model.PnGate pnGate, net.project.hibernate.model.PnProjectSpace pnProjectSpace,
			net.project.hibernate.model.PnDeliverable pnDeliverable, net.project.hibernate.model.PnDocument pnDocument,
			net.project.hibernate.model.PnDocSpace pnDocSpace, net.project.hibernate.model.PnShareable pnShareable,
			net.project.hibernate.model.PnBusiness pnBusiness, net.project.hibernate.model.PnPerson pnPerson,
			net.project.hibernate.model.PnAddress pnAddress, net.project.hibernate.model.PnPlan pnPlan,
			net.project.hibernate.model.PnTask pnTask, net.project.hibernate.model.PnPerson pnPerson2,
			net.project.hibernate.model.PnObjectType pnObjectType, Set pnCustomCodes, Set pnObjectHasDiscussions,
			Set pnObjectLinksByToObjectId, Set pnObjectLinksByFromObjectId, Set pnAssignments, Set pnPosts,
			Set pnAgendaItems, Set pnObjectPermissions, Set pnClassDomainValues, Set pnShareablePermissions,
			Set pnEnvelopeHasObjects, Set pnFormsHistories, Set pnDocContainerHasObjects, Set pnClassFields,
			Set pnSpaceHasFeaturedMenuitemsBySpaceId, Set pnSpaceHasFeaturedMenuitemsByObjectId) {
		this.objectId = objectId;
		this.dateCreated = dateCreated;
		this.recordStatus = recordStatus;
		this.pnMeeting = pnMeeting;
		this.pnCalendar = pnCalendar;
		this.pnPortfolio = pnPortfolio;
		this.pnDiscussionGroup = pnDiscussionGroup;
		this.pnDocContainer = pnDocContainer;
		this.pnPhase = pnPhase;
		this.pnClassDomain = pnClassDomain;
		this.pnFacility = pnFacility;
		this.pnGroup = pnGroup;
		this.pnClass = pnClass;
		this.pnProcess = pnProcess;
		this.pnDocVersion = pnDocVersion;
		this.pnGate = pnGate;
		this.pnProjectSpace = pnProjectSpace;
		this.pnDeliverable = pnDeliverable;
		this.pnDocument = pnDocument;
		this.pnDocSpace = pnDocSpace;
		this.pnShareable = pnShareable;
		this.pnBusiness = pnBusiness;
		this.pnPerson2 = pnPerson2;
		this.pnAddress = pnAddress;
		this.pnPlan = pnPlan;
		this.pnTask = pnTask;
		this.pnPerson = pnPerson;
		this.pnObjectType = pnObjectType;
		this.pnCustomCodes = pnCustomCodes;
		this.pnObjectHasDiscussions = pnObjectHasDiscussions;
		this.pnObjectLinksByToObjectId = pnObjectLinksByToObjectId;
		this.pnObjectLinksByFromObjectId = pnObjectLinksByFromObjectId;
		this.pnAssignments = pnAssignments;
		this.pnPosts = pnPosts;
		this.pnAgendaItems = pnAgendaItems;
		this.pnObjectPermissions = pnObjectPermissions;
		this.pnClassDomainValues = pnClassDomainValues;
		this.pnShareablePermissions = pnShareablePermissions;
		this.pnEnvelopeHasObjects = pnEnvelopeHasObjects;
		this.pnFormsHistories = pnFormsHistories;
		this.pnDocContainerHasObjects = pnDocContainerHasObjects;
		this.pnClassFields = pnClassFields;
		this.pnSpaceHasFeaturedMenuitemsBySpaceId = pnSpaceHasFeaturedMenuitemsBySpaceId;
		this.pnSpaceHasFeaturedMenuitemsByObjectId = pnSpaceHasFeaturedMenuitemsByObjectId;
	}

	@Id
	@Column(name = "OBJECT_ID", nullable = false)
	public Integer getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	@Column(name = "DATE_CREATED", nullable = false)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Column(name = "RECORD_STATUS", nullable = false, length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnPerson.class)
	@JoinColumn(name = "CREATED_BY")
	public PnPerson getPnPerson() {
		return this.pnPerson;
	}

	public void setPnPerson(PnPerson pnPerson) {
		this.pnPerson = pnPerson;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnMeeting.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnMeeting getPnMeeting() {
		return this.pnMeeting;
	}

	public void setPnMeeting(PnMeeting pnMeeting) {
		this.pnMeeting = pnMeeting;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnCalendar.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnCalendar getPnCalendar() {
		return this.pnCalendar;
	}

	public void setPnCalendar(PnCalendar pnCalendar) {
		this.pnCalendar = pnCalendar;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnPortfolio.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnPortfolio getPnPortfolio() {
		return this.pnPortfolio;
	}

	public void setPnPortfolio(PnPortfolio pnPortfolio) {
		this.pnPortfolio = pnPortfolio;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnDiscussionGroup.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnDiscussionGroup getPnDiscussionGroup() {
		return this.pnDiscussionGroup;
	}

	public void setPnDiscussionGroup(PnDiscussionGroup pnDiscussionGroup) {
		this.pnDiscussionGroup = pnDiscussionGroup;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnCustomCode.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnCustomCodes() {
		return this.pnCustomCodes;
	}

	public void setPnCustomCodes(Set pnCustomCodes) {
		this.pnCustomCodes = pnCustomCodes;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnObjectHasDiscussion.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnObjectHasDiscussions() {
		return this.pnObjectHasDiscussions;
	}

	public void setPnObjectHasDiscussions(Set pnObjectHasDiscussions) {
		this.pnObjectHasDiscussions = pnObjectHasDiscussions;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObjectByToObjectId", targetEntity = PnObjectLink.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnObjectLinksByToObjectId() {
		return this.pnObjectLinksByToObjectId;
	}

	public void setPnObjectLinksByToObjectId(Set pnObjectLinksByToObjectId) {
		this.pnObjectLinksByToObjectId = pnObjectLinksByToObjectId;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObjectByFromObjectId", targetEntity = PnObjectLink.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnObjectLinksByFromObjectId() {
		return this.pnObjectLinksByFromObjectId;
	}

	public void setPnObjectLinksByFromObjectId(Set pnObjectLinksByFromObjectId) {
		this.pnObjectLinksByFromObjectId = pnObjectLinksByFromObjectId;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnDocContainer.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnDocContainer getPnDocContainer() {
		return this.pnDocContainer;
	}

	public void setPnDocContainer(PnDocContainer pnDocContainer) {
		this.pnDocContainer = pnDocContainer;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnAssignment.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnAssignments() {
		return this.pnAssignments;
	}

	public void setPnAssignments(Set pnAssignments) {
		this.pnAssignments = pnAssignments;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnPost.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnPosts() {
		return this.pnPosts;
	}

	public void setPnPosts(Set pnPosts) {
		this.pnPosts = pnPosts;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnPhase.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnPhase getPnPhase() {
		return this.pnPhase;
	}

	public void setPnPhase(PnPhase pnPhase) {
		this.pnPhase = pnPhase;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnClassDomain.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnClassDomain getPnClassDomain() {
		return this.pnClassDomain;
	}

	public void setPnClassDomain(PnClassDomain pnClassDomain) {
		this.pnClassDomain = pnClassDomain;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnAgendaItem.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnAgendaItems() {
		return this.pnAgendaItems;
	}

	public void setPnAgendaItems(Set pnAgendaItems) {
		this.pnAgendaItems = pnAgendaItems;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnFacility.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnFacility getPnFacility() {
		return this.pnFacility;
	}

	public void setPnFacility(PnFacility pnFacility) {
		this.pnFacility = pnFacility;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnGroup.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnGroup getPnGroup() {
		return this.pnGroup;
	}

	public void setPnGroup(PnGroup pnGroup) {
		this.pnGroup = pnGroup;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnObjectPermission.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnObjectPermissions() {
		return this.pnObjectPermissions;
	}

	public void setPnObjectPermissions(Set pnObjectPermissions) {
		this.pnObjectPermissions = pnObjectPermissions;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnClass.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnClass getPnClass() {
		return this.pnClass;
	}

	public void setPnClass(PnClass pnClass) {
		this.pnClass = pnClass;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnProcess.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnProcess getPnProcess() {
		return this.pnProcess;
	}

	public void setPnProcess(PnProcess pnProcess) {
		this.pnProcess = pnProcess;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnDocVersion.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnDocVersion getPnDocVersion() {
		return this.pnDocVersion;
	}

	public void setPnDocVersion(PnDocVersion pnDocVersion) {
		this.pnDocVersion = pnDocVersion;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnClassDomainValue.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnClassDomainValues() {
		return this.pnClassDomainValues;
	}

	public void setPnClassDomainValues(Set pnClassDomainValues) {
		this.pnClassDomainValues = pnClassDomainValues;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnGate.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnGate getPnGate() {
		return this.pnGate;
	}

	public void setPnGate(PnGate pnGate) {
		this.pnGate = pnGate;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnShareablePermission.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnShareablePermissions() {
		return this.pnShareablePermissions;
	}

	public void setPnShareablePermissions(Set pnShareablePermissions) {
		this.pnShareablePermissions = pnShareablePermissions;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnEnvelopeHasObject.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnEnvelopeHasObjects() {
		return this.pnEnvelopeHasObjects;
	}

	public void setPnEnvelopeHasObjects(Set pnEnvelopeHasObjects) {
		this.pnEnvelopeHasObjects = pnEnvelopeHasObjects;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnProjectSpace.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnProjectSpace getPnProjectSpace() {
		return this.pnProjectSpace;
	}

	public void setPnProjectSpace(PnProjectSpace pnProjectSpace) {
		this.pnProjectSpace = pnProjectSpace;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnFormsHistory.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnFormsHistories() {
		return this.pnFormsHistories;
	}

	public void setPnFormsHistories(Set pnFormsHistories) {
		this.pnFormsHistories = pnFormsHistories;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnDeliverable.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnDeliverable getPnDeliverable() {
		return this.pnDeliverable;
	}

	public void setPnDeliverable(PnDeliverable pnDeliverable) {
		this.pnDeliverable = pnDeliverable;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnDocument.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnDocument getPnDocument() {
		return this.pnDocument;
	}

	public void setPnDocument(PnDocument pnDocument) {
		this.pnDocument = pnDocument;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnDocSpace.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnDocSpace getPnDocSpace() {
		return this.pnDocSpace;
	}

	public void setPnDocSpace(PnDocSpace pnDocSpace) {
		this.pnDocSpace = pnDocSpace;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnShareable.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnShareable getPnShareable() {
		return this.pnShareable;
	}

	public void setPnShareable(PnShareable pnShareable) {
		this.pnShareable = pnShareable;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnDocContainerHasObject.class)
	@Transient
	public Set getPnDocContainerHasObjects() {
		return this.pnDocContainerHasObjects;
	}

	public void setPnDocContainerHasObjects(Set pnDocContainerHasObjects) {
		this.pnDocContainerHasObjects = pnDocContainerHasObjects;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnBusiness.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnBusiness getPnBusiness() {
		return this.pnBusiness;
	}

	public void setPnBusiness(PnBusiness pnBusiness) {
		this.pnBusiness = pnBusiness;
	}

	//@OneToOne(fetch = FetchType.LAZY, targetEntity = PnPerson.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnPerson getPnPerson2() {
		return this.pnPerson2;
	}

	public void setPnPerson2(PnPerson pnPerson2) {
		this.pnPerson2 = pnPerson2;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnAddress.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnAddress getPnAddress() {
		return this.pnAddress;
	}

	public void setPnAddress(PnAddress pnAddress) {
		this.pnAddress = pnAddress;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnClassField.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnClassFields() {
		return this.pnClassFields;
	}

	public void setPnClassFields(Set pnClassFields) {
		this.pnClassFields = pnClassFields;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObjectBySpaceId", targetEntity = PnSpaceHasFeaturedMenuitem.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnSpaceHasFeaturedMenuitemsBySpaceId() {
		return this.pnSpaceHasFeaturedMenuitemsBySpaceId;
	}

	public void setPnSpaceHasFeaturedMenuitemsBySpaceId(Set pnSpaceHasFeaturedMenuitemsBySpaceId) {
		this.pnSpaceHasFeaturedMenuitemsBySpaceId = pnSpaceHasFeaturedMenuitemsBySpaceId;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObjectByObjectId", targetEntity = PnSpaceHasFeaturedMenuitem.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public Set getPnSpaceHasFeaturedMenuitemsByObjectId() {
		return this.pnSpaceHasFeaturedMenuitemsByObjectId;
	}

	public void setPnSpaceHasFeaturedMenuitemsByObjectId(Set pnSpaceHasFeaturedMenuitemsByObjectId) {
		this.pnSpaceHasFeaturedMenuitemsByObjectId = pnSpaceHasFeaturedMenuitemsByObjectId;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnPlan.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnPlan getPnPlan() {
		return this.pnPlan;
	}

	public void setPnPlan(PnPlan pnPlan) {
		this.pnPlan = pnPlan;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnTask.class)
	//@JoinColumn(name="OBJECT_ID")
	@Transient
	public PnTask getPnTask() {
		return this.pnTask;
	}

	public void setPnTask(PnTask pnTask) {
		this.pnTask = pnTask;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnObjectType.class)
	@JoinColumn(name = "OBJECT_TYPE")
	public PnObjectType getPnObjectType() {
		return this.pnObjectType;
	}

	public void setPnObjectType(PnObjectType pnObjectType) {
		this.pnObjectType = pnObjectType;
	}
	
	/**
	 * @return Returns the assignedWikiPage.
	 */
	@Transient
	public PnWikiPage getAssignedWikiPage() {
		return assignedWikiPage;
	}

	/**
	 * @param assignedWikiPage The assignedWikiPage to set.
	 */
	public void setAssignedWikiPage(PnWikiPage assignedWikiPage) {
		this.assignedWikiPage = assignedWikiPage;
	}
	
	/**
	 * @return the pnSpaceHasSpace
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnObject", targetEntity = PnSpaceHasSpace.class)
	public Set getPnSpaceHasSpace() {
		return pnSpaceHasSpace;
	}

	/**
	 * @param pnSpaceHasSpace the pnSpaceHasSpace to set
	 */
	public void setPnSpaceHasSpace(Set pnSpaceHasSpace) {
		this.pnSpaceHasSpace = pnSpaceHasSpace;
	}

	public String toString() {
		return new ToStringBuilder(this).append("objectId", getObjectId()).toString();
	}
}