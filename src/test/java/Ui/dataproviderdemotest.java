package Ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderdemotest {
	
	
	@Test(dataProvider="dataSet")
	public void test (String username,String password)
	{
		System.out.println(username+"======="+password);
	}
	
	
	
	@DataProvider
	public Object[][] dataSet()
	{
		Object[] [] dataset = new Object [5][2];
		
		//First row
		dataset [0][0]= "user1";
		dataset [0][1]= "pass1";
		
		//second row
		dataset [1][0]= "user2";
		dataset [1][1]= "pass2";
		
		//third row
		dataset [2][0]= "user3";
		dataset [2][1]= "pass3";
		
		//fourth row
		dataset [3][0]= "user4";
		dataset [3][1]= "pass4";
		
		//fifth row
		dataset [4][0]= "user5";
		dataset [4][1]= "pass5";
		return dataset;
		
		
		
	}

}
