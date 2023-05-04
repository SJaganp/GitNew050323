package org.Day1;

import org.testng.annotations.Test;

public class Class3 {

	@Test(groups="Smoke")
	private void tc7() {

		System.out.println("TestCase 7");
	}

	@Test (groups = {"Smoke","Reg"})
	private void tc6() {
		System.out.println("TestCase 6");
	}

	@Test (groups="Reg")
	private void tc8() {
		System.out.println("TestCase 8");
	}
	
}
