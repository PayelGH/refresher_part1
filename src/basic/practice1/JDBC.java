package basic.practice1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) throws SQLException {
        //create a connection
        Connection connect= DriverManager.getConnection("jdbc:oracle:thin@localhost:1800/pdborc1","username", "pwd");

        //create a query/statement
        Statement query1= connect.createStatement();
        String s1= "INSERT INTO STUDENT VALUES(101, 'Anne')";
        //execute statement/query
        query1.executeQuery(s1);
        //close connection
        connect.close();
        System.out.println("Program is completed");
    }
}
