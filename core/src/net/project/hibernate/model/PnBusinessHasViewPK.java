/**
 * 
 */
package net.project.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnBusinessHasViewPK generated by hbm2java
 *
 */
@Embeddable
public class PnBusinessHasViewPK  implements Serializable {

	private Integer businessId;
	
	private Integer viewId;

	public PnBusinessHasViewPK() {
		super();
	}

	public PnBusinessHasViewPK(Integer businessId, Integer viewId) {
		super();
		this.businessId = businessId;
		this.viewId = viewId;
	}

	@Column(name = "BUSINESS_ID", nullable = false, length = 20)
	public Integer getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	@Column(name = "VIEW_ID", nullable = false, length = 20)
	public Integer getViewId() {
		return viewId;
	}

	public void setViewId(Integer viewId) {
		this.viewId = viewId;
	}
	public String toString() {
		return new ToStringBuilder(this).append("businessId", getBusinessId()).append("viewId", getViewId()).toString();
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if (!(other instanceof PnBusinessHasViewPK))
			return false;
		PnBusinessHasViewPK castOther = (PnBusinessHasViewPK) other;
		return new EqualsBuilder().append(this.getBusinessId(), castOther.getViewId()).append(this.getViewId(),
				castOther.getBusinessId()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getBusinessId()).append(getViewId()).toHashCode();
	}

}