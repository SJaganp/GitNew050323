package org.Day1;

import org.testng.annotations.Test;

public class ClassX {
	
	
	@Test(expectedExceptions=ArithmeticException.class) 
	private void tc2() {
		System.out.println(5/0);
		System.out.println("TestCase 2");
	}


}
