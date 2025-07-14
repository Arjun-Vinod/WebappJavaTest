package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHomePage {

    public static void main(String[] args) {
        // Set chromedriver path if not in PATH
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        try {
            driver.get("http://<YOUR_DEPLOYED_APP_URL>/Jenkins-CICD-simpleJavaWebapp/");
            String pageSource = driver.getPageSource();
            if (pageSource.contains("Welcome to Jenkins CI/CD Java WebApp!")) {
                System.out.println("✅ Test Passed: Text found!");
            } else {
                System.out.println("❌ Test Failed: Text NOT found!");
                System.exit(1);
            }
        } catch (Exception e) {
            System.out.println("❌ Test Failed with Exception: " + e.getMessage());
            System.exit(1);
        } finally {
            driver.quit();
        }
    }
}

