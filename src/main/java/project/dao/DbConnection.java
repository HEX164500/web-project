package project.dao;

import java.sql.Connection;

/**
 *
 * @author lucas
 */
public class DbConnection {

    public static Connection getConnection() {
        /**
         * From some jdbc connection pool at
         * jdbc:somedriver://somehost:someport/nowheretorun do
         * DriverManager.getConnection(jdbc-url, username, password); or (your
         * configured pool).getConnection();
         */

        return null;
    }
}
