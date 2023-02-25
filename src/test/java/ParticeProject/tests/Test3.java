package ParticeProject.tests;

import ParticeProject.utilites.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Actions actions = new Actions(Driver.getDriver());

        Driver.getDriver().get("https://www.saucedemo.com/");
        Driver.getDriver().findElement(By.id("user-name")).sendKeys("standard_user");
        Driver.getDriver().findElement(By.id("password")).sendKeys("secret_sauce");
        Driver.getDriver().findElement(By.id("login-button")).click();
        List<WebElement> alllinks = Driver.getDriver().findElements(By.tagName("a"));

        for (WebElement e : alllinks){
            System.out.println(e.getText() +"       "+e.getAttribute("href"));
        }

        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File scrFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File des = new File("screen");
        FileUtils.copyFile(scrFile, des);

    }
}
