package bank;

public class Account {
    public String id;
    public double solde;
    public double tauxInteret;


    public Account(String id, double solde, double tauxInteret) {
        this.id = id;
        this.solde = solde;
        this.tauxInteret = tauxInteret;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void depot(double somme){
        solde+=somme;
    }
    public void retrait(double somme){
        solde-=somme;
    }

    public void transfer(Account destination, double solde) {
        retrait(solde);
        destination.depot(solde);
    }

    public double interet(){
        return solde *(tauxInteret/100);
    }





}
