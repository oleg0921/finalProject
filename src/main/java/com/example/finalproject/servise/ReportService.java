package com.example.finalproject.servise;

import com.example.finalproject.dao.ReportDaoImpl;
import com.example.finalproject.dto.ReportDto;
import com.example.finalproject.entity.Report;

public class ReportService {

    ReportDaoImpl reportDao;

    public ReportService()
    {
        reportDao = new ReportDaoImpl();

    }



    public void saveReport(ReportDto reportDto)
    {
        Report report = new Report();

        report.setTopic(reportDto.getTopic());
        report.setLanguages_id(reportDto.getLanguages_id());


        reportDao.save(report);
    }


}


