package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.DialogContent;
import utilities.DBUtility;
import java.util.ArrayList;
import java.util.List;

public class _11_JDBCSteps {
    @Then("Send the query the database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String query) {
        /** Get required information from DataBase */
        ArrayList<ArrayList<String>>dblist= DBUtility.getListData(query);

        DialogContent dc=new DialogContent();
        List<WebElement>UIList=dc.nameList;

        for (int i = 0; i < dblist.size(); i++) {
            System.out.print(dblist.get(i).get(1).trim());
            System.out.println("\t"+UIList.get(i).getText().trim());

            Assert.assertEquals(dblist.get(i).get(1).trim(),UIList.get(i).getText().trim());
        }

        /** Get required information from UI */
    }
}
