package flyweight;

public class DriverManager {
    public static Connection getConnection(String url, String username, String password) {
        return new MysqlConnection(url, username, password);
    }
}
