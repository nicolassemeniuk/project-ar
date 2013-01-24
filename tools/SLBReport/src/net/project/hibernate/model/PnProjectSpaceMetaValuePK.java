package net.project.hibernate.model;
// Generated Mar 16, 2007 11:39:28 PM by Hibernate Tools 3.2.0.beta8


import java.math.BigDecimal;

/**
 * PnProjectSpaceMetaValuePK generated by hbm2java
 */
public class PnProjectSpaceMetaValuePK  implements java.io.Serializable {

    // Fields    

     private BigDecimal projectId;
     private BigDecimal propertyId;

     // Constructors

    /** default constructor */
    public PnProjectSpaceMetaValuePK() {
    }

    /** full constructor */
    public PnProjectSpaceMetaValuePK(BigDecimal projectId, BigDecimal propertyId) {
       this.projectId = projectId;
       this.propertyId = propertyId;
    }
   
    // Property accessors
    public BigDecimal getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(BigDecimal projectId) {
        this.projectId = projectId;
    }
    public BigDecimal getPropertyId() {
        return this.propertyId;
    }
    
    public void setPropertyId(BigDecimal propertyId) {
        this.propertyId = propertyId;
    }




}

