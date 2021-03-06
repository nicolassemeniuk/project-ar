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
|   $Revision: 15815 $
|       $Date: 2007-04-10 10:04:20 +0530 (Tue, 10 Apr 2007) $
|     $Author: avinash $
|
|--------------------------------------------------------------------%>
<%@ page
    contentType="text/html; charset=UTF-8"
    info=""
    language="java"
    errorPage="/errors.jsp"
    import="net.project.security.SessionManager,
            net.project.base.property.PropertyProvider,
            net.project.base.Module,
            net.project.security.Action,
            net.project.xml.XMLFormatter"
%>
<%@ include file="/base/taglibInclude.jsp"%>
<jsp:useBean id="errorReporter" class="net.project.util.ErrorReporter" scope="request"/>

<html>
<head>
<title></title>

<%-- Import CSS --%>
<template:getSpaceCSS />

<%-- Import Javascript --%>
<template:import type="javascript" src="/src/errorHandler.js" />
<template:import type="javascript" src="/src/checkComponentForms.js" />

<script language="javascript" type="text/javascript">
var theForm;
var JSPRootURL = '<%= SessionManager.getJSPRootURL() %>';

function setup() {
	theForm = self.document.forms[0];
}

function validate() {
    if (!checkTextbox(theForm.scheduleFile, '<%=PropertyProvider.get("prm.schedule.import.xml.choosefile.pleaseselectafile.message")%>')) return false;
    return true;
}

function next() {
    if (validate()) {
        self.document.forms[0].submit();
    }
}

function cancel() {
	theLocation="<%=SessionManager.getJSPRootURL()%>/workplan/taskview?module=<%= net.project.base.Module.SCHEDULE %>";
	self.location = theLocation;
}

function reset() {
	theForm.reset();
}

function help() {
	var helplocation=JSPRootURL+"/help/Help.jsp?page=schedule_import_project_file";
	openwin_help(helplocation);
}

</script>   
</head>

<body class="main" onLoad="setup();" id="bodyWithFixedAreasSupport">
<template:getSpaceMainMenu />
<template:getSpaceNavBar />

<tb:toolbar style="tooltitle" groupTitle="prm.project.nav.schedule">
	<tb:setAttribute name="leftTitle">
		<history:history>
			<history:page displayToken='prm.schedule.import.xml.choosefile.pagetitle'
					jspPage='<%=SessionManager.getJSPRootURL() + "" %>'
					queryString='<%="module="+net.project.base.Module.REPORT%>' />
		</history:history>
	</tb:setAttribute>
	<tb:band name="standard" showAll="true" />
</tb:toolbar>

<div id='content'>

<form method="post" action="<%=SessionManager.getJSPRootURL()%>/schedule/importer/ScheduleImport.htm" enctype="MULTIPART/form-DATA">
    <input type="hidden" name="module" value="<%=Module.SCHEDULE%>">
    <input type="hidden" name="action" value="<%=Action.MODIFY%>">

<table border="0" width="100%" cellspacing="0" cellpadding="0">
<tr class="channelHeader">
    <td width="1%" class="channelHeader"><img src="<%=SessionManager.getJSPRootURL()%>/images/icons/channelbar-left_end.gif" width=8 height=27 alt="" border=0></td>
	<td align="left" class="channelHeader"><display:get name="prm.schedule.import.xml.choosefile.pagetitle" /></td>
    <td width="1%" align=right class="channelHeader"><img src="<%=SessionManager.getJSPRootURL()%>/images/icons/channelbar-right_end.gif" width=8 height=27 alt="" border=0></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>
        <table border="0" cellspacing="0" cellpadding="0" width="100%">

        <%-- Instructions --%>
        <tr class="instructions">
            <td><display:get name="prm.schedule.import.xml.instructions" /></td>
        </tr>
        <tr><td>&nbsp;</td></tr>

        <%-- Errors, if any --%>
<%  if (errorReporter.errorsFound()) { %>
        <tr class="tableContent">
            <td><pnet-xml:transform stylesheet="/base/xsl/error-report.xsl" name="errorReporter" scope="request" /></td>
        </tr>
        <tr class="tableContent"><td>&nbsp;</td></tr>
<%  } %>

        <%-- Select XML File Input --%>
        <tr class="tableContent">
            <td>
                <label class="fieldRequired">
                    <display:get name="prm.schedule.import.xml.choosefile.choosempd.message" />&nbsp;
                    <input type="file" name="scheduleFile" size="50">
                </label>
            </td>
        </tr>

        </table>
    </td>
    <td>&nbsp;</td>
</tr>
</table>
<p>
<tb:toolbar style="action" showLabels="true">
	<tb:band name="action">
		<tb:button type="cancel" />
		<tb:button type="next" />
	</tb:band>
</tb:toolbar>
</form>
<%@ include file="/help/include_outside/footer.jsp" %>

<template:getSpaceJS />
</body>
</html>
