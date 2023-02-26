package ParticeProject.pages;

import ParticeProject.base.Wait;
import ParticeProject.utilites.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.FileNotFoundException;



public class SuaceDemo_inventory extends Wait {
    public SuaceDemo_inventory() throws FileNotFoundException {
    }

    By login_Btn = By.id("login-button");
    By product_text = By.xpath("//span[text()='Products']");
    By burger_menu = By.id("react-burger-menu-btn");
    By logOut_Btn = By.id("logout_sidebar_link");


    public void clickLogOut() {
        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(logOut_Btn))).click();
    }

    public String getProductText() {
        return wait.until(ExpectedConditions.elementToBeClickable(product_text)).getText();
    }

    public void click_BurgerMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(burger_menu))).click();
    }

    public boolean logOut_BtnPresent() {
        return wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(logOut_Btn))).isDisplayed();
    }

    public boolean login_btnClickable() {
        return wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(logOut_Btn))).isEnabled();
    }

    public void clickLogOut_Btn() {
        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(logOut_Btn)));
    }

    public boolean isLoginBtn_present() {
        return wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(login_Btn))).isDisplayed();
    }



}
