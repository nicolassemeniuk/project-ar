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

 /*-----------------------------------------------------------------------------+
|
|    $RCSfile$
|   $Revision: 18397 $
|       $Date: 2008-11-21 10:47:28 -0200 (vie, 21 nov 2008) $
|     $Author: umesha $
|
+-----------------------------------------------------------------------------*/
package net.project.schedule.report;

/**
 * An individual user in a user filter list.
 *
 * @author Matthew Flower
 * @since Version 7.4
 */
public class FilterUser {
    /** The database id for the user. */
    private String id;
    /** The full name of the user we are going to display in the list. */
    private String displayName;
    /**
     * Whether or not this user has been selected for inclusion in the where
     * clause.
     */
    private boolean selected = false;

    /**
     * Standard constructor.
     *
     * @param id a <code>String</code> value containing the primary key of this
     * user in the database.
     * @param displayName a <code>String</code> value containing the full name
     * of the user.
     */
    public FilterUser(String id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    /**
     * Get the primary key of this user's person record in the database.
     *
     * @return a <code>String</code> value containing the primary key of this
     * user's person record in the database.
     */
    public String getID() {
        return id;
    }

    /**
     * Gets the full name of the user.
     *
     * @return a <code>String</code> value containing the user's full name.
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Indicates whether this user was selected for inclusion in the where
     * clause.
     *
     * @return a <code>boolean</code> value indicating whether the user id
     * should be included in the where clause.
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Indicate whether this user should be included in the where clause
     * generated by this filter.
     *
     * @param selected a <code>boolean</code> value indicating whether this user
     * should be included in the where clause generated by the UserFilter.
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}