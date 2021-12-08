<%--
  Created by IntelliJ IDEA.
  User: Nord
  Date: 26.11.2021
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Seconds JSP</title>
</head>
<body>
<h1> Hi </h1>>
    <p>
        <%
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");

            out.println("Hello " + name + " " + surname);

        %>
    <p>

</body>
</html>
