package com.questypageobject;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.questyautomationtestcases.Baseclass;

public class CreatecandidatePage extends Baseclass {
WebDriver driver;
	
	public CreatecandidatePage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		

}
	@FindBy(xpath="//body/app[1]/section[1]/main[1]/ng-component[1]/ng-component[1]/div[1]/section[2]/div[3]/div[1]/button[2]") 
	WebElement addNewCandidateBtn;
	
	public void addnewcandidate() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		for(int i=0; i<=2;i++) {
			try {
		
			    Thread.sleep(5000);
				addNewCandidateBtn.click();
				break;
			}
			catch(NoSuchElementException e) {
				System.out.println(e.getMessage());
			}
	}
}
}