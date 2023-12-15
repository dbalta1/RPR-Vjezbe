//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.probaprogram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KorisniciModelTest extends KorisniciModel {
    private KorisniciModel model;

    KorisniciModelTest() {
    }

    @BeforeEach
    public void setUp() {
        this.model = new KorisniciModel();
    }

    @Test
    public void testDodajKorisnika() {
        Korisnik korisnik = new Korisnik("Ime", "Prezime", "email@example.com", "korisnik", "lozinka");
        this.model.dodajKorisnika(korisnik);
        Assertions.assertEquals(1, this.model.getKorisnici().size());
        Assertions.assertEquals(korisnik, this.model.getKorisnici().get(0));
    }

    @Test
    public void testSetTrenutniKorisnik() {
        Korisnik korisnik1 = new Korisnik("Ime1", "Prezime1", "email1@example.com", "korisnik1", "lozinka1");
        Korisnik korisnik2 = new Korisnik("Ime2", "Prezime2", "email2@example.com", "korisnik2", "lozinka2");
        this.model.dodajKorisnika(korisnik1);
        this.model.dodajKorisnika(korisnik2);
        this.model.setTrenutniKorisnik(korisnik1);
        Assertions.assertEquals(korisnik1, this.model.getTrenutniKorisnik());
        this.model.setTrenutniKorisnik(korisnik2);
        Assertions.assertEquals(korisnik2, this.model.getTrenutniKorisnik());
    }
}
