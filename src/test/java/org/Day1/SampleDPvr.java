package org.Day1;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDPvr extends BaseClass {
	
	@BeforeClass
	public void tc1() throws InterruptedException {
		openChromeBrowser();
		maxWindow();
	
	}
	
	@BeforeMethod
		private void dateandtime() {
		driver.get("https://www.facebook.com/");
		
		Date d = new Date();
		System.out.println(d);
				}
	
	@Test(dataProvider="Course")
	public void tc2(String v1,String v2) throws InterruptedException {
		
		LoginPojo l = new LoginPojo();
		WebElement txtemail = l.getTxtemail();
		fillTextBox(txtemail, v1);
		
		WebElement txtpass = l.getTxtpass();
		fillTextBox(txtpass, v2);
		
		WebElement btnlogin = l.getBtnlogin();
		btnlogin.click();
		
		holdExecution(2000);

	}

	@DataProvider(name="Course")
	private Object loginData() {
		return new Object[][]{
		
		{"jagan", "Jagan@123"},
		{"murugan","Murugan@123"},
		{"ram", "Ram@123"},
		{"madhan","Madhan@123"},
		{"velu", "Velu@123"}
		
		
		};
	}
	
	
	@AfterMethod
	private void datetime() {
	Date d = new Date();
	System.out.println(d);
	}
	
	
	@AfterClass
		private void CloseBrower() {
		driver.close();
		}

}
