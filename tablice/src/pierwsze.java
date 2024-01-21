/*
Napisz program generujący jednowymiarową tablicę losowych liczb (10 elementów) w której każda liczba jest podzielna przez 7.
Wynikiem działania programu ma być wyświetlona tablica. Zakres losowych liczb 0 - 100.
 */

import java.util.Random;

public class pierwsze {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random losowaLiczba = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = losowaLiczba.nextInt(15) * 7;
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
    }

}
