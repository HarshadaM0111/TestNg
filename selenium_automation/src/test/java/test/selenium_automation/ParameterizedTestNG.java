package test.selenium_automation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestNG {

	@Parameters({"N"})
	@Test
	
	void display(String name) {
		System.out.println("My name is  " +name);
		
	}
	
	@Parameters({"A","B"})
	@Test
	
	void add(int a, int b) {
		int c = a+b;
		System.out.println("Adition: " +c);
	}
}
