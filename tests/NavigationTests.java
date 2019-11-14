package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class NavigationTests {
    public static void main(String[] args) {
        ArrayList<String> choice = new ArrayList<String>();
        choice.add("chrome");
        choice.add("firefox");
        choice.add("edge");
        for (String each : choice) {
            if (each.equalsIgnoreCase("chrome")) {
                WebDriver driver = BrowserFactory.getDriver("chrome");
                driver.get("https://google.com");
                String title = driver.getTitle();
                driver.get("https://etsy.com");
                String title2 = driver.getTitle();
                driver.navigate().to("https://google.com");
                if (driver.getTitle().equalsIgnoreCase(title)) {
                    System.out.println("PASS");
                } else
                    System.out.println("FAIL");
                driver.navigate().to("https://etsy.com");
                if (driver.getTitle().equalsIgnoreCase(title2)) {
                    System.out.println("PASS");
                } else
                    System.out.println("FAIL");
driver.quit();
              }
          if (each.equalsIgnoreCase("firefox")) {
                WebDriver driver = BrowserFactory.getDriver("firefox");
                driver.get("https://google.com");
                String title = driver.getTitle();
                driver.get("https://etsy.com");
                String title2 = driver.getTitle();
                driver.navigate().to("https://google.com");
                if (driver.getTitle().equalsIgnoreCase(title)) {
                    System.out.println("PASS");
                } else
                    System.out.println("FAIL");
                driver.navigate().to("https://etsy.com");
                if (driver.getTitle().equalsIgnoreCase(title2)) {
                    System.out.println("PASS");
                } else
                    System.out.println("FAIL");
driver.quit();
            }
            if (each.equalsIgnoreCase("edge")) {
                WebDriver driver = BrowserFactory.getDriver("edge");
                driver.get("https://google.com");
                String title = driver.getTitle();
                driver.get("https://etsy.com");
                String title2 = driver.getTitle();
                driver.navigate().to("https://google.com");
                if (driver.getTitle().equalsIgnoreCase(title)) {
                    System.out.println("PASS");
                } else
                    System.out.println("FAIL");
                driver.navigate().to("https://etsy.com");
                if (driver.getTitle().equalsIgnoreCase(title2)) {
                    System.out.println("PASS");
                } else
                    System.out.println("FAIL");
driver.quit();
            }
        }
    }
}