package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("chromedriver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box"); //siteyi aç
        driver.manage().window().maximize(); //ekranı büyüt

        WebElement fullName = driver.findElement(By.id("userName")); //element eşleştir
        fullName.click(); //tıkla
        fullName.sendKeys("sametozalp"); //değerini yaz

        WebElement email = driver.findElement(By.cssSelector(".mr-sm-2[id=\'userEmail\']"));
        email.click();
        email.sendKeys("deneme@gmail.com");

        WebElement currentAdress = driver.findElement(By.id("currentAddress"));
        currentAdress.sendKeys("BahçeliEvler");

        WebElement buton = driver.findElement(By.id("submit"));
        buton.click();

        WebElement nameText = driver.findElement(By.id("name"));
        String name = nameText.getText();
        System.out.println(name);

    }
}