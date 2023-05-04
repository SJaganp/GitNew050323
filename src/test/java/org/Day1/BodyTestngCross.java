package org.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BodyTestngCross {
	WebDriver driver;
	
	@Parameters({"Browser"})
	@Test
	private void tc1(String browserName) {
		
		if (browserName.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}		
			else if (browserName.startsWith("ed")) {
				
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			
			else if (browserName.endsWith("ko")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				
			}
		 else {

			 	System.out.println("If browser not found there is no webpage open");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.close();
		
			}
	

}
