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
    info="User Details"
    language="java"
    errorPage="/errors.jsp"
    import="net.project.base.property.PropertyProvider,
			net.project.admin.ApplicationSpace,
			net.project.base.Module,
            net.project.resource.Person,
            net.project.security.User,
            net.project.security.Action,
            net.project.security.SecurityProvider,
            net.project.security.SessionManager,
            net.project.xml.XMLFormatter"
%>
<%@ include file="/base/taglibInclude.jsp" %>
<jsp:useBean id="applicationSpace" class="net.project.admin.ApplicationSpace" scope="session" />
<jsp:useBean id="personalSpace" class="net.project.space.PersonalSpace" scope="session" />
<jsp:useBean id="securityProvider" class="net.project.security.SecurityProvider" scope="session" />
<jsp:useBean id="user" class="net.project.security.User" scope="session" />

<%----- Security Verification ---------------------------------------
     We are viewing a specific objectID on the UserView page, but we
     are not passing that object with a parameter name of "id".  This
     is intentional.  It is done because default permission for 
     "Person" objects are not defined.
     
     At this time, we were not prepared to create permissions for 
     person objects, so the id is passed as the "userID" parameter 
     instead.
  -------------------------------------------------------------------%>
<security:verifyAccess action="view"
                       module="<%=net.project.base.Module.APPLICATION_SPACE%>" />
<%
    String jspRootURL = SessionManager.getJSPRootURL();
    int module = Module.APPLICATION_SPACE;
    String userID = request.getParameter("userID");
	
%>

<template:getDoctype />
<html>
<head>
<title><display:get name="prm.global.application.title" /></title>
<%----- Import CSS --------------------------------------------------%>
<template:getSpaceCSS />

<%----- import Javascript Files -------------------------------------%>
<template:getSpaceJS space="application" />

<script language="JavaScript">
    JSPRootURL = '<%= SessionManager.getJSPRootURL() %>';
	    
	function setup() {
    	isLoaded = true;
	}
    
    function cancel() {
        self.document.location = JSPRootURL + '/admin/license/LicenseDetailView.jsp?module=<%=Module.APPLICATION_SPACE%>&action=<%=Action.VIEW%>';
    }

    function help() {
		var helplocation = JSPRootURL + "/help/Help.jsp?page=admin_license&section=userview";
        openwin_help(helplocation);
    }

    function modify() {
	    self.document.location = JSPRootURL + '/admin/license/UserListProcessing.jsp?module=<%=module%>&action=<%=Action.MODIFY%>&theAction=modify&selected=<%=userID%>';	
    }

    function reset() {
        self.document.location = JSPRootURL + '/admin/license/UserView.jsp?module=<%=module%>&action=<%=Action.VIEW%>&userID=<%=userID%>';
    }
</script>
</head>
<body class="main" onload="setup();" id="bodyWithFixedAreasSupport">
<template:getSpaceMainMenu />

<%----- Set up the toolbar for the page -----------------------------%>

<tb:toolbar style="tooltitle" showAll="true" groupTitle="prm.application.nav.licensemanager">
    <tb:setAttribute name="leftTitle">
		<history:history>
			<%	if(user.isApplicationAdministrator()) {	%>
			<history:business display="<%= applicationSpace.getName()%>"
                              jspPage='<%=SessionManager.getJSPRootURL() + "/admin/Main.jsp"%>'
                              queryString='<%="module=" + Module.APPLICATION_SPACE%>' />
			<%	} else { %>				  
			<history:business display="<%= personalSpace.getName()%>"
                              jspPage='<%=SessionManager.getJSPRootURL() + "/personal/Main.jsp"%>'
                              queryString='<%="module=" + Module.PERSONAL_SPACE%>' />
			<% } %>				  
			<history:module display='<%=PropertyProvider.get("prm.license.module.history")%>'
                              jspPage='<%=SessionManager.getJSPRootURL() + "/admin/license/Main.jsp"%>'
                              queryString='<%="module=" + Module.APPLICATION_SPACE%>' />
            <history:page display='<%=PropertyProvider.get("prm.license.userview.module.history")%>' 
							  jspPage='<%=SessionManager.getJSPRootURL() + "/admin/license/UserView.jsp"%>'
                          	  queryString='<%="module=" + Module.APPLICATION_SPACE + "&action=" + Action.VIEW%>' />
        </history:history>
		
    </tb:setAttribute>
    <tb:band name="standard">
	<%	if(user.isApplicationAdministrator()) {	%>		
        <tb:button type="modify" />
	<%	} %>	
    </tb:band>
</tb:toolbar>

<div id='content'>

<form method="post" action="UserListProcessing.jsp">
<input type="hidden" name="theAction">
<input type="hidden" name="module" value="<%=Module.PERSONAL_SPACE%>">
<input type="hidden" name="action" value="<%=Action.VIEW%>">

<%-- This table provides the top and bottom horizontal rules.  Unfortunately,
     this code cannot be inside of the stylesheet because the stylesheet won't
     accept taglibs.  --%>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr class="channelHeader">
        <td width="1%"><img src="<%=SessionManager.getJSPRootURL()%>/images/icons/channelbar-left_end.gif" width="8" height="15" border="0"/></td>
        <td colspan="4" nowrap align="left" class="ChannelHeader">&nbsp;</td>
        <td width="1%" align="right"><img src="<%=SessionManager.getJSPRootURL()%>/images/icons/channelbar-right_end.gif" width="8" height="15" alt="" border="0"></td>
    </tr>
    <%
        //Get the information about the user id passed to this page
        Person person = new Person();

        person.setID(userID);
        person.load();

        //Using the XML information from person and an XSL stylesheet, construct
        //the page.
        XMLFormatter xmlFormatter = new XMLFormatter();
        xmlFormatter.setStylesheet("/admin/license/xsl/user-details.xsl");
        xmlFormatter.setXML(person.getXML());

        //Output the formatted html to the page
        out.print(xmlFormatter.getPresentation());
    %>
</table>

</form>

<tb:toolbar style="action" showLabels="true" bottomFixed="true">
	<tb:band name="action">
		<tb:button type="cancel"/>
	</tb:band>
</tb:toolbar>

</div>


<template:getSpaceNavBar space="application"/>
</body>
</html>
