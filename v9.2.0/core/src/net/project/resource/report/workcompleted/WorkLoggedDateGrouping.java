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

 package net.project.resource.report.workcompleted;

import java.util.Date;

import net.project.base.finder.FinderGrouping;
import net.project.calendar.PnCalendar;
import net.project.persistence.PersistenceException;
import net.project.resource.AssignmentWorkLogEntry;
import net.project.util.DateFormat;

public class WorkLoggedDateGrouping extends FinderGrouping {
    private DateFormat df = DateFormat.getInstance();

    public WorkLoggedDateGrouping(String id, String nameToken, boolean isDefaultGrouping) {
        super(id, nameToken, isDefaultGrouping);
    }

    /**
     * Get the "value" associated with this grouping.  For example, if you were
     * grouping based on assignees, a group value for a certain task might be
     * "John Smith" whereas the grouping value for another task might be "David
     * Jones".  These values are used to indicate when a {@link
     * net.project.base.finder.GroupingIterator} has crossed the boundary of one
     * group and has gone into another.
     *
     * @param currentObject a <code>Object</code> value from which the
     * implementer will determine the grouping value.
     * @return a <code>String</code> representation of the current value of the
     *         object.
     * @throws net.project.persistence.PersistenceException if there is a
     * database error thrown while fetching the Grouping Value.  Not all
     * implementation of getGroupingValue will require this exception.
     */
    public Object getGroupingValue(Object currentObject) throws PersistenceException {
        Date logDate = null;
        if (currentObject != null) {
            logDate = ((AssignmentWorkLogEntry) currentObject).getLogDate();
            PnCalendar cal = new PnCalendar();
            logDate = cal.startOfDay(logDate);
        }

        return (currentObject == null ? null : logDate);
    }

    /**
     * Get the human readable name of this grouping that can be used to signal
     * the user what the current grouping is.  Often, this value can be
     * identical to get grouping value.  This method differs in that it can also
     * be used to add additional text to the group for display purposes.
     *
     * @param currentObject a <code>Object</code> value from which the
     * implementer will determine the grouping value.
     * @return a <code>String</code> value used to get the human-readable form
     *         of the current group.
     * @throws net.project.persistence.PersistenceException if there is a
     * database error thrown while fetching the Grouping Value.  Not all
     * implementation of getGroupingName will require this exception.
     */
    public String getGroupName(Object currentObject) throws PersistenceException {
        return (currentObject == null ? null : df.formatDate(((AssignmentWorkLogEntry)currentObject).getLogDate()));
    }
}
