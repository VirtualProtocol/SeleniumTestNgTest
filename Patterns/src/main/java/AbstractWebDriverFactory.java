import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AbstractWebDriverFactory implements WebDriverFactoryInterface {

    public DriverOptions createDriverOptions(){

        return new DriverOptions();
    }

    public DriverOptions createDriverOptions(boolean isHeadless){

        return new DriverOptions(isHeadless);
    }

    public DriverPath createDriverPath(){

        return new DriverPath();
    }

    public DriverPath createDriverPath(String operatingSystem, String driverPath){

        return new DriverPath(driverPath);
    }

    public WebDriver createWebDriver(){

        System.setProperty("webdriver.chrome.driver", ".\\chromedriver78.exe");

        return new ChromeDriver();
    }
}
