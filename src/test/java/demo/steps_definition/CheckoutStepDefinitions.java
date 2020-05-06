package demo.steps_definition;

import demo.pages.FavoritePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutStepDefinitions {

    FavoritePage favoritePage = new FavoritePage();

    @Given("User at favorites pages")
    public void userAtFavoritesPages() {
        boolean actual = favoritePage.isOnPage();
        Assert.assertTrue(actual);
    }

    @When("User click {string}")
    public void userClick(String keyword) {
        favoritePage.addItem(keyword);
    }

    @And("User click charge")
    public void userClickCharge() {
        favoritePage.checkoutButton();
    }

    @Then("User click suggested amount")
    public void userClickSuggestedAmount() {
        favoritePage.suggestedamountButton();
    }

    @And("User click charge button")
    public void userClickChargeButton() {
        favoritePage.okButton();
    }

    @Then("User click no thank you")
    public void userClickNoThankYou() {
        favoritePage.nosendButton();
    }

    @Then("User type {string}")
    public void userType(String keyword) {
        favoritePage.amountInput(keyword);
    }
}
