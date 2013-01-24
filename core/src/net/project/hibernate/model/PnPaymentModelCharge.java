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

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * PnPaymentModelCharge generated by hbm2java
 */
@Entity
@Table(name = "PN_PAYMENT_MODEL_CHARGE")
public class PnPaymentModelCharge implements Serializable {

	private Integer paymentModelId;

	private String chargeCode;

	private PnPaymentModel pnPaymentModel;

	public PnPaymentModelCharge() {
	}

	public PnPaymentModelCharge(Integer paymentModelId, String chargeCode) {
		this.paymentModelId = paymentModelId;
		this.chargeCode = chargeCode;
	}

	public PnPaymentModelCharge(Integer paymentModelId, String chargeCode, PnPaymentModel pnPaymentModel) {
		this.paymentModelId = paymentModelId;
		this.chargeCode = chargeCode;
		this.pnPaymentModel = pnPaymentModel;
	}

	@Id
	@Column(name = "PAYMENT_MODEL_ID", nullable = false)
	public Integer getPaymentModelId() {
		return this.paymentModelId;
	}

	public void setPaymentModelId(Integer paymentModelId) {
		this.paymentModelId = paymentModelId;
	}

	@Column(name = "CHARGE_CODE", nullable = false, length = 500)
	public String getChargeCode() {
		return this.chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pnPaymentModelCharge", targetEntity = PnPaymentModel.class)
	public PnPaymentModel getPnPaymentModel() {
		return this.pnPaymentModel;
	}

	public void setPnPaymentModel(PnPaymentModel pnPaymentModel) {
		this.pnPaymentModel = pnPaymentModel;
	}

	public String toString() {
		return new ToStringBuilder(this).append("paymentModelId", getPaymentModelId()).toString();
	}

}