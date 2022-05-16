package com.designpatterns.creational.singleton;

public class DateUtilEagerInit {

    private static DateUtilEagerInit dateUtil;

    static {
        dateUtil = new DateUtilEagerInit();
    }

    private DateUtilEagerInit() {

    }

    public static DateUtilEagerInit getInstance() {
        return dateUtil;
    }
}
