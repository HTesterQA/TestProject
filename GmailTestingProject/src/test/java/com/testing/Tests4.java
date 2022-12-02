package com.testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests4 {
	gmailPage gmail= new gmailPage();
	
	@BeforeTest
	public void beforeMethod() throws InterruptedException
	{
		gmail.openBrowser();
		gmail.openURL();
		
	}
	@AfterTest
	public void AfterMethod()
	{
		gmail.closeBrowser();
	}
	@Test (priority=1)
	public void ValidatingUrlAndSignInTest() throws InterruptedException
	{
		
		gmail.clickSignin();
	}
	
	@Test (priority=2)
	public void readmail() throws InterruptedException
	{
		gmail.ReadandUnReadMail();
		gmail.ReadandUnReadMail();
		
	}
	@Test(priority=3)
	public void SignOutTest() throws InterruptedException
	{
		gmail.SignOut();
	}
	
		
}
