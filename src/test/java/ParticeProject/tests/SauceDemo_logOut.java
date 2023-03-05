package ParticeProject.tests;

import ParticeProject.base.OpenSite;
import ParticeProject.pages.SauceDemo_LoginPage;
import ParticeProject.pages.SuaceDemo_inventory;
import ParticeProject.utilites.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SauceDemo_logOut extends OpenSite {
    SauceDemo_LoginPage loginPage = new SauceDemo_LoginPage();
    SuaceDemo_inventory inventory = new SuaceDemo_inventory();

    public SauceDemo_logOut() throws FileNotFoundException {
    }


    @Test(dataProvider = "credential", priority = 0)
    public void loginToInventory(String username, String password) throws IOException {

    loginPage.sendUsernameText(username);
    loginPage.sendPasswordText(password);
    loginPage.clickLoginBtn();
    String actualText = "PRODUCTS";
    Assert.assertTrue(actualText.equalsIgnoreCase(inventory.getProductText() ), "System has been logged in Successfully");

    }
@Test(priority = 2)
    public void isLogOutBtn_Present(){

Assert.assertTrue(inventory.logOut_BtnPresent(), "LogOut Button in Present.");
    }

    @Test(priority = 1)
    public void loginBtn_is_clickable(){
        inventory.click_BurgerMenu();
        Assert.assertTrue(inventory.logOut_BtnPresent(), "LogOut Button in Clickable.");
    }
    @Test(priority = 3)
    public void LogOut_done() throws InterruptedException {
        inventory.clickLogOut();
        Thread.sleep(2000);
        Assert.assertTrue(inventory.isLoginBtn_present(), "System logged Out successfully");

    }



}
