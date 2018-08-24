package com.qa.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private static Properties properties;
	private final String propertyFilePath = "C://Users//Basavanagouda BR//workspace//FreeCRMBDDFrameWork//"
			+ "src//main//java//com//qa//config//config.properties";
	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getBrowserName() {

		String browserName = properties.getProperty("browser");
		if (browserName !=null)
		return browserName;
		else
			throw new RuntimeException("browser name is not specified in the Configuration.properties file.");
	}

	public String getAppUrl() {
		String appUrl = properties.getProperty("url");
		if (appUrl != null)
			return appUrl;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getAdminUsername() {
		String adminUsername = properties.getProperty("adminUsername");
		if (adminUsername != null)
			return adminUsername;
		else
			throw new RuntimeException("adminUsername not specified in the Configuration.properties file.");
	}

	public String getAdminPassword() {
		String adminPassword = properties.getProperty("adminPassword");
		if (adminPassword != null)
			return adminPassword;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
}
