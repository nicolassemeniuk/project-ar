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


<%@ page 
    contentType="text/html; charset=UTF-8"
    info="Document List" 
    language="java" 
    errorPage="/errors.jsp"
    import="net.project.document.*,
    net.project.base.ObjectType,
    net.project.base.Module,
    net.project.security.*"

%>

<jsp:useBean id="docManager" class="net.project.document.DocumentManagerBean" scope="session" />
<jsp:useBean id="securityProvider" class="net.project.security.SecurityProvider" scope="session" />

<%
    IContainerObject containerObject = docManager.getCurrentObject();

    if (containerObject.isTypeOf(ObjectType.CONTAINER))
        pageContext.forward("/document/ModifyContainer.jsp");
    else if (containerObject.isTypeOf(ObjectType.DOCUMENT))
        pageContext.forward("/document/ModifyDocumentProperties.jsp");
    else if (containerObject.isTypeOf(ObjectType.BOOKMARK))
        pageContext.forward("/document/ModifyBookmarkProperties.jsp");
%>


