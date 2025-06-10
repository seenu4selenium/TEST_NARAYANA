package com.testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationsDemo_2 {

	@Test // Functional steps
	public void f() {
		System.out.println("I am @Test Annotation f");
	}
	
	@Test // Functional steps
	public void a() {
		System.out.println("I am @Test Annotation a");
	}

	@BeforeClass // Pre-condition
	public void beforeClass() {
		System.out.println("I am @BeforeClass Annotation");
	}

	@AfterClass // Post-condition
	public void afterClass() {
		System.out.println("I am @AfterClass Annotation");
	}

}
