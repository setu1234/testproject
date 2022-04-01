package com.questypageobject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;



public class SearchUI {
	WebDriver driver;
	
	public SearchUI(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//locators of login page.
	@FindBy(id="email-field") 
	WebElement username;
	
	@FindBy(id="password-field") 
	WebElement password;
	
	@FindBy(id="submitbutton") 
	WebElement subButton;
	
	//valid login method
	public void openurl()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://corp-staging.questy.co.in/");
	}
	
	public void VerifyUrl()
	{
		String url = driver.getCurrentUrl();
		String expurl = "https://corp-staging.questy.co.in/";
		assertEquals(url, expurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("current url is verified");
	}
	public void logInToQuesty(String usrname,String psswrd) throws InterruptedException {
		
		String title=driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(4000);
		//Assert.assertEquals(title, "Questy");
		username.sendKeys(usrname);
		Thread.sleep(4000);
		password.sendKeys(psswrd);
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", subButton);
		Thread.sleep(1000);
		
	
	}
}
