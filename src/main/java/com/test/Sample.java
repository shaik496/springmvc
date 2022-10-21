package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

    public static void main(String[] args) {
        System.out.println("This is Shaik meeravali");
      WebDriverManager.chromedriver().setup();
      WebDriver driver= new ChromeDriver();
      driver.get("http://google.com");
      driver.quit();
        
    }
    
}
