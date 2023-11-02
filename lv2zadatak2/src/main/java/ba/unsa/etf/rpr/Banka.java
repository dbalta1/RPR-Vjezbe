package ba.unsa.etf.rpr;

import java.util.List;
import java.util.Random;

public class Banka {
    private long brojRacuna;
    public Banka(){};
    public Korisnik kreirajNovogKorisnika(String ime, String prezime) {
        return new Korisnik(ime, prezime);
    }
    public Uposlenik kreirajNovogUposlenika(String ime, String prezime) {
        return new Uposlenik(ime, prezime);
    }
    public Racun kreirajRacunZaKorisnika(Korisnik k) {
        Random r = new Random();
        Long br = r.nextLong();
        return new Racun(br,k);
    }
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;
}
