package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    @Test
    public void testConnect() throws SQLException {
        //Given

        //When
        DbManager dbManager = DbManager.getInstance();

        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String solQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(solQuery);

        //Then
        int counter = 0;

        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
            rs.getString("FIRSTNAME") + ", " +
            rs.getString("LASTNAME"));
            counter++;
        }

        rs.close();
        statement.close();

        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager manager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT \n" +
                            "    U.FIRSTNAME, U.LASTNAME, COUNT(*) AS NUMBER_OF_POSTS\n" +
                            "FROM\n" +
                            "    USERS U,\n" +
                            "    POSTS P\n" +
                            "WHERE\n" +
                            "    U.ID = P.USER_ID\n" +
                            "GROUP BY u.id\n" +
                            "HAVING COUNT(*) >= 2;";

        Statement statement = manager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;

        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                                rs.getString("LASTNAME") + ", " +
                                rs.getInt("NUMBER_OF_POSTS"));
            counter++;
        }

        rs.close();
        statement.close();

        Assert.assertEquals(3, counter);
    }
}
