import java.sql.*;
public class JDBCDemo {
public static void main(String[] args) {
try {
// Load the JDBC driver
Class.forName("com.mysql.cj.jdbc.Driver");
// Establish connection
Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/testdb", "root", "12345");
Statement stmt = con.createStatement();
// Create table
stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students (id INTPRIMARY KEY, name VARCHAR(50))");
// Insert record
stmt.executeUpdate("INSERT INTO students VALUES (1, 'John')");
// Update record
stmt.executeUpdate("UPDATE students SET name='Johnny' WHERE id=1");
// Retrieve record
ResultSet rs = stmt.executeQuery("SELECT * FROM students");
while (rs.next()) {
    System.out.println("ID: " + rs.getInt(1) + ", Name: " +
rs.getString(2));
}
// Delete record
stmt.executeUpdate("DELETE FROM students WHERE id=1");
con.close();
} catch (Exception e) {
System.out.println(e);
}
}
}