public class Drzava {

    private int id;
    private String naziv;
    private Grad glavniGrad;

    // Constructors

    public Drzava(int id, String naziv, Grad glavniGrad) {
        this.id = id;
        this.naziv = naziv;
        this.glavniGrad = glavniGrad;
    }

    public Drzava() {
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public Grad getGlavniGrad() {
        return glavniGrad;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGlavniGrad(Grad glavniGrad) {
        this.glavniGrad = glavniGrad;
    }
}
