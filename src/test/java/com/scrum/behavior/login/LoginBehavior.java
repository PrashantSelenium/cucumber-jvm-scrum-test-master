package com.scrum.behavior.login;

import java.io.IOException;

import com.scrum.behavior.BaseBehavior;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author saikrishna
 */
public class LoginBehavior extends BaseBehavior {

    private LoginAssert loginAssert = new LoginAssert();

  @Given("^Administrator wants to login$")
  public void administratorWantsToLogin() throws IOException {
    adminPerson.atLoginPage().open();
  }

  @When("^Administrator login to the system with username (.*) and password (.*)$")
  public void administratorLoginToTheSystemWithUsernameAndPassword(String username,
                                                                   String password) throws IOException {
    adminPerson.atLoginPage().fillForm(username, password);
    adminPerson.atLoginPage().clickSignInButton();
  }

  @Then("^Administrator should see home page$")
  public void administratorShouldSeeHomePage() throws IOException {
      loginAssert.checkThatHomePageOpened();
  }

  @Then("^Administrator should see login page$")
  public void administratorShouldSeeLoginPage() throws IOException {
      loginAssert.checkThatPageOpened();
  }
}
