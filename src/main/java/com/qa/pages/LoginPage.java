package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.pages.HomePage;
import com.qa.testBase.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name ="username")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	@FindBy(xpath="//img[contains(@class, 'img-responsive')]")
	WebElement freeCRM_Image;
	
	//Initializing page elements
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String loginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean loginPageImage(){
		return freeCRM_Image.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		try {
			Thread.sleep(3000);
			userName.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new HomePage();
	}
}

