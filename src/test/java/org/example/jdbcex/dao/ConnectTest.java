package org.example.jdbcex.dao;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTest {
    @Test
    public void testConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/webdb",
                "webuser",
                "1234"
        );
        Assertions.assertNotNull(connection);
        connection.close();
    }
}

