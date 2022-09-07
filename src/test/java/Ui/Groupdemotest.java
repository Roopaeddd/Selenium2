package Ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
@Test(groups= "user-registration")
public class Groupdemotest {
	@BeforeClass
	public void beforeClass() 
	{	
	System.out.println("Run this before class");	
		
  }
    @AfterClass
	public void afterClass() 
	{	
	System.out.println("Run this after class");	
		
  }
    @BeforeGroups(value= "regression")
	public void beforeGroup() 
	{	
	System.out.println("Run this method before regression");	
	}
    
    @AfterGroups(value= "regression")
	public void afterGroup() 
	{	
	System.out.println("Run this method after regression ");	
	}	
    
	@Test(priority = 1,groups="regression")
public void atest1() 
	{	
	System.out.println("test1");	
		
  }
	@Test (priority = 2,groups="regression")
	public void btest2()
	{
		System.out.println("test2");
	}
	@Test(groups={"regression","bvt"})
	public void btest3()
	{
		System.out.println("test3");
	}
	@Test(groups = "bvt")
	public void btest4()
	{
		System.out.print("test4");
	}
	
	
}


