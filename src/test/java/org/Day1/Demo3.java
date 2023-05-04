package org.Day1;

import org.testng.annotations.Test;

public class Demo3 {

	@Test (priority=-14, invocationCount=2)
	
	private void tc7() {
		
		System.out.println(7);
	}
	
	@Test
	
	private void tc9() {
System.out.println(9);
	}
	
	@Test (priority = -6)
	
	private void tc10() {
		System.out.println(10);
	}
	
}

