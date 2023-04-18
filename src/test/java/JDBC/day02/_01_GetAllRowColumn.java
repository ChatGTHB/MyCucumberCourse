package JDBC.day02;

import JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class _01_GetAllRowColumn extends JDBCParent {
    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select*from language");
        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount = rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <= columnCount; i++) {
            System.out.print("Column name = " + rsmd.getColumnName(i));
            System.out.println("\tColumn type name = " + rsmd.getColumnTypeName(i));
        }
    }

    @Test
    public void test2() throws SQLException {

        ResultSet rs = statement.executeQuery("select*from language");
        ResultSetMetaData rsmd = rs.getMetaData();


        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.print(rsmd.getColumnName(i) + "\t");
        }
        System.out.println();

        while (rs.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void test3() {

        /** send the query("select from language") to a method and
         *  the method will return you the query's data as an ArrayList*/


        String sql="select * from language";
        ArrayList<ArrayList<String>>returningResult=getListData(sql);

        for (ArrayList<String> s:returningResult){
            System.out.println("s = " + s);
        }
        System.out.println(returningResult);

    }
    public  ArrayList<ArrayList<String>>getListData(String sql) {

        ArrayList<ArrayList<String>> table = new ArrayList<>();

        try {
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    row.add(rs.getString(i));
                }
                table.add(row);
            }
            return table;
        }catch(Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        return table;
    }
}
