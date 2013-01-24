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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnSkillCategory generated by hbm2java
 */
@Entity
@Table(name = "PN_SKILL_CATEGORY")
public class PnSkillCategory implements Serializable {

	private Integer skillCategoryId;

	private String skillCategoryName;

	private String skillCategoryDesc;

	private String recordStatus;

	private Set pnSpaceHasSkillCategories = new HashSet(0);

	private Set pnSkills = new HashSet(0);

	public PnSkillCategory() {
	}

	public PnSkillCategory(Integer skillCategoryId, String skillCategoryName, String recordStatus,
			Set pnSpaceHasSkillCategories, Set pnSkills) {
		this.skillCategoryId = skillCategoryId;
		this.skillCategoryName = skillCategoryName;
		this.recordStatus = recordStatus;
		this.pnSpaceHasSkillCategories = pnSpaceHasSkillCategories;
		this.pnSkills = pnSkills;
	}

	public PnSkillCategory(Integer skillCategoryId, String skillCategoryName, String skillCategoryDesc,
			String recordStatus, Set pnSpaceHasSkillCategories, Set pnSkills) {
		this.skillCategoryId = skillCategoryId;
		this.skillCategoryName = skillCategoryName;
		this.skillCategoryDesc = skillCategoryDesc;
		this.recordStatus = recordStatus;
		this.pnSpaceHasSkillCategories = pnSpaceHasSkillCategories;
		this.pnSkills = pnSkills;
	}

	@Id
	@Column(name = "SKILL_CATEGORY_ID", nullable = false)
	public Integer getSkillCategoryId() {
		return this.skillCategoryId;
	}

	public void setSkillCategoryId(Integer skillCategoryId) {
		this.skillCategoryId = skillCategoryId;
	}

	@Column(name = "SKILL_CATEGORY_NAME", nullable = false, length = 80)
	public String getSkillCategoryName() {
		return this.skillCategoryName;
	}

	public void setSkillCategoryName(String skillCategoryName) {
		this.skillCategoryName = skillCategoryName;
	}

	@Column(name = "SKILL_CATEGORY_DESC", length = 500)
	public String getSkillCategoryDesc() {
		return this.skillCategoryDesc;
	}

	public void setSkillCategoryDesc(String skillCategoryDesc) {
		this.skillCategoryDesc = skillCategoryDesc;
	}

	@Column(name = "RECORD_STATUS", nullable = false, length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnSkillCategory", targetEntity = PnSpaceHasSkillCategory.class)
	@Transient
	public Set getPnSpaceHasSkillCategories() {
		return this.pnSpaceHasSkillCategories;
	}

	public void setPnSpaceHasSkillCategories(Set pnSpaceHasSkillCategories) {
		this.pnSpaceHasSkillCategories = pnSpaceHasSkillCategories;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnSkillCategory", targetEntity = PnSkill.class)
	@Transient
	public Set getPnSkills() {
		return this.pnSkills;
	}

	public void setPnSkills(Set pnSkills) {
		this.pnSkills = pnSkills;
	}

	public String toString() {
		return new ToStringBuilder(this).append("skillCategoryId", getSkillCategoryId()).toString();
	}

}