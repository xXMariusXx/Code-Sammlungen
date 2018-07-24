package JavaIO.SQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SQLRequest {
    public static void sql() {
        SQLAccess mySQLAccess = new SQLAccess();

        String sql = "SELECT * FROM abc";

        try {
            PreparedStatement statement = mySQLAccess.connect().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("ID"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            mySQLAccess.disconnect();

        }
    }
}