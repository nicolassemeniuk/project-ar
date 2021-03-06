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
import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * QrtzJobDetail generated by hbm2java
 */
@Entity
@Table(name = "QRTZ_JOB_DETAILS")
public class QrtzJobDetail implements Serializable {

	private QrtzJobDetailPK comp_id;

	private String description;

	private String jobClassName;

	private String isDurable;

	private String isVolatile;

	private String isStateful;

	private String requestsRecovery;

	private Blob jobData;

	private Set qrtzJobListeners = new HashSet(0);

	private Set qrtzTriggers = new HashSet(0);

	public QrtzJobDetail() {
	}

	public QrtzJobDetail(QrtzJobDetailPK comp_id, String jobClassName, String isDurable, String isVolatile,
			String isStateful, String requestsRecovery) {
		this.comp_id = comp_id;
		this.jobClassName = jobClassName;
		this.isDurable = isDurable;
		this.isVolatile = isVolatile;
		this.isStateful = isStateful;
		this.requestsRecovery = requestsRecovery;
	}

	public QrtzJobDetail(QrtzJobDetailPK comp_id, String description, String jobClassName, String isDurable,
			String isVolatile, String isStateful, String requestsRecovery, Blob jobData, Set qrtzJobListeners,
			Set qrtzTriggers) {
		this.comp_id = comp_id;
		this.description = description;
		this.jobClassName = jobClassName;
		this.isDurable = isDurable;
		this.isVolatile = isVolatile;
		this.isStateful = isStateful;
		this.requestsRecovery = requestsRecovery;
		this.jobData = jobData;
		this.qrtzJobListeners = qrtzJobListeners;
		this.qrtzTriggers = qrtzTriggers;
	}

	/** minimal constructor */
	public QrtzJobDetail(net.project.hibernate.model.QrtzJobDetailPK comp_id, String jobClassName, String isDurable,
			String isVolatile, String isStateful, String requestsRecovery, Set qrtzJobListeners, Set qrtzTriggers) {
		this.comp_id = comp_id;
		this.jobClassName = jobClassName;
		this.isDurable = isDurable;
		this.isVolatile = isVolatile;
		this.isStateful = isStateful;
		this.requestsRecovery = requestsRecovery;
		this.qrtzJobListeners = qrtzJobListeners;
		this.qrtzTriggers = qrtzTriggers;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "jobName", column = @Column(name = "JOB_NAME", nullable = false, length = 80)),
			@AttributeOverride(name = "jobGroup", column = @Column(name = "JOB_GROUP", nullable = false, length = 80)) })
	public QrtzJobDetailPK getComp_id() {
		return this.comp_id;
	}

	public void setComp_id(QrtzJobDetailPK comp_id) {
		this.comp_id = comp_id;
	}

	@Column(name = "DESCRIPTION", length = 120)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "JOB_CLASS_NAME", nullable = false, length = 128)
	public String getJobClassName() {
		return this.jobClassName;
	}

	public void setJobClassName(String jobClassName) {
		this.jobClassName = jobClassName;
	}

	@Column(name = "IS_DURABLE", nullable = false, length = 1)
	public String getIsDurable() {
		return this.isDurable;
	}

	public void setIsDurable(String isDurable) {
		this.isDurable = isDurable;
	}

	@Column(name = "IS_VOLATILE", nullable = false, length = 1)
	public String getIsVolatile() {
		return this.isVolatile;
	}

	public void setIsVolatile(String isVolatile) {
		this.isVolatile = isVolatile;
	}

	@Column(name = "IS_STATEFUL", nullable = false, length = 1)
	public String getIsStateful() {
		return this.isStateful;
	}

	public void setIsStateful(String isStateful) {
		this.isStateful = isStateful;
	}

	@Column(name = "REQUESTS_RECOVERY", nullable = false, length = 1)
	public String getRequestsRecovery() {
		return this.requestsRecovery;
	}

	public void setRequestsRecovery(String requestsRecovery) {
		this.requestsRecovery = requestsRecovery;
	}

	@Column(name = "JOB_DATA", length = 4000)
	public Blob getJobData() {
		return this.jobData;
	}

	public void setJobData(Blob jobData) {
		this.jobData = jobData;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "qrtzJobDetail", targetEntity = QrtzJobListener.class)
	@Transient
	public Set getQrtzJobListeners() {
		return this.qrtzJobListeners;
	}

	public void setQrtzJobListeners(Set qrtzJobListeners) {
		this.qrtzJobListeners = qrtzJobListeners;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "qrtzJobDetail", targetEntity = QrtzTrigger.class)
	@Transient
	public Set getQrtzTriggers() {
		return this.qrtzTriggers;
	}

	public void setQrtzTriggers(Set qrtzTriggers) {
		this.qrtzTriggers = qrtzTriggers;
	}

	public String toString() {
		return new ToStringBuilder(this).append("comp_id", getComp_id()).toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof QrtzJobDetail))
			return false;
		QrtzJobDetail castOther = (QrtzJobDetail) other;
		return new EqualsBuilder().append(this.getComp_id(), castOther.getComp_id()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getComp_id()).toHashCode();
	}

}
