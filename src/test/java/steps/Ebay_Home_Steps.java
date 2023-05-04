package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.jsoup.helper.Validate.fail;

public class Ebay_Home_Steps {
    Logger LOGGER = LoggerFactory.getLogger(Common_Steps.class);
    WebDriver driver;

    public Ebay_Home_Steps(Common_Steps commonSteps) {
        LOGGER.info("Ebay_Home_Steps()");
        this.driver = commonSteps.getDriver();
    }

    @Given("Iam on Ebay Home Page")
    public void iam_on_ebay_home_page() {
        // Write code here that turns the phrase above into concrete actions

        driver.get("https://www.ebay.com/");

    }

    @When("I click on Advanced Link")
    public void i_click_on_advanced_link() {
        // Write code here that turns the phrase above into concrete actions
         driver.findElement(By.linkText("Advanced")).click();
    }

    @Then("I navigate to Advanced Search Page")
    public void i_navigate_to_advanced_search_page() {
        // Write code here that turns the phrase above into concrete actions
         String expUrl = "https://www.ebay.com.au/sch/ebayadvsearch";
         String actUrl = driver.getCurrentUrl();
         if (!expUrl.equals(actUrl)) {
          fail("does not work ");
          }
         driver.quit();
    }
}
