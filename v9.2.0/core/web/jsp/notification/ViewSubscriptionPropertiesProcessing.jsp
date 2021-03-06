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
|   $Revision: 18397 $
|   $Date: 2008-11-21 10:47:28 -0200 (vie, 21 nov 2008) $
|   $Author: umesha $
|
|--------------------------------------------------------------------%>

<%@ page 
    contentType="text/html; charset=UTF-8"
    info="Manage Subscriptions" 
    language="java" 
    errorPage="/errors.jsp"
    import="net.project.notification.*,
    net.project.security.User"
%>

<%------------------------------------------------------------------------
  -- Security Verification
  ----------------------------------------------------------------------%>

<%--
<security:verifyAccess 
				module="<%=net.project.base.Module.DOCUMENT%>"
				action="view" 
/>
--%>

<%------------------------------------------------------------------------
  -- Variable Declarations and Page Setup
  ----------------------------------------------------------------------%>

<%
     String action = request.getParameter ("theAction");

	 if (action.equals ("remove"))
		 pageContext.forward ("RemoveSubscriptionProcessing.jsp?subscriptionID="+request.getParameter("subscriptionID"));

	else if (action.equals("modify"))
		pageContext.forward ("EditSubscription.jsp?subscriptionID="+request.getParameter("subscriptionID")+"&module="+net.project.base.Module.PROJECT_SPACE);
	else if (action.equals("back"))
		pageContext.forward ("ManageSubscriptions.jsp?spaceID="+ request.getParameter("spaceID") );
%>



