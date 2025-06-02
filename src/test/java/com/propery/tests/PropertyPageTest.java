package com.propery.tests;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.insurance.utils.ExcelUtility;
import com.project.base.SetUp;
import com.property.pages.PropertyPage;

public class PropertyPageTest extends SetUp {
	//pre - conditions ; 
	//Test -> 
	
	PropertyPage pr;

	PropertyPageTest()
	{  
		// execute parent constructor: -> read the browser value and url
		initialization();
		pr=new PropertyPage(driver);
	}
	
	
	@Test
	public void validatePropertyDetails()
	{
		pr.enterCurrentMarketValue("100000");
		pr.enterCarpetArea("1000");
		pr.enterPincode("500081");
		pr.ageOfBuilding("0 to 5 Years");
		pr.isPropertyEffected("No");
		pr.selectSecurity("Yes");
		pr.selectSalariedPerson("Yes");
		pr.clickOnViewQuotesBtn();
		String s=pr.getTaxInfo();
	    Assert.assertEquals(s,"All premiums are inclusive of GST");	
		//Assertions: Validate the test
	}
	
	@Test(dataProvider="ageOfBuildingData")
	public void validatePropertyDetailsWithAllOptionsOfAgeOfBuilding(String val) throws InterruptedException
	{
//		pr.enterCurrentMarketValue("100000");
//		pr.enterCarpetArea("1000");
//		pr.enterPincode("500081");
//		pr.ageOfBuilding(val);
//		pr.isPropertyEffected("No");
//		pr.selectSecurity("Yes");
//		pr.selectSalariedPerson("Yes");
//		pr.clickOnViewQuotesBtn();
//		String s=pr.getTaxInfo();
//	    Assert.assertEquals(s,"All premiums are inclusive of GST");	
//	    Thread.sleep(2000);
		
		System.out.println(val);
	    
	}
	
	
	@DataProvider()
	public String[] ageOfBuildingData()
	{
//		String arr[]= {
//				"0 to 5 Years",
//				"5 to 10 Years"
//		};
//		return arr;
		
		String arr[]=ExcelUtility.readExcelFile();
		return arr;
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	

}
