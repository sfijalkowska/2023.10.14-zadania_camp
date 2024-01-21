/*
Napisz program który losuje dwie tablice (10 elementów, zakres 0 - 100).
Wynikiem działania programu mają być wypisane obie tablice, oraz trzecia tablica
w które każdy element jest sumą odpowiadających elementów z dwóch pierwszych tablic.
Przykład:
1 4 4 64 45
23 32 5 23 3
24 36 9 87 48
 */

import java.util.Random;

public class ósme {
    public static void main(String[] args) {
        int[] tablica1 = new int[10];
        int[] tablica2 = new int[10];
        int[] sumaTablic = new int[tablica1.length];

        Random randomLiczba = new Random();

        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = randomLiczba.nextInt(101);
        }
        for (int i = 0; i < tablica1.length; i++) {
            System.out.print(tablica1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < tablica2.length; i++) {
            tablica2[i] = randomLiczba.nextInt(101);
        }
        for (int i = 0; i < tablica2.length; i++) {
            System.out.print(tablica2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < tablica1.length; i++) {
            sumaTablic[i] = tablica1[i] + tablica2[i];
        }
        for (int i = 0; i < sumaTablic.length; i++) {
            System.out.print(sumaTablic[i] + " ");
        }
    }
}

