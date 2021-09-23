package com.example.finalproject.servlets;

import com.example.finalproject.request.EventRequest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@WebServlet(name = "CreationNewEventServlet", value = "/CreationNewEventServlet")
public class CreationNewEventServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        EventRequest eventRequest = new EventRequest();


        String startEvent = request.getParameter("startEvent");
        String finishEvent = request.getParameter("finishEvent");

    }
}
