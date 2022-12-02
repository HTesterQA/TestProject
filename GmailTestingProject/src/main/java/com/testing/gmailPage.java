package com.testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class gmailPage extends webLocators {
	
	public WebDriver driver;
	
	
	public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\Selenium_Workspace\\GmailTestingProject\\Project_Data\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	public void openURL() throws InterruptedException 
	{
		driver.get("https://www.google.com/gmail/about/");
		Thread.sleep(2000);
	}
	public void verifyOpenLink() 
	{
		if (driver.getCurrentUrl().contains("gmail")) 
			System.out.println("Current open Link Validation passed.!");
		 else
			System.out.println("Your are not on the right Web Page.!");
	}
	public void clickonSignin() throws InterruptedException
	{
		Signin.click();
		Thread.sleep(2000);
		
		if (UsernameField != null)
			System.out.println("UI Validation Passed.!");
		 else 
			System.out.println("UI Validation Failed.!");
		Thread.sleep(2000);
		NextBttn.click();
		System.out.println("Error Msg While Clicking on next"+ ErrorForUserN.getText());
		Thread.sleep(2000);
	}
	public void InvalidUsernamenoPass() throws InterruptedException 
	{
		UsernameField.sendKeys("HelloWord11111111111@gmail.com");
		NextBttn.click();
		System.out.println("Error Msg While Clicking on next"+ ErrorForUserN.getText());
		Thread.sleep(2000);
	}
	public void validUserNameWrongPasswd() throws InterruptedException
	{
		UsernameField.clear();
		UsernameField.sendKeys("tproject747@gmail.com");
		NextBttn.click();
		Thread.sleep(2000);
		PasswdField.sendKeys("qqqqqqqqqqqqqqqqq");
		NextBttn.click();
		Thread.sleep(2000);
		System.out.println("Error Msg While Clicking on next"+ ErrorPWD.getText());
		Thread.sleep(2000);
	}
	public void ValidPwd() throws InterruptedException 
	{
		PasswdField.clear();
		PasswdField.sendKeys("Test@7474");
		NextBttn.click();
		Thread.sleep(5000);
		if(driver.getCurrentUrl().contains("inbox"))
			System.out.println("User is in Inbox");
		Thread.sleep(5000);
	}
	public void SignOut() throws InterruptedException 
	{
		SignoutP.click();
		driver.switchTo().frame("account");
		SignoutB.click();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().contains("signinchooser"))
			System.out.println("User Log Out Successfully.!");
		else
			System.out.println("Something went Wrong.!");
		
		Thread.sleep(2000);
	}
	//-------------------------------------------------------------------------------------
	public void clickSignin() throws InterruptedException
	
		{
		Thread.sleep(2000);
			Signin.click();
			Thread.sleep(2000);
			UsernameField.sendKeys("tproject747@gmail.com");
			NextBttn.click();
			Thread.sleep(2000);
			PasswdField.sendKeys("Test@7474");
			NextBttn.click();
			Thread.sleep(2000);
			if(driver.getCurrentUrl().contains("inbox"))
				System.out.println("User is in Inbox");
			Thread.sleep(5000);
		}
		public void CountFirstPage() throws InterruptedException 
		{	Thread.sleep(2000);
			System.out.println("Total Number Of EMail on First Page: "+CountFp.getText());
			Thread.sleep(2000);
		}
		public void CountTotal()throws InterruptedException {
			Thread.sleep(2000);
			System.out.println("Total Number Of EMail in Inbox: "+CountT.getText());
			Thread.sleep(2000);
		}
		//==================================================================
		
		public void ClickOnMore()
		{
			More.click();
		}
		public void DragEmailtoFolder() throws InterruptedException
		{
			Thread.sleep(2000);
			Actions Act1=new Actions(driver);
			Act1.dragAndDrop(SourceMail, TrashFolder).build().perform();
			Thread.sleep(2000);
			String msg=Verifymsgofmove.getText();
			System.out.println("Confirmation msg : "+msg);
			Thread.sleep(2000);
		}
			public void ClickTrashFolder() throws InterruptedException
			{
			TrashFolder.click();
			Thread.sleep(2000);
			
			}
		
		public void TrashFoldertoInbox() throws InterruptedException
		{
			Thread.sleep(2000);
			Actions Act2=new Actions(driver);
			Act2.dragAndDrop(MailinTRASH,InbFolder).build().perform();

			Thread.sleep(5000);
			String Msg1 = Verifymsgofmove.getText();
			System.out.println("Confirmation msg : "+Msg1 );
			Thread.sleep(2000);
		}
		//==========================================================================================================================
		
		public void ReadandUnReadMail() throws InterruptedException
		{
			
			Actions Act3=new Actions(driver);
			Act3.contextClick(linkElements).build().perform();
			Thread.sleep(5000);
			if(ConfirmRead.isDisplayed())
			{
				ConfirmRead.click();
			}else
			{
				ConfirmUnRead.click();
			}
			
			 
			Thread.sleep(10000);
			driver.navigate().refresh();

		}
	}

	
