package com.sgtesting.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class A {
	public static WebDriver oBrowser = null;
	
	
	  static void zaunchBrowser()
	  {
		  try
		  {
			  System.setProperty("WebDriver.chrome.driver", "E:\\WelcomeAutomation\\Automation\\WebAutomation\\Library\\Drivers\\chromedriver.exe");
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
	    @Test
		  static void navigate()
		    {
		    	try
		    	{
		    		oBrowser.get("http://localhost:82/login.do");
		    			Thread.sleep(4000);
		    	}catch(Exception e)
		    	{
		    		e.printStackTrace();
		    	}
		    }

			static void login()
			{
				try
				{
					oBrowser.findElement(By.id("username")).sendKeys("admin");
					oBrowser.findElement(By.name("pwd")).sendKeys("manager");
					oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
					Thread.sleep(4000);
					System.out.println("Active time logged in successfully");	
				}catch(Exception e)
			    {
					e.printStackTrace();
					}
			    }
			
}

