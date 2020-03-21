<%--
  Created by IntelliJ IDEA.
  User: Азат
  Date: 21.03.2020
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>chet or nechet</title>
</head>
<body>
<h1>Четное или нечетное</h1>
<% Integer i = (Integer)request.getAttribute("integer");%>
<%=i%>
<%if (i%2==0){%>
<%="Число четное"%>
<%} else {%>
<%="Нечетное число"%>
<%}%>
<br>
<A HREF="http://localhost:8080/myapp/start.jsp">main page</A>
</body>
</html>