package com.designpatterns.creational.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DateUtilLazyInitTest extends Assertions {

    @Test
    void test_singleton() {
        DateUtilLazyInit firstInstance = DateUtilLazyInit.getInstance();
        DateUtilLazyInit secondInstance = DateUtilLazyInit.getInstance();
        assertThat(firstInstance).isSameAs(secondInstance);
    }

}