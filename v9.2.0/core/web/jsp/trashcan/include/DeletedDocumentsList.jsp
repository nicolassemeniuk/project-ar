<%--
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
--%>

<%--------------------------------------------------------------------
|
|   $RCSfile$
|   $Revision: 10578 $
|   $Date: 2003-02-25 00:59:34 +0530 (Tue, 25 Feb 2003) $
|   $Author: tim $
|
|--------------------------------------------------------------------%>

<%@ page 
    contentType="text/html; charset=UTF-8"
    info="Deleted Documents List" 
    language="java" 
    errorPage="/errors.jsp"
    import="net.project.document.*, 
    net.project.security.User"
%>

<%@ include file="/base/taglibInclude.jsp" %>

<jsp:useBean id="container" class="net.project.document.ContainerBean" scope="request" />
<jsp:useBean id="docManager" class="net.project.document.DocumentManagerBean" scope="session" />
<jsp:useBean id="user" class="net.project.security.User" scope="session" /> 

  <%-- Apply stylesheet to format document list--%> 
  <jsp:setProperty name="container" property="stylesheet" value="/trashcan/xsl/del-container-contents.xsl" /> 
  <jsp:getProperty name="container" property="presentation" /> 

