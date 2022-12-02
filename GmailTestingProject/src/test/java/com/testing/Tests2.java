package com.testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests2 {

	gmailPage gp= new gmailPage();
	
	@BeforeTest
	public void openUrlTest() throws InterruptedException
	{
		gp.openBrowser();
		gp.openURL();
	}
	@AfterTest
	public void closeBrowsertest()
	{
		gp.closeBrowser();
	}
	@Test(priority=1)
	public void VerifyLinktest()
	{
		gp.verifyOpenLink();
	}
	@Test(priority=2)
	public void SigninTest() throws InterruptedException
	{
		gp.clickSignin();
	}
	@Test(priority=3)
	public void CountonFirstPagetest() throws InterruptedException
	{
		gp.CountFirstPage();
	}
	@Test(priority=4)
	public void CountTotalEmailstest() throws InterruptedException
	{
		gp.CountTotal();
	}
	@Test(priority=5)
	public void SignoutTest() throws InterruptedException
	{
		gp.SignOut();
	}
}
