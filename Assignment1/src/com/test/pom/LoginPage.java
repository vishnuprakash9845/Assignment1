package com.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage{

	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement loginOption;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement unTextBox;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement pwTextBox;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[@class='list-group-item'][contains(text(),'Logout')]")
	private WebElement logoutButton;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement continueButton;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void openLoginPage()
	{
		myAccount.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginOption.click();
	}
	
	public void setUserName(String un)
	{
		unTextBox.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwTextBox.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
	
	public void clickLogout()
	{
		logoutButton.click();
	}
	
	public void clickContinue()
	{
		continueButton.click();
	}
}
