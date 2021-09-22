package com.sgtesting.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//====== Advanced Scenarios

/*launchBrowser-->navigate-->login as admin-->createUser [User1,User2,User3] -->logout--->
login as User1--->logout-->Login as User2 --> logout -->login as User3 --> logout-->
login as admin [modify the password for User1,User2,User3] --> logout -->
login as User1--->logout-->Login as User2 --> logout -->login as User3 --> logout-->
login as Admin --> Delete [User1,User2,User3]-->logout -->closeApplication		*/

//tagName[@attribute = 'Value']

public class Assignment9 {
	
	public static void main(String args[])
	{
		launchBrowser();
		navigate();
		login();
		clickUser();
		createUser();
		user1();
		logout();
		
	}
	
 static WebDriver oBrowser = null;
	
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
			oBrowser.findElement(By.xpath("//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void clickUser()
	{
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
	}
	static void createUser()
	{
		try
		{
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("zxc1");
		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Demo1");
		oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("userdemo1@gmail.com");
		Thread.sleep(1000);
		oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Adi");
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("asd123");
		Thread.sleep(1500);
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("asd123");
		Thread.sleep(1500);
		oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
	}catch(Exception e1)
	{
		e1.printStackTrace();
	}
}
	
	static void logout()
	{
		oBrowser.findElement(By.id("logoutLink")).click();
	}


 static void user1()
  {
	  try
	  {
		  Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("qwe");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Demo2");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("userdemo2@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Qaz");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("abc123");
			Thread.sleep(1500);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abc123");
			Thread.sleep(1500);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
		  
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
   }
 
 static void logout1()
 {
	oBrowser.findElement(By.id("logoutLink")).click(); 
 }
 }
 
   

	

