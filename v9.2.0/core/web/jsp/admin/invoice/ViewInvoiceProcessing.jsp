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
|  Loads an invoice to display
|--------------------------------------------------------------------%>
<%@ page
    contentType="text/html; charset=UTF-8"
    info="View Invoice Processing"
    language="java"
    errorPage="/errors.jsp"
    import="net.project.admin.ApplicationSpace,
            net.project.billing.invoice.Invoice,
			net.project.billing.invoice.InvoiceManager,
            net.project.base.Module,
            net.project.security.Action,
            net.project.security.SessionManager,
			net.project.xml.XMLFormatter"
%>

<%@ include file="/base/taglibInclude.jsp" %>
<jsp:useBean id="invoice" class="net.project.billing.invoice.Invoice" scope="session"/>
<jsp:useBean id="user" class="net.project.security.User" scope="session"/>

<security:checkSpaceAccess userID="<%=user.getID()%>" spaceID="<%=ApplicationSpace.DEFAULT_APPLICATION_SPACE_ID%>"/>

 <%   String invoiceID = request.getParameter("invoiceID");
	  invoice.setID(invoiceID);
	  
	  if (request.getParameter("theAction").equals("submit")) {
	  
	  invoice.load();
	  
 %>	
 
 <jsp:forward page="ViewInvoice.jsp">
 <jsp:param name="displayInvoice" value="true"/>
 </jsp:forward>
 
 <% } else {
 
    	if (!invoice.isLoaded()) {
		  invoice.load();
	    }
 
 %>
 
 <jsp:forward page="ViewInvoiceDetails.jsp"/>
 
 <% } %>