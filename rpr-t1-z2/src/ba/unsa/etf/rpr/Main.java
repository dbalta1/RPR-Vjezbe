package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {


    public static int sumaCifara(int n) {
        int suma = 0;
        int cifra;
        do {
            cifra = n % 10;
            n = n / 10;
            suma = suma + cifra;
        } while(n != 0);

        return suma;
    }

    public static void main(String[] args) {
	// write your code here
        int n;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n = ulaz.nextInt();

        for(int i = 1; i < n; i++) {
            if (i % sumaCifara(i) == 0)
                System.out.println(i);
        }


       // System.out.println("Uneseni broj je " + n);
       // System.out.println("Suma cifara broja je: " + sumaCifara(n));
    }
}
