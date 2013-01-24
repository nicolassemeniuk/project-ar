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
package net.project.hibernate.service;

import java.util.Date;
import java.util.List;

import net.project.resource.Assignment;
import net.project.resource.TimesheetStatus;

public interface IPnTimesheetService {
    public Integer saveObject(String id, String person_id, String approve_reject_by_id,
    Date start_date, Date end_date, Integer work, Integer workUnits, TimesheetStatus status,
    String recordStatus, String comments, List<Assignment> assignmentList);
    public void removeObject(String id);
}