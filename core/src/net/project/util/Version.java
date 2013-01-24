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

 /*
********** DO NOT EDIT THIS FILE **********

THIS FILE IS AUTOGENERATED
ANY CHANGES MADE HERE WILL BE LOST

*******************************************

*/
package net.project.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Properties;

import net.project.base.compatibility.Compatibility;

import org.apache.log4j.Logger;

/**
 * Provides version information.
 * Version information is read from <code>version.properties</code> in
 * the this class's directory.
 */
public class Version implements Serializable {
    private static transient Logger logger = Logger.getLogger(Version.class);

    /** The location of the version.properties file. */
    private static final String VERSION_PROPERTIES_RESOURCE = "version.properties";

    /**
     * The singleton instance of Version.
     */
    private static Version version = new Version();

    /**
     * Returns a singleton instance of the Version class.
     * @return a Version instance.
     */
    public static final Version getInstance() {
        return version;
    }

    //
    // Instance Members
    //

    /**
     * The loaded version properties.
     */
    private final Properties properties;

    /**
     * Creates an empty Version.
     */
    private Version() {
        this.properties = new Properties();
        try {
            this.properties.load(Compatibility.getResourceProvider().getResourceAsStream(VERSION_PROPERTIES_RESOURCE));
        } catch (IOException e) {
            // We log, but consume the error; we don't want this class to cause failure
            // properties will be empty
            logger.warn("Unable to load version.properties from " + VERSION_PROPERTIES_RESOURCE);
        }
    }

    /**
     * Returns the value for the specified property or the empty string
     * if there is no property with that name.
     * @param property the name of the property who's value to get
     * @return the property value or empty string
     */
    private String getProperty(String property) {
        return this.properties.getProperty(property, "");
    }

    /**
     * Returns the application version.
     * @return the application version number from <code>product.version</code>
     */
    public String getAppVersion() {
        return getProperty("product.version");
    }

    /**
     * Returns the application version code name.
     * @return the application version codename from <code>product.version.codename</code>
     */
    public String getProductVersionCodename() {
        return getProperty("product.version.codename");
    }

    
    /**
     * Return the client's version of the product.  This is their own private build number.
     * @return the client product version number from <code>client.product.version</code>
     */
    public String getClientAppVersion() {
        return getProperty("client.product.version");
    }

    /**
     * Return the name of the client that this product has been customized for.  This will
     * be blank for the main prm product.
     * @return the client name from <code>client.name</code>
     */
    public String getClientName() {
        return getProperty("client.name");
    }

    /**
     * Return the build date for the product.
     * @return the build date from <code>product.version.builddate</code>.
     */
    public String getBuildDate() {
        return getProperty("product.version.builddate");
    }

    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        logger = Logger.getLogger(Version.class);
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
    }
}