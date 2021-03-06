package com.sgtesting.Selenium.BrowserOptions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FireFoxProfilesDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		
	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "E:\\WelcomeAutomation\\Automation\\WebAutomation\\Library\\Drivers\\geckodriver.exe");
			//Manual Appraoch
			ProfilesIni profileini=new ProfilesIni();
			FirefoxProfile ffprofile=profileini.getProfile("sgtesting");
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(ffprofile);
			oBrowser=new FirefoxDriver(options);
			
			//Programmatic Approach
		/*	FirefoxProfile ffprofile=new FirefoxProfile();
			ffprofile.setPreference("browser.startup.homepage", "http://www.sgtestinginstitute.com");
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(ffprofile);
			oBrowser=new FirefoxDriver(options);
		*/	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}


