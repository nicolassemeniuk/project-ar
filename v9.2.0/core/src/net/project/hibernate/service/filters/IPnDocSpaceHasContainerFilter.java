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
package net.project.hibernate.service.filters;

import net.project.hibernate.model.PnDocSpaceHasContainer;

/**
 * Created by IntelliJ IDEA.
 * User: Oleg
 * Date: 24.05.2007
 * Time: 22:57:24
 * To change this template use File | Settings | File Templates.
 */
public interface IPnDocSpaceHasContainerFilter {
    boolean isSuitable(PnDocSpaceHasContainer object);
}
