package Data_Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_c0nnection {
    public static Connection getConnection() {
        Connection connection = null;

        {
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/library_Management_sys_v2",
                        "root",
                        "root123"
                );
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return connection;
        }
    }
}
