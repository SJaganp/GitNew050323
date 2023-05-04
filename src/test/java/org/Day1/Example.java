package org.Day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Example extends BaseClass{

	@Test
	public void tc1() {
		openChromeBrowser();
		driver.get("https://www.facebook.com/");
		maxWindow();
		
	}
	@Parameters({"Username","password"})
	@Test
	public void tc2(@Optional("GreensTech") String v1,@Optional("Jagan") String v2) {
		
		LoginPojo l = new LoginPojo();
		WebElement txtemail = l.getTxtemail();
		fillTextBox(txtemail, v1);
		
		WebElement txtpass = l.getTxtpass();
		fillTextBox(txtpass, v2);
		
		WebElement btnlogin = l.getBtnlogin();
		btnlogin.click();
		
		
		
	}
	
	
}
