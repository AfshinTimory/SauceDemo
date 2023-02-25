package ParticeProject.tests;

import ParticeProject.utilites.Configurations;
import ParticeProject.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;

public class test1 {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("https://demoqa.com/droppable");
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("window.scrollBy(0, 200)");
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
      // WebElement dropdown =  Driver.getDriver().findElement(By.id("oldSelectMenu"));
       // Actions actions = new Actions(Driver.getDriver());
        //actions.moveToElement(dropdown).perform();
       // Select select = new Select(dropdown);
      //  select.selectByIndex(3);

      //  List<WebElement> dropOptions = select.getOptions();
       // for (WebElement e : dropOptions){
          //  System.out.println(e.getText());
       // }
//        WebElement options = Driver.getDriver().findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']"));
//        options.click();
//        WebElement option2 = Driver.getDriver().findElement(By.xpath("//div[text()='Group 1, option 2']"));
//        option2.click();

        //WebElement multiSelect = Driver.getDriver().findElement(By.xpath("(//div[@class=' css-1hwfws3'])[3]"));
        //multiSelect.click();
       // WebElement green = Driver.getDriver().findElement(By.xpath("//div[@class='css-12jo7m5']"));
        //green.click();
      // WebElement black =  Driver.getDriver().findElement(By.xpath("(//div[@class='css-12jo7m5'])[2]"));
       //black.click();

        WebElement drag = Driver.getDriver().findElement(By.id("draggable"));
        WebElement drop = Driver.getDriver().findElement(By.id("droppable"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(drag).clickAndHold().moveToElement(drop).release().perform();
        //actions.dragAndDrop(drag, drop).perform();
       Thread.sleep(5000);
        Driver.getDriver().close();
    }

}
