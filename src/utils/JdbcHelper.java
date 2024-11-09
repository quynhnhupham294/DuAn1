package utils;

// 1. Kết nối JDBC và SQL Server
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcHelper {
    public static final String connectionUrl = "jdbc:sqlserver://localhost:1433;"
                                             + "databaseName=phanMemBanCaPhe;user=sa;password=root123;encrypt=false;";
    
    public static Connection getDBConnect(){
        Connection conn = null;
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Connect tới JDBC của SQL Server thành công!");
        } catch (Exception e) {
            System.out.println("Chưa có Driver!"+ e.toString()); // Lỗi Driver JDBC
        }
        try {
            conn = DriverManager.getConnection(connectionUrl);
            System.out.println("Login success!");
            return  conn;
        } catch (Exception e) {
            // Lỗi sai tên database
            // Lỗi sai user or password
            System.out.println("Lỗi connect: " + e.toString());
        }
        return null;
    } 
    
    public static void main(String[] args) {
        JdbcHelper db = new JdbcHelper();
        Connection connect = db.getDBConnect();
    }
}
