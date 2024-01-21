/*
Napisz program który generuje dwie tablice (10 elementów) losowych liczb.
Wynikiem działania programu mają być wyświetlone obie tablice oraz trzecia tablica będąca połączeniem dwóch wygenerowanych.
Przykład:
3, 5, 12, 34, 45
45, 21, 65, 23, 1
3, 5, 12, 34, 45, 45, 21, 65, 23, 1
 */

import java.util.Random;

public class siódme {
    public static void main(String[] args) {
        int[] tablica1 = new int[10];
        int[] tablica2 = new int[10];
        int[] tablicaPołączona = new int[tablica1.length + tablica2.length];
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
        for (int i = 0; i < tablica1.length; i++) {
            System.out.print(tablica2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tablica1.length; i++) {
            tablicaPołączona[i] = tablica1[i];
            }
        for (int i = 0; i < tablica2.length; i++) {
            tablicaPołączona[i + tablica1.length] = tablica2[i];
        }
        for (int i = 0; i < tablicaPołączona.length; i++) {
            System.out.print(tablicaPołączona[i] + " ");
        }
    }
}
