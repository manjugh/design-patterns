package com.designpatterns.behavioral.template;

public abstract class Reports {

    public void generateReport() {
        // read data
        String reportData = readData();
        validateData(reportData);
        // validate data
        // generateReport
        printReport(reportData);
    }

    private String readData() {
        System.out.println("reading data");
        return "Accounts data";
    }

    private void validateData(String data) {
        System.out.println("validated " + data);
    }

    public abstract void printReport(String reportData);
}
