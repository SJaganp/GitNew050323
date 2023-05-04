package org.Day1;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExamHardTest extends BaseClass {

	LoginPojo l;
	
	@Test
	public void tc1() throws InterruptedException {
		openChromeBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();
		
	}
	
	
	@Test
	public void tc2() throws InterruptedException {
		
		l = new LoginPojo();
		WebElement txtemail = l.getTxtemail();
		fillTextBox(txtemail, "Jagan");
		Assert.assertEquals(txtemail.getAttribute("value"), "Jagan", "Check username");
		
		WebElement txtpass = l.getTxtpass();
		fillTextBox(txtpass, "Jagan@123");
		Assert.assertEquals(txtpass.getAttribute("value"), "Jagan@123", "Check Password");
		
		WebElement btnlogin = l.getBtnlogin();
		btnlogin.click();
		

	}
	

	
	
	
		}
