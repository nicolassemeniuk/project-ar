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

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnPortfolio generated by hbm2java
 */
@Entity
@Table(name = "PN_PORTFOLIO")
public class PnPortfolio implements Serializable {

	private Integer portfolioId;

	private String portfolioName;

	private String portfolioDesc;

	private String portfolioType;

	private String contentType;

	private String recordStatus;

	private PnObject pnObject;

	private Set pnPortfolioHasConfigurations = new HashSet(0);

	private Set pnPortfolioHasSpaces = new HashSet(0);

	private Set pnSpaceHasPortfolios = new HashSet(0);

	public PnPortfolio() {
	}

	public PnPortfolio(Integer portfolioId, String portfolioName) {
		this.portfolioId = portfolioId;
		this.portfolioName = portfolioName;
	}

	public PnPortfolio(Integer portfolioId, String portfolioName, String portfolioDesc, String portfolioType,
			String contentType, String recordStatus, PnObject pnObject, Set pnPortfolioHasConfigurations,
			Set pnPortfolioHasSpaces, Set pnSpaceHasPortfolios) {
		this.portfolioId = portfolioId;
		this.portfolioName = portfolioName;
		this.portfolioDesc = portfolioDesc;
		this.portfolioType = portfolioType;
		this.contentType = contentType;
		this.recordStatus = recordStatus;
		this.pnObject = pnObject;
		this.pnPortfolioHasConfigurations = pnPortfolioHasConfigurations;
		this.pnPortfolioHasSpaces = pnPortfolioHasSpaces;
		this.pnSpaceHasPortfolios = pnSpaceHasPortfolios;
	}

	/** minimal constructor */
	public PnPortfolio(Integer portfolioId, String portfolioName, Set pnPortfolioHasConfigurations,
			Set pnPortfolioHasSpaces, Set pnSpaceHasPortfolios) {
		this.portfolioId = portfolioId;
		this.portfolioName = portfolioName;
		this.pnPortfolioHasConfigurations = pnPortfolioHasConfigurations;
		this.pnPortfolioHasSpaces = pnPortfolioHasSpaces;
		this.pnSpaceHasPortfolios = pnSpaceHasPortfolios;
	}

	public PnPortfolio(Integer portfolioId, String portfolioName, String portfolioDesc) {
		this.portfolioId = portfolioId;
		this.portfolioName = portfolioName;
		this.portfolioDesc = portfolioDesc;
	}

	@Id
	@Column(name = "PORTFOLIO_ID", nullable = false)
	public Integer getPortfolioId() {
		return this.portfolioId;
	}

	public void setPortfolioId(Integer portfolioId) {
		this.portfolioId = portfolioId;
	}

	@Column(name = "PORTFOLIO_NAME", nullable = false, length = 80)
	public String getPortfolioName() {
		return this.portfolioName;
	}

	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}

	@Column(name = "PORTFOLIO_DESC", length = 500)
	public String getPortfolioDesc() {
		return this.portfolioDesc;
	}

	public void setPortfolioDesc(String portfolioDesc) {
		this.portfolioDesc = portfolioDesc;
	}

	@Column(name = "PORTFOLIO_TYPE", length = 40)
	public String getPortfolioType() {
		return this.portfolioType;
	}

	public void setPortfolioType(String portfolioType) {
		this.portfolioType = portfolioType;
	}

	@Column(name = "CONTENT_TYPE", length = 40)
	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	@Column(name = "RECORD_STATUS", length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	//@OneToOne(fetch = FetchType.LAZY, targetEntity = PnObject.class)
	//@JoinColumn(name="PORTFOLIO_ID")
	@Transient
	public PnObject getPnObject() {
		return this.pnObject;
	}

	public void setPnObject(PnObject pnObject) {
		this.pnObject = pnObject;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPortfolio", targetEntity = PnPortfolioHasConfiguration.class)
	@Transient
	public Set getPnPortfolioHasConfigurations() {
		return this.pnPortfolioHasConfigurations;
	}

	public void setPnPortfolioHasConfigurations(Set pnPortfolioHasConfigurations) {
		this.pnPortfolioHasConfigurations = pnPortfolioHasConfigurations;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPortfolio", targetEntity = PnPortfolioHasSpace.class)
	@Transient
	public Set getPnPortfolioHasSpaces() {
		return this.pnPortfolioHasSpaces;
	}

	public void setPnPortfolioHasSpaces(Set pnPortfolioHasSpaces) {
		this.pnPortfolioHasSpaces = pnPortfolioHasSpaces;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnPortfolio", targetEntity = PnSpaceHasPortfolio.class)
	@Transient
	public Set getPnSpaceHasPortfolios() {
		return this.pnSpaceHasPortfolios;
	}

	public void setPnSpaceHasPortfolios(Set pnSpaceHasPortfolios) {
		this.pnSpaceHasPortfolios = pnSpaceHasPortfolios;
	}

	public String toString() {
		return new ToStringBuilder(this).append("portfolioId", getPortfolioId()).toString();
	}

}
