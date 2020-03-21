<%@ page import="java.time.LocalTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Start</title>
</head>
<body>

    <% String name = "Sataro"; %>

    <%= name.length() %>

    <% for (int i = 0; i < name.length(); i++) { %>
        <p> <%= name.charAt(i) %> </p>
    <% } %>

    <%=LocalTime.now()%>
    <% System.out.println(LocalTime.now()); %>
    <br>
    <a href="http://localhost:8080/myapp/time">TimeServlet</a>
    <br>
    <a href="http://localhost:8080/myapp/randomSum">SumServlet</a>
    <br>
    <a href="http://localhost:8080/myapp/gotoGoogle">goToGoogle</a>
    <br>
    <a href="https://github.com/AzatBaisynov/hww54.git">github</a>
    <br>
    <a href="http://localhost:8080/myapp/random">isOdd Random number</a>
    <br>
    <a href="http://localhost:8080/myapp/form.jsp">form</a>
</body>
</html>
