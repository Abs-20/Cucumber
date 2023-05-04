package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Common_Steps {
    Logger LOGGER = LoggerFactory.getLogger(Common_Steps.class);
    private WebDriver driver;
    @Before// from cucumber will run before Given Gherkin
    public void setUp(){
        LOGGER.info("Hello world!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abd-1\\IdeaProjects\\Cucumber\\webDrivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        LOGGER.info("Hello world?");
    }

    @After// from cucumber will run after Then Gherkin
    public void tearDown() throws Exception {
        driver.quit();
        Thread.sleep(1000);
}

public WebDriver getDriver(){
        return this.driver;
}
}
