package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homestepdefs {
    @Given("^navigate to homepage$")
    public void navigateToHomepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("navigate to homepage");
    }
    @And("^home page UI will come$")
    public void homePageUIWillCome() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("home page UI will come");
    }

    @When("^user open homepage logo should be aligned at proper position$")
    public void userOpenHomepageLogoShouldBeAlignedAtProperPosition() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user open homepage logo should be aligned at proper position");
    }

    @Then("^logo should be in center at top of webpage$")
    public void logoShouldBeInCenterAtTopOfWebpage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("logo should be in center at top of webpage");
    }

    @And("^click on search bar$")
    public void clickOnSearchBar() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on search bar");
    }

    @When("^user click on search button in search bar$")
    public void userClickOnSearchButtonInSearchBar() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user click on search button in search bar");
    }

    @Then("^he should be able to search$")
    public void heShouldBeAbleToSearch() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("he should be able to search");
    }

    @When("^we press search button$")
    public void wePressSearchButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("we press search button");
    }

    @Then("^keyboard popup should come$")
    public void keyboardPopupShouldCome() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("keyboard popup should come");
    }

    @And("^click on myprofile icon$")
    public void clickOnMyprofileIcon() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on myprofile icon");
    }

    @When("^user click on myprofile button$")
    public void userClickOnMyprofileButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user click on myprofile button");
    }

    @Then("^user personal profile should be accesible$")
    public void userPersonalProfileShouldBeAccesible() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user personal profile should be accesible");
    }

    @And("^click on inbox icon$")
    public void clickOnInboxIcon() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on inbox icon");
    }

    @And("^click on send messages$")
    public void clickOnSendMessages() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on send messages");
    }

    @When("^user click on send messages button$")
    public void userClickOnSendMessagesButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user click on send messages button");
    }

    @Then("^he should be able to text anyone$")
    public void heShouldBeAbleToTextAnyone() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("he should be able to text anyone");
    }

    @And("^scroll down$")
    public void scrollDown() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("scroll down");
    }

    @And("^click on social media links$")
    public void clickOnSocialMediaLinks() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on social media links");
    }

    @When("^user click on social media links$")
    public void userClickOnSocialMediaLinks() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user click on social media links");
    }

    @Then("^he should able to redirect on application social media handles$")
    public void heShouldAbleToRedirectOnApplicationSocialMediaHandles() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("he should able to redirect on application social media handles");
    }

    @And("^click on contact us button$")
    public void clickOnContactUsButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on contact us button");
    }

    @When("^user click on contact button in the homepage$")
    public void userClickOnContactButtonInTheHomepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user click on contact button in the homepage");
    }

    @Then("^he/she should be able to get contact details of the application$")
    public void heSheShouldBeAbleToGetContactDetailsOfTheApplication() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("he/she should be able to get contact details of the application");
    }

    @And("^click on contact us button \"([^\"]*)\" and \"([^\"]*)\"$")
    public void clickOnContactUsButtonAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on contact us button <arg0> and <arg1>" +arg0 +arg1);
    }

    @And("^click on services$")
    public void clickOnServices() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on services");
    }

    @And("^navigate to use services button$")
    public void navigateToUseServicesButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("navigate to use services button");
    }

    @When("^user click on use services button in services field$")
    public void userClickOnUseServicesButtonInServicesField() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user click on use services button in services field");
    }

    @Then("^he should be able to use all services provided by the webpage$")
    public void heShouldBeAbleToUseAllServicesProvidedByTheWebpage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("he should be able to use all services provided by the webpage");
    }
    @And("^click on change profile photo$")
    public void clickOnChangeProfilePhoto() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on change profile photo");
    }

    @And("^add photo \"([^\"]*)\"$")
    public void addPhoto(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("add photo <arg0>" +arg0);
    }
    @When("^user click on change profile photo$")
    public void userClickOnChangeProfilePhoto() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user click on change profile photo");
    }



        @Then("^he should be able to change his/her profile photo$")
    public void heShouldBeAbleToChangeHisHerProfilePhoto() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("he should be able to change his/her profile photo");
    }


    }



