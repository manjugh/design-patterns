package com.designpatterns.behavioral.template;

public class XmlFormat extends Reports {
    @Override
    public void printReport(String reportData) {
        System.out.println("Report generated in xml foramt");
    }
}
