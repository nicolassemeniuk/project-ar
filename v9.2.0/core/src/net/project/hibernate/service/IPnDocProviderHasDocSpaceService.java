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

import net.project.hibernate.model.PnDocProviderHasDocSpace;
import net.project.hibernate.model.PnDocProviderHasDocSpacePK;

public interface IPnDocProviderHasDocSpaceService {
	
	/**
	 * @param pnDocProviderHasDocSpaceId 
	 * @return PnDocProviderHasDocSpace bean
	 */
	public PnDocProviderHasDocSpace getDocProviderHasDocSpace(PnDocProviderHasDocSpacePK pnDocProviderHasDocSpaceId);
	
	/**
	 * Saves new PnDocProviderHasDocSpace
	 * @param PnDocProviderHasDocSpace object we want to save
	 * @return primary key for saved space and person
	 */
	public PnDocProviderHasDocSpacePK saveDocProviderHasDocSpace(PnDocProviderHasDocSpace pnDocProviderHasDocSpace);
	
	/**
	 * Deletes PnDocProviderHasDocSpace from database
	 * @param PnDocProviderHasDocSpace object we want to delete
	 */
	public void deleteDocProviderHasDocSpace(PnDocProviderHasDocSpace pnDocProviderHasDocSpace);
	
	/**
	 * Updates PnDocProviderHasDocSpace
	 * @param PnDocProviderHasDocSpace object we want to update
	 */
	public void updateDocProviderHasDocSpace(PnDocProviderHasDocSpace pnDocProviderHasDocSpace);

}
