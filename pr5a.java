import java.sql.Connection;
import java.sql.DriverManager;

public class pr5a {

    public static void main(String args[]) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/collagdb";
            String user = "rootuser";
            String pass = "root";

            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println("Connection Successful");

        } 
        catch (Exception e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
}