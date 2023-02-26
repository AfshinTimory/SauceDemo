package ParticeProject.pages;

import ParticeProject.utilites.Driver;
import org.openqa.selenium.By;

import java.io.IOException;

public class SauceDemo_LoginPage {


    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");
    By passwordLabel = By.xpath("//h4[text()='Password for all users:']");

    public String getPassLabel() throws IOException {
       return Driver.getDriver().findElement(passwordLabel).getText();
    }

    public void sendUsernameText(String userText) throws IOException {
        Driver.getDriver().findElement(username).sendKeys(userText);

    }
    public void sendPasswordText(String pass) throws IOException {
       Driver.getDriver().findElement(password).sendKeys(pass);
    }
    public void clickLoginBtn() throws IOException {
        Driver.getDriver().findElement(loginBtn).click();
    }
}
