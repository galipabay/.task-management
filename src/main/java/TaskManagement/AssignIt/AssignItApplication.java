package TaskManagement.AssignIt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignItApplication {

    public static void main(String[] args) throws ClassNotFoundException {
        String hostname = "localhost";
        String sqlInstanceName = "GalipAbay"; //computer name 
        String sqlDatabase = "master";  //sql server database name
        String sqlUser = "newSA";
        String sqlPassword = "galip abay"; //passwrod sa account

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String connectURL = "jdbc:sqlserver://" + hostname + ":1433"
                + ";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase +";encrypt=true;trustServerCertificate=true";
        try {
            try (Connection conn = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);) {
                System.out.println("Baglandi aq");
            }
        } catch (SQLException e) {
            System.out.println("Error mesaji aq");
            e.printStackTrace();
        }
        SpringApplication.run(AssignItApplication.class, args);
    }
}
