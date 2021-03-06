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

 /*----------------------------------------------------------------------+
|                                                                       
|    $RCSfile$
|   $Revision: 18397 $
|       $Date: 2008-11-21 10:47:28 -0200 (vie, 21 nov 2008) $
|     $Author: umesha $
|                                                                       
+----------------------------------------------------------------------*/
package net.project.workflow;

import net.project.space.Space;
import net.project.xml.XMLFormatter;

/**
  * Expands upon Transition to provide presentation
  * facilities.
  */
public class TransitionBean extends Transition {

    /** Current space */
    private Space space;
    private XMLFormatter xmlFormatter;

    /**
      * Creates new TransitionBean
      */
    public TransitionBean() {
        this.xmlFormatter = new XMLFormatter();
    }
    
   /**
      * Set the current space
      * @param space the current space
      */
    public void setSpace(Space space) {
        this.space = space;
    }

    /**
      * Set the stylesheet to use
      * @param stylesheetFileName the stylesheet path
      */
    public void setStylesheet(String stylesheetFileName) {
        // set the XML formatter stylesheet
        xmlFormatter.setStylesheet(stylesheetFileName);
    }

    /**
      * Get propreties presentation based on the
      * current stylesheet and properties XML
      * @return properties presentation
      */
    public String getPropertiesPresentation() {
        return xmlFormatter.getPresentation(getXML());
    }

   /**
      * Check to see if the transition can be removed
      * and return the results of those checks
      * @return the HTML results
      */
    public String getPrepareRemovePresentation() {
        return getPrepareRemoveErrorsPresentation();
    }

    /**
      * Get the results of removing the transition
      * @return the HTML results
      */
    public String getRemoveResultPresentation() {
        return getRemoveResultPresentation();
    }

}
