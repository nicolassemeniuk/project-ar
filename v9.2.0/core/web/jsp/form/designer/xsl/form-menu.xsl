<?xml version="1.0"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:display="xalan://net.project.base.property.PropertyProvider" extension-element-prefixes="display" >

<xsl:output method="html"/>

<xsl:template match="*|/"><xsl:apply-templates/></xsl:template>

<xsl:template match="text()|@*"><xsl:value-of select="."/></xsl:template>

<xsl:template match="FormMenu">
	<table border="0" width="100%" cellspacing="0" cellpadding="0">
	<tr class="channelHeader" align="left">
		<td width="1%"><img src="../../images/icons/channelbar-left_end.gif" width="8" height="15" alt="" border="0"></img></td>
		<th class="channelHeader" align="left" colspan="5">
			<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text><xsl:value-of select="display:get('prm.form.main.channel.available.title')"/>
		</th>
		<td align="right" width="1%"><img src="../../images/icons/channelbar-right_end.gif" width="8" height="15" alt="" border="0"></img></td>
	</tr>
	<tr class="tableHeader" align="left">
		<th class="tableHeader"><img src="{jsp_root_url}/images/spacers/trans.gif" height="18" width="19" border="0"/><xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text></th>
		<th class="tableHeader"><xsl:value-of select="display:get('prm.form.main.abbrev.column')"/></th>
		<th class="tableHeader"><xsl:value-of select="display:get('prm.form.main.name.column')"/></th>
		<th class="tableHeader"><xsl:value-of select="display:get('prm.form.main.description.column')"/></th>
		<th class="tableHeader" colspan="3"><xsl:value-of select="display:get('prm.form.designer.main.description.column')"/></th>
	</tr>
	<tr class="tableLine">
	      <td colspan="7" class="tableLine"><img src="../../images/spacers/trans.gif" width="1" height="2" border="0" alt=""/></td>
	</tr>

	<xsl:apply-templates select="FormMenuEntry"/>
	</table>
</xsl:template>

<xsl:template match="FormMenu/FormMenuEntry">
	<tr class="tableContent" align="left"> 
		<td class="tableContent">
			<xsl:element name="input">
				<xsl:attribute name="type">radio</xsl:attribute>
				<xsl:attribute name="name">selected</xsl:attribute>
				<xsl:attribute name="value"><xsl:value-of select="./id"/></xsl:attribute>
				<xsl:attribute name="owner"><xsl:value-of select="./owner"/></xsl:attribute>
			</xsl:element><xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>			
			<xsl:element name="input">
				<xsl:attribute name="type">hidden</xsl:attribute>
				<xsl:attribute name="name">isOwner</xsl:attribute>
				<xsl:attribute name="value"><xsl:value-of select="./owner"/></xsl:attribute>
			</xsl:element>
			<xsl:element name="input">
				<xsl:attribute name="type">hidden</xsl:attribute>
				<xsl:attribute name="name">ownerId</xsl:attribute>
				<xsl:attribute name="value"><xsl:value-of select="./ownerId"/></xsl:attribute>
			</xsl:element>									
		</td>
		<td class="tableContent"><xsl:value-of select="./abbreviation"/></td>
		<td class="tableContent">
			<xsl:element name="a">
				<xsl:attribute name="href">javascript:modify('<xsl:value-of select="./id"/>', '<xsl:value-of select="./owner"/>');</xsl:attribute>
				<xsl:value-of select="./name"/>
			</xsl:element>
		</td>		
		<td class="tableContent"><xsl:value-of select="./description"/><xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text></td>
		<td class="tableContent"><xsl:value-of select="./publicationStatus"/></td>
		<td class="tableContent">
			<xsl:choose>
                <xsl:when test="./has_workflows = 1">
                    <img src="{jsp_root_url}/images/document/workflow-button.gif" height="18" width="19" border="0" alt=""/><xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <img src="{jsp_root_url}/images/spacers/trans.gif" height="18" width="19" border="0"/><xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
                </xsl:otherwise>
            </xsl:choose>
        </td>
		<td class="tableContent">
			<xsl:choose>
                <xsl:when test="support_external_access = 1">
					<xsl:element name="a">
						<xsl:attribute name="href">javascript:extAlert('<xsl:value-of select="display:get('prm.form.main.externalurl.message')"/>', '<xsl:value-of select="./external_url"/>', Ext.MessageBox.INFO);</xsl:attribute>
						<img src="{jsp_root_url}/images/default/form/eyeicon_1.gif" height="18" width="19" border="0" alt="" title="{display:get('prm.form.main.externaltooltip.message')}"/><xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
					</xsl:element>                
                </xsl:when>
                <xsl:otherwise>
					<img src="{jsp_root_url}/images/spacers/trans.gif" height="18" width="19" border="0"/><xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
                </xsl:otherwise>
            </xsl:choose>
        </td>
	</tr>
	<tr class="tableLine">
	      <td colspan="7" class="tableLine"><img src="../../images/spacers/trans.gif" width="1" height="1" border="0" alt=""/></td>
	</tr>

</xsl:template>

</xsl:stylesheet>
