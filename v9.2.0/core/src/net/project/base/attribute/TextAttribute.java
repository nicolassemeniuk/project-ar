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
package net.project.base.attribute;

import net.project.datatransform.csv.transformer.AbstractDataTransformer;
import net.project.datatransform.csv.transformer.TextDataTransformer;

/**
 * Represents the Attribute for Textual Nature
 *
 * @author deepak
 */
public class TextAttribute extends AbstractAttribute {
    /** Sets the maximum length for the Attribute */
    private int maxLength = -1;

    /**
     * Default, no-arg constructor for Bean Spec Compliance.
     * By default, the attribute is not Required
     * NOTE, all object that extend this abstract class must setType to the appropriate type
     * @since Gecko
     */
    public TextAttribute() {
        super();
    }

    /**
     * Construct a new attribute with the ID and displayName specified.
     * By default, this attribute will not be required.
     *
     * @param id     The ID of the attribute
     * @param displayName
     *               The displayName of the attribute
     * @since Gecko
     */
    public TextAttribute(String id, String displayName) {
        super(id, displayName);
    }

    /**
     * Construct a new attribute with the ID and displayName specified.
     * By default, this attribute will not be required.
     *
     * @param id     The ID of the attribute
     * @param displayName
     * @param required True if the attribute is required
     * @since Gecko
     */
    public TextAttribute(String id, String displayName, boolean required) {
        super(id, displayName, required);
    }

    /**
     * Contructs a new object with the ID DisplayName , Maximum Length passed on
     * as the parameter.
     *
     * @param id String
     * @param displayName  String Display Name for the Attribute
     * @param maxLength int
     */
    public TextAttribute(String id, String displayName, int maxLength) {
        super(id, displayName);
        this.maxLength = maxLength;
    }

    /**
     * Must be implemented by each subclass to initiale the Attribute Type
     * member.
     *
     * @since Gecko
     */
    protected void initializeType() {
        setType(AttributeType.TEXT);
    }

    public AbstractDataTransformer getDataTransformer(String id, IAttribute iAttribute) {
        return new TextDataTransformer(id, iAttribute);
    }

    /**
     * Returns the maximum length the Attribute can have.
     *
     * @return int
     */
    public int getMaxLength() {
        if (maxLength < 0) {
            return Integer.MAX_VALUE;
        } else {
            return this.maxLength;
        }
    }
}

