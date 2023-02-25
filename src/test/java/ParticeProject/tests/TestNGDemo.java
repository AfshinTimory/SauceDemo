package ParticeProject.tests;

import ParticeProject.base.OpenSite;
import ParticeProject.pages.Elements;
import ParticeProject.pages.HomePage;
import ParticeProject.utilites.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.FileNotFoundException;

public class TestNGDemo extends OpenSite{
    HomePage homePage = new HomePage();
    Elements elements = new Elements();

    public TestNGDemo() throws FileNotFoundException {
    }

    @Test(invocationCount = 1 )
    public void Test1() throws FileNotFoundException {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("window.scrollBy(0,300)");
        homePage.ClickElements();

    }

    @Test(description = "click check box")
    public void Test2() throws FileNotFoundException {

        elements.clickCheck();
    }
    @Test
    public void Test3() throws FileNotFoundException {
        elements.CheckBox();
    }
    @Test
    public void Test4(){
        String Actual = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";

        String Expected = elements.GetTextCheck();
        Assert.assertEquals(Actual,Expected);

    }
    @DataProvider
    public Object[][] provider(){
        return new Object[][]{
                {"Karim","Rahim"},
                {"Borar Karim","Maqsood"},
                {"Piar Karim","Saoud"}};
    }
    @Test(dataProvider =  "provider")
    public void nameProvider(String name, String name2){
        System.out.println(name + name2);
    }
    @Test
    @Parameters("NewParam")
    public void testParam(String param){
        System.out.println(param);
    }


    @Test
    public void Test5(){
        String name = "Karim";
        String lasname = "Bagheri";
        int age = 30;
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("Karimi ", name);
        softAssert.assertEquals("Bagher2i", lasname);
        softAssert.assertEquals(31,age);
        softAssert.assertAll();
    }
}
