package ParticeProject.base;

import ParticeProject.utilites.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;

public class Wait {


public WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


        public Wait() throws FileNotFoundException {
        }

}

