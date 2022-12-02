package com.testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests3 {

	gmailPage gp= new gmailPage();
	
	@BeforeTest
	public void beforeMethod() throws InterruptedException
	{
		gp.openBrowser();
		gp.openURL();
		
	}
	
	@AfterTest
	public void AfterMethod()
	{
		gp.closeBrowser();
	}
	
	@Test (priority=1)
	public void ValidatingUrlAndSignInTest() throws InterruptedException
	{
		gp.verifyOpenLink();
		gp.clickSignin();
	}
	@Test(priority=2)
	public void clickMOre() throws InterruptedException
	{
		gp.ClickOnMore();
	}
	@Test (priority=3)
	public void MovetoTrashTest() throws InterruptedException
	{
		gp.DragEmailtoFolder();
		gp.ClickTrashFolder();
		
	}
	@Test(priority=4)
	public void MovetoinboxTest() throws InterruptedException
	{
		gp.TrashFoldertoInbox();
		
	}
	@Test(priority=5)
	public void validatingURLandSignout() throws InterruptedException
	{	
		gp.SignOut();
	}
}
