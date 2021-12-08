<%--
  Created by IntelliJ IDEA.
  User: Nord
  Date: 26.11.2021
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Title h1</h1>>
    <%@page import="java.util.Date, logic.TestClass" %> <!--директива позволяющая делать импорты -->
    <p>
        <%
            Date dateNow = new Date();
            String outputDateInformation ="Текущая дата: " + dateNow;
        %>
        <%=outputDateInformation%>
    </p>>
    <p>
        <%for (int i = 0; i<3; i++){
            out.println("<p>" + "Hello iteration " + i + "</p>");
        }%>

    </p>
    <p>
        <%
            TestClass testClass1 = new TestClass();
            out.println(testClass1.getINfo());%>
    </p>
</body>
</html>
