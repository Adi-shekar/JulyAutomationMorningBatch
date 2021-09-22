package com.sgtesting.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//==>  7) launchBrowser-->navigate-->login-->createCustomer-->CreateProject-->Create Tasks -->Delete Tasks -->DeleteProject-->deleteCustomer-->logout -->closeApplication

public class Assignment7 {
	public static WebDriver oBrowser = null;
    public static void main(String args[])
    {
    	launchBrowser();
		Navigate();
		Login();
		createCustomer();
		createProject();
		createTasks();
		deleteTasks();
		deleteProject();
		deleteCustomer();
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


	static void Navigate()
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

	static void Login()
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
	
	static void createCustomer()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Telefonica");
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Telefonica");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
    			
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

	static void createProject()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
		    oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("SMIP");
			oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("SMIP");
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
    			
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

	static void createTasks()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("Testing");
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
	
	static void deleteTasks()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")).click();
			oBrowser.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

	static void deleteProject()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
    			
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

	static void deleteCustomer()
    {
    	try
    	{
            oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
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


