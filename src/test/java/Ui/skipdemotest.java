package Ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipdemotest {
	Boolean datasetup=true;
	@Test(enabled = false)
public void skiptest1()
{
	System.out.println("skipping this test as it is not complete");
	
}    @Test
	 public void skiptest2()
	 {
		 System.out.println("Skipping this test forcfully");
		 throw new SkipException("Skipping this test");
		 
	 }
      @Test
	  public void skiptest3()
	  {
    	  
		  System.out.println("Skinpping this test based on condition");
		  if(datasetup=true)
		  {
		  System.out.println("Execute the test");
		  }
		  else
		  {
			  System.out.println("Do not execute further steps");
		  throw new SkipException("Do not execute further steps");
	  }

}
}