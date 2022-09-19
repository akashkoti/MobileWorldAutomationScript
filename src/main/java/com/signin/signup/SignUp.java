package com.signin.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class SignUp {
	
@Test
    public void SignUpmethod () throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\akash.koti\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         Thread.sleep(3000);
         LandingPage landingpage2 = new LandingPage(driver);
         Thread.sleep(3000);
         landingpage2.goTo();
         Thread.sleep(3000);
         landingpage2.signupapp("Akash","koti","akashk@gmail.com","akash@123" ,"02/09/1999","1234567890","Welcome to Qualitest");
      driver.switchTo().alert().accept();
    }
}