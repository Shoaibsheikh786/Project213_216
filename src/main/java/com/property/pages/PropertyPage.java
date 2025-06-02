package com.property.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.insurance.utils.Dd;
import com.project.base.SetUp;

public class PropertyPage extends SetUp{
	
	//1. WebElements 
	//2. Actions
	//3. Constructor
	///______________________________________
	public  PropertyPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='marketValue']")
	WebElement cMarketVal;
	public void enterCurrentMarketValue(String val)
	{
		cMarketVal.sendKeys(val);
		
	}
	
	@FindBy(xpath="//input[@name='squareFeet']")
	WebElement carpetArea;
	public void enterCarpetArea(String val)
	{
		carpetArea.sendKeys(val);
	}
	
	@FindBy(xpath="//input[@name='pincode']")
	WebElement pincode;
	public void enterPincode(String pin)
	{
		pincode.sendKeys(pin);
	}
	
	@FindBy(id="age")
	WebElement ageOfBuilding;
	
	public void ageOfBuilding(String val)
	{
//		Select sel=new Select(ageOfBuilding);
//		sel.selectByValue(val);
		
		Dd.selectByText(ageOfBuilding, val);
	}
	
	@FindBy(id="effect")
	WebElement propertyEffect;
	public void isPropertyEffected(String val)
	{
//		Select sel=new Select(propertyEffect);
//		sel.selectByValue(val);
		Dd.selectByText(propertyEffect, val);
		
	}
	
	@FindBy(id="security")
	WebElement security;
	public void selectSecurity(String val)
	{
		Dd.selectByText(security, val);
	}
	
	@FindBy(id="person")
	WebElement salaried;
	public void selectSalariedPerson(String val)
	{
		Dd.selectByText(salaried, val);
	}
	@FindBy(xpath="//button[text()=' View Quotes ']")
	WebElement viewQuotes;
	public void clickOnViewQuotesBtn()
	{
		viewQuotes.click();
	}
	//********************************************************
	
	@FindBy(xpath="//p[text()='All premiums are inclusive of GST']")
	WebElement taxInfo;
	public String getTaxInfo()
	{
		String t=taxInfo.getText();
		return t;
	}
	
	

}
