package demo.steps_definition;

import demo.pages.FavoritePage;
import demo.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinitions {

  StartPage startPage = new StartPage();
  FavoritePage favoritePage = new FavoritePage();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

  @Then("User type username {string}")
  public void userTypeUsername(String keyword) {
    startPage.usernameInput(keyword);
  }

  @And("User type password {string}")
  public void userTypePassword(String keyword) {
    startPage.passwordInput(keyword);
  }

  @And("User click sign in button")
  public void userClickSignInButton() {
    startPage.signinButton();
  }

  @Then("User logged in and see {string} page")
  public void userLoggedInAndSeePage(String title) {
    String actual = favoritePage.getTitle();
    Assert.assertEquals(title, actual);
  }
}
