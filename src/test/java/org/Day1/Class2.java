package org.Day1;

import org.testng.annotations.Test;

public class Class2 {

	@Test(groups="Sanity")
	private void tc5() {
		System.out.println("TestCase 5");
	}
	
	@Test(groups= {"Sanity","Smoke"})
	private void tc4() {
		System.out.println("TestCase 4");
	}
	
	
	
}
