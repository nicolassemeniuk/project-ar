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

import net.project.hibernate.model.PnWikiHistory;


public interface IPnWikiHistoryService {

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param pnWikiPage a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Integer save(net.project.hibernate.model.PnWikiHistory pnWikiHistory);	

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param pnWeblog a transient instance containing updated state
	 */
	public void update(net.project.hibernate.model.PnWikiHistory pnWikiHistory);
	
	public net.project.hibernate.model.PnWikiHistory get(java.lang.Integer key);
	
	public java.util.List<net.project.hibernate.model.PnWikiHistory> findAll ();
	
	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param pnWeblog the instance to be removed
	 */
	public void delete(net.project.hibernate.model.PnWikiHistory pnWikiHistory);
	
	public List<PnWikiHistory> findHistoryWithPageId(Integer wikiPageID);
	
	
	/**
	 * Get history of the project wiki page
	 * @param projectId project identifier
	 * @param startDate 
	 * @param endDate
	 * @return List of PnWikiHistory instances
	 */
	public List<PnWikiHistory> getWikiHistory(Integer projectId, Date startDate, Date endDate);  

	/**
	 * Update all history records with wikiPageId field set to oldWikiPageId to new newWikiPageId value.
	 * @param newWikiPageId
	 * @param oldWikiPageId
	 */
	public void updateWikiPageIds(Integer newWikiPageId, Integer oldWikiPageId);

}