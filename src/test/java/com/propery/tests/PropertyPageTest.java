package com.propery.tests;

import org.testng.annotations.Test;

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
		
		//Assertions: Validate the test
	}
	

}
