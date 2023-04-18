package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.DBUtility;
import java.util.ArrayList;

public class _11_JDBCSteps {
    @Then("Send the query the database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String query) {
        /** Get required information from DataBase */
        ArrayList<ArrayList<String>>dblist= DBUtility.getListData(query);

        for (int i = 0; i < dblist.size(); i++) {
            System.out.println(dblist.get(i).get(1).trim());
        }


    }
}
