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
|   $Revision: 19055 $
|       $Date: 2009-03-31 16:01:05 -0300 (mar, 31 mar 2009) $
|
|--------------------------------------------------------------------%>
<%@ page 
    contentType="text/html; charset=UTF-8"
    info="Available Members of a Group include page" 
    language="java" 
    errorPage="/errors.jsp"
    import="net.project.base.property.PropertyProvider,
			net.project.resource.Roster, 
            net.project.security.User,
            net.project.security.SessionManager,
            net.project.security.group.Group,
            net.project.security.group.GroupCollection,
            net.project.security.group.AvailableMemberCollection"
%>
<%@ include file="/base/taglibInclude.jsp" %>
<jsp:useBean id="user" class="net.project.security.User" scope="session" />

<%-- Loaded group to display members --%>
<jsp:useBean id="group" type="net.project.security.group.Group" scope="session" />

<jsp:useBean id="availableMembers" class="net.project.security.group.AvailableMemberCollection" scope="page" />

<%
    availableMembers.setSpace(user.getCurrentSpace());
    availableMembers.setGroup(group);
    availableMembers.load();

    // Update all the group-type members with their owning space information
    availableMembers.getGroups().updateWithOwningSpace();

    pageContext.setAttribute("availableMembers", availableMembers, PageContext.PAGE_SCOPE);
%>

<!-- Group Members Channel -->
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr class="channelHeader">
	<td class="channelHeader" colspan="4" style="height:20;padding-left: 7px;"><%=PropertyProvider.get("prm.directory.roles.groupedit.channel.available.title")%></td>
</tr>
<tr>
   <td colspan="3">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" vspace="0">
		<tr class="table-header">
			<th class="over-table">&nbsp;</th>
			<th class="over-table">&nbsp;</th>
			<th align="left" class="over-table"><%=PropertyProvider.get("prm.directory.roles.groupedit.members.name.column")%></th>
			<th align="left" class="over-table"><%=PropertyProvider.get("prm.directory.roles.groupedit.members.description.column")%></th>
		</tr>
	    <tr class="tableLine">
	     	<td colspan="4" class="tableLine"><img src="<%=SessionManager.getJSPRootURL()%>/images/spacers/trans.gif" width="1" height="2" border="0" alt=""></td>
	    </tr>
    	<pnet-xml:transform name="availableMembers" scope="page" stylesheet="/security/group/include/group-member.xsl">
            <%-- The name to give the checkbox input fields --%>
            <pnet-xml:property name="JSPRootURL" value="<%=SessionManager.getJSPRootURL()%>" />
            <pnet-xml:property name="checkboxName" value="availableSelected" />
            <pnet-xml:property name="groupTypeID" value="<%=group.getGroupTypeID().getID()%>" />
        </pnet-xml:transform>
		</table>
	</td>
   
</tr>
</table>
