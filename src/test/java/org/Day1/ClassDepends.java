package org.Day1;

import org.testng.annotations.Test;

public class ClassDepends {

	@Test(dependsOnMethods="tc2",alwaysRun=true)
	private void tc1() {
		
		System.out.println("TestCase 1");
	}

	@Test 
	private void tc2() {
		System.out.println(5/0);
		System.out.println("TestCase 2");
	}

	
}
