package com.designpatterns.creational.singleton;

public class DateUtilLazyInit {
    private static DateUtilLazyInit dateUtil;

    private DateUtilLazyInit() {

    }

    public static DateUtilLazyInit getInstance() {
        synchronized (DateUtilEagerInit.class) {
            if (dateUtil == null) {
                dateUtil = new DateUtilLazyInit();
            }
        }
        return dateUtil;
    }
}
