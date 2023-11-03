package ba.unsa.etf.rpr;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Double> brojevi = new ArrayList<>();
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesite brojeve ili 'stop' za kraj: ");

        while(true) {
            String input = ulaz.next();
            if(input.equals("stop")) {
                break;
            }
            double broj = Double.parseDouble(input);
            brojevi.add(broj);
        }

        double suma = 0;
        double minimum = 0;
        double maksimum = 0;
        double srednja_vrijednost;
        double standardna_devijacija = 0;
        double varijansa = 0;

        for (double broj : brojevi)
            suma = suma + broj;


        srednja_vrijednost = suma / brojevi.size();

        for(int i = 0; i < brojevi.size(); i++) {
             minimum = brojevi.get(0);
                if(brojevi.get(i) < minimum)
                    minimum = brojevi.get(i);
        }

        for(int i = 0; i < brojevi.size(); i++) {
            maksimum = brojevi.get(0);
                if (brojevi.get(i) > maksimum)
                    maksimum = brojevi.get(i);
        }

        for(double broj : brojevi) {
            varijansa = varijansa + Math.pow(broj - srednja_vrijednost, 2);
        }

        standardna_devijacija = Math.sqrt(varijansa / brojevi.size());


        System.out.println("Srednja vrijednost brojeva je " + srednja_vrijednost);
        System.out.println("Najmanji element liste je " + minimum);
        System.out.println("Najveci element liste je " + maksimum);
        System.out.println("Standardna devijacija " + standardna_devijacija);
    }
}