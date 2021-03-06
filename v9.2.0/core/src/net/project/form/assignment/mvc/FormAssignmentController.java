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
|   $Revision: 15790 $
|       $Date: 2007-04-02 07:17:33 +0530 (Mon, 02 Apr 2007) $
|     $Author: sjmittal $
|
+-----------------------------------------------------------------------------*/
package net.project.form.assignment.mvc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.project.base.mvc.Controller;
import net.project.base.mvc.Handler;
import net.project.base.mvc.IView;
import net.project.security.SecurityProvider;

/**
 * Servlet that receives a request for a page in the form module, loads a
 * handler to deal with the request, and redirects the user to an appropriate
 * view.  This object is a simple implementation of the "Front Controller"
 * pattern.
 *
 * @author Sachin Mittal
 * @since 8.4
 */
public class FormAssignmentController extends Controller {
    /**
     * Process the user's request and serve up the appropriate page.
     *
     * @param request a <code>HttpServletRequest</code> object which contains
     * the parameters submitted to this page.
     * @param response a <code>HttpServletResponse</code> object which we will
     * use to send the response to the user.
     * @throws Exception if any error occurs while processing the request.
     */
    public void controlRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        //Requisite objects
        SecurityProvider sp = (SecurityProvider)request.getSession().getAttribute("securityProvider");

        //Handle the request, checking security and doing any operations that
        //are required.
        Handler handler = new FormAssignmentHandlerMapping().getHandler(request);
        handler.validateSecurity(sp.getCheckedModuleID(), sp.getCheckedActionID(), sp.getCheckedObjectID(), request);
        Map model = handler.handleRequest(request, response);

        // Now render the view
        IView view = handler.getView();
        view.render(model, request, response);
    }
}
