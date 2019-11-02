import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

    private WebDriver driver;

    private String testURL = "https://www.bing.com/";

    @BeforeMethod
    public void before(){
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver78.exe");
        driver = new ChromeDriver();

        driver.navigate().to(testURL);
    }

    @Test
    public void webDriverCanReachURL(){
        String url = driver.getCurrentUrl();

        Assert.assertEquals(testURL, url);
    }

    @Test
    public void webDriverCanSearch(){

        String searchText = "Selenium";

        By searchFieldName = new By.ById("sb_form_q");

        WebElement searchFieldElement = driver.findElement(searchFieldName);

        searchFieldElement.sendKeys(searchText + Keys.ENTER);

        boolean condition = driver.getCurrentUrl().contains("search?");

        Assert.assertTrue(condition);
    }

    @AfterMethod
    public void after(){
        driver.quit();
    }
}
