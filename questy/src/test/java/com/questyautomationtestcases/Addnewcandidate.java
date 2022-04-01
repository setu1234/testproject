package com.questyautomationtestcases;

import org.testng.annotations.Test;

import com.questypageobject.CreatecandidatePage;

import com.questypageobject.SearchUI;

public class Addnewcandidate extends Baseclass {
  
	@Test
	public void addnewcandidate() throws InterruptedException
   {  
		SearchUI qLogin=new SearchUI(driver);
 	    qLogin.logInToQuesty("setutalati1@gmail.com", "Test@123");
	   CreatecandidatePage createcandidatePage2 = new CreatecandidatePage(driver);
	   Thread.sleep(5000);
	   createcandidatePage2.addnewcandidate();
   }
}
