package myPackage;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	@Test
	public void a2() {
		System.out.println("this is A2");
	}

	@Test
	public void a1() {
		System.out.println("this is A1");
	}

	@BeforeTest
	public void a3() {

		System.out.println("@before test method");
	}

	@BeforeSuite
	public void a4() {

		System.out.println("@before suit method");
	}

	@BeforeMethod
	public void a33() {

		System.out.println("@beforemethod method");

	}

	@AfterMethod
	public void a333() {

		System.out.println("@afterMethod method");

	}

	@BeforeClass
	public void a3333() {

		System.out.println("@BeforeClass method");

	}

	@AfterClass
	public void a33333() {

		System.out.println("AfterClass method");

	}

	@AfterSuite
	public void a333333() {

		System.out.println("AfterSuite method");

	}

	@AfterSuite
	public void a3333335() {

		System.out.println("AfterSuit method");

	}
}
