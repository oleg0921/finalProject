<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.finalproject.entity.Event" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.finalproject.entity.User" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="com.example.finalproject.dto.UserDto" %>
<%@ page import="com.example.finalproject.dao.UserDao" %>
<%@ page import="com.example.finalproject.dao.UserDaoImpl" %>
<%@ page import="java.util.ListIterator" %>
<%@ page import="com.example.finalproject.dao.EventDaoImpl" %><%--
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

<h4> moderatorPage</h4>


    <form name="creationNewReport" action=CreationNewReportServlet method="post" accept-charset="UTF-8">
        <h3>Создать доклад </h3>

        <input type="text " name="topicOfReport" value=" " >

        <select name="selectLanguageForReport">
            <option>en</option>
            <option>ru</option>
            <option>ua</option>
        </select>
        <input type="submit" value="createReport" formmethod="post" >
    </form>

<p></p>

<form name="createNewEvent" method="post" action=CreationNewEventServlet>

    <h3>Создать событие </h3>
    <p></p>
    <p>Начало события:<input name="startEvent" id="startEvent" type="datetime-local">
    <p></p>
    <p>конец события:<input  name="finishEvent" id="finishEvent" type="datetime-local">
    <p></p>
    <p>Название события: <input type="text" name="nameOfevent" value=" ">
    <p></p>
    <p>Локация проведения события: <input type="text" name= "locationOfevent" value=" ">
    <p>Выбор языка
    <select name="selectLanguage">
        <option>en</option>
        <option>ru</option>
        <option>ua</option>
    </select>

    <h3>Выбрать спикера </h3>
    <jsp:useBean id="speakers" class="com.example.finalproject.dao.UserDaoImpl" scope="page"/>
    <select name="selectSpeaker">
        <c:forEach var="item" items="${speakers.getByIdRole(3)}">
            <option>${item}</option>
        </c:forEach>
    </select>

    <h3>Выбрать тему </h3>
    <jsp:useBean id="reports" class="com.example.finalproject.dao.ReportDaoImpl" scope="page"/>
    <select name="selectReport">
        <c:forEach var="item" items="${reports.allReport}">
            <option>${item}</option>
        </c:forEach>
    </select>

    <input type="submit" value="create new event" formmethod="post">
</form>





</body>
</html>
