package com.test.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.test.generics.WaitForMoment;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement SearchFields;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement SearchButton;
	
	@FindBy(xpath="//a[contains(text(),'Phones & PDAs')]")
	private WebElement PhonesPDAs;
	
	@FindBy(xpath="//select[@id='input-sort']")
	private WebElement SortBy;
	//https://demo.opencart.com/index.php?route=product/category&path=24&sort=p.price&order=DESC
	
	@FindBy(xpath="//div[@id='content']//div//div[1]//div[2]//div[2]//button[3]")
	private List<WebElement> ProductAddtoCompare;
	
	@FindBy(xpath="//a[contains(text(),'product comparison')]")
	private WebElement ProductAddtoCompareLink;
	
	@FindBy(xpath="//td[2]//input[1]")
	private WebElement AddToCartButton;
	
	@FindBy(xpath="//a[contains(text(),'shopping cart')]")
	private WebElement ShoppingCart;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement CheckOutButton;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	private WebElement ProductImage;
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement Quantity;
	
	public void EnterSearchText(String value)
	{
		WaitForMoment.wait(2);
		SearchFields.sendKeys(value);
		WaitForMoment.wait(2);
		SearchButton.click();
	}
	
	public void clickPhonePDAs()
	{
		PhonesPDAs.click();
		WaitForMoment.wait(4);
		Select options=new Select(SortBy);
		options.selectByVisibleText("Price (High > Low)");
		WaitForMoment.wait(4);
	}
	
	public void clickAddToCompareButtons()
	{
		WaitForMoment.wait(2);
		for(WebElement ele: ProductAddtoCompare)
		{
			ele.click();
			WaitForMoment.wait(1);
		}
		WaitForMoment.wait(2);
		ProductAddtoCompareLink.click();
		WaitForMoment.wait(2);
	}
	
	public void AddToCartCheckOut()
	{
		AddToCartButton.click();
		WaitForMoment.wait(4);
		ShoppingCart.click();
		WaitForMoment.wait(4);
		CheckOutButton.click();
		WaitForMoment.wait(4);
	}
	
	public void clickProductImage()
	{
		ProductImage.click();
		WaitForMoment.wait(3);
		Select options=new Select(Quantity);
		options.selectByVisibleText("5");
		WaitForMoment.wait(10);
	}
}
