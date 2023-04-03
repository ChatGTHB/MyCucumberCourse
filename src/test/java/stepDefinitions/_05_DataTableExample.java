package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import java.util.List;

public class _05_DataTableExample {

    @When("Write username {string}")
    public void writeUsername(String username) {
        System.out.println("username = " + username);
    }

    @And("Write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println("username and password = " + username + " " + password);
    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable elements) {
        List<String> listElements = elements.asList(String.class);

        for (String u : listElements)
            System.out.println("u = " + u);

    }

    @And("Write username and password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable elements) {
        List<List<String>> listElements = elements.asLists(String.class);

//        for (int i = 0; i < listElements.size(); i++) {
//            System.out.println("listElemanlar = " + listElements.get(i).get(0) + " " +
//                    listElements.get(i).get(1));
//        }

        for (List<String> listElement : listElements) {
            System.out.println("listElemanlar = " + listElement.get(0) + " " +
                    listElement.get(1));
        }
    }
}
