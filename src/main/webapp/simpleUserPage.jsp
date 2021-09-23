<%--
  Created by IntelliJ IDEA.
  User: oleg
  Date: 13.09.2021
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h4> simpleUserPage</h4>

<jsp:useBean id="events" class="com.example.finalproject.dao.EventDaoImpl" scope="page"/>
<select>
    <c:forEach var="item" items="${events}">
        <option>${item}</option>
    </c:forEach>
</select>

</body>
</html>
