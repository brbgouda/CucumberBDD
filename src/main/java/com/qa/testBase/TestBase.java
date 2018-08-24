package com.qa.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public TestBase(){
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C://Users//Basavanagouda BR//workspace//FreeCRMBDDFrameWork//"
					+ "src//main//java//com//qa//config//config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization(){
		
		String browserName = prop.getProperty("browser");
		if(browserName=="chrome"){
			System.setProperty("webdriver.chrome.driver", "C://HomeProjects//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else{
			System.setProperty("webdriver.gecko.driver", "C://HomeProjects//chromedriver.exe");
		}
		String url = prop.getProperty("url");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
	

}
