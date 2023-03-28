package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public List<Account>accounts;

    public Bank(){
        accounts=new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void AfficherSolde() {
        for (Account account : accounts) {
            System.out.println("Account " + account.getId() + ": " + account.getSolde());
        }
    }

    public void transfer(Account source, Account destination, double somme) {
        source.transfer(destination, somme);
    }

}
