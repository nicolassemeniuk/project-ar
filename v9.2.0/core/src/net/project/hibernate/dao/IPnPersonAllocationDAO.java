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
package net.project.hibernate.dao;

import java.util.Date;
import java.util.List;

import net.project.hibernate.model.PnPersonAllocation;
import net.project.hibernate.model.PnPersonAllocationPK;


public interface IPnPersonAllocationDAO extends IDAO<PnPersonAllocation, PnPersonAllocationPK> {
	
	public List getResourceAllocationEntryByPerson(Integer businesId, Integer personId, Date startDate, Date endDate);
	
	public List getResourceAllocationEntryByProject(Integer businesId,  Integer projectId,  Date startDate, Date endDate);
	
	@Deprecated
	public List getResourceAllocationSumary (Integer businesId, Date startDate, Date endDate);
		
	public List getResourceAllocationSumary (Integer resourceId, Integer businesId, Date startDate, Date endDate);
	
	public void saveResourceAllocations(List<PnPersonAllocation> allocations);
	
	public PnPersonAllocation getResourceAllocationDetails(Integer resourceId, Integer projectId, Date startDate, Date endDate);
}
