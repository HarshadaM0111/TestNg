package test.selenium_automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class AnnotationTestNG {
	
	@AfterTest
	void display() {
		System.out.println("After Test Annotations. ");
	}

	@BeforeTest
	void show() {
		System.out.println("Before Test Annotations. ");
	}
	@Test
	void demo(){
		System.out.println("only Test  Annotations.");
	}
	
	@BeforeClass
	void beforeclass() {
		System.out.println("Before Class Annotations .");
	}
	@BeforeMethod
	void  beforeMethod() {
		System.out.println("Before Method Annotations.");
	}
	
	
	@AfterMethod
	void  AfterMethod() {
		System.out.println("After Method Annotations.");
	}
	
	
	@AfterClass
	void  AfterClass() {
		System.out.println("After Class Annotations.");
	}
	
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("Before Suite Annotations. ");
	}
	
	@AfterSuite
	void afterSuite() {
		System.out.println("After Suite Annotation. ");
	}
}
