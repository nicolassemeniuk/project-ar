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

 /*
 * InvalidXMLFormatException.java
 *
 * Created on April 11, 2002, 10:31 AM
 */

package net.project.xml;

/**
 *
 * @author  matt
 */
public class InvalidXMLFormatException extends java.lang.Exception {
    
    /**
     * Creates a new instance of <code>InvalidXMLFormatException</code> without detail message.
     */
    public InvalidXMLFormatException() {
    }
    
    
    /**
     * Constructs an instance of <code>InvalidXMLFormatException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public InvalidXMLFormatException(String msg) {
        super(msg);
    }
}