package net.project.hibernate.model;
// Generated Jun 13, 2009 11:41:49 PM by Hibernate Tools 3.2.4.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnCalculationFieldFormulaPK generated by hbm2java
 */
@Embeddable
public class PnCalculationFieldFormulaPK  implements java.io.Serializable {

    /** identifier field */
    private Integer classId;

    /** identifier field */
    private Integer fieldId;

    /** identifier field */
    private Integer orderId;

    /** full constructor */
    public PnCalculationFieldFormulaPK(Integer classId, Integer fieldId, Integer orderId) {
        this.classId = classId;
        this.fieldId = fieldId;
        this.orderId = orderId;
    }

    /** default constructor */
    public PnCalculationFieldFormulaPK() {
    }

    @Column(name="CLASS_ID", nullable=false, length=20)
    public Integer getClassId() {
        return this.classId;
    }
    
    public void setClassId(Integer classId) {
        this.classId = classId;
    }


    @Column(name="FIELD_ID", nullable=false, length=20)
    public Integer getFieldId() {
        return this.fieldId;
    }
    
    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }


    @Column(name="ORDER_ID", nullable=false, length=20)
    public Integer getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("classId", getClassId())
            .append("fieldId", getFieldId())
            .append("orderId", getOrderId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnCalculationFieldFormulaPK) ) return false;
        PnCalculationFieldFormulaPK castOther = (PnCalculationFieldFormulaPK) other;
        return new EqualsBuilder()
            .append(this.getClassId(), castOther.getClassId())
            .append(this.getFieldId(), castOther.getFieldId())
            .append(this.getOrderId(), castOther.getOrderId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getClassId())
            .append(getFieldId())
            .append(getOrderId())
            .toHashCode();
    }

}

