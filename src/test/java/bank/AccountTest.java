package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account a1= new Account("BA552365",20.0,05.0);
        Assertions.assertEquals("BA552365",a1.getId());
    }

    @Test
    void setId() {
        Account a1= new Account("BA552365",20.0,05.0);
        a1.setId("2");
        Assertions.assertEquals("2",a1.getId());
    }

    @Test
    void getSolde() {
        Account a1= new Account("BA552365",20.0,05.0);
        Assertions.assertEquals(20.0,a1.getSolde());

    }

    @Test
    void setSolde() {
        Account a1= new Account("BA552365",20.0,05.0);
        a1.setSolde(19.0);
        Assertions.assertEquals(19.0,a1.getSolde());
    }

    @Test
    void getTauxInteret() {
        Account a1= new Account("BA552365",20.0,05.0);
        Assertions.assertEquals(05.0,a1.getTauxInteret());

    }

    @Test
    void setTauxInteret() {
        Account a1= new Account("BA552365",20.0,05.0);
        a1.setTauxInteret(10.0);
        Assertions.assertEquals(10.0,a1.getTauxInteret());
    }

    @Test
    void depot() {
        Account a1= new Account("BA552365",20.0,05.0);
        a1.depot(10.0);
        Assertions.assertEquals(30.0,a1.getSolde());
    }

    @Test
    void retrait() {
        Account a1= new Account("BA552365",20.0,05.0);
        a1.retrait(10.0);
        Assertions.assertEquals(10.0,a1.getSolde());
    }

    @Test
    void transfer() {
        Account a1= new Account("BA552365",20.0,05.0);
        Account a2= new Account("BA55552365",50.0,10.0);
        a1.transfer(a2,10.0);
        Assertions.assertEquals(60.0,a2.getSolde());
    }

    @Test
    void interet() {
        Account a1= new Account("BA552365",20.0,100.0);
        Assertions.assertEquals(20.0,a1.interet());
    }
}