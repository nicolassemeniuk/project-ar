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

-- Alter table PN_PLAN_VERSION to add INLINE_EDITING_WARNING column
ALTER TABLE PN_PLAN_VERSION
ADD (INLINE_EDITING_WARNING NUMBER(1,0) DEFAULT 1)
/

-- Alter table PN_PLAN_VERSION to add UN_ASSIGNED_WORKCAPTURE column
ALTER TABLE PN_PLAN_VERSION
ADD (UN_ASSIGNED_WORKCAPTURE NUMBER(1,0) DEFAULT 0)
/

-- Alter table PN_PLAN_VERSION to add HOURS_PER_DAY column
ALTER TABLE PN_PLAN_VERSION
ADD (HOURS_PER_DAY NUMBER DEFAULT 8)
/

-- Alter table PN_PLAN_VERSION to add HOURS_PER_WEEK column
ALTER TABLE PN_PLAN_VERSION
ADD (HOURS_PER_WEEK NUMBER DEFAULT 40)
/

-- Alter table PN_PLAN_VERSION to add DAYS_PER_MONTH column
ALTER TABLE PN_PLAN_VERSION
ADD (DAYS_PER_MONTH NUMBER DEFAULT 20)
/

-- Alter table PN_PLAN_VERSION to add RESOURCE_CALENDAR column
ALTER TABLE PN_PLAN_VERSION
ADD (RESOURCE_CALENDAR VARCHAR2(50) DEFAULT 'PERSONAL')
/