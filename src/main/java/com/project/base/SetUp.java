package com.project.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {
	// we will read config file
	// which browser we need to open
// what is the url 
	public WebDriver driver;
	private File file;
	private FileInputStream fis;
	private Properties pr;
	private String browser;
	private String url;

	public SetUp() {
		pr = new Properties();
		file = new File("./Config/config.properties");
		try {
			fis = new FileInputStream(file);
			pr.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		browser = pr.getProperty("browser");
		url = pr.getProperty("url");
		


	}

	public void initialization() {
		// Take the decision which browser we need to open
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Browser Not Found " + browser);
			return;
		}

		driver.get(url);
		driver.manage().window().maximize();
	}

}
