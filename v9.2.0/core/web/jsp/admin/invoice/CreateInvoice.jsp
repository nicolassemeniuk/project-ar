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
| Invoice Creator
|--------------------------------------------------------------------%>
<%@ page
    contentType="text/html; charset=UTF-8"
    info="Invoice Creator"
    language="java"
    errorPage="/errors.jsp"
    import="net.project.admin.ApplicationSpace,
            net.project.base.property.PropertyProvider,
            net.project.base.Module,
            net.project.security.Action,
            net.project.security.SessionManager"
%>
<%@ include file="/base/taglibInclude.jsp" %>
<jsp:useBean id="applicationSpace" class="net.project.admin.ApplicationSpace" scope="session" />
<jsp:useBean id="user" class="net.project.security.User" scope="session"/>

<security:checkSpaceAccess userID="<%=user.getID()%>" spaceID="<%=ApplicationSpace.DEFAULT_APPLICATION_SPACE_ID%>"/>
<%
    // Grab some useful values
    String jspRootURL = SessionManager.getJSPRootURL();
    String module = String.valueOf(net.project.base.Module.APPLICATION_SPACE);
%>
<template:insert> 
	<template:put name="title" content='Invoice Creator' direct="true" /> 
	
<%----- import Javascript Files -------------------------------------%>
<template:import type="javascript" src="/src/window_functions.js"/>

<%-- Additional HEAD stuff --%>
<template:put name="head">
    
<script language="javascript">
	var theForm;
	var isLoaded = false;
    var JSPRootURL = '<%= SessionManager.getJSPRootURL() %>';    

function setup() {
    isLoaded = true;
    theForm = self.document.forms["main"];
}

function reset() { self.document.location = JSPRootURL + "/admin/license/Main.jsp?module=<%=Module.APPLICATION_SPACE%>"; }

function tabClick(nextPage) {
	self.document.location = JSPRootURL + nextPage + '?module=<%=Module.APPLICATION_SPACE%>&action=<%=Action.VIEW%>';
}

function help() {
   	openwin_help(JSPRootURL + "/help/Help.jsp?page=admin&section=billing_invoice&section=create");
}

</script>


</template:put>
<%-- End of HEAD --%>

<%-- Begin Content --%>		
<template:put name="content">

<tb:toolbar style="tooltitle" showAll="true"  groupTitle="prm.application.nav.billingmanager">
    <tb:setAttribute name="leftTitle">
        <history:history>
            <history:module display="Invoicing Tasks"
                          jspPage='<%=SessionManager.getJSPRootURL() + "/admin/invoice/InvoicingTasks.jsp"%>'
                          queryString='<%="module=" + Module.APPLICATION_SPACE %>' />				
			<history:page display="Create Invoice"
                          jspPage='<%=SessionManager.getJSPRootURL() + "/admin/invoice/CreateInvoice.jsp"%>'
                          queryString='<%="module=" + Module.APPLICATION_SPACE %>' />				
        </history:history>
    </tb:setAttribute>
    <tb:band name="standard">
    </tb:band>
</tb:toolbar>
<br />
<%-- Tab Bar --%>
<%--<tab:tabStrip>
    <tab:tab label="Manage Existing Licenses" href="javascript:tabClick('/admin/license/LicenseListView.jsp');" />
	<tab:tab label="Licensing Tasks" href="javascript:tabClick('/admin/license/LicensingTasks.jsp');" selected="true" />
</tab:tabStrip>
--%>
<table width="100%" cellpadding="0" cellspacing="0" border="0">
	
	<tr><td colspan="4">&nbsp;</td></tr>
	<tr><td colspan="4">Currently you are able to create an invoice which will automatically include all the non-invoiced entries till date.</td></tr>
	<tr><td colspan="4">Any invoice that you create would be e-mailed to Project.Net immediately.</td></tr>
	<tr><td colspan="4">Please click on create invoice link below to create such invoice.</td></tr>
	<tr><td colspan="4">&nbsp;</td></tr>
	<tr align="left">
		<td>&nbsp;</td>
        <td colspan="2">
        <table>
            <tr>
                <td class="fieldContent" colspan="2">
                    <a href="<%=SessionManager.getJSPRootURL() + "/admin/invoice/CreateInvoiceProcessing.jsp?theAction=createinvoice&module=" + Module.APPLICATION_SPACE + "&action=" + Action.MODIFY%>">
                        Create Invoice
                    </a>
                </td>
            </tr>
		</table>
        </td>
		<td>&nbsp;</td>
    </tr>
</table>

</template:put>
<%-- End Content --%>

</template:insert>
