package ba.unsa.etf.rpr;


import java.io.Serializable;

public class Laptop implements Serializable {
    public String brand, model, procesor, grafickaKartica;
    public int ram, hdd, sdd;
    public double cijena, velicinaEkrana;
    public String getProcesor(){
        return procesor;
    }
    public String getBrand() {
        return brand;
    }
    public int getRam() {
        return ram;
    }
    public Laptop (String brand, String procesor, int ram) {
        this.brand = brand;
        this.procesor = procesor;
        this.ram = ram;
    }
}
