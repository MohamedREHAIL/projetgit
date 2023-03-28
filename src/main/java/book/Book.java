package book;

import java.time.LocalDate;

public class Book {
    public String titre;
    public String auteur;
    public LocalDate dateDePub;

    public Book(String titre, String auteur, LocalDate dateDePub) {
        this.titre = titre;
        this.auteur = auteur;
        this.dateDePub = dateDePub;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public LocalDate getDateDePub() {
        return dateDePub;
    }

    public void setDateDePub(LocalDate dateDePub) {
        this.dateDePub = dateDePub;
    }

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
    }
}
