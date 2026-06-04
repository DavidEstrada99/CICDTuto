package com.selenium.DavidTuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * first selenium test
 */
public class FirstTest 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");

        driver.quit();
    }
}
