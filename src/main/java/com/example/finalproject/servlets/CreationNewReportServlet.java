package com.example.finalproject.servlets;

import com.example.finalproject.dao.LanguageDaoImpl;
import com.example.finalproject.dto.ReportDto;
import com.example.finalproject.entity.Language;
import com.example.finalproject.request.ReportRequest;
import com.example.finalproject.servise.ReportService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreationNewReportServlet", value = "/CreationNewReportServlet")
public class CreationNewReportServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        ReportRequest reportRequest = new ReportRequest();
        reportRequest.setTopic(request.getParameter("topicOfReport"));
        reportRequest.setLanguag(request.getParameter("selectLanguageForReport"));

        ReportDto reportDto = new ReportDto();
        Language language = new LanguageDaoImpl().findLangugeByCode(request.getParameter("selectLanguageForReport"));

        reportDto.setTopic(reportRequest.getTopic());
        reportDto.setLanguages_id(language.getId());

        ReportService reportService = new ReportService();
        reportService.saveReport(reportDto);
    }
}
