package ParticeProject.base;

import ParticeProject.utilites.Driver;
import ParticeProject.utilites.ExcelUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OpenSite {

    @BeforeTest
    public void openWebsite() throws FileNotFoundException {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("https://www.saucedemo.com/");
    }

    @DataProvider
    public Object[][] credential() throws IOException {


        return new Object[][]{{"standard_user", "secret_sauce"}};
    }

    @AfterTest
    public void CloseBrowser() throws InterruptedException {
        Thread.sleep(10000);
        Driver.getDriver().quit();
    }
}
