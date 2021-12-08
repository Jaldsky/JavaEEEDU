<%--
  Created by IntelliJ IDEA.
  User: Nord
  Date: 27.11.2021
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Cart</title>
</head>
<body>
    <%@ page import="pacageCart.Cart"%>
    <%Cart cart = (Cart) session.getAttribute("cart");%>

    <h1>Твоя корзина</h1>>
    <p>Наименование: <%= cart.getName()%></p>>
    <p>Количество: <%= cart.getQuantity()%></p>>

    <p>Количество сессий: <%= session.getAttribute("session")%></p>

</body>
</html>
