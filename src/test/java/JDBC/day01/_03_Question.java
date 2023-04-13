package JDBC.day01;

import JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_Question extends JDBCParent {

    // Print the names of all records in the city table with next

    @Test
    public void test01() throws SQLException {

        ResultSet rs = statement.executeQuery("select city from city");

        int rowCount=0;
        while(rs.next()){
            rs.getString("city");
            rowCount++;
        }
        System.out.println("rowCount = " + rowCount);
    }

    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız

    // TODO : print city names in all rows in city table with absolute
    // TODO : print city names in all rows in city table with relative

}
