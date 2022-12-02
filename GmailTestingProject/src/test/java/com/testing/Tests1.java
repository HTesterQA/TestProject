package com.testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests1 {

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
	@Test(priority=2)
	public void VerifyLinktest()
	{
		gp.verifyOpenLink();
	}
	@Test(priority=3)
	public void SigninTest() throws InterruptedException
	{
		gp.clickonSignin();
	}
	@Test(priority=4)
	public void UsernameTest() throws InterruptedException
	{
		gp.InvalidUsernamenoPass();
	}
	@Test(priority=5)
	public void validUserWrongPWDTEST() throws InterruptedException
	{
		gp.validUserNameWrongPasswd();
	}
	@Test(priority=6)
	public void InsertingPassTest() throws InterruptedException
	{
		gp.ValidPwd();
	}
	@Test(priority=7)
	public void SignOutTest() throws InterruptedException
	{
		gp.SignOut();
	}
	
}
