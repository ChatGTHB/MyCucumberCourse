package stepDefinitions;

import pages.DialogContent;
import pages.LeftNav;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;

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
        String countryName= RandomStringUtils.randomAlphanumeric(8);
        String countryCode= RandomStringUtils.randomNumeric(4);

        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,countryName);
        dc.sendKeysFunction(dc.codeInput,countryCode);
        dc.clickFunction(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage, "success");
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.codeInput,code);
        dc.clickFunction(dc.saveButton);
    }
}
