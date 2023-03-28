package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account>accounts;

    public Bank(){
        this.accounts=new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }



    public String AfficherSolde() {
        String str="";
        for (Account account : accounts) {
            str+=("Account " + account.getId() + ": " + account.getSolde());
        }
        return str;
    }

    public void transfer(Account source, Account destination, double somme) {
        source.transfer(destination, somme);
    }
    public List<Account> getAccounts() {
        return accounts;
    }

}
