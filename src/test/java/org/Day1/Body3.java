package org.Day1;

import org.testng.annotations.Test;

public class Body3 {

	@Test
	private void tc6() {
		System.out.println("TestCase6 :" + Thread.currentThread().getId());
	}

	@Test
	private void tc7() {
		System.out.println("TestCase7 :" + Thread.currentThread().getId());
	}
	
	@Test
	private void tc8() {
		System.out.println("TestCase8 :"+Thread.currentThread().getId());
	}
}
