package com.sgtesting.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//==> 2)launchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication 

public class Assignment2 {
	public static WebDriver oBrowser = null;
	public static void main(String args[]) 
	{
		launchBrowser();
		navigate();
		login();
		createuser();
		ModifyUser();
		DeleteUser();
		logout();
		CloseApplication();
		
	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("Webdriver.chrome.driver","E:\\WelcomeAutomation\\Automation\\WebAutomation\\Library\\Drivers\\chromedriver.exe" );
			oBrowser = new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


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
		}catch(Exception e)
	    {
			e.printStackTrace();
			}
	    }

    static void createuser()
    {
    	try
    	{
    		 oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
  			Thread.sleep(2000);
  			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
  			Thread.sleep(2000);
  			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo");
  			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User1");
  			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo@gmail.com");
  			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demoUser1");
  			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome1");
  			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome1");
  			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
  			Thread.sleep(5000);
     	 }catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    static void ModifyUser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Lastname10");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome123");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
			System.out.println("User1 modified successfully");
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    static void DeleteUser()
    {
    	try
    	{
    		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Zen");
    		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Car");
    		oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("zxc123");
    		oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("abc");
    		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
    		oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    static void logout()
    {
    	try
    	{
    		oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    static void CloseApplication()
    {
    	try
    	{
    		oBrowser.close();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}

