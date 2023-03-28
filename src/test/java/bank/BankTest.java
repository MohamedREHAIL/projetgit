package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void addAccount() {
        Bank b1=new Bank();
        Account a1= new Account("BA552365",200.0,80.0);
        Account a2= new Account("BA559965",10.0,75.0);
        Account a3= new Account("BA552375",70.0,50.0);
        List<Account>accounts=new ArrayList<>();
        b1.addAccount(a1);
        b1.addAccount(a2);
        b1.addAccount(a3);
        Assertions.assertEquals(3,b1.getAccounts().size());
    }

    @Test
    void removeAccount() {

        Account a1= new Account("BA552365",200.0,80.0);
        Account a2= new Account("BA559965",10.0,75.0);

        List<Account>accounts=new ArrayList<>();
        Bank b1=new Bank();
       b1.addAccount(a1);
       b1.addAccount(a2);


        b1.removeAccount(a2);
        Assertions.assertEquals(1,b1.getAccounts().size());
    }

    @Test
    void afficherSolde() {
        Bank b1= new Bank();
        Account a1= new Account("BA552365",200.0,80.0);
        b1.addAccount(a1);
        String affichage="Account BA552365: 200.0" ;
        Assertions.assertEquals(affichage, b1.AfficherSolde());
    }

    @Test
    void transfer() {
        Bank b1=new Bank();
        Account source= new Account("BA552365",200.0,80.0);
        Account destination= new Account("BA559965",10.0,75.0);
        b1.transfer(source,destination,100.0);
        Assertions.assertEquals(110.0,destination.getSolde());



    }
}