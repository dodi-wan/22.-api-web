package stepdef.web.featureNavigate.homepage.menu;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.web.featureNavigate.home.HomePages;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AboutStepDef {

    private final HomePages homePages;


    public AboutStepDef() {
        homePages = new HomePages();
    }



    @When("user click {int} strips menu at top-left window")
    public void userClickStripsMenuAtTopLeftWindow(int arg0) {
        homePages.menuHomepage();
    }



    @And("click button About")
    public void clickButtonAbout() throws InterruptedException {
        homePages.aboutButton();
    }


    @Then("verify new homepage about")
    public void verifyNewHomepageAbout() {
        boolean actualFirstText = homePages.verifyAboutFirst();
        boolean actualSecondText = homePages.verifySecondAbout();
        boolean actualThirdText = homePages.verifyThirdAbout();

        String expectedFirstText = "Turn quality into a strategic advantage—accelerate outcomes with Sauce AI.";
        String expectedSecondText = "Explore more";
        String expectedThirdText = "Build apps users love with AI-driven quality";

        assertTrue(actualFirstText, expectedFirstText);
        assertTrue(actualSecondText, expectedSecondText);
        assertTrue(actualThirdText, expectedThirdText);

        System.out.println("Result : " + actualSecondText);
        System.out.println("Result : " + actualSecondText);
        System.out.println("Result : " + actualThirdText);
    }


}
