package ParticeProject.base;

import ParticeProject.utilites.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;

public class OpenSite {
    @BeforeTest
    public void openWebsite() throws FileNotFoundException {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("https://demoqa.com/");
    }
}
