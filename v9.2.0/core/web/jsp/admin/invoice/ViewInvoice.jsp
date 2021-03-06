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
|  Displays an invoice's information
|--------------------------------------------------------------------%>
<%@ page
    contentType="text/html; charset=UTF-8"
    info="Invoice Display"
    language="java"
    errorPage="/errors.jsp"
    import="net.project.admin.ApplicationSpace,
            net.project.billing.invoice.Invoice,
			net.project.billing.invoice.InvoiceManager,
            net.project.base.Module,
            net.project.security.Action,
            net.project.security.SessionManager,
			net.project.xml.XMLFormatter,
			net.project.base.property.PropertyProvider"
%>

<%@ include file="/base/taglibInclude.jsp" %>

<jsp:useBean id="applicationSpace" class="net.project.admin.ApplicationSpace" scope="session" />
<jsp:useBean id="invoice" class="net.project.billing.invoice.Invoice" scope="session"/>
<jsp:useBean id="user" class="net.project.security.User" scope="session"/>

<security:checkSpaceAccess userID="<%=user.getID()%>" spaceID="<%=ApplicationSpace.DEFAULT_APPLICATION_SPACE_ID%>"/>
   	
<template:getDoctype />
<template:insert>
	<template:put name="title" content='<%=PropertyProvider.get("prm.global.application.title")%>' direct="true" /> 

<%-- Additional HEAD stuff --%>
<template:put name="head">
	
<%----- import Javascript Files -------------------------------------%>

<template:getSpaceJS />
<%-- Import CSS --%>
<template:getSpaceCSS/>

    
<script language="javascript">
	var theForm;
	var isLoaded = false;
    var JSPRootURL = '<%= SessionManager.getJSPRootURL() %>';    

function setup() {
    isLoaded = true;
    theForm = self.document.forms["main"];
}

function reset() { self.document.location = JSPRootURL + "/admin/invoice/ViewInvoice.jsp?displayInvoice=true&module=<%=Module.APPLICATION_SPACE%>"; }

function tabClick(nextPage) {
	self.document.location = JSPRootURL + nextPage + '?module=<%=Module.APPLICATION_SPACE%>&action=<%=Action.VIEW%>';
}

function help() {
   	openwin_help(JSPRootURL + "/help/Help.jsp?page=admin&section=billing_invoiceview");
}

function viewDetails() {
   	theForm.elements['theAction'].value = 'viewdetails';
	theForm.submit();
}

function downloadInvoiceXML() {
	self.document.location = '<%=SessionManager.getJSPRootURL() + "/servlet/Download?downloadableObjectAttributeName=invoice&cleanup=true"%>';
}	

function submit() {
	theForm.elements['theAction'].value = 'submit';
   	theForm.submit();
}

function cancel() {
	self.document.location = '<%= SessionManager.getJSPRootURL() + "/admin/invoice/ViewInvoiceList.jsp?module=" + Module.APPLICATION_SPACE + "&action=" + Action.VIEW%>'; 
}
</script>


</template:put>
<%-- End of HEAD --%>

<%-- Begin Content --%>		
<template:put name="content">

<tb:toolbar style="tooltitle" showAll="true" groupTitle="prm.application.nav.billingmanager">
    <tb:setAttribute name="leftTitle">
        <history:history>
            <history:module display="Invoicing Tasks"
                            jspPage='<%=SessionManager.getJSPRootURL() + "/admin/invoice/InvoicingTasks.jsp"%>'
                            queryString='<%="module=" + Module.APPLICATION_SPACE%>' />
			<history:page display="View Invoice"
                          jspPage='<%=SessionManager.getJSPRootURL() + "/admin/invoice/ViewInvoice.jsp"%>'
                          queryString='<%="module=" + Module.APPLICATION_SPACE %>' />				
        </history:history>
    </tb:setAttribute>
    <tb:band name="standard">
    </tb:band>
</tb:toolbar>

<div id='content'>
<br />

	<form name="main" action="<%=SessionManager.getJSPRootURL() + "/admin/invoice/ViewInvoiceProcessing.jsp"%>" method="post">
    <input type="hidden" name="theAction">
    <input type="hidden" name="module" value="<%=""+Module.APPLICATION_SPACE%>">
    <input type="hidden" name="action" value="<%=""+Action.VIEW%>">
	<input type="hidden" name="searchOption" value="" >
	<input type="hidden" name="sortField" value="" >
	
	<table width="100%" cellpadding="0" cellspacing="0" border="0">
    <tr>
		<td class="fieldRequired">View Invoice</td>
		
	</tr>
	<tr> <td>&nbsp;</td></tr>
	<tr>
	<%-- BEGIN license attribute based search parameters --%>
	<td align="left">
	<table width="50%" cellpadding="0" cellspacing="0" border="0">
		<tr>
			<td class="fieldNonRequired" align="right" nowrap>Select Invoice :&nbsp;</td>
			<td align="left">
				<%= InvoiceManager.getInvoiceOptionList()%>
			</td>	
			<td  align="right">
				<a href="javascript:submit()"> <img src="<%=SessionManager.getJSPRootURL()%>/images/icons/toolbar-gen-submit_on.gif" alt="Go" border=0 align="absmiddle"> GO </a>
			</td>
		</tr>
		<tr><td>&nbsp;</td></tr>
	</table>	
    </td>
	
	</tr>
	<tr><td colspan="6">
	<channel:channel name='<%="ApplicationSpaceMain_" + applicationSpace.getName()%>' customizable="false">
    	<channel:insert name='<%="InvoiceView_" + applicationSpace.getName()%>'
                    title="Invoice Summary" minimizable="false" closeable="false"
					include="/admin/invoice/include/ViewInvoice.jsp">  
				<% if (request.getParameter("displayInvoice") != null && request.getParameter("displayInvoice").equals("true")) {%>
				<channel:button style="channel" type="create" label='View Details' href="javascript:viewDetails();"/>	
				<channel:button style="channel" type="modify" label='Download Invoice' href="javascript:downloadInvoiceXML();"/>
				<% } %>
				<channel:button style="action" type="cancel" label='Cancel' href="javascript:cancel();"/>	
		</channel:insert>						
	</channel:channel>
	</td>
	
	</tr>
	</table>
	
</template:put>
<%-- End Content --%>

</template:insert>

<template:getSpaceMainMenu />
<template:getSpaceNavBar />