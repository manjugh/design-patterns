package com.designpatterns.creational.factory.simple;

import org.junit.jupiter.api.Test;

class TransportFactoryTest {

    @Test
    void testFactory() {
        Transport ship = TransportFactory.transport("ship");
       /* if(ship instanceof Ship s){
            System.out.println("yes its ship");
            s.deliver("goods");
        }*/
    }

}