package Testting;

import java.sql.Connection;
import utils.JdbcHelper;

public class TestConnectToSQLServer {
    public static void main(String[] args) {
        JdbcHelper db = new JdbcHelper();
        Connection connect = db.getDBConnect();
    }
}
