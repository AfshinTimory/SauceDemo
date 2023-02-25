package ParticeProject.tests;

import ParticeProject.utilites.Driver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws FileNotFoundException {

        Driver.getDriver().get("https://www.salesforce.com/au/");

        Driver.getDriver().findElement(By.xpath("//div[contains(@class,'margin-0-top-lg margin-0-bottom-lg margin-20-left-sm text-left')]//span[contains(text(),'Start my free trial')]")).click();

        Set<String> windowsHandel = Driver.getDriver().getWindowHandles();

        Iterator<String> iterator = windowsHandel.iterator();

        String parentWin = iterator.next();
        String childWin = iterator.next();

        Driver.getDriver().switchTo().window(childWin);

        Driver.getDriver().findElement(By.name("UserFirstName")).sendKeys("Karim");
        Driver.getDriver().findElement(By.name("UserLastName")).sendKeys("Bagheri");


    }
}
