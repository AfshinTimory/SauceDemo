package ParticeProject.tests;

import ParticeProject.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;

public class Website {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Driver.getDriver().get("https://demo.opencart.com/admin/index.php?route=sale/order&user_token=ea36aab6a5393ede6420b607bf3b4f09");
WebElement user = Driver.getDriver().findElement(By.name("username"));
user.sendKeys("demo");
        WebElement pass = Driver.getDriver().findElement(By.name("password"));
        pass.sendKeys("demo");

        Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(4000);
Driver.getDriver().manage().window().maximize();
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("window.scrollBy(0, 210)");

        String nopage = Driver.getDriver().findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
       String Nopage = nopage.substring(nopage.indexOf("(")+1, nopage.indexOf("(")+2);
       int NoOfPage = Integer.parseInt(Nopage);

        System.out.println("Number of total page: "+NoOfPage);


        for (int j = 2; j <= NoOfPage; j++) {

           int totalRow = Driver.getDriver().findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();

            Thread.sleep(3000);
            for (int i = 1; i <= totalRow; i++) {
               String orderID =  Driver.getDriver().findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[2]")).getText();
               String store = Driver.getDriver().findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[3]")).getText();
               String status = Driver.getDriver().findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[4]")).getText();
                System.out.println( orderID+"   "+store+"  "+status);

            }
            WebElement nextPage = Driver.getDriver().findElement(By.xpath("//a[text()='"+j+"']"));
            executor.executeScript("arguments[0].click();", nextPage);

        }


}

    }

