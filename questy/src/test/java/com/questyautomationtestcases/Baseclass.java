package com.questyautomationtestcases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.paulhammant.ngwebdriver.NgWebDriver;



public class Baseclass {
	public static WebDriver driver;

	JavascriptExecutor jsDriver;
	
	@BeforeMethod
	public void setup() throws IOException, ParseException
	{
		
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("use-fake-ui-for-media-stream");
		options.addArguments("--headless");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//NewDriver//chromedriver.exe");
		driver=new ChromeDriver(options);
		jsDriver = (JavascriptExecutor)driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	   
		
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
