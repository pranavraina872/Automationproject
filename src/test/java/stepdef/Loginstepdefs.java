package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdefs {
    @Given("^open the browser$")
    public void openTheBrowser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("open the browser");
    }

    @And("^enter the url$")
    public void enterTheUrl() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the url");
    }

    @And("^enter the credentials$")
    public void enterTheCredentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the credentials");
    }

    @When("^user is clicking on login button$")
    public void userIsClickingOnLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is clicking on login button");
    }

    @Then("^user should be able to navigate homepage$")
    public void userShouldBeAbleToNavigateHomepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should be able to navigate homepage");
    }

    @And("^enter the credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterTheCredentialsAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the credentials <arg0> and <arg1>" + arg0+ arg1);
    }

    }

