package net.project.hibernate.model;
// Generated Jun 13, 2009 11:41:49 PM by Hibernate Tools 3.2.4.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnBrandSupportsLanguage generated by hbm2java
 */
@Entity
@Table(name="PN_BRAND_SUPPORTS_LANGUAGE"
)
public class PnBrandSupportsLanguage  implements java.io.Serializable {


     private PnBrandSupportsLanguagePK comp_id;
     private PnLanguage pnLanguage;

    public PnBrandSupportsLanguage() {
    }

	
    public PnBrandSupportsLanguage(PnBrandSupportsLanguagePK comp_id) {
        this.comp_id = comp_id;
    }
    public PnBrandSupportsLanguage(PnBrandSupportsLanguagePK comp_id, PnLanguage pnLanguage) {
       this.comp_id = comp_id;
       this.pnLanguage = pnLanguage;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="brandId", column=@Column(name="BRAND_ID", nullable=false, length=20) ), 
        @AttributeOverride(name="languageCode", column=@Column(name="LANGUAGE_CODE", nullable=false, length=2) ) } )
    public PnBrandSupportsLanguagePK getComp_id() {
        return this.comp_id;
    }
    
    public void setComp_id(PnBrandSupportsLanguagePK comp_id) {
        this.comp_id = comp_id;
    }

@ManyToOne(fetch=FetchType.LAZY, targetEntity=PnLanguage.class)
    @JoinColumn(name="LANGUAGE_CODE", insertable=false, updatable=false)
    public PnLanguage getPnLanguage() {
        return this.pnLanguage;
    }
    
    public void setPnLanguage(PnLanguage pnLanguage) {
        this.pnLanguage = pnLanguage;
    }


    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnBrandSupportsLanguage) ) return false;
        PnBrandSupportsLanguage castOther = (PnBrandSupportsLanguage) other;
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


