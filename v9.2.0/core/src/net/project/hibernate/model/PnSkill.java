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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnSkill generated by hbm2java
 */
@Entity
@Table(name = "PN_SKILL")
public class PnSkill implements Serializable {

	private Integer skillId;

	private String skillName;

	private String skillDesc;

	private Integer parentSkillId;

	private String recordStatus;

	private Set pnPersonHasSkills = new HashSet(0);

	private Set pnSkillHasSubskillsByParentSkillId = new HashSet(0);

	private Set pnSkillHasSubskillsByChildSkillId = new HashSet(0);

	private Set pnSpaceHasSkills = new HashSet(0);

	private PnSkillCategory pnSkillCategory;

	public PnSkill() {
	}

	public PnSkill(Integer skillId, String skillName, String recordStatus,
			net.project.hibernate.model.PnSkillCategory pnSkillCategory, Set pnPersonHasSkills,
			Set pnSkillHasSubskillsByParentSkillId, Set pnSkillHasSubskillsByChildSkillId, Set pnSpaceHasSkills) {
		this.skillId = skillId;
		this.skillName = skillName;
		this.recordStatus = recordStatus;
		this.pnSkillCategory = pnSkillCategory;
		this.pnPersonHasSkills = pnPersonHasSkills;
		this.pnSkillHasSubskillsByParentSkillId = pnSkillHasSubskillsByParentSkillId;
		this.pnSkillHasSubskillsByChildSkillId = pnSkillHasSubskillsByChildSkillId;
		this.pnSpaceHasSkills = pnSpaceHasSkills;
	}

	public PnSkill(Integer skillId, String skillName, String skillDesc, Integer parentSkillId, String recordStatus,
			net.project.hibernate.model.PnSkillCategory pnSkillCategory, Set pnPersonHasSkills,
			Set pnSkillHasSubskillsByParentSkillId, Set pnSkillHasSubskillsByChildSkillId, Set pnSpaceHasSkills) {
		this.skillId = skillId;
		this.skillName = skillName;
		this.skillDesc = skillDesc;
		this.parentSkillId = parentSkillId;
		this.recordStatus = recordStatus;
		this.pnSkillCategory = pnSkillCategory;
		this.pnPersonHasSkills = pnPersonHasSkills;
		this.pnSkillHasSubskillsByParentSkillId = pnSkillHasSubskillsByParentSkillId;
		this.pnSkillHasSubskillsByChildSkillId = pnSkillHasSubskillsByChildSkillId;
		this.pnSpaceHasSkills = pnSpaceHasSkills;
	}

	@Id
	@Column(name = "SKILL_ID", nullable = false)
	public Integer getSkillId() {
		return this.skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	@Column(name = "SKILL_NAME", nullable = false, length = 80)
	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Column(name = "SKILL_DESC", length = 500)
	public String getSkillDesc() {
		return this.skillDesc;
	}

	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}

	@Column(name = "PARENT_SKILL_ID", length = 20)
	public Integer getParentSkillId() {
		return this.parentSkillId;
	}

	public void setParentSkillId(Integer parentSkillId) {
		this.parentSkillId = parentSkillId;
	}

	@Column(name = "RECORD_STATUS", nullable = false, length = 1)
	public String getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnSkill", targetEntity = PnPersonHasSkill.class)
	@Transient
	public Set getPnPersonHasSkills() {
		return this.pnPersonHasSkills;
	}

	public void setPnPersonHasSkills(Set pnPersonHasSkills) {
		this.pnPersonHasSkills = pnPersonHasSkills;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnSkillByParentSkillId", targetEntity = PnSkillHasSubskill.class)
	@Transient
	public Set getPnSkillHasSubskillsByParentSkillId() {
		return this.pnSkillHasSubskillsByParentSkillId;
	}

	public void setPnSkillHasSubskillsByParentSkillId(Set pnSkillHasSubskillsByParentSkillId) {
		this.pnSkillHasSubskillsByParentSkillId = pnSkillHasSubskillsByParentSkillId;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnSkillByChildSkillId", targetEntity = PnSkillHasSubskill.class)
	@Transient
	public Set getPnSkillHasSubskillsByChildSkillId() {
		return this.pnSkillHasSubskillsByChildSkillId;
	}

	public void setPnSkillHasSubskillsByChildSkillId(Set pnSkillHasSubskillsByChildSkillId) {
		this.pnSkillHasSubskillsByChildSkillId = pnSkillHasSubskillsByChildSkillId;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "pnSkill", targetEntity = PnSpaceHasSkill.class)
	@Transient
	public Set getPnSpaceHasSkills() {
		return this.pnSpaceHasSkills;
	}

	public void setPnSpaceHasSkills(Set pnSpaceHasSkills) {
		this.pnSpaceHasSkills = pnSpaceHasSkills;
	}

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PnSkillCategory.class)
	@JoinColumn(name = "SKILL_CATEGORY_ID")
	public PnSkillCategory getPnSkillCategory() {
		return this.pnSkillCategory;
	}

	public void setPnSkillCategory(PnSkillCategory pnSkillCategory) {
		this.pnSkillCategory = pnSkillCategory;
	}

	public String toString() {
		return new ToStringBuilder(this).append("skillId", getSkillId()).toString();
	}

}
