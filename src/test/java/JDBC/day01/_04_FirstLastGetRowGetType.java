package JDBC.day01;

import JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowGetType extends JDBCParent {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select city from city");

        rs.last();
        System.out.println("last line city name : "+rs.getString(1));

        rs.first();
        System.out.println("First line city name : "+rs.getString(1));

        rs.last();
        int whatRowAmIOn = rs.getRow();

        System.out.println("whatLineAmIOn : " + whatRowAmIOn);
    }
}
