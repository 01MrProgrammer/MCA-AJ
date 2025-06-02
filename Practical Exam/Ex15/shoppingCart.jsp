<%@ page import="java.util.*, ShoppingCart" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Online Shopping Cart</title>
</head>
<body>
<h1>Online Shopping Cart</h1>
<%-- Get the shopping cart from the session, create a new one if it
doesn't exist --%>
<%
ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
if (cart == null) {
cart = new ShoppingCart();
session.setAttribute("cart", cart);
}
%>
<h2>Products</h2>
<ul>
<li>Product A - $10.0 <a href="addItem.jsp?item=Product
A&price=10.0">Add to Cart</a></li>
<li>Product B - $20.0 <a href="addItem.jsp?item=Product
B&price=20.0">Add to Cart</a></li>
<li>Product C - $30.0 <a href="addItem.jsp?item=Product
C&price=30.0">Add to Cart</a></li>
</ul>
<h2>Your Shopping Cart</h2>
<%
List<String> cartItems = cart.getItems();
List<Double> cartPrices = cart.getPrices();
if (cartItems.size() > 0) {
for (int i = 0; i < cartItems.size(); i++) {
String item = cartItems.get(i);
double price = cartPrices.get(i);
%>
<p><%= item %> - $<%= price %> <a href="removeItem.jsp?index=<%= i
%>">Remove</a></p>
<%
}
double total = cart.getTotal();
%>
<h3>Total: $<%= total %></h3>
<%
} else {
%>
<p>Your cart is empty.</p>
<%
}
%>
</body>
</html>
