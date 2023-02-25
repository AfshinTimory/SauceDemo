package ParticeProject.tests;

import ParticeProject.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;

import java.io.FileNotFoundException;
import java.util.List;

public class Table {
    public static void main(String[] args) throws FileNotFoundException {
        Driver.getDriver().get("https://www.worldometers.info/world-population/us-population/");
        Driver.getDriver().manage().window().maximize();
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("window.scrollBy(0, 1000)");

        List<WebElement> tablerows = Driver.getDriver().findElements(By.xpath("//table[@class='table table-striped table-bordered table-hover table-condensed table-list']//tbody/tr"));
        int tableRows = tablerows.size();
        System.out.println("Num of Row  = "+ tableRows);
        List<WebElement> tableCol = Driver.getDriver().findElements(By.xpath("//table[@class='table table-striped table-bordered table-hover table-condensed table-list']//tbody//tr[1]//td"));
        int tableColm = tableCol.size();
        System.out.println("Num of Col  = "+tableColm);

    }
}
