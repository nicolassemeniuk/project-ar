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
|    $RCSfile$
|   $Revision: 18397 $
|       $Date: 2008-11-21 10:47:28 -0200 (vie, 21 nov 2008) $
|     $Author: umesha $
|  
|   Transient Page used to contain LinkManager.jsp
|--------------------------------------------------------------------%>
<%@ page 
    contentType="text/html; charset=UTF-8"
    info="Add Deliverable Link" 
    language="java" 
    errorPage="/errors.jsp"
    import="net.project.security.SessionManager,
            net.project.security.SecurityProvider" 
%>
<jsp:useBean id="securityProvider" class="net.project.security.SecurityProvider" scope="session" />

<%
int module = securityProvider.getCheckedModuleID();
int action = securityProvider.getCheckedActionID();
String id = securityProvider.getCheckedObjectID();
String view = request.getParameter("view");
String context = request.getParameter("context");

HttpSession mySess=request.getSession() ;	
mySess.setAttribute("refererLink",SessionManager.getJSPRootURL()+"/process/ViewDeliverable.jsp?module="+module+"&action="+net.project.security.Action.VIEW+"&id="+id);

response.sendRedirect( SessionManager.getJSPRootURL() +"/link/LinkManager.jsp?module="+module+"&action="+action+"&id="+id+"&context="+context+"&view="+view);
 %>


