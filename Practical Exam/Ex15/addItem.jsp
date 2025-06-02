<%@ page import="ShoppingCart" %>
<%@ page session="true" %>
<%
String item = request.getParameter("item");
double price = Double.parseDouble(request.getParameter("price"));
ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
if (cart == null) {
    cart = new ShoppingCart();
session.setAttribute("cart", cart);
}
cart.addItem(item, price);
response.sendRedirect("shoppingCart.jsp");
%>