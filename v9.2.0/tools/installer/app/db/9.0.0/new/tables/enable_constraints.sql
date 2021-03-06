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
-- prompt  Enabling foreign key constraints for PN_OBJECT...
alter table PN_OBJECT enable constraint OBJECT_FK1
/
alter table PN_OBJECT enable constraint OBJECT_FK2
/
-- prompt  Enabling foreign key constraints for PN_PERSON...
alter table PN_PERSON enable constraint PERSON_OBJ_FK
/
-- prompt  Enabling foreign key constraints for PN_ADDRESS...
alter table PN_ADDRESS enable constraint ADDRESS_FK1
/
alter table PN_ADDRESS enable constraint ADDRESS_OBJ_FK
/
-- prompt  Enabling foreign key constraints for PN_AUTHENTICATOR...
alter table PN_AUTHENTICATOR enable constraint PN_AUTHENTICATOR_FK1
/
-- prompt  Enabling foreign key constraints for PN_BRAND...
alter table PN_BRAND enable constraint PN_BRAND_FK1
/
-- prompt  Enabling foreign key constraints for PN_BRAND_SUPPORTS_LANGUAGE...
alter table PN_BRAND_SUPPORTS_LANGUAGE enable constraint PN_BRAND_SUPPORTS_LANGUAGE_FK1
/
-- prompt  Enabling foreign key constraints for PN_CALENDAR...
alter table PN_CALENDAR enable constraint CALENDAR_OBJ_FK
/
-- prompt  Enabling foreign key constraints for PN_CLASS...
alter table PN_CLASS enable constraint CLASS_FK1
/
alter table PN_CLASS enable constraint CLASS_OBJ_FK
/
-- prompt  Enabling foreign key constraints for PN_CLASS_DOMAIN...
alter table PN_CLASS_DOMAIN enable constraint CLASS_DOMAIN_OBJ_FK
/
-- prompt  Enabling foreign key constraints for PN_CLASS_DOMAIN_VALUES...
alter table PN_CLASS_DOMAIN_VALUES enable constraint CLASS_DOMAIN_VALUES_FK1
/
alter table PN_CLASS_DOMAIN_VALUES enable constraint CLASS_DOMAIN_VAL_OBJ_FK
/
-- prompt  Enabling foreign key constraints for PN_CLASS_FIELD_PROPERTY...
alter table PN_CLASS_FIELD_PROPERTY enable constraint CLASS_FIELD_PROPERTY_FK1
/
-- prompt  Enabling foreign key constraints for PN_CLASS_TYPE_ELEMENT...
alter table PN_CLASS_TYPE_ELEMENT enable constraint CLASS_TYPE_ELEMENT_FK1
/
alter table PN_CLASS_TYPE_ELEMENT enable constraint CLASS_TYPE_ELEMENT_FK2
/
-- prompt  Enabling foreign key constraints for PN_GROUP...
alter table PN_GROUP enable constraint PN_GROUP_FK2
/
alter table PN_GROUP enable constraint PN_GROUP_FK3
/
-- prompt  Enabling foreign key constraints for PN_DEFAULT_OBJECT_PERMISSION...
alter table PN_DEFAULT_OBJECT_PERMISSION enable constraint DEFAULT_OBJ_PERM_FK1
/
alter table PN_DEFAULT_OBJECT_PERMISSION enable constraint DEFAULT_OBJ_PERM_FK2
/
-- prompt  Enabling foreign key constraints for PN_DIRECTORY_HAS_PERSON...
alter table PN_DIRECTORY_HAS_PERSON enable constraint DIRECTORY_PERSON_FK1
/
alter table PN_DIRECTORY_HAS_PERSON enable constraint DIRECTORY_PERSON_FK2
/
-- prompt  Enabling foreign key constraints for PN_DOC_CONTAINER...
alter table PN_DOC_CONTAINER enable constraint DOC_CONTAINER_FK1
/
alter table PN_DOC_CONTAINER enable constraint DOC_CONTAINER_OBJ_FK
/
-- prompt  Enabling foreign key constraints for PN_DOC_PROVIDER...
alter table PN_DOC_PROVIDER enable constraint DOC_PROVIDER_FK1
/
-- prompt  Enabling foreign key constraints for PN_DOC_SPACE...
alter table PN_DOC_SPACE enable constraint DOC_SPACE_OBJ_FK
/
-- prompt  Enabling foreign key constraints for PN_DOC_PROVIDER_HAS_DOC_SPACE...
alter table PN_DOC_PROVIDER_HAS_DOC_SPACE enable constraint DOC_PROV_DOC_SPACE_FK1
/
alter table PN_DOC_PROVIDER_HAS_DOC_SPACE enable constraint DOC_PROV_DOC_SPACE_FK2
/
-- prompt  Enabling foreign key constraints for PN_DOC_SPACE_HAS_CONTAINER...
alter table PN_DOC_SPACE_HAS_CONTAINER enable constraint DOC_SPACE_CONTAINER_FK1
/
alter table PN_DOC_SPACE_HAS_CONTAINER enable constraint DOC_SPACE_CONTAINER_FK2
/
-- prompt  Enabling foreign key constraints for PN_ELEMENT_DISPLAY_CLASS...
alter table PN_ELEMENT_DISPLAY_CLASS enable constraint ELEMENT_DISPLAY_CLASS_FK1
/
alter table PN_ELEMENT_DISPLAY_CLASS enable constraint ELEMENT_DISPLAY_CLASS_FK2
/
-- prompt  Enabling foreign key constraints for PN_ELEMENT_PROPERTY...
alter table PN_ELEMENT_PROPERTY enable constraint ELEMENT_PROPERTY_FK1
/
alter table PN_ELEMENT_PROPERTY enable constraint ELEMENT_PROPERTY_FK2
/
-- prompt  Enabling foreign key constraints for PN_EVENT_TYPE...
alter table PN_EVENT_TYPE enable constraint PN_EVENT_TYPE_FK1
/
-- prompt  Enabling foreign key constraints for PN_NOTIFICATION_TYPE...
alter table PN_NOTIFICATION_TYPE enable constraint NOTIFICATION_TYPE_FK1
/
-- prompt  Enabling foreign key constraints for PN_EVENT_HAS_NOTIFICATION...
alter table PN_EVENT_HAS_NOTIFICATION enable constraint PN_EVENT_HAS_NOTIFICATION_FK1
/
alter table PN_EVENT_HAS_NOTIFICATION enable constraint PN_EVENT_HAS_NOTIFICATION_FK2
/
-- prompt  Enabling foreign key constraints for PN_GLOBAL_CODE...
alter table PN_GLOBAL_CODE enable constraint GLOBAL_CODE_FK1
/
-- prompt  Enabling foreign key constraints for PN_GROUP_HAS_PERSON...
alter table PN_GROUP_HAS_PERSON enable constraint GROUP_HAS_PERSON_FK1
/
alter table PN_GROUP_HAS_PERSON enable constraint GROUP_HAS_PERSON_FK2
/
-- prompt  Enabling foreign key constraints for PN_LOGIN_HISTORY...
alter table PN_LOGIN_HISTORY enable constraint LOGIN_HISTORY_FK1
/
-- prompt  Enabling foreign key constraints for PN_SPACE_HAS_MODULE...
alter table PN_SPACE_HAS_MODULE enable constraint SPACE_HAS_MODULE_FK1
/
-- prompt  Enabling foreign key constraints for PN_MODULE_PERMISSION...
alter table PN_MODULE_PERMISSION enable constraint MODULE_PERMISSION_FK1
/
alter table PN_MODULE_PERMISSION enable constraint MODULE_PERMISSION_FK2
/
-- prompt  Enabling foreign key constraints for PN_OBJECT_PERMISSION...
alter table PN_OBJECT_PERMISSION enable constraint OBJECT_PERMISSION_FK1
/
alter table PN_OBJECT_PERMISSION enable constraint OBJECT_PERMISSION_FK2
/
-- prompt  Enabling foreign key constraints for PN_OBJECT_TYPE_SUPPORTS_ACTION...
alter table PN_OBJECT_TYPE_SUPPORTS_ACTION enable constraint OBJ_TYPE_SUP_ACTION_FK1
/
alter table PN_OBJECT_TYPE_SUPPORTS_ACTION enable constraint OBJ_TYPE_SUP_ACTION_FK2
/
-- prompt  Enabling foreign key constraints for PN_PERSON_AUTHENTICATOR...
alter table PN_PERSON_AUTHENTICATOR enable constraint PERSON_AUTH_FK2
/
alter table PN_PERSON_AUTHENTICATOR enable constraint PN_PERSON_AUTH_FK1
/
-- prompt  Enabling foreign key constraints for PN_PERSON_NOTIFICATION_ADDRESS...
alter table PN_PERSON_NOTIFICATION_ADDRESS enable constraint PERSON_NOTIFICATION_ADDR_FK1
/
alter table PN_PERSON_NOTIFICATION_ADDRESS enable constraint PERSON_NOTIFICATION_ADDR_FK2
/
-- prompt  Enabling foreign key constraints for PN_PERSON_PROFILE...
alter table PN_PERSON_PROFILE enable constraint PN_PERSON_PROFILE_FK1
/
-- prompt  Enabling foreign key constraints for PN_PORTFOLIO...
alter table PN_PORTFOLIO enable constraint PORTFOLIO_OBJ_FK
/
-- prompt  Enabling foreign key constraints for PN_PORTFOLIO_HAS_SPACE...
alter table PN_PORTFOLIO_HAS_SPACE enable constraint PORTFOLIO_SPACE_FK1
/
-- prompt  Enabling foreign key constraints for PN_SPACE_HAS_CALENDAR...
alter table PN_SPACE_HAS_CALENDAR enable constraint SPACE_HAS_CALENDAR_FK1
/
-- prompt  Enabling foreign key constraints for PN_SPACE_HAS_DIRECTORY...
alter table PN_SPACE_HAS_DIRECTORY enable constraint SPACE_DIRECTORY_FK1
/
-- prompt  Enabling foreign key constraints for PN_SPACE_HAS_DOC_SPACE...
alter table PN_SPACE_HAS_DOC_SPACE enable constraint SPACE_HAS_DOC_SPACE_FK1
/
-- prompt  Enabling foreign key constraints for PN_SPACE_HAS_GROUP...
alter table PN_SPACE_HAS_GROUP enable constraint SPACE_HAS_GROUP_FK1
/
-- prompt  Enabling foreign key constraints for PN_SPACE_HAS_PERSON...
alter table PN_SPACE_HAS_PERSON enable constraint SPACE_PERSON_FK1
/
-- prompt  Enabling foreign key constraints for PN_SPACE_HAS_PORTFOLIO...
alter table PN_SPACE_HAS_PORTFOLIO enable constraint SPACE_PORTFOLIO_FK1
/
-- prompt  Enabling foreign key constraints for PN_STATE_LOOKUP...
alter table PN_STATE_LOOKUP enable constraint STATE_LOOKUP_FK1
/
-- prompt  Enabling foreign key constraints for PN_USER...
alter table PN_USER enable constraint PN_USER_FK1
/
alter table PN_USER enable constraint PN_USER_FK2
/
-- prompt  Enabling foreign key constraints for PN_USER_DEFAULT_CREDENTIALS...
alter table PN_USER_DEFAULT_CREDENTIALS enable constraint PN_USER_DEF_CREDENTIALS_FK1
/
