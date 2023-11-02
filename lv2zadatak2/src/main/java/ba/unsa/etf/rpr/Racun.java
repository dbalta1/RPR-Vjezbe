package ba.unsa.etf.rpr;

public class Racun {
    private long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private double stanjeRacuna;
    public Racun(Long brRacuna, Osoba o){
        this.brojRacuna = brRacuna;
        this.korisnikRacuna = o;
        this.stanjeRacuna = 0.0;
        this.odobrenjePrekoracenja = false;
    }
    public boolean provjeriOdobrenjePrekoracenja(double prekoracenje) {
        return (stanjeRacuna - prekoracenje >= 0) && odobrenjePrekoracenja;
    }

    public boolean izvrsiUplatu(double iznos) {
        if(iznos >= 0) {
            stanjeRacuna += iznos;
            return true;
        }
        else return false;
    }
    public boolean izvrsiIsplatu(double iznos) {
        if(stanjeRacuna - iznos >= 0){
            stanjeRacuna -= iznos;
            return true;
        }
        else return false;
    }
    public void odobriPrekoracenje(double prekoracenje) {
        if(prekoracenje >= 0)
            odobrenjePrekoracenja = true;
    }
}
