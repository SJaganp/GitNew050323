package org.Day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunTest {
	
	@Test
	private void tc2() {
		System.out.println(3/0);
		System.out.println("TestCase 2"); 
		
	}
	
	@Test
	private void tc1() {
		System.out.println("TestCase 1");
	} 
	
	@Test
	private void tc3() {
		Assert.assertTrue(100<10, "Check TC3");
		System.out.println("TestCase 3");
	}
}
