package org.Day1;

import org.testng.annotations.Test;

public class Body1 {

	@Test
	private void tc1() {
		System.out.println("TestCase1 :"+Thread.currentThread().getId() );
	}
	
	@Test
	private void tc2() {
		System.out.println("TestCase2 :"+Thread.currentThread().getId());
		
	}
	
	@Test
	private void tc3() {
		System.out.println("TestCase3 :"+Thread.currentThread().getId());
	}
}
