package delivery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {

    @Test
    void calculateCost() {
        Delivery d1=new Delivery(30,30);
        double cout=d1.calculateCost();
        Assertions.assertEquals(15.0,cout);
    }
}