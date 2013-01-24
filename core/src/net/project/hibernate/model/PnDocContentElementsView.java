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
// Generated Jun 13, 2009 11:41:49 PM by Hibernate Tools 3.2.4.GA


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PnDocContentElementsView generated by hbm2java
 */
@Entity
@Table(name="PN_DOC_CONTENT_ELEMENTS_VIEW"
)
public class PnDocContentElementsView  implements java.io.Serializable {

    /** identifier field */
    private BigDecimal docContentId;

    /** identifier field */
    private BigDecimal documentId;

    /** identifier field */
    private BigDecimal versionId;

    /** identifier field */
    private BigDecimal docFormatId;

    /** identifier field */
    private String docFormat;

    /** identifier field */
    private BigDecimal fileSize;

    /** identifier field */
    private String fileHandle;

    /** identifier field */
    private String recordStatus;

    /** identifier field */
    private String mimeType;

    /** identifier field */
    private String appIconUrl;
    
	/** identifier field */
    private int repositoryId;
    
    /** identifier field */
    private String repositoryPath;

    public PnDocContentElementsView() {
    }

    public PnDocContentElementsView(BigDecimal docContentId, BigDecimal documentId, BigDecimal versionId, BigDecimal docFormatId, String docFormat, BigDecimal fileSize, String fileHandle, String recordStatus, String mimeType, String appIconUrl, int repositoryId, String repositoryPath) {
       this.docContentId = docContentId;
       this.documentId = documentId;
       this.versionId = versionId;
       this.docFormatId = docFormatId;
       this.docFormat = docFormat;
       this.fileSize = fileSize;
       this.fileHandle = fileHandle;
       this.recordStatus = recordStatus;
       this.mimeType = mimeType;
       this.appIconUrl = appIconUrl;
       this.repositoryId = repositoryId;
       this.repositoryPath = repositoryPath;
    }
   
    @Column(name="DOC_CONTENT_ID", nullable=false, length=20)
    public BigDecimal getDocContentId() {
        return this.docContentId;
    }
    
    public void setDocContentId(BigDecimal docContentId) {
        this.docContentId = docContentId;
    }

    
    @Column(name="DOCUMENT_ID", nullable=false, length=20)
    public BigDecimal getDocumentId() {
        return this.documentId;
    }
    
    public void setDocumentId(BigDecimal documentId) {
        this.documentId = documentId;
    }

    
    @Column(name="VERSION_ID", nullable=false, length=20)
    public BigDecimal getVersionId() {
        return this.versionId;
    }
    
    public void setVersionId(BigDecimal versionId) {
        this.versionId = versionId;
    }

    
    @Column(name="DOC_FORMAT_ID", nullable=false, length=20)
    public BigDecimal getDocFormatId() {
        return this.docFormatId;
    }
    
    public void setDocFormatId(BigDecimal docFormatId) {
        this.docFormatId = docFormatId;
    }

    
    @Column(name="DOC_FORMAT", nullable=false, length=240)
    public String getDocFormat() {
        return this.docFormat;
    }
    
    public void setDocFormat(String docFormat) {
        this.docFormat = docFormat;
    }

    
    @Column(name="FILE_SIZE", nullable=false, length=20)
    public BigDecimal getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    
    @Column(name="FILE_HANDLE", nullable=false, length=240)
    public String getFileHandle() {
        return this.fileHandle;
    }
    
    public void setFileHandle(String fileHandle) {
        this.fileHandle = fileHandle;
    }

    
    @Column(name="RECORD_STATUS", nullable=false, length=1)
    public String getRecordStatus() {
        return this.recordStatus;
    }
    
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    
    @Column(name="MIME_TYPE", nullable=false, length=240)
    public String getMimeType() {
        return this.mimeType;
    }
    
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    
    @Column(name="APP_ICON_URL", nullable=false, length=240)
    public String getAppIconUrl() {
        return this.appIconUrl;
    }
    
    public void setAppIconUrl(String appIconUrl) {
        this.appIconUrl = appIconUrl;
    }

    
    @Column(name="REPOSITORY_ID", nullable=false, length=4)
    public int getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(int repositoryId) {
        this.repositoryId = repositoryId;
    }

    
    @Column(name="REPOSITORY_PATH", nullable=false, length=240)
    public String getRepositoryPath() {
        return this.repositoryPath;
    }
    
    public void setRepositoryPath(String repositoryPath) {
        this.repositoryPath = repositoryPath;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("docContentId", getDocContentId())
            .append("documentId", getDocumentId())
            .append("versionId", getVersionId())
            .append("docFormatId", getDocFormatId())
            .append("docFormat", getDocFormat())
            .append("fileSize", getFileSize())
            .append("fileHandle", getFileHandle())
            .append("recordStatus", getRecordStatus())
            .append("mimeType", getMimeType())
            .append("appIconUrl", getAppIconUrl())
            .append("repositoryId", getRepositoryId())
            .append("repositoryPath", getRepositoryPath())
            .toString();
    }

}

