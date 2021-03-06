/*
 * #%L
 * The AIBench basic runtime and plugin engine
 * %%
 * Copyright (C) 2006 - 2017 Daniel Glez-Peña and Florentino Fdez-Riverola
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */
/*
Copyright 2007 Daniel Gonzalez Peña, Florentino Fernandez Riverola


This file is part of the AIBench Project. 

AIBench Project is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

AIBench Project is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser Public License for more details.

You should have received a copy of the GNU Lesser Public License
along with AIBench Project.  If not, see <http://www.gnu.org/licenses/>.
*/

/*  
 * PluginConfiguration.java
 *
 * Created inside the SING research group (http://sing.ei.uvigo.es)
 * University of Vigo
 *
 * Created on 20/03/2009
 */
package org.platonos.pluginengine;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Properties;

import org.platonos.pluginengine.logging.DefaultLogger;
import org.platonos.pluginengine.logging.ILogger;
import org.platonos.pluginengine.logging.LoggerLevel;

/**
 * @author Miguel Reboiro Jato
 *
 */
public class PluginFileConfiguration implements IPluginConfiguration {
	private static final ILogger logger = new DefaultLogger();

	private static final String DEFAULT_OPTION_ENABLED = "enabled";
	
	private static final String DEFAULT_OPTION_LOAD = "load";
	
	private static final String DEFAULT_OPTION_ACTIVE = "active";
	
	private final Properties properties;
	private final URL configurationFile;
	private final String enabledSuffix, loadSuffix, activeSuffix;
	private final boolean enabledByDefault;
	private final boolean loadByDefault;
	private final boolean activeByDefault;
	
	public PluginFileConfiguration(URL configurationFile)
	throws IOException {
		this(
			configurationFile, 
			PluginFileConfiguration.DEFAULT_OPTION_LOAD, 
			PluginFileConfiguration.DEFAULT_OPTION_ENABLED,
			PluginFileConfiguration.DEFAULT_OPTION_ACTIVE
		);
	}

	/**
	 * Constructs a new PluginConfiguration loading the configuration from the {@code conf/plugins.conf} file.
	 * 
	 * @param configurationFile the URL of the file that contains the plugin configuration.
	 * @param loadSuffix the suffix used for loaded plugin properties.
	 * @param enabledSuffix the suffix used for enabled plugin properties.
	 * @param activeSuffix the suffix used for active plugin properties.
	 * @throws IOException if an error occurs while creating the configuration.
	 */
	public PluginFileConfiguration(URL configurationFile, String loadSuffix, String enabledSuffix, String activeSuffix)
	throws IOException {
		this.properties = new Properties();
		this.configurationFile = configurationFile;
		this.loadSuffix = loadSuffix;
		this.enabledSuffix = enabledSuffix;
		this.activeSuffix = activeSuffix;
		
		try {
			InputStream fis = configurationFile.openStream();
			this.properties.load(fis);
			fis.close();
			
			this.enabledByDefault = Boolean.parseBoolean(this.properties.getProperty("default.enabled", "true"));
			this.loadByDefault = Boolean.parseBoolean(this.properties.getProperty("default.load", "true"));
			this.activeByDefault = Boolean.parseBoolean(this.properties.getProperty("default.active", "true"));
		} catch (IOException e) {
			throw e;
		}
	}
	
	public PluginFileConfiguration(File configurationFile)
	throws IOException {
		this(configurationFile.toURI().toURL());
	}
	
	/**
	 * Constructs a new PluginConfiguration loading the configuration from the a configuration file.
	 * 
	 * @param configurationFile the file that contains the plugin configuration.
	 * @param loadSuffix the suffix used for loaded plugin properties.
	 * @param enabledSuffix the suffix used for enabled plugin properties.
	 * @param activeSuffix the suffix used for active plugin properties.
	 * @throws IOException if an error occurs while creating the configuration.
	 */
	public PluginFileConfiguration(File configurationFile, String loadSuffix, String enabledSuffix, String activeSuffix)
	throws IOException {
		this(configurationFile.toURI().toURL(), loadSuffix, enabledSuffix, activeSuffix);
	}
	
	private void storeProperties() {
		try {
			OutputStream os = this.configurationFile.openConnection().getOutputStream();
			this.properties.store(os, null);
			os.flush();
			os.close();
		} catch (IOException e) {
			PluginFileConfiguration.logger.log(LoggerLevel.WARNING, "Plugin configuration file couldn't be modified.", e);
		}
	}
	
	@Override
	public boolean isLoadPlugin(Plugin plugin) {
		if (plugin == null) return false;
		else return this.isLoadPlugin(plugin.getUID());
	}

	@Override
	public boolean isLoadPlugin(String pluginUID) {
		return Boolean.parseBoolean(this.properties.getProperty(String.format("%s.%s", pluginUID, this.loadSuffix), Boolean.toString(this.loadByDefault)));
	}

	@Override
	public boolean isEnabledPlugin(Plugin plugin) {
		if (plugin == null) return false;
		else return this.isEnabledPlugin(plugin.getUID());
	}

	@Override
	public boolean isEnabledPlugin(String pluginUID) {
		return Boolean.parseBoolean(this.properties.getProperty(String.format("%s.%s", pluginUID, this.enabledSuffix), Boolean.toString(this.enabledByDefault)));
	}

	@Override
	public boolean isActivePlugin(Plugin plugin) {
		if (plugin == null) return false;
		else return this.isActivePlugin(plugin.getUID());
	}

	@Override
	public boolean isActivePlugin(String pluginUID) {
		return Boolean.parseBoolean(this.properties.getProperty(String.format("%s.%s", pluginUID, this.activeSuffix), Boolean.toString(this.activeByDefault)));
	}

	@Override
	public void setLoadPlugin(Plugin plugin, boolean value) {
		this.setLoadPlugin(plugin.getUID(), value);
	}

	@Override
	public void setLoadPlugin(String pluginUID, boolean value) {
		this.properties.setProperty(String.format("%s.%s", pluginUID, this.loadSuffix), Boolean.toString(value));
		this.storeProperties();
	}

	@Override
	public void setEnabledPlugin(Plugin plugin, boolean value) {
		this.setEnabledPlugin(plugin.getUID(), value);
	}

	@Override
	public void setEnabledPlugin(String pluginUID, boolean value) {
		this.properties.setProperty(String.format("%s.%s", pluginUID, this.enabledSuffix), Boolean.toString(value));
		this.storeProperties();
	}

	@Override
	public void setActivePlugin(Plugin plugin, boolean value) {
		this.setActivePlugin(plugin.getUID(), value);
	}

	@Override
	public void setActivePlugin(String pluginUID, boolean value) {
		this.properties.setProperty(String.format("%s.%s", pluginUID, this.activeSuffix), Boolean.toString(value));
		this.storeProperties();
	}
}
