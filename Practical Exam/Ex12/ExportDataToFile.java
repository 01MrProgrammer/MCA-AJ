import java.sql.*;
import java.io.*;

public class ExportDataToFile {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Change database name
        String user = "root"; // Your MySQL username
        String password = "password"; // Your MySQL password

        String query = "SELECT * FROM users"; // Table: users (id, name, age)

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        ) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                String line = "ID: " + id + ", Name: " + name + ", Age: " + age;
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Data has been written to 'output.txt'.");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
