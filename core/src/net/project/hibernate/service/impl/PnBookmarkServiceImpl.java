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

import net.project.hibernate.dao.IPnBookmarkDAO;
import net.project.hibernate.model.PnBookmark;
import net.project.hibernate.service.IPnBookmarkService;


@Service(value="pnBookmarkService")
public class PnBookmarkServiceImpl implements IPnBookmarkService {
	
	@Autowired
    private IPnBookmarkDAO dao;

    public IPnBookmarkDAO getDao() {
        return dao;
    }

    public void setDao(IPnBookmarkDAO dao) {
        this.dao = dao;
    }

    public void save(PnBookmark object) {
        dao.create(object);
    }

    public void update(PnBookmark object) {
        dao.update(object);
    }

    public PnBookmark getByPK(Integer pk) {
        return dao.findByPimaryKey(pk);
    }
}