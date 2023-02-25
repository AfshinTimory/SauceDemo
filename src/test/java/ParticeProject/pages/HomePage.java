package ParticeProject.pages;

import ParticeProject.base.Wait;
import ParticeProject.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.FileNotFoundException;

public class HomePage extends Wait {
    By elements = By.xpath("//h5[text()='Elements']");
    By forms = By.xpath("//h5[text()='Forms']//parent::div");
    By alerts = By.xpath("(//div[@class='card-body'])[3]");
    By widgets = By.xpath("(//div[@class='card-body'])[4]");
    By interactions = By.xpath("(//div[@class='card-body'])[5]");
    By bookstore = By.xpath("(//div[@class='card-body'])[6]");

    public HomePage() throws FileNotFoundException {
    }


    public void ClickElements() throws FileNotFoundException {
     wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(elements))).click();

    }



}
