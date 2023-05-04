package org.Day1;

import org.testng.annotations.Test;

public class Body2 {
	
	@Test
	private void tc4() {
		System.out.println("TestCase4 :"+Thread.currentThread().getId());
		
	}
	
	@Test
	private void tc5() {
		System.out.println("TestCase5 :"+Thread.currentThread().getId());
	}

}
