package com.example.finalproject.servlets;

import com.example.finalproject.request.EventRequest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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

        Date dates = new Date();


        int startYear = Integer.parseInt(startEvent.substring(0,4));
        int startMount =  Integer.parseInt(startEvent.substring(5,7));
        int startDay =  Integer.parseInt(startEvent.substring(8,10));

        int h = Integer.parseInt(startEvent.substring(11,13));
        int m = Integer.parseInt(startEvent.substring(14));

        LocalDate date = LocalDate.of(startYear, startMount, startDay);

        int startYearp = Integer.parseInt(finishEvent.substring(0,4));
        int startMountp =  Integer.parseInt(finishEvent.substring(5,7));
        int startDayp =  Integer.parseInt(finishEvent.substring(8,10));

        int hp = Integer.parseInt(finishEvent.substring(11,13));
        int mp = Integer.parseInt(finishEvent.substring(14));

        LocalDateTime dateStart = LocalDateTime.of(Integer.parseInt(startEvent.substring(0,4)),
                                                   Integer.parseInt(startEvent.substring(5,7)),
                                                   Integer.parseInt(startEvent.substring(8,10)),
                                                   Integer.parseInt(startEvent.substring(11,13)),
                                                   Integer.parseInt(startEvent.substring(14)));

        LocalDateTime dateFinish = LocalDateTime.of(Integer.parseInt(finishEvent.substring(0,4)),
                Integer.parseInt(finishEvent.substring(5,7)),
                Integer.parseInt(finishEvent.substring(8,10)),
                Integer.parseInt(finishEvent.substring(11,13)),
                Integer.parseInt(finishEvent.substring(14)));


        Date debuS = EventRequest.convertLocalDateTimeToDateUsingInstant(dateStart);
        Date debugF = EventRequest.convertLocalDateTimeToDateUsingInstant(dateFinish);

        eventRequest.setStartEvent(EventRequest.convertLocalDateTimeToDateUsingInstant(dateStart));
        eventRequest.setFihishEvent(EventRequest.convertLocalDateTimeToDateUsingInstant(dateFinish));
        eventRequest.setNameEvent(request.getParameter("nameOfevent"));
        eventRequest.setLocation(request.getParameter("locationOfevent"));
        eventRequest.setLanguage(request.getParameter("selectLanguage"));







     // .setYear();
    }
}
