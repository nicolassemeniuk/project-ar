package net.project.hibernate.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class PnMethodologyInIndustry implements Serializable {

    /** identifier field */
    private net.project.hibernate.model.PnMethodologyInIndustryPK comp_id;

    /** full constructor */
    public PnMethodologyInIndustry(net.project.hibernate.model.PnMethodologyInIndustryPK comp_id) {
        this.comp_id = comp_id;
    }

    /** default constructor */
    public PnMethodologyInIndustry() {
    }

    public net.project.hibernate.model.PnMethodologyInIndustryPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(net.project.hibernate.model.PnMethodologyInIndustryPK comp_id) {
        this.comp_id = comp_id;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnMethodologyInIndustry) ) return false;
        PnMethodologyInIndustry castOther = (PnMethodologyInIndustry) other;
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
