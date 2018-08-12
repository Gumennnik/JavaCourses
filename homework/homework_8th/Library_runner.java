import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Library_runner {
    public static void main(String[] args) {
        try {
            System.out.println("Starting program");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    ConnectorToDataBase.databaseLocation,ConnectorToDataBase.dataBaseConnectionName,ConnectorToDataBase.getDataBaseConnectionpassword);
                //here sonoo is database name, root is username and password
            System.out.println("Connection is " + !con.isClosed());
//            System.out.println(con.createStatement().executeQuery("SELECT library"));
            System.out.println(con.createStatement().executeUpdate("USE library;") + " up! ");
            System.out.println(con.getClientInfo());
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM library.books;");
            rs.next();
            System.out.println(rs.getInt(1) + " rs.first");
            System.out.println(rs.getString(2));
        }catch (Exception e)
        {
            System.out.println("Error!");
            e.printStackTrace();
        }


    }

}
