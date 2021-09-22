package com.sgtesting.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//===> 1) launchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication
public class Assignment1
{
	public static WebDriver oAdhi=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}
	
	static void launchBrowser()
	{
		try
		{
		  System.setProperty("webdriver.chrome.driver", "E:\\WelcomeAutomation\\Automation\\WebAutomation\\Library\\Drivers\\chromedriver.exe");
		  oAdhi=new ChromeDriver();
		  Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oAdhi.get("http://localhost:82/login.do");
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
			oAdhi.findElement(By.name("username")).sendKeys("admin");
			oAdhi.findElement(By.name("pwd")).sendKeys("manager");
			oAdhi.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		 

	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			oAdhi.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		 
	}

	
	static void createUser()
	{
		try
		{
		    oAdhi.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
		    oAdhi.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
		    oAdhi.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demouser");
		    oAdhi.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user1");
		    oAdhi.findElement(By.id("userDataLightBox_emailField")).sendKeys("abc@123");
		    oAdhi.findElement(By.id("userDataLightBox_usernameField")).sendKeys("abc");
		    oAdhi.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234@abc");
		    oAdhi.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234@abc");
		    Thread.sleep(4000);
		    oAdhi.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
		    Thread.sleep(4000);
		    
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		 

	}
	static void deleteUser()
	{
		try
		{
		  oAdhi.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")).click();
		  oAdhi.findElement(By.id("userDataLightBox_deleteBtn")).click();
		  Alert monkey=oAdhi.switchTo().alert();
		  Thread.sleep(4000);
		  monkey.accept();
		  Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		 

	}
	static void logout()
	{
		try
		{
			 oAdhi.findElement(By.id("logoutLink")).click();
			 Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		 

	}
	static void closeApplication()
	{
		try
		{
			oAdhi.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		 
	}
}