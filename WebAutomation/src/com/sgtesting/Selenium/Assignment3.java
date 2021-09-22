package com.sgtesting.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



//==> 3) launchBrowser-->navigate-->login-->createCustomer-->deleteCustomer-->logout -->closeApplication 

public class Assignment3 {
public static WebDriver oBrowser = null;
public static void main(String args[]) 
{
	launchBrowser();
	navigate();
	login();
	CreateCustomer();
	DeleteCustomer();
	Logout();
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

static void CreateCustomer()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
		oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User1");
		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Last Name");
		oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("User1.Lastname@gmail.com");
		oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User1");
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome123");
		oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome123");
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		Thread.sleep(5000);
		System.out.println("User1 created successfully");
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


static void Logout()
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



