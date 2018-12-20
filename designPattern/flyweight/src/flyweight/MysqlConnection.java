package flyweight;

public class MysqlConnection implements Connection {
    private String url;
    private String username;
    private String password;

    public MysqlConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
}
