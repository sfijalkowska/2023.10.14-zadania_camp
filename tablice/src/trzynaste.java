/*
Napisz program który generuje tablicę liczb 0 i 1 (10 elementów).
Program ma sprawdzić czy tablica jest symetryczna - pierwszy element taki jak ostatni, drugi taki jak przedostatni itd.
Wynikiem działania programu ma być wypisana wygenerowana tablica oraz true albo false w zależności czy jest symetria czy nie.
 */

import java.util.Random;

public class trzynaste {
    public static void main(String[] args) {
        Random random = new Random();
        int [] tab = new int [10];

        for (int i=0; i< tab.length; i++) {
            tab[i] = random.nextInt(0, 2);
        }
        for (int i=0; i< tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        boolean symetria = true;
        for (int i=0; i< tab.length; i++) {
            if (tab[i] !=tab[tab.length-1-i]){
                symetria = false;
                break;
            }
        }
        System.out.println();
        System.out.println("Czy tablica jest symetryczna? " + symetria);
    }
}
