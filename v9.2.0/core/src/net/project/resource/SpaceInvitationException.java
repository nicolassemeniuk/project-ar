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
|     $RCSfile$
|    $Revision: 18397 $
|        $Date: 2008-11-21 10:47:28 -0200 (vie, 21 nov 2008) $
|      $Author: umesha $
|                                                                       
+----------------------------------------------------------------------*/
package net.project.resource;

/**
 * Indicates some problem occurred inviting users to a space.
 */
public class SpaceInvitationException extends net.project.base.PnetException {

    /**
     * Constructs an empty SpaceInvitationException.
     */
    public SpaceInvitationException() {
        super();
    }

    /**
     * Constructs an empty SpaceInvitationException with the specified message.
     * @param message the message
     */
    public SpaceInvitationException(String message) {
        super(message);
    }

    /**
     * Constructs an empty SpaceInvitationException with the specified message, indicating
     * the exception was caused by the specified throwable.
     * @param message the message
     * @param cause the exception that caused this exception
     */
    public SpaceInvitationException(String message, Throwable cause) {
        super(message, cause);
    }
}


