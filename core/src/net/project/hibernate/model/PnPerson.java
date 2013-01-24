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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import net.project.security.User;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnPerson generated by hbm2java
 */
@Entity
@Table(name = "PN_PERSON")
public class PnPerson implements Serializable {

	private Integer personId;

	private String email;

	private String firstName;

	private String lastName;

	private String displayName;

	private String userStatus;

	private Integer membershipPortfolioId;

	private String recordStatus;

	private Date createdDate;

	private Integer imageId;

	private PnObject pnObject;

	private PnPersonNotificationPref pnPersonNotificationPref;

	private PnPersonNotificationAddress pnPersonNotificationAddress;

	private Set pnMeetings = new HashSet(0);

	private Set pnGroupHasPersons = new HashSet(0);

	private Set pnPersonHasProfCerts = new HashSet(0);

	private Set pnInvitedUsers = new HashSet(0);

	private Set pnPersonSkillCommentsByAddedBy = new HashSet(0);

	private Set pnPersonSkillCommentsByPersonId = new HashSet(0);

	private Set pnDocContainers = new HashSet(0);

	private PnUser pnUser;

	private Set pnPostHistories = new HashSet(0);

	private Set pnPosts = new HashSet(0);

	private Set pnGroupHistories = new HashSet(0);

	private Set pnAgendaItems = new HashSet(0);

	private Set pnGroups = new HashSet(0);

	private Set pnBookmarksByOwnerId = new HashSet(0);

	private Set pnBookmarksByModifiedById = new HashSet(0);

	private Set pnPersonAllocations = new HashSet(0);

	private Set pnScheduledSubscriptions = new HashSet(0);

	private Set pnDirectoryHasPersons = new HashSet(0);

	private Set pnDocConfigurations = new HashSet(0);

	private Set pnDiscussionHistories = new HashSet(0);

	private Set pnObjects = new HashSet(0);

	private Set pnTaskHistories = new HashSet(0);

	private Set pnDocVersionsByDocAuthorId = new HashSet(0);

	private Set pnDocVersionsByModifiedById = new HashSet(0);

	private Set pnDocVersionsByCheckedOutById = new HashSet(0);

	private Set pnPersonHasStateRegs = new HashSet(0);

	private Set pnCalEventHasAttendees = new HashSet(0);

	private Set pnBills = new HashSet(0);

	private Set pnPersonProperties = new HashSet(0);

	private Set pnProjectSpaces = new HashSet(0);

	private Set pnFormsHistories = new HashSet(0);

	private Set pnLicenses = new HashSet(0);

	private Set pnNewsHistories = new HashSet(0);

	private Set helpFeedbacks = new HashSet(0);

	private PnPersonHasLicense pnPersonHasLicense;

	private Set pnLoginHistories = new HashSet(0);

	private Set pnWorkingtimeCalendars = new HashSet(0);

	private Set pnPostReaders = new HashSet(0);

	private Set pnLicensePurchasers = new HashSet(0);

	private Set pnPersonHasDisciplines = new HashSet(0);

	private Set pnDocHistories = new HashSet(0);

	private PnPersonSurvey pnPersonSurvey;

	private PnPersonProfile pnPersonProfile;

	private Set pnDocCheckoutLocations = new HashSet(0);

	private Set pnPersonAuthenticators = new HashSet(0);

	private Set pnSpaceHasPersons = new HashSet(0);

	private User user;

	public PnPerson() {
	}

	public PnPerson(Integer personId, String email, String firstName, String lastName, String displayName,
			String userStatus, Integer membershipPortfolioId, String recordStatus, Date createdDate,
			net.project.hibernate.model.PnObject pnObject,
			net.project.hibernate.model.PnPersonNotificationPref pnPersonNotificationPref,
			net.project.hibernate.model.PnPersonNotificationAddress pnPersonNotificationAddress,
			net.project.hibernate.model.PnUser pnUser,
			net.project.hibernate.model.PnPersonHasLicense pnPersonHasLicense,
			net.project.hibernate.model.PnPersonSurvey pnPersonSurvey,
			net.project.hibernate.model.PnPersonProfile pnPersonProfile, Set pnMeetings, Set pnGroupHasPersons,
			Set pnPersonHasProfCerts, Set pnInvitedUsers, Set pnPersonSkillCommentsByAddedBy,
			Set pnPersonSkillCommentsByPersonId, Set pnDocContainers, Set pnPostHistories, Set pnPosts,
			Set pnGroupHistories, Set pnAgendaItems, Set pnGroups, Set pnBookmarksByOwnerId,
			Set pnBookmarksByModifiedById, Set pnPersonAllocations, Set pnScheduledSubscriptions,
			Set pnDirectoryHasPersons, Set pnDocConfigurations, Set pnDiscussionHistories, Set pnObjects,
			Set pnTaskHistories, Set pnDocVersionsByDocAuthorId, Set pnDocVersionsByModifiedById,
			Set pnDocVersionsByCheckedOutById, Set pnPersonHasStateRegs, Set pnCalEventHasAttendees, Set pnBills,
			Set pnPersonProperties, Set pnProjectSpaces, Set pnFormsHistories, Set pnLicenses, Set pnNewsHistories,
			Set helpFeedbacks, Set pnLoginHistories, Set pnWorkingtimeCalendars, Set pnPostReaders,
			Set pnLicensePurchasers, Set pnPersonHasDisciplines, Set pnDocHistories, Set pnDocCheckoutLocations,
			Set pnPersonAuthenticators, Set pnSpaceHasPersons) {
		this.personId = personId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.displayName = displayName;
		this.userStatus = userStatus;
		this.membershipPortfolioId = membershipPortfolioId;
		this.recordStatus = recordStatus;
		this.createdDate = createdDate;
		this.pnObject = pnObject;
		this.pnPersonNotificationPref = pnPersonNotificationPref;
		this.pnPersonNotificationAddress = pnPersonNotificationAddress;
		this.pnUser = pnUser;
		this.pnPersonHasLicense = pnPersonHasLicense;
		this.pnPersonSurvey = pnPersonSurvey;
		this.pnPersonProfile = pnPersonProfile;
		this.pnMeetings = pnMeetings;
		this.pnGroupHasPersons = pnGroupHasPersons;
		this.pnPersonHasProfCerts = pnPersonHasProfCerts;
		this.pnInvitedUsers = pnInvitedUsers;
		this.pnPersonSkillCommentsByAddedBy = pnPersonSkillCommentsByAddedBy;
		this.pnPersonSkillCommentsByPersonId = pnPersonSkillCommentsByPersonId;
		this.pnDocContainers = pnDocContainers;
		this.pnPostHistories = pnPostHistories;
		this.pnPosts = pnPosts;
		this.pnGroupHistories = pnGroupHistories;
		this.pnAgendaItems = pnAgendaItems;
		this.pnGroups = pnGroups;
		this.pnBookmarksByOwnerId = pnBookmarksByOwnerId;
		this.pnBookmarksByModifiedById = pnBookmarksByModifiedById;
		this.pnPersonAllocations = pnPersonAllocations;
		this.pnScheduledSubscriptions = pnScheduledSubscriptions;
		this.pnDirectoryHasPersons = pnDirectoryHasPersons;
		this.pnDocConfigurations = pnDocConfigurations;
		this.pnDiscussionHistories = pnDiscussionHistories;
		this.pnObjects = pnObjects;
		this.pnTaskHistories = pnTaskHistories;
		this.pnDocVersionsByDocAuthorId = pnDocVersionsByDocAuthorId;
		this.pnDocVersionsByModifiedById = pnDocVersionsByModifiedById;
		this.pnDocVersionsByCheckedOutById = pnDocVersionsByCheckedOutById;
		this.pnPersonHasStateRegs = pnPersonHasStateRegs;
		this.pnCalEventHasAttendees = pnCalEventHasAttendees;
		this.pnBills = pnBills;
		this.pnPersonProperties = pnPersonProperties;
		this.pnProjectSpaces = pnProjectSpaces;
		this.pnFormsHistories = pnFormsHistories;
		this.pnLicenses = pnLicenses;
		this.pnNewsHistories = pnNewsHistories;
		this.helpFeedbacks = helpFeedbacks;
		this.pnLoginHistories = pnLoginHistories;
		this.pnWorkingtimeCalendars = pnWorkingtimeCalendars;
		this.pnPostReaders = pnPostReaders;
		this.pnLicensePurchasers = pnLicensePurchasers;
		this.pnPersonHasDisciplines = pnPersonHasDisciplines;
		this.pnDocHistories = pnDocHistories;
		this.pnDocCheckoutLocations = pnDocCheckoutLocations;
		this.pnPersonAuthenticators = pnPersonAuthenticators;
		this.pnSpaceHasPersons = pnSpaceHasPersons;
	}

	public PnPerson(Integer personId, String email, String firstName, String lastName, String displayName,
			String userStatus, Integer membershipPortfolioId, String recordStatus, Set pnMeetings,
			Set pnGroupHasPersons, Set pnPersonHasProfCerts, Set pnInvitedUsers, Set pnPersonSkillCommentsByAddedBy,
			Set pnPersonSkillCommentsByPersonId, Set pnDocContainers, Set pnPostHistories, Set pnPosts,
			Set pnGroupHistories, Set pnAgendaItems, Set pnGroups, Set pnBookmarksByOwnerId,
			Set pnBookmarksByModifiedById, Set pnPersonAllocations, Set pnScheduledSubscriptions,
			Set pnDirectoryHasPersons, Set pnDocConfigurations, Set pnDiscussionHistories, Set pnObjects,
			Set pnTaskHistories, Set pnDocVersionsByDocAuthorId, Set pnDocVersionsByModifiedById,
			Set pnDocVersionsByCheckedOutById, Set pnPersonHasStateRegs, Set pnCalEventHasAttendees, Set pnBills,
			Set pnPersonProperties, Set pnProjectSpaces, Set pnFormsHistories, Set pnLicenses, Set pnNewsHistories,
			Set helpFeedbacks, Set pnLoginHistories, Set pnWorkingtimeCalendars, Set pnPostReaders,
			Set pnLicensePurchasers, Set pnPersonHasDisciplines, Set pnDocHistories, Set pnDocCheckoutLocations,
			Set pnPersonAuthenticators, Set pnSpaceHasPersons) {
		this.personId = personId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.displayName = displayName;
		this.userStatus = userStatus;
		this.membershipPortfolioId = membershipPortfolioId;
		this.recordStatus = recordStatus;
		this.pnMeetings = pnMeetings;
		this.pnGroupHasPersons = pnGroupHasPersons;
		this.pnPersonHasProfCerts = pnPersonHasProfCerts;
		this.pnInvitedUsers = pnInvitedUsers;
		this.pnPersonSkillCommentsByAddedBy = pnPersonSkillCommentsByAddedBy;
		this.pnPersonSkillCommentsByPersonId = pnPersonSkillCommentsByPersonId;
		this.pnDocContainers = pnDocContainers;
		this.pnPostHistories = pnPostHistories;
		this.pnPosts = pnPosts;
		this.pnGroupHistories = pnGroupHistories;
		this.pnAgendaItems = pnAgendaItems;
		this.pnGroups = pnGroups;
		this.pnBookmarksByOwnerId = pnBookmarksByOwnerId;
		this.pnBookmarksByModifiedById = pnBookmarksByModifiedById;
		this.pnPersonAllocations = pnPersonAllocations;
		this.pnScheduledSubscriptions = pnScheduledSubscriptions;
		this.pnDirectoryHasPersons = pnDirectoryHasPersons;
		this.pnDocConfigurations = pnDocConfigurations;
		this.pnDiscussionHistories = pnDiscussionHistories;
		this.pnObjects = pnObjects;
		this.pnTaskHistories = pnTaskHistories;
		this.pnDocVersionsByDocAuthorId = pnDocVersionsByDocAuthorId;
		this.pnDocVersionsByModifiedById = pnDocVersionsByModifiedById;
		this.pnDocVersionsByCheckedOutById = pnDocVersionsByCheckedOutById;
		this.pnPersonHasStateRegs = pnPersonHasStateRegs;
		this.pnCalEventHasAttendees = pnCalEventHasAttendees;
		this.pnBills = pnBills;
		this.pnPersonProperties = pnPersonProperties;
		this.pnProjectSpaces = pnProjectSpaces;
		this.pnFormsHistories = pnFormsHistories;
		this.pnLicenses = pnLicenses;
		this.pnNewsHistories = pnNewsHistories;
		this.helpFeedbacks = helpFeedbacks;
		this.pnLoginHistories = pnLoginHistories;
		this.pnWorkingtimeCalendars = pnWorkingtimeCalendars;
		this.pnPostReaders = pnPostReaders;
		this.pnLicensePurchasers = pnLicensePurchasers;
		this.pnPersonHasDisciplines = pnPersonHasDisciplines;
		this.pnDocHistories = pnDocHistories;
		this.pnDocCheckoutLocations = pnDocCheckoutLocations;
		this.pnPersonAuthenticators = pnPersonAuthenticators;
		this.pnSpaceHasPersons = pnSpaceHasPersons;
	}

	public PnPerson(Integer personId, String email, String firstName, String lastName, String displayName,
			String userStatus, Integer membershipPortfolioId, Date createdDate, String recordStatus) {
		this.personId = personId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.displayName = displayName;
		this.userStatus = userStatus;
		this.membershipPortfolioId = membershipPortfolioId;
		this.recordStatus = recordStatus;
		this.createdDate = createdDate;
	}

	public PnPerson(Integer personId, String firstName, String lastName, String displayName) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.displayName = displayName;
	}

	public PnPerson(Integer personId, Integer imageId) {
		this.personId = personId;
		this.imageId = imageId;
	}

	public PnPerson(Integer personId, String firstName, String lastName, String displayName, String userStatus,
			Integer membershipPortfolioId, Date createdDate, String recordStatus) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.displayName = displayName;
		this.userStatus = userStatus;
		this.membershipPortfolioId = membershipPortfolioId;
		this.createdDate = createdDate;
		this.recordStatus = recordStatus;
	}

	public PnPerson(Integer personId, String firstName, String lastName, String displayName, String email,
			String userStatus, Integer membershipPortfolioId, String recordStatus, Date createdDate) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.displayName = displayName;
		this.email = email;
		this.userStatus = userStatus;
		this.membershipPortfolioId = membershipPortfolioId;
		this.recordStatus = recordStatus;
		this.createdDate = createdDate;
	}

	public PnPerson(String firstName, String lastName, String email, Integer personId) {
		this.personId = personId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public PnPerson(Integer personId) {
		this.personId = personId;
	}

	public PnPerson(Integer personId, String firstName, String lastName, String displayName, Integer imageId) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.displayName = displayName;
		this.imageId = imageId;
	}

	/** 
	 * Instantiate PnPerson by using User object
	 * @param user
	 */
	public PnPerson(User user) {
		this.user = user;
		this.personId = Integer.parseInt(user.getID());
		this.displayName = user.getDisplayName();
	}

	@Id
	@Column(name = "PERSON_ID", nullable = false)
	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	@Column(name = "EMAIL", nullable = false, length = 240)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "FIRST_NAME", nullable = false, length = 40)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", nullable = false, length = 60)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "DISPLAY_NAME", nullable = false, length = 240)
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Column(name = "USER_STATUS", nullable = false, length = 80)
	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	@Column(name = "MEMBERSHIP_PORTFOLIO_ID", nullable = false, length = 20)
	public Integer getMembershipPortfolioId() {
		return this.membershipPortfolioId;
	}

	public void setMembershipPortfolioId(Integer membershipPortfolioId) {
		this.membershipPortfolioId = membershipPortfolioId;
	}

	@Column(name = "RECORD_STATUS", nullable = false, length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	@Column(name = "CREATED_DATE", length = 7)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "IMAGE_ID", length = 20)
	public Integer getImageId() {
		return this.imageId;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnPerson2", targetEntity = PnObject.class)
	//@JoinColumn(name="PERSON_ID")
	@Transient
	public PnObject getPnObject() {
		return this.pnObject;
	}

	public void setPnObject(PnObject pnObject) {
		this.pnObject = pnObject;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPersonNotificationPref.class)
	//@JoinColumn(name = "PERSON_ID")
	@Transient
	public PnPersonNotificationPref getPnPersonNotificationPref() {
		return this.pnPersonNotificationPref;
	}

	public void setPnPersonNotificationPref(PnPersonNotificationPref pnPersonNotificationPref) {
		this.pnPersonNotificationPref = pnPersonNotificationPref;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPersonNotificationAddress.class)
	@Transient
	public PnPersonNotificationAddress getPnPersonNotificationAddress() {
		return this.pnPersonNotificationAddress;
	}

	public void setPnPersonNotificationAddress(PnPersonNotificationAddress pnPersonNotificationAddress) {
		this.pnPersonNotificationAddress = pnPersonNotificationAddress;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnMeeting.class)
	@Transient
	public Set getPnMeetings() {
		return this.pnMeetings;
	}

	public void setPnMeetings(Set pnMeetings) {
		this.pnMeetings = pnMeetings;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnGroupHasPerson.class)
	@Transient
	public Set getPnGroupHasPersons() {
		return this.pnGroupHasPersons;
	}

	public void setPnGroupHasPersons(Set pnGroupHasPersons) {
		this.pnGroupHasPersons = pnGroupHasPersons;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPersonHasProfCert.class)
	@Transient
	public Set getPnPersonHasProfCerts() {
		return this.pnPersonHasProfCerts;
	}

	public void setPnPersonHasProfCerts(Set pnPersonHasProfCerts) {
		this.pnPersonHasProfCerts = pnPersonHasProfCerts;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnInvitedUser.class)
	@Transient
	public Set getPnInvitedUsers() {
		return this.pnInvitedUsers;
	}

	public void setPnInvitedUsers(Set pnInvitedUsers) {
		this.pnInvitedUsers = pnInvitedUsers;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPersonByAddedBy", targetEntity = PnPersonSkillComment.class)
	@Transient
	public Set getPnPersonSkillCommentsByAddedBy() {
		return this.pnPersonSkillCommentsByAddedBy;
	}

	public void setPnPersonSkillCommentsByAddedBy(Set pnPersonSkillCommentsByAddedBy) {
		this.pnPersonSkillCommentsByAddedBy = pnPersonSkillCommentsByAddedBy;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPersonByPersonId", targetEntity = PnPersonSkillComment.class)
	@Transient
	public Set getPnPersonSkillCommentsByPersonId() {
		return this.pnPersonSkillCommentsByPersonId;
	}

	public void setPnPersonSkillCommentsByPersonId(Set pnPersonSkillCommentsByPersonId) {
		this.pnPersonSkillCommentsByPersonId = pnPersonSkillCommentsByPersonId;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnDocContainer.class)
	@Transient
	public Set getPnDocContainers() {
		return this.pnDocContainers;
	}

	public void setPnDocContainers(Set pnDocContainers) {
		this.pnDocContainers = pnDocContainers;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnUser.class)
	@Transient
	public PnUser getPnUser() {
		return this.pnUser;
	}

	public void setPnUser(PnUser pnUser) {
		this.pnUser = pnUser;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPostHistory.class)
	@Transient
	public Set getPnPostHistories() {
		return this.pnPostHistories;
	}

	public void setPnPostHistories(Set pnPostHistories) {
		this.pnPostHistories = pnPostHistories;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPost.class)
	@Transient
	public Set getPnPosts() {
		return this.pnPosts;
	}

	public void setPnPosts(Set pnPosts) {
		this.pnPosts = pnPosts;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnGroupHistory.class)
	@Transient
	public Set getPnGroupHistories() {
		return this.pnGroupHistories;
	}

	public void setPnGroupHistories(Set pnGroupHistories) {
		this.pnGroupHistories = pnGroupHistories;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnAgendaItem.class)
	@Transient
	public Set getPnAgendaItems() {
		return this.pnAgendaItems;
	}

	public void setPnAgendaItems(Set pnAgendaItems) {
		this.pnAgendaItems = pnAgendaItems;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnGroup.class)
	@Transient
	public Set getPnGroups() {
		return this.pnGroups;
	}

	public void setPnGroups(Set pnGroups) {
		this.pnGroups = pnGroups;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPersonByOwnerId", targetEntity = PnBookmark.class)
	@Transient
	public Set getPnBookmarksByOwnerId() {
		return this.pnBookmarksByOwnerId;
	}

	public void setPnBookmarksByOwnerId(Set pnBookmarksByOwnerId) {
		this.pnBookmarksByOwnerId = pnBookmarksByOwnerId;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPersonByModifiedById", targetEntity = PnBookmark.class)
	@Transient
	public Set getPnBookmarksByModifiedById() {
		return this.pnBookmarksByModifiedById;
	}

	public void setPnBookmarksByModifiedById(Set pnBookmarksByModifiedById) {
		this.pnBookmarksByModifiedById = pnBookmarksByModifiedById;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPersonAllocation.class)
	@Transient
	public Set getPnPersonAllocations() {
		return this.pnPersonAllocations;
	}

	public void setPnPersonAllocations(Set pnPersonAllocations) {
		this.pnPersonAllocations = pnPersonAllocations;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnScheduledSubscription.class)
	@Transient
	public Set getPnScheduledSubscriptions() {
		return this.pnScheduledSubscriptions;
	}

	public void setPnScheduledSubscriptions(Set pnScheduledSubscriptions) {
		this.pnScheduledSubscriptions = pnScheduledSubscriptions;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnDirectoryHasPerson.class)
	@Transient
	public Set getPnDirectoryHasPersons() {
		return this.pnDirectoryHasPersons;
	}

	public void setPnDirectoryHasPersons(Set pnDirectoryHasPersons) {
		this.pnDirectoryHasPersons = pnDirectoryHasPersons;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnDocConfiguration.class)
	@Transient
	public Set getPnDocConfigurations() {
		return this.pnDocConfigurations;
	}

	public void setPnDocConfigurations(Set pnDocConfigurations) {
		this.pnDocConfigurations = pnDocConfigurations;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnDiscussionHistory.class)
	@Transient
	public Set getPnDiscussionHistories() {
		return this.pnDiscussionHistories;
	}

	public void setPnDiscussionHistories(Set pnDiscussionHistories) {
		this.pnDiscussionHistories = pnDiscussionHistories;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnObject.class)
	@Transient
	public Set getPnObjects() {
		return this.pnObjects;
	}

	public void setPnObjects(Set pnObjects) {
		this.pnObjects = pnObjects;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnTaskHistory.class)
	@Transient
	public Set getPnTaskHistories() {
		return this.pnTaskHistories;
	}

	public void setPnTaskHistories(Set pnTaskHistories) {
		this.pnTaskHistories = pnTaskHistories;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPersonByDocAuthorId", targetEntity = PnDocVersion.class)
	@Transient
	public Set getPnDocVersionsByDocAuthorId() {
		return this.pnDocVersionsByDocAuthorId;
	}

	public void setPnDocVersionsByDocAuthorId(Set pnDocVersionsByDocAuthorId) {
		this.pnDocVersionsByDocAuthorId = pnDocVersionsByDocAuthorId;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPersonByModifiedById", targetEntity = PnDocVersion.class)
	@Transient
	public Set getPnDocVersionsByModifiedById() {
		return this.pnDocVersionsByModifiedById;
	}

	public void setPnDocVersionsByModifiedById(Set pnDocVersionsByModifiedById) {
		this.pnDocVersionsByModifiedById = pnDocVersionsByModifiedById;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPersonByCheckedOutById", targetEntity = PnDocVersion.class)
	@Transient
	public Set getPnDocVersionsByCheckedOutById() {
		return this.pnDocVersionsByCheckedOutById;
	}

	public void setPnDocVersionsByCheckedOutById(Set pnDocVersionsByCheckedOutById) {
		this.pnDocVersionsByCheckedOutById = pnDocVersionsByCheckedOutById;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPersonHasStateReg.class)
	@Transient
	public Set getPnPersonHasStateRegs() {
		return this.pnPersonHasStateRegs;
	}

	public void setPnPersonHasStateRegs(Set pnPersonHasStateRegs) {
		this.pnPersonHasStateRegs = pnPersonHasStateRegs;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnCalEventHasAttendee.class)
	@Transient
	public Set getPnCalEventHasAttendees() {
		return this.pnCalEventHasAttendees;
	}

	public void setPnCalEventHasAttendees(Set pnCalEventHasAttendees) {
		this.pnCalEventHasAttendees = pnCalEventHasAttendees;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnBill.class)
	@Transient
	public Set getPnBills() {
		return this.pnBills;
	}

	public void setPnBills(Set pnBills) {
		this.pnBills = pnBills;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPersonProperty.class)
	public Set getPnPersonProperties() {
		return this.pnPersonProperties;
	}

	public void setPnPersonProperties(Set pnPersonProperties) {
		this.pnPersonProperties = pnPersonProperties;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnProjectSpace.class)
	@Transient
	public Set getPnProjectSpaces() {
		return this.pnProjectSpaces;
	}

	public void setPnProjectSpaces(Set pnProjectSpaces) {
		this.pnProjectSpaces = pnProjectSpaces;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnFormsHistory.class)
	@Transient
	public Set getPnFormsHistories() {
		return this.pnFormsHistories;
	}

	public void setPnFormsHistories(Set pnFormsHistories) {
		this.pnFormsHistories = pnFormsHistories;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnLicense.class)
	@Transient
	public Set getPnLicenses() {
		return this.pnLicenses;
	}

	public void setPnLicenses(Set pnLicenses) {
		this.pnLicenses = pnLicenses;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnNewsHistory.class)
	@Transient
	public Set getPnNewsHistories() {
		return this.pnNewsHistories;
	}

	public void setPnNewsHistories(Set pnNewsHistories) {
		this.pnNewsHistories = pnNewsHistories;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = HelpFeedback.class)
	@Transient
	public Set getHelpFeedbacks() {
		return this.helpFeedbacks;
	}

	public void setHelpFeedbacks(Set helpFeedbacks) {
		this.helpFeedbacks = helpFeedbacks;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPersonHasLicense.class)
	//@JoinColumn(name = "PERSON_ID")
	@Transient
	public PnPersonHasLicense getPnPersonHasLicense() {
		return this.pnPersonHasLicense;
	}

	public void setPnPersonHasLicense(PnPersonHasLicense pnPersonHasLicense) {
		this.pnPersonHasLicense = pnPersonHasLicense;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnLoginHistory.class)
	@Transient
	public Set getPnLoginHistories() {
		return this.pnLoginHistories;
	}

	public void setPnLoginHistories(Set pnLoginHistories) {
		this.pnLoginHistories = pnLoginHistories;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnWorkingtimeCalendar.class)
	@Transient
	public Set getPnWorkingtimeCalendars() {
		return this.pnWorkingtimeCalendars;
	}

	public void setPnWorkingtimeCalendars(Set pnWorkingtimeCalendars) {
		this.pnWorkingtimeCalendars = pnWorkingtimeCalendars;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPostReader.class)
	@Transient
	public Set getPnPostReaders() {
		return this.pnPostReaders;
	}

	public void setPnPostReaders(Set pnPostReaders) {
		this.pnPostReaders = pnPostReaders;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnLicensePurchaser.class)
	@Transient
	public Set getPnLicensePurchasers() {
		return this.pnLicensePurchasers;
	}

	public void setPnLicensePurchasers(Set pnLicensePurchasers) {
		this.pnLicensePurchasers = pnLicensePurchasers;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPersonHasDiscipline.class)
	@Transient
	public Set getPnPersonHasDisciplines() {
		return this.pnPersonHasDisciplines;
	}

	public void setPnPersonHasDisciplines(Set pnPersonHasDisciplines) {
		this.pnPersonHasDisciplines = pnPersonHasDisciplines;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnDocHistory.class)
	@Transient
	public Set getPnDocHistories() {
		return this.pnDocHistories;
	}

	public void setPnDocHistories(Set pnDocHistories) {
		this.pnDocHistories = pnDocHistories;
	}

	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPersonSurvey.class)
	//@JoinColumn(name = "PERSON_ID")
	@Transient
	public PnPersonSurvey getPnPersonSurvey() {
		return this.pnPersonSurvey;
	}

	public void setPnPersonSurvey(PnPersonSurvey pnPersonSurvey) {
		this.pnPersonSurvey = pnPersonSurvey;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPersonProfile.class)
	@JoinColumn(name = "PERSON_ID")
	public PnPersonProfile getPnPersonProfile() {
		return this.pnPersonProfile;
	}

	public void setPnPersonProfile(PnPersonProfile pnPersonProfile) {
		this.pnPersonProfile = pnPersonProfile;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnDocCheckoutLocation.class)
	@Transient
	public Set getPnDocCheckoutLocations() {
		return this.pnDocCheckoutLocations;
	}

	public void setPnDocCheckoutLocations(Set pnDocCheckoutLocations) {
		this.pnDocCheckoutLocations = pnDocCheckoutLocations;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnPersonAuthenticator.class)
	@Transient
	public Set getPnPersonAuthenticators() {
		return this.pnPersonAuthenticators;
	}

	public void setPnPersonAuthenticators(Set pnPersonAuthenticators) {
		this.pnPersonAuthenticators = pnPersonAuthenticators;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPerson", targetEntity = PnSpaceHasPerson.class)
	@Transient
	public Set getPnSpaceHasPersons() {
		return this.pnSpaceHasPersons;
	}

	public void setPnSpaceHasPersons(Set pnSpaceHasPersons) {
		this.pnSpaceHasPersons = pnSpaceHasPersons;
	}

	@Transient
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String toString() {
		return new ToStringBuilder(this).append("personId", getPersonId()).toString();
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof PnPerson))
			return false;
		PnPerson castOther = (PnPerson) other;
		return new EqualsBuilder().append(this.personId, castOther.personId).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getPersonId()).toHashCode();
	}

}