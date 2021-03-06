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

 /*----------------------------------------------------------------------+
|                                                                       
|    $RCSfile$
|   $Revision: 18397 $
|       $Date: 2008-11-21 10:47:28 -0200 (vie, 21 nov 2008) $
|     $Author: umesha $
|                                                                       
+----------------------------------------------------------------------*/

package net.project.base.attribute;

public  class BooleanAttributeValue extends AbstractAttributeValue{
   private DomainValues domainValues = new DomainValues();
   private String id;
   private String displayName=null;
   private IAttribute iAttribute;

    /****************Constructors *************** */ 

   public BooleanAttributeValue(IAttribute iAttribute){
       this.iAttribute=iAttribute;
   }

   /**
    * Returns the DomainValues for the current Boolean Object
    * @return DomainValues  
    */   
   public DomainValues getBooleanValue(){
        return this.domainValues;
    }

   /**
    * Adds the DomainValue for the current Boolean Object
    * @param domainValue
    */   
   public void setBooleanValue(DomainValue domainValue){
        this.domainValues.add(domainValue);
    }

   /**
    * Returns the DomainValues for the current Boolean Object
    * @return DomainValues  
    */   
   public IAttribute getAttribute(){
       return this.iAttribute;
   }

}

