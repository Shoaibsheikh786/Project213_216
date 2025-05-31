package com.insurance.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dd {
	
	public static void selectByText(WebElement ele,String text)
	{  
		System.out.println("user selected "+text);
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}

}
