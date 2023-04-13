package JDBC.day01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {
    @Test
    public void test01() throws SQLException {
        String hostURL = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        Connection connection = DriverManager.getConnection(hostURL, username, password);

        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery("select*from customer");

        rs.next();

        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");

        System.out.println("Customer first name and last name of line 1 = " + firstName + " " + lastName);

        rs.next();

        firstName = rs.getString("first_name");
        lastName = rs.getString("last_name");

        System.out.println("Customer first name and last name of line 2 = " + firstName + " " + lastName);

        connection.close();
    }


}
