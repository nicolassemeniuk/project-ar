package net.project.hibernate.dao;

import java.util.ArrayList;

import net.project.financial.PnFinancialSpaceList;
import net.project.hibernate.model.PnFinancialSpace;

public interface IPnFinancialSpaceDAO extends IDAO<PnFinancialSpace, Integer> {
	
	/**
	 * Obtain a certain financial space.
	 * @param financialSpaceId the id from the financial space to obtain.
	 * @returna a financial space.
	 */
	public PnFinancialSpace getFinancialSpaceById(Integer financialSpaceId);

	/**
	 * Get a list of financial spaces from an id collection.
	 * @param additionalSpaceIDCollection the collection of id's.
	 * @return a list of financial spaces.
	 */
	public PnFinancialSpaceList getFinancialSpacesByIds(ArrayList<Integer> additionalSpaceIDCollection);

}
