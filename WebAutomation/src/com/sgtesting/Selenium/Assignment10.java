package com.sgtesting.Selenium;

import org.openqa.selenium.WebDriver;

//====== Advanced Scenarios

//==> 2)launchBrowser-->navigate-->login as Admin-->createUser [User1] -->logout ->login as User1-->createUser [User2] -->logout -->login as User2 --> createUser [User3]--> logout-->login as User3 --> logout -->login as User2 -->modify password for User3-->logout --> login as User3 --> logout-->
//login as User1 -->modify password for User2 --> logout -->login as User2 --> logout-->login as admin--> modify password for User1 --> logout -->login as User1 --> logout --> login as User2 --> Delete User3--> logout --> login as User1 --> delete USer2 --> logout --> login as Admin --> delete User1 --> logout --> closeApplication


public class Assignment10 {
	public static WebDriver oBrowser = null;
    public static void main(String args[])
    {
    	launchBrowser();
    	navigate();
    	
    }
    
    static void launchBrowser()
    {
    	try {
    		
    	    }catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

    static void navigate()
    {
    	try {
    		
    	    }catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

}
