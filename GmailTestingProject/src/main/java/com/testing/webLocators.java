package com.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class webLocators {

	@FindBy(linkText="Sign in")
	public WebElement Signin;
	
	@FindBy(xpath="//*[contains(@id,'identifierId')]")
	public WebElement UsernameField;

	@FindBy(xpath="//span[contains(text(),'Next')]")
	public WebElement NextBttn;
	
	@FindBy(xpath=" //div[@class=\"o6cuMc\"]")
	public WebElement ErrorForUserN;
	
	@FindBy(name="Passwd")
	public WebElement PasswdField;
	
	@FindBy(xpath="//span[contains(text(),'Wrong')]")
	public WebElement ErrorPWD;
	
	@FindBy(xpath="//img[@class='gb_Ia gbii']")
	public WebElement SignoutP;
	
	@FindBy(xpath="//div[contains(text(),'Sign')]")
	public WebElement SignoutB;
	//-------------------------------------------
	@FindBy(xpath="(//span[contains(@class,'ts')])[2]")
	public WebElement CountFp;
	
	@FindBy(xpath="(//span[contains(@class,'ts')])[3]")
	public WebElement CountT;

	@FindBy(xpath="//span[contains(text(),'More')]")
	public WebElement More;
	
	@FindBy(xpath="(//div[@class='av'])[2]")
	public WebElement SourceMail;
	
	@FindBy(linkText="Inbox")
	public WebElement InbFolder;
	
	@FindBy(xpath="//span[@class='bAq']")
	public WebElement Verifymsgofmove;
	
	@FindBy(linkText="Trash")
	public WebElement TrashFolder;

	@FindBy(xpath="//div[@id=':1v']")
	public WebElement SourceMailinT;

	@FindBy(xpath="(//div[@class='J-N-Jz'])[20]")
	public WebElement unRead;

	@FindBy(xpath="//*[@id=':2k']")
	public WebElement Mailtobeclick;

	@FindBy(xpath="//span[contains(@id,':nd')]")
	public WebElement MailinTRASH;
	
	@FindBy(xpath="//*[@id=\":2e\"]")
	public WebElement Selectb;
	
	@FindBy(xpath="//div[@class='asa'])[4]")
	public WebElement rEADB;
	
	@FindBy(xpath="(//div[contains(@class,'yW')])[1]") 
	public WebElement Rightclick;
	
	@FindBy(xpath="//tr[@class='zA zE' or @class='zA yO']/td[2]") 
	public WebElement linkElements;
	
	@FindBy(xpath="//*[contains(text(),'Mark as read')]")
	public WebElement ConfirmRead;
	
	@FindBy(xpath="//*[contains(text(),'Mark as unread')]")
	public WebElement ConfirmUnRead;
	
	@FindBy(xpath="(//div[contains(@class,'asa')])[5]")
	public WebElement Markbutton;
	
}
