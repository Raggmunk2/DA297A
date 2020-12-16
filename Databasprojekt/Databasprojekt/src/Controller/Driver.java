package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {

  public static Connection getConnection() throws SQLException {

    String dbURL = "jdbc:sqlserver://data source=localhost;" +
            "       Initial Catalog=school;Integrated Security=SSPI;"; //connection sträng

    Connection conn = DriverManager.getConnection(dbURL); //anropar klassen DriverManager

    if (conn != null) {
      System.out.println("Connected");
    }
    return conn;
  }
}
