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

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PnObjectLinkPK generated by hbm2java
 */
@Embeddable
public class PnObjectLinkPK implements Serializable {

	private Integer fromObjectId;

	private Integer toObjectId;

	private Integer context;

	public PnObjectLinkPK() {
	}

	public PnObjectLinkPK(Integer fromObjectId, Integer toObjectId, Integer context) {
		this.fromObjectId = fromObjectId;
		this.toObjectId = toObjectId;
		this.context = context;
	}

	@Column(name = "FROM_OBJECT_ID", nullable = false, length = 20)
	public Integer getFromObjectId() {
		return this.fromObjectId;
	}

	public void setFromObjectId(Integer fromObjectId) {
		this.fromObjectId = fromObjectId;
	}

	@Column(name = "TO_OBJECT_ID", nullable = false, length = 20)
	public Integer getToObjectId() {
		return this.toObjectId;
	}

	public void setToObjectId(Integer toObjectId) {
		this.toObjectId = toObjectId;
	}

	@Column(name = "CONTEXT", nullable = false, length = 4)
	public Integer getContext() {
		return this.context;
	}

	public void setContext(Integer context) {
		this.context = context;
	}

	public String toString() {
		return new ToStringBuilder(this).append("fromObjectId", getFromObjectId())
				.append("toObjectId", getToObjectId()).append("context", getContext()).toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof PnObjectLinkPK))
			return false;
		PnObjectLinkPK castOther = (PnObjectLinkPK) other;
		return new EqualsBuilder().append(this.getFromObjectId(), castOther.getFromObjectId()).append(
				this.getToObjectId(), castOther.getToObjectId()).append(this.getContext(), castOther.getContext())
				.isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getFromObjectId()).append(getToObjectId()).append(getContext())
				.toHashCode();
	}

}