package StepDefinitions;


import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class _02_CountrySteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.countries);

    }

    @When("Create a country")
    public void createACountry() {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,"Country01 ");
        dc.sendKeysFunction(dc.codeInput,"0101");
        dc.clickFunction(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        //dc.verifyContainsTextFunction(dc.successMessage, "success");
        dc.waitUntilVisible(dc.successMessage);
        Assert.assertTrue(dc.successMessage.isDisplayed());
    }
}
