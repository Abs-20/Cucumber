package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class EbayAdvancedSearch_Steps
{

        public EbayAdvancedSearch_Steps(Common_Steps commonSteps) {

        }

        @Given("i am on advanced search page")
        public void i_am_on_advanced_search_page() {
            // Write code here that turns the phrase above into concrete actions
                System.out.println("1");
        }
        @When("i click on the Ebay logo")
        public void i_click_on_the_ebay_logo() {
            // Write code here that turns the phrase above into concrete actions
                System.out.println("2");
        }
        @Then("i am navigate to Ebay home page")
        public void i_am_navigate_to_ebay_home_page() {
            // Write code here that turns the phrase above into concrete actions
                System.out.println("3");
        }
}
