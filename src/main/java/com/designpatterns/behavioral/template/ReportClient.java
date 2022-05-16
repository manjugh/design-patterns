package com.designpatterns.behavioral.template;

public class ReportClient {
    public static void main(String[] args) {
        Reports jsonReports = new JsonFormat();
        jsonReports.generateReport();

        Reports xmlReport = new XmlFormat();
        xmlReport.generateReport();
    }
}
