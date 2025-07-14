package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHomePage {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://<YOUR_DEPLOYED_APP_URL>/Jenkins-CICD-simpleJavaWebapp/");
            String pageSource = driver.getPageSource();

            if (pageSource.contains("Welcome to Jenkins CI/CD Java WebApp!")) {
                System.out.println("✅ Test Passed");
            } else {
                System.err.println("❌ Test Failed: Expected content not found.");
            }

        } catch (Exception e) {
            System.err.println("❌ Test Failed: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}

