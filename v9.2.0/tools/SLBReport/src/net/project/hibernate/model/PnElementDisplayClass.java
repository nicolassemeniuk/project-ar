package net.project.hibernate.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class PnElementDisplayClass implements Serializable {

    /** identifier field */
    private net.project.hibernate.model.PnElementDisplayClassPK comp_id;

    /** nullable persistent field */
    private net.project.hibernate.model.PnElement pnElement;

    /** nullable persistent field */
    private net.project.hibernate.model.PnClass pnClass;

    /** full constructor */
    public PnElementDisplayClass(net.project.hibernate.model.PnElementDisplayClassPK comp_id, net.project.hibernate.model.PnElement pnElement, net.project.hibernate.model.PnClass pnClass) {
        this.comp_id = comp_id;
        this.pnElement = pnElement;
        this.pnClass = pnClass;
    }

    /** default constructor */
    public PnElementDisplayClass() {
    }

    /** minimal constructor */
    public PnElementDisplayClass(net.project.hibernate.model.PnElementDisplayClassPK comp_id) {
        this.comp_id = comp_id;
    }

    public net.project.hibernate.model.PnElementDisplayClassPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(net.project.hibernate.model.PnElementDisplayClassPK comp_id) {
        this.comp_id = comp_id;
    }

    public net.project.hibernate.model.PnElement getPnElement() {
        return this.pnElement;
    }

    public void setPnElement(net.project.hibernate.model.PnElement pnElement) {
        this.pnElement = pnElement;
    }

    public net.project.hibernate.model.PnClass getPnClass() {
        return this.pnClass;
    }

    public void setPnClass(net.project.hibernate.model.PnClass pnClass) {
        this.pnClass = pnClass;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnElementDisplayClass) ) return false;
        PnElementDisplayClass castOther = (PnElementDisplayClass) other;
        return new EqualsBuilder()
            .append(this.getComp_id(), castOther.getComp_id())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getComp_id())
            .toHashCode();
    }

}
