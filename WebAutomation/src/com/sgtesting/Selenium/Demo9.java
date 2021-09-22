package com.sgtesting.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*launchBrowser-->navigate-->login as admin-->createUser [User1,User2,User3] -->logout--->
login as User1--->logout-->Login as User2 --> logout -->login as User3 --> logout-->
login as admin [modify the password for User1,User2,User3] --> logout -->
login as User1--->logout-->Login as User2 --> logout -->login as User3 --> logout-->
login as Admin --> Delete [User1,User2,User3]-->logout -->closeApplication		*/

public class Demo9 {

	public static void main(String[] args) 
	{
		launch();
	}
	static WebDriver driver=null;
	
	static void launch() 
	{
		
		driver=new ChromeDriver();
	}
	
}
