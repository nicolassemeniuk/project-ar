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

 /*--------------------------------------------------------------------------------------+
|
|    $RCSfile$
|   $Revision: 18397 $
|       $Date: 2008-11-21 10:47:28 -0200 (vie, 21 nov 2008) $
|     $Author: umesha $
|
+--------------------------------------------------------------------------------------*/
package net.project.base.finder;

import java.io.Serializable;

import net.project.base.property.PropertyProvider;

/**
 * This class defines a database column name and a token to look up a human
 * readable name for that column.  These classes are optional if you just want
 * to create a finder.
 *
 * @author Matthew Flower
 * @since Version 7.4
 */
public class ColumnDefinition implements Serializable {

    /**
     * The ID of the column for persistent purposes.
     */
    private final String id;

    /**
     * The name of the column as it appears in the SQL statement.
     */
    private final String columnName;

    /**
     * The token that provides name of the column as it would appear to a human reader.
     */
    private final String nameToken;

    /**
     * Creates a new ColumnDefinition that may be used for persistence.
     * The id should uniquely identify this column among other columns in
     * the same context.
     *
     * @param id the unique ID of this column
     * @param columnName a <code>String</code> value which contains the database
     * identifier for this token.
     * @param nameToken a <code>String</code> value which contains a property
     * name that can be used to look up the human readable name of this column
     * definition.  For example, if you column name was lastName, this token
     * might be prm.global.person.columndefinition.lastName, which might point
     * to the string "Last Name".
     */
    public ColumnDefinition(String id, String columnName, String nameToken) {
        this.id = id;
        this.columnName = columnName;
        this.nameToken = nameToken;
    }
    /**
     * Creates a new ColumnDefinition for use in a SQL statement.
     * It may not be used for persistence since no ID is defined.
     *
     * @param columnName the name of this column for use in a SQL statement
     * @param nameToken the token used to provide the name of this column
     */
    public ColumnDefinition(String columnName, String nameToken) {
        this(null, columnName, nameToken);
    }

    /**
     * Returns the unique ID of this column definition.
     *
     * @return the ID
     */
    public String getID() {
        return this.id;
    }
    /**
     * Get the database column name for this column definition.
     *
     * @return a <code>String</code> object containing the database column name
     * for this column definition.
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Returns the token used for displaying the name of this column definition.
     * @return the token name
     */
    public String getNameToken() {
        return this.nameToken;
    }

    /**
     * Get the human-readable name of this column definition.
     *
     * @return a <code>String</code> value containing the language-specific
     * representation of the current column.  A token value to look up this
     * column name was provided when the <code>ColumnDefinition</code> object
     * was originally constructed.
     */
    public String getName() {
        return PropertyProvider.get(nameToken);
    }


    // equals() and hashCode() auto-generated by IntelliJ
    // When adding a new property, regenerate rather than hand-edit

    /**
     * Indicates whether the specified object is equal to this ColumnDefintion.
     * The specified object is equal if it is a ColumnDefinition with matching
     * ID, column name and name token, or where any of those are null, this
     * ColumnDefinition must have equivalent null values.
     *
     * @param o the object to compare
     * @return true if the object is a ColumnDefinition equal to this one
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColumnDefinition)) return false;

        final ColumnDefinition columnDefinition = (ColumnDefinition) o;

        if (columnName != null ? !columnName.equals(columnDefinition.columnName) : columnDefinition.columnName != null) return false;
        if (id != null ? !id.equals(columnDefinition.id) : columnDefinition.id != null) return false;
        if (nameToken != null ? !nameToken.equals(columnDefinition.nameToken) : columnDefinition.nameToken != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (id != null ? id.hashCode() : 0);
        result = 29 * result + (columnName != null ? columnName.hashCode() : 0);
        result = 29 * result + (nameToken != null ? nameToken.hashCode() : 0);
        return result;
    }

}