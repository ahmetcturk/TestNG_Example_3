package firstPackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	// @BeforeTest, @BeforeMethod, @BeforeClass, @Test
	// @AfterTest, @AfterMethod, @AfterClass
	
	@BeforeClass
	public void m_5(){
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void m_6(){
		System.out.println("AfterClass");
	}

	
	@BeforeTest
	public void m_1(){
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void m_2(){
		System.out.println("AfterTest");
	}
	
	@BeforeMethod
	public void m_3(){
		System.out.println("Before Method");
	}
	@AfterMethod
	public void m_4(){
		System.out.println("After Method");	
	}
	
	@Test(priority = 1, groups = {"Sanity","Regression"})
	public void test1(){
		// Assertions : work like if else blocks, and if we get expected result, gives green, 
		// otherwise gives red
		Assert.assertEquals("Hello", "Hello");
		System.out.println("test1");
	}
	
	@Test(priority = 2, groups = {"Sanity","Regression","G1"})
	public void test2(){
		System.out.println("test2");
	}
	
	@Test(priority = 3, groups = {"Smoke","Regression"})
	public void test3(){
		System.out.println("test3");
	}

	@Test(priority = 4, groups = {"Smoke","Regression","G1"})
	public void test4(){
		System.out.println("test4");
	}
	
	
}
