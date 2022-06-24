package Test;

import Base.BasePage;
//import Base.ExcelReader;
import Pages.SidebarPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class ElementsTest extends BasePage {


    public static Base.ExcelReader excelReader;

    @BeforeMethod
    public void setUpPage() throws InterruptedException, IOException {

        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/elements");
        Thread.sleep(2000);

       // excelReader = new Base.ExcelReader("C:\\Users\\DELL Latitude\\Desktop\\TestData.xlsx");
    }

    @Test
    public void TextBoxTest () throws InterruptedException {
        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();
        homepage.getElementsButton().click();

        sidebarPage.getTextBox().click();
        Thread.sleep(2000);
        textBox.getFullName().sendKeys("Milan Jorgos");
        Thread.sleep(1000);
        textBox.getEmail().sendKeys("imeprezime@mail.com");
        Thread.sleep(1000);
        textBox.getCurrento().sendKeys("Tall Steve numero 357");
        Thread.sleep(1000);
        textBox.getPermanento().sendKeys("Gandraz plejs 13");



    }
    @Test
    public void verifyTextBoxIsOpened()  {
        elementsPage.getTextBox().click();

        String url = excelReader.getStringData("URL", 2, 0);
        Assert.assertEquals("https://demoqa.com/text-box", url);
    }

    @Test
    public void verifyCheckBoxIsOpened()  {
        elementsPage.getCheckBox().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/checkbox");
    }

    @Test
    public void verifyRadioButtonIsOpened()  {
        elementsPage.getRadioButton().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
    }

    @Test
    public void verifyThatDynamicIsOpended(){
        WebElement dinamiko = driver.findElement(By.id("item-8"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dinamiko);

        dinamiko.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/dynamic-properties");
    }
    @Test
    public void verifyListCanBeExpanded(){
        verifyCheckBoxIsOpened();
        checkBox.getArrow().click();
    }

    @Test
    public void verifyListMemberIsClickable(){
        verifyListCanBeExpanded();
        checkBox.getBox().click();

        String url = excelReader.getStringData("URL", 3, 0);
        Assert.assertEquals("https://demoqa.com/checkbox", url);
    }

    @Test
    public void verifyRadioButtonIsClicked(){
        elementsPage.getRadioButton().click();
        checkBox.getRadioB().click();

        String url = excelReader.getStringData("URL", 4, 0);
        Assert.assertEquals("https://demoqa.com/radio-button", url);

        WebElement we = checkBox.getRadioBText();
        Assert.assertTrue(we.isDisplayed());

        Assert.assertEquals(we.getText(), "You have selected Yes");
    }



    @AfterMethod
    public void back() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("https://demoqa.com/");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);

        driver.quit();
    }
}