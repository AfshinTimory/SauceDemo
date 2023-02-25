package ParticeProject.utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileNotFoundException;


public class Driver {

    private static WebDriver driver;
    public Driver(){

    }

public static synchronized WebDriver getDriver()  {
    if(driver == null){

        String browser = null;
        try {
            browser = Configurations.setValue("Browser");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        switch (browser){
        case "chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
        case"firefox":
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            break;
        default:
            throw new RuntimeException("invalid driver selection");

}
}
    return driver;

}}
