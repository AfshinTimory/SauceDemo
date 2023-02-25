package ParticeProject.tests;

import ParticeProject.utilites.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;

public class Iframe {

    public static void main(String[] args) throws FileNotFoundException {
        Driver.getDriver().get("https://demo.guru99.com/test/guru99home/");
        int frameSize = Driver.getDriver().findElements(By.tagName("iframe")).size();
        System.out.println(frameSize);
       // Driver.getDriver().switchTo().frame("a077aa5e");
        Driver.getDriver().findElement(By.xpath("html/body/a/img")).click();


    }
}
