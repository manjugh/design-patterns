package com.designpatterns.behavioral.template;

public class JsonFormat extends Reports {
    @Override
    public void printReport(String reportData) {
        System.out.println("Report generated in Json Format");
    }
}
