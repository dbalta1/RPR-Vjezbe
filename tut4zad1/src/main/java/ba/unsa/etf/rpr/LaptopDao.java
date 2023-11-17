package ba.unsa.etf.rpr;

import java.util.ArrayList;

public interface LaptopDao {
    public void dodajLaptopUListu(Laptop laptop);
    public void dodajLaptopUFile(Laptop laptop);
    public void Laptop getLaptop(String procesor) {
        throws NeodgovarajuciProcesorException;
        public void napuniLisatu(ArrayList<Laptop> laptopi);
        public ArrayList<Laptop> vratiPodatkeIzDatoteke();
    }
}
