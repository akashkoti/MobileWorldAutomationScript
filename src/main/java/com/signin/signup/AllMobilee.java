package com.signin.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllMobilee {
@Test
    public void allmobiles() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\akash.koti\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         Thread.sleep(2000);
         LandingPage landingpage4 = new LandingPage(driver);
         landingpage4.goTo();
         Thread.sleep(2000);
         landingpage4.searchbox("samsung");
         Thread.sleep(2000);
         landingpage4.searchbox("Apple");
         Thread.sleep(2000);
         landingpage4.searchbox("sa");
         Thread.sleep(2000);
         landingpage4.searchbox("12345");
         Thread.sleep(2000);
         landingpage4.searchbox("@#$^&*!");
         
    }
}