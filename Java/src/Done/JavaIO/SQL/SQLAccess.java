package Done.JavaIO.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SQLAccess {
    private static SQLAccess instance;

    public static SQLAccess getInstance() {
        if (instance == null) instance = new SQLAccess();
        return instance;
    }

    public SQLAccess() {
        //this.connect();
    }

    private static final String DATABASE_URL = "jdbc:mysql://1.1.1.1:3306/mysqlDB";
    private static final String USERNAME = "mysqlDB";
    private static final String PASSWORD = "pw";

    public Connection getConnection() {
        return connection;
    }

    private Connection connection;
    private Properties properties;

    private Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            properties.setProperty("user", USERNAME);
            properties.setProperty("password", PASSWORD);
            properties.setProperty("serverTimezone", "GMT+1");
        }
        return properties;
    }

    public Connection connect() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(DATABASE_URL, getProperties());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}