package org.Day1;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test (priority = -10, invocationCount = 2)
	private void tc1() {
		System.out.println(1);
	}
	@Test (priority = -6)
	
	private void tc2() {
		System.out.println(2);
	}
	
	@Test (priority = -12, invocationCount = 3)
	
	private void tc3() {
		System.out.println(3);
	}
	@Test (priority = 6)
	
	private void tc4() {
		System.out.println(4);
	}
	@Test
	
	private void tc5() {
		System.out.println(5);
	}

}

