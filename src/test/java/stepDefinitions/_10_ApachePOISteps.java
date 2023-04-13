package stepDefinitions;

import io.cucumber.java.en.*;
import pages.DialogContent;
import utilities.ExcelUtility;

import java.util.List;

public class _10_ApachePOISteps {
    DialogContent dc = new DialogContent();

    @When("User create citizenship with ApachePOI")
    public void userCreateCitizenshipWithApachePOI() {
        List<List<String>> table = ExcelUtility.getData("src/test/java/apachePOI/resources/ApacheExcel2.xlsx", "testCitizen", 2);

        for (List<String> row : table) {
            dc.clickFunction(dc.addButton);
            dc.sendKeysFunction(dc.nameInput, row.get(0));
            dc.sendKeysFunction(dc.shortName, row.get(1));
            dc.clickFunction(dc.saveButton);
            dc.verifyContainsTextFunction(dc.successMessage, "success");
        }
    }

    @Then("User delete citizenship with ApachePOI")
    public void userDeleteCitizenshipWithApachePOI() {
        List<List<String>> table = ExcelUtility.getData("src/test/java/apachePOI/resources/ApacheExcel2.xlsx", "testCitizen", 1);
        for (List<String> row : table) {
            dc.deleteItem(row.get(0));
            dc.verifyContainsTextFunction(dc.successMessage,"success");
        }
    }
}
