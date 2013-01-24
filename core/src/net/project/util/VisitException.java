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
package net.project.util;

/**
 * An exception that indicates a problem occurred while visiting
 * an an object using the Visitor pattern.
 * The causing Throwable should be examined to find out the base
 * the reason why this exception was thrown.
 *
 * @author Tim Morrow
 * @since Version 7.4
 */
public class VisitException extends net.project.base.PnetException {

    /**
     * Creates an empty VisitException.
     */
    public VisitException() {
        super();
    }

    /**
     * Creates an VisitException with the specified message.
     * @param message the message
     */
    public VisitException(String message) {
        super(message);
    }

    /**
     * Creates an VisitException with the specified message
     * indicating the throwable that caused this exception.
     * @param message the message
     * @param cause the cause of the exception
     */
    public VisitException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates an VisitException with no message
     * indicating the throwable that caused this exception.
     * @param cause
     */
    public VisitException(Throwable cause) {
        super(cause);
    }

}
