package com.test.scripts;

import org.testng.annotations.Test;

import com.test.generics.Excel;
import com.test.generics.WaitForMoment;
import com.test.pom.HomePage;
import com.test.pom.LoginPage;

public class ValidLogin extends BaseTest {
	
	@Test
	public void TestCase1ValidLoginLogout()
	{	
		
		String un=Excel.getCellValue(XL_PATH, "ValidLoginLogout",1, 0);
		String pw=Excel.getCellValue(XL_PATH, "ValidLoginLogout",1, 1);
		
		try		
		{
			//enter valid un and pw
			LoginPage l=new LoginPage(driver);
			l.openLoginPage();
			WaitForMoment.wait(2);
			l.setUserName(un);
			WaitForMoment.wait(2);
			l.setPassword(pw);
			WaitForMoment.wait(2);
			//click login
			l.clickLogin();
			
			l.clickLogout();
			WaitForMoment.wait(2);
			l.clickContinue();
			WaitForMoment.wait(2);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void TestCase4CheckOutProduct()
	{	
		String un=Excel.getCellValue(XL_PATH, "ValidLoginLogout",1, 0);
		String pw=Excel.getCellValue(XL_PATH, "ValidLoginLogout",1, 1);
		
		try		
		{
			//enter valid un and pw
			LoginPage l=new LoginPage(driver);
			HomePage h=new HomePage(driver);
			
			//Steps: 1-3
			l.openLoginPage();
			WaitForMoment.wait(2);
			l.setUserName(un);
			WaitForMoment.wait(2);
			l.setPassword(pw);
			WaitForMoment.wait(2);
			//click login
			l.clickLogin();
			
			//Steps: 5
			h.EnterSearchText("Apple");
			//Step: 6-7
			h.clickPhonePDAs();
			//Step: 8-13
			h.clickAddToCompareButtons();
			//Step: 14
			h.AddToCartCheckOut();
			//Step: Application not allowing to checkout the product
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
	}
	
	@Test
	public void TestCase6CheckOutCanonProduct()
	{	
		String un=Excel.getCellValue(XL_PATH, "ValidLoginLogout",1, 0);
		String pw=Excel.getCellValue(XL_PATH, "ValidLoginLogout",1, 1);
		
		try		
		{
			//enter valid un and pw
			LoginPage l=new LoginPage(driver);
			HomePage h=new HomePage(driver);
			
			//Steps: 1-3
			l.openLoginPage();
			WaitForMoment.wait(2);
			l.setUserName(un);
			WaitForMoment.wait(2);
			l.setPassword(pw);
			WaitForMoment.wait(2);
			//click login
			l.clickLogin();
			
			//Steps: 5
			h.EnterSearchText("canon");
			//Step: 6-7
			h.clickProductImage();			
			//Later: Application not allowing to select available dropdown option
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
	}
	
}
