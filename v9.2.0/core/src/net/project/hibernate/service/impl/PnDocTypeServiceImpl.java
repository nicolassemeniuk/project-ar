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
package net.project.hibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.project.hibernate.dao.IPnDocTypeDAO;
import net.project.hibernate.model.PnDocType;
import net.project.hibernate.service.IPnDocTypeService;



/**
 * Created by IntelliJ IDEA.
 * User: Oleg
 * Date: 29.05.2007
 * Time: 23:53:24
 * To change this template use File | Settings | File Templates.
 */
@Service(value="pnDocTypeService")
public class PnDocTypeServiceImpl implements IPnDocTypeService {
	
	@Autowired
    private IPnDocTypeDAO dao;

    public IPnDocTypeDAO getDao() {
        return dao;
    }

    public void setDao(IPnDocTypeDAO dao) {
        this.dao = dao;
    }

    public PnDocType findById(Integer pk) {
        return dao.findByPimaryKey(pk);
    }
}
