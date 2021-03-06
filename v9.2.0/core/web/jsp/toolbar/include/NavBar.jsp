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

<%
/*----------------------------------------------------------------------+
|
|    $RCSfile$
|   $Revision: 18397 $
|       $Date: 2008-11-21 10:47:28 -0200 (vie, 21 nov 2008) $
|     $Author: umesha $
|
| Includable navbar : actually includes another navbar, depending on space
| used by template system to include appropriate Navbar
+----------------------------------------------------------------------*/
%>
<%@ page
    contentType="text/javascript; charset=UTF-8"
    info="Navigation Bar"
    language="java"
    errorPage="/errors.jsp"
    import="net.project.security.*, 
			net.project.space.Space"
%>
<jsp:useBean id="user" class="net.project.security.User" scope="session" />
<%
    if (user.getCurrentSpace().getType().equals(Space.BUSINESS_SPACE)) {
		pageContext.include("/business/include/NavBar.jsp");
    } else if (user.getCurrentSpace().getType().equals(Space.PROJECT_SPACE)) {
		pageContext.include("/project/include/NavBar.jsp");
    } else {
		pageContext.include("/personal/include/NavBar.jsp");
    }
%>
