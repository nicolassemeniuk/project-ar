package net.project.hibernate.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class PnSpaceHasWorkflow implements Serializable {

    /** identifier field */
    private net.project.hibernate.model.PnSpaceHasWorkflowPK comp_id;

    /** nullable persistent field */
    private net.project.hibernate.model.PnWorkflow pnWorkflow;

    /** full constructor */
    public PnSpaceHasWorkflow(net.project.hibernate.model.PnSpaceHasWorkflowPK comp_id, net.project.hibernate.model.PnWorkflow pnWorkflow) {
        this.comp_id = comp_id;
        this.pnWorkflow = pnWorkflow;
    }

    /** default constructor */
    public PnSpaceHasWorkflow() {
    }

    /** minimal constructor */
    public PnSpaceHasWorkflow(net.project.hibernate.model.PnSpaceHasWorkflowPK comp_id) {
        this.comp_id = comp_id;
    }

    public net.project.hibernate.model.PnSpaceHasWorkflowPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(net.project.hibernate.model.PnSpaceHasWorkflowPK comp_id) {
        this.comp_id = comp_id;
    }

    public net.project.hibernate.model.PnWorkflow getPnWorkflow() {
        return this.pnWorkflow;
    }

    public void setPnWorkflow(net.project.hibernate.model.PnWorkflow pnWorkflow) {
        this.pnWorkflow = pnWorkflow;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof PnSpaceHasWorkflow) ) return false;
        PnSpaceHasWorkflow castOther = (PnSpaceHasWorkflow) other;
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
