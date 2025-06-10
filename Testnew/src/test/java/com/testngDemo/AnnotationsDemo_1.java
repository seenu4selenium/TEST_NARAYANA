package com.testngDemo;

import org.testng.annotations.Test;

public class AnnotationsDemo_1 {

	@Test(enabled = false)
	public void tc_03() {
		System.out.println("I am @Test Annotation tc03");
	}

	@Test
	public void f() {
		System.out.println("I am @Test Annotation f");
	}

	@Test
	public void b() {
		System.out.println("I am @Test Annotation b");
	}

}
