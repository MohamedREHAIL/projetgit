package delivery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {

    @Test
    void calculateCost() {
        Delivery d1=new Delivery(30,30);
        Delivery d2=new Delivery(70,30);
        Delivery d3=new Delivery(10,15);
        Assertions.assertEquals(15.0,d1.calculateCost());
        Assertions.assertEquals(25.0,d2.calculateCost());
        Assertions.assertEquals(12.0,d3.calculateCost());


    }
}