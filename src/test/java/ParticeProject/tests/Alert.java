package ParticeProject.tests;

import ParticeProject.utilites.Driver;
import org.example.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;

public class Alert {
    public static void main(String[] args) throws FileNotFoundException {

        Driver.getDriver().manage().window().maximize();

        Driver.getDriver().get("https://demoqa.com/alerts");

        Driver.getDriver().findElement(By.id("confirmButton")).click();
        org.openqa.selenium.Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        WebElement text = Driver.getDriver().findElement(By.id("confirmResult"));
        System.out.println(text.getText());
        System.out.println();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));

    }
}
