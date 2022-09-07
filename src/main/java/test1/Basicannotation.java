package test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basicannotation {
	@BeforeSuite
	public void test1() {
		System.out.println("BeforeSuite");
		
	}
	@BeforeTest

	public void test2() {
		System.out.println("BeforeTest");
		
	}
	@BeforeClass
	public void test3() {
		System.out.println("BeforeClass");
		
	}
	@BeforeMethod
	public void test4() {
		System.out.println("BeforeMethod");
		
	}
	@Test
	public void test5() {
		System.out.println("@test");
	}
	@AfterSuite
	public void test6() {
		System.out.println("BeforeSuite");
	}
	@AfterTest
	public void test7() {
		System.out.println("BeforeTest");
	}
	@AfterClass
	public void test8() {
		System.out.println("BeforeClass");
	}
}
