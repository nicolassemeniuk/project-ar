/* 
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
*/

 package net.project.resource;

import java.io.Serializable;

import net.project.xml.XMLFormatter;


/**  
    A list of Persons for use within JSP pages.      
*/
public class PersonListBean extends PersonList implements Serializable
{
    /** Contains XML formatting information and utilities specific to this object **/
    protected XMLFormatter m_formatter;
    /** Sets the current display mode for the user */
    private String displayMode = null;


    /** 
     Construct an empty roster
   */
    public PersonListBean()
    {
        m_formatter = new XMLFormatter();
    }


    /**
     * Set's the display mode into the PersonListBean.  '
     * Used by the JSP to decide whether to display search results.
     * Available modes are ("initial", "search")
     * 
     * @param mode
     */
    public void setDisplayMode (String mode) {
        this.displayMode = mode;
    }

    /**
     * Get's the display mode from the PersonListBean.  Used by the JSP to 
     * decide whether to display search results.
     * Available modes are ("initial", "search")
     * 
     */
    public String getDisplayMode () {
        return this.displayMode;
    }



    /**
    * Gets the presentation of the component
    * This method will apply the stylesheet to the XML representation of the component and
    * return the resulting text
    * 
    * @return presetation of the component
    */
    public String getPresentation()
    {
        return m_formatter.getPresentation(getXML());
    }


    /**
     * Sets the stylesheet file name used to render this component.
     * This method accepts the name of the stylesheet used to convert the XML representation of the component
     * to a presentation form.
     *
     * @param styleSheetFileName name of the stylesheet used to render the XML representation of the component
     */
    public void setStylesheet(String styleSheetFileName)
    {
        m_formatter.setStylesheet(styleSheetFileName);
    }


}

