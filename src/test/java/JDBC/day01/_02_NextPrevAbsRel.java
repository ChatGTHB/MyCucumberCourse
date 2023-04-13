package JDBC.day01;

import JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends JDBCParent {

    @Test
    public void nextPrev() throws SQLException {

        ResultSet rs=statement.executeQuery("select*from language");

        rs.next();
        System.out.println("1st line language name : "+rs.getString(2));

        rs.next();
        System.out.println("2nd line language name : "+rs.getString(2));

        rs.next();
        System.out.println("3rd line language name : "+rs.getString(2));

        rs.previous();
        System.out.println("1 back (3-1=2) row language name : "+rs.getString(2));
    }

    @Test
    public void absoluteRelative() throws SQLException {

        ResultSet rs=statement.executeQuery("select*from film");

        rs.absolute(10);
        System.out.println("10th row title : "+rs.getString("title"));

        rs.relative(10);
        System.out.println("20th (10+10) row title : "+rs.getString("title"));

        rs.absolute(-10);
        System.out.println("10th line from the end title : "+rs.getString("title"));

        rs.relative(-10);
        System.out.println("20th ((last line-10)-10) line from the end title : "+rs.getString("title"));
    }
}
