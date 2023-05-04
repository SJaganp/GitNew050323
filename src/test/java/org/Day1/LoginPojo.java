package org.Day1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPojo extends BaseClass {
	
	
	
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement txtemail;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtpass;
	
	@FindBy(name="login")
	private WebElement btnlogin;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	
	
}

