package com.sgtesting.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



//==>4) launchBrowser-->navigate-->login-->createCustomer-->modifyCustomer-->deleteCustomer-->logout -->closeApplication

public class Assignment4 {
	public static WebDriver oBrowser = null;
	public static void main(String args[]) {
		launchBrowser();
		navigate();
		login();
		 CreateCustomer();
		ModifyUser();
		DeleteCustomer();
		logout();
		closeApplication();
		
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\WelcomeAutomation\\Automation\\WebAutomation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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

	static void CreateCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Telefonica");
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Telefonica");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void ModifyUser()
	{
		try
		{
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Adi12");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Aadu");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("Welcome321");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Welcome321");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome321");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_accountInformationSection\"]/div[3]/div[3]/div[4]")).click();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void DeleteCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);	
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

	static void closeApplication()
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

