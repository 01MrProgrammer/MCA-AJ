import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class CustomerFeedbackServlet extends HttpServlet {
// Database connection parameters
private static final String URL =
"jdbc:mysql://localhost:3306/FeedbackDB";
private static final String USER = "root";
private static final String PASSWORD = "password"; // Change to your
MySQL password
// Initialize the servlet
public void init() throws ServletException {
try {
// Load the MySQL JDBC driver
Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
}
// Handle HTTP POST requests
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
// Get feedback data from the form
String name = request.getParameter("name");
String email = request.getParameter("email");
String feedback = request.getParameter("feedback");
// Establish database connection and insert data
try (Connection conn = DriverManager.getConnection(URL, USER,
PASSWORD)) {
String query = "INSERT INTO feedback (name, email, feedback)
VALUES (?, ?, ?)";
try (PreparedStatement stmt = conn.prepareStatement(query)) {
stmt.setString(1, name);
stmt.setString(2, email);
stmt.setString(3, feedback);
int result = stmt.executeUpdate();
if (result > 0) {
response.getWriter().println("Feedback submitted
successfully!");
} else {
response.getWriter().println("Error submitting
feedback.");
}
}
} catch (SQLException e) {
e.printStackTrace();
}
}

// Handle HTTP GET requests (display existing feedback)
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
// Establish database connection and retrieve data
try (Connection conn = DriverManager.getConnection(URL, USER,
PASSWORD)) {
String query = "SELECT * FROM feedback";
try (Statement stmt = conn.createStatement()) {
ResultSet rs = stmt.executeQuery(query);
out.println("<h1>Customer Feedback</h1>");
while (rs.next()) {
out.println("<p>Name: " + rs.getString("name") + "</p>");
out.println("<p>Email: " + rs.getString("email") +
"</p>");
out.println("<p>Feedback: " + rs.getString("feedback") +
"</p><hr>");
}

}
} catch (SQLException e) {
e.printStackTrace();
}
}
}
