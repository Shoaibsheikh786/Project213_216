package com.propery.tests;

import org.testng.annotations.Test;

import com.project.base.SetUp;
import com.property.pages.PropertyPage;

public class GetQuotesTest extends SetUp {
	
	//@Test
	//Constructor
	PropertyPage pr;
	
	GetQuotesTest()
	{
		initialization();
		pr=new PropertyPage(driver);
	}
	@Test
	public void checkCallBtn()
	{
		pr.enterCurrentMarketValue("100000");
		pr.enterCarpetArea("1000");
		pr.enterPincode("193222");
		pr.ageOfBuilding("0 to 5 Years");
		pr.isPropertyEffected("No");
		pr.selectSalariedPerson("Yes");
		pr.selectSecurity("Yes");
		pr.clickOnViewQuotesBtn();
	}

}
