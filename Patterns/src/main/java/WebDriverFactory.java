import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory extends AbstractWebDriverFactory {

    private WebDriver webDriver;

    public WebDriverFactory(){

        webDriver = createWebDriver();
    }

    public WebDriverFactory(String path, boolean isHeadless) throws Exception {

        DriverOptions driverOptions = new DriverOptions(isHeadless);

        DriverPath driverPath = new DriverPath(path);

        webDriver = createWebDriver(driverPath, driverOptions);
    }

    private WebDriver createWebDriver(DriverPath driverPath, DriverOptions driverOptions) throws Exception {

        if (driverPath.getFilePath().contains("chrome")) {

            System.setProperty("webDriver.chrome.driver", driverPath.getFilePath());

            if (driverOptions.getHeadlessMode()) {
                return new ChromeDriver();
            }

            return new ChromeDriver(new ChromeOptions().addArguments("--headless"));
        } else if (driverPath.getFilePath().contains("fox")) {

            System.setProperty("webDriver.gecko.driver", driverPath.getFilePath());

            if (driverOptions.getHeadlessMode()) {
                return new ChromeDriver();
            }

            return new ChromeDriver(new ChromeOptions().addArguments("--headless"));
        } else {
            throw new Exception("Unable to create driver requested");
        }
    }

    public WebDriver getWebDriver(){

        return webDriver;
    }

    public void disposeWebDriver(){

        if (webDriver != null){
            webDriver.quit();
        }
    }
}
