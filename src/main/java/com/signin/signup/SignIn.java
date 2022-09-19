package com.signin.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {
    
	@Test
	 public void SignInmethod() throws InterruptedException {
	       
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\akash.koti\\Downloads\\chromedriver_win32\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         Thread.sleep(1000);
	         
	         //driver.get("https://mobileworld.azurewebsites.net/");
	         LandingPage landingpage = new LandingPage(driver);
	         landingpage.goTo();
	         Thread.sleep(1000); 
	         landingpage.signinapplication("akashk","Akash@123");
	            
	       
	    }
	    

}
