/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Downloads/chrome-headless-shell-win64/chrome-headless-shell.exe");

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        System.out.println("Hello World!");
    }
}
