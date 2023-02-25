package ParticeProject.pages;

import ParticeProject.base.Wait;
import ParticeProject.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.FileNotFoundException;

public class Elements extends Wait {
    By CheckBox = By.xpath("//span[normalize-space()='Check Box']");
    By CheckBoxBox  =By.xpath("//span[@class='rct-checkbox']//*[name()='svg']");

    By ResultString = By.xpath("//div[@id='result']");

    public Elements() throws FileNotFoundException {
    }
    public void clickCheck (){
        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(CheckBox))).click();
    }
    public void CheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(CheckBoxBox))).click();
    }
    public String GetTextCheck(){
        String Actual = wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(ResultString))).getText();
        return Actual;
    }
}
