
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            // Create Statement
            Statement st = con.createStatement();

            // Insert query
            String query = "INSERT INTO student VALUES (1, 'Anand')";

            // Execute
            st.executeUpdate(query);

            System.out.println("Data Inserted Successfully ✅");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
