package com.questyautomationtestcases;


import org.testng.annotations.Test;


import com.questypageobject.SearchUI;



public class SearchUITest extends Baseclass {
	
	@Test(priority=1)
    public void loginwithvalidcredentials() throws InterruptedException
    {
		SearchUI qLogin=new SearchUI(driver);
    	 qLogin.openurl();
    	 qLogin.VerifyUrl();
 	 //   qLogin.logInToQuesty("setutalati1@gmail.com", "Test@123");
 	   qLogin.logInToQuesty("", "");
    }
	
	@Test(priority=2)
	 public void loginwithadmincredentials() throws InterruptedException
	    {
		SearchUI qLogin=new SearchUI(driver);
	 	    qLogin.logInToQuesty("setutalati2@gmail.com", "Test@123");
	    }
	
}
