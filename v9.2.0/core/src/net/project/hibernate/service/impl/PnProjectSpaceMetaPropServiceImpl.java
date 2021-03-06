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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.project.hibernate.dao.IPnProjectSpaceMetaPropDAO;
import net.project.hibernate.model.PnProjectSpaceMetaProp;
import net.project.hibernate.service.IPnProjectSpaceMetaPropService;

@Service(value = "pnProjectSpaceMetaPropService")
public class PnProjectSpaceMetaPropServiceImpl implements IPnProjectSpaceMetaPropService {
	
	@Autowired
    private IPnProjectSpaceMetaPropDAO pnProjectSpaceMetaPropDAO;

    public void setPnProjectSpaceMetaPropDAO(IPnProjectSpaceMetaPropDAO pnProjectSpaceMetaPropDAO) {
        this.pnProjectSpaceMetaPropDAO = pnProjectSpaceMetaPropDAO;
    }

    public PnProjectSpaceMetaProp getProjectSpaceMetaProp(Integer pnProjectSpaceMetaPropId) {
        return pnProjectSpaceMetaPropDAO.findByPimaryKey(pnProjectSpaceMetaPropId);
    }

    public Integer saveProjectSpaceMetaProp(PnProjectSpaceMetaProp pnProjectSpaceMetaProp) {
        return pnProjectSpaceMetaPropDAO.create(pnProjectSpaceMetaProp);
    }

    public void deleteProjectSpaceMetaProp(PnProjectSpaceMetaProp pnProjectSpaceMetaProp) {
        pnProjectSpaceMetaPropDAO.delete(pnProjectSpaceMetaProp);
    }

    public void updateProjectSpaceMetaProp(PnProjectSpaceMetaProp pnProjectSpaceMetaProp) {
        pnProjectSpaceMetaPropDAO.update(pnProjectSpaceMetaProp);
    }

    public List<PnProjectSpaceMetaProp> getAllProjectSpaceMetaProperties() {
        return pnProjectSpaceMetaPropDAO.findAll();
    }

    public PnProjectSpaceMetaProp getProjectSpaceMetaPropByName(String propertyName) {
        return pnProjectSpaceMetaPropDAO.getProjectSpaceMetaPropByName(propertyName);
    }
}
