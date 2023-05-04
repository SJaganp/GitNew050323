package org.Day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleHard {

	@Test
private void tc1() {
		System.out.println("TestCase1");
		Assert.assertTrue(20>100, "Verify TC1");
		System.out.println("TestCase11");
		
}	
	
	@Test
	private void tc2() {
		System.out.println("TestCase2");
		Assert.assertFalse(20>100, "Verify Tc2");
		System.out.println("TestCase22");
		
	}
	
	@Test
	private void tc3() {
		System.out.println("TestCase3");
		Assert.assertEquals(200, 100, "verify Tc3");
		System.out.println("Testcase33");
		
	}
	
}
