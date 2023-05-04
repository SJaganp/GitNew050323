package org.Day1;

import org.testng.annotations.Test;

public class Class1 {

	@Test(groups="Smoke")
	private void tc1() {

		System.out.println("TestCase 1");
	}

	@Test (groups = {"Sanity","Reg"})
	private void tc3() {
		System.out.println("TestCase 3");
	}

	@Test (groups="Reg")
	private void tc2() {
		System.out.println("TestCase 2");
	}
}
