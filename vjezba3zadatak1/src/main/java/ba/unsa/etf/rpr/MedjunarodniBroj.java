package ba.unsa.etf.rpr;

public class MedjunarodniBroj extends TelefonskiBroj{
    private String drzava, broj;

    public MedjunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return drzava + "/" + broj;
    }

    @Override
    public int hashCode(){
        return 1;
    }
}
