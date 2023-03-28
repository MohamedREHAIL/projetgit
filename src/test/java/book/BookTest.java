package book;

import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @org.junit.jupiter.api.Test
    void getTitre() {
        Book b1= new Book("le rouge et le noir", "victor hugo ", LocalDate.now());
        Assertions.assertEquals("le rouge et le noir",b1.getTitre());
    }

    @org.junit.jupiter.api.Test
    void setTitre() {
        Book b1= new Book("le rouge et le noir", "victor hugo ", LocalDate.now());
        b1.setTitre("les misérables");
        Assertions.assertEquals("les misérables",b1.getTitre());
    }

    @org.junit.jupiter.api.Test
    void getAuteur() {
        Book b1= new Book("le rouge et le noir", "victor hugo", LocalDate.now());
        Assertions.assertEquals("victor hugo",b1.getAuteur());
    }

    @org.junit.jupiter.api.Test
    void setAuteur() {
        Book b1= new Book("le rouge et le noir", "victor hugo", LocalDate.now());
        b1.setAuteur("mohamed");
        Assertions.assertEquals("mohamed",b1.getAuteur());
    }

    @org.junit.jupiter.api.Test
    void getDateDePub() {
        Book b1= new Book("le rouge et le noir", "victor hugo", LocalDate.now());
        Assertions.assertEquals(LocalDate.now(),b1.getDateDePub());
    }




}