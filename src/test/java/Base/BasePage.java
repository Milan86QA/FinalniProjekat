package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public Homepage homepage;
    public ElementsPage elementsPage;
    public FormsPage formPage;
    public AlertsPage alertsPage;
    public WidgetPage widgetPage;
    public InteractionsPage interactionsPage;
    public BookstorePage bookstorePage;
    public CheckBox checkBox;
    public ExcelReader excelReader;
    public SidebarPage sidebarPage;
    public TextBox textBox;



    @BeforeClass
    public void setUp () throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homepage = new Homepage(driver, wdwait);
        elementsPage = new ElementsPage(driver, wdwait);
        alertsPage = new AlertsPage(driver, wdwait);
        widgetPage = new WidgetPage(driver, wdwait);
        interactionsPage = new InteractionsPage(driver, wdwait);
        bookstorePage = new BookstorePage(driver, wdwait);
        excelReader = new ExcelReader("C:\\Users\\DELL Latitude\\Desktop\\TestData.xlsx");



    }


}
