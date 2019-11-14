package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String a) {
WebDriver driver=null;
        if (System.getProperty("os.name").toLowerCase().contains("Windows") && a.equalsIgnoreCase("safari")) {
            return null;
        }else if(System.getProperty("os.name").toLowerCase().contains("Mac") && a.equalsIgnoreCase("edge")) {
        return null;
        }else {
            if(a.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver =new ChromeDriver();
            }
            if(a.equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
                 driver=new FirefoxDriver();
            }
            if(a.equalsIgnoreCase("edge")){
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            }

        }
        return driver;
    }


}

