/*
Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
Wynikiem działania programu ma być wygenerowana tablica oraz ilość powtórzeń liczby 5. Zakres losowych liczb 0 - 10.
 */

import java.util.Random;

public class piąte {
    public static void main(String[] args) {
        int[] tablicaJadnowymiarowa = new int[10];
        Random losowaLiczba = new Random();

        for (int i=0; i< tablicaJadnowymiarowa.length; i++){
            tablicaJadnowymiarowa[i]= losowaLiczba.nextInt(11);
        }
        for (int i=0; i< tablicaJadnowymiarowa.length; i++){
            System.out.print(tablicaJadnowymiarowa[i]+ " ");
        }
        System.out.println();
int licznikPowtórzeń = 0;
        for (int i=0; i< tablicaJadnowymiarowa.length; i++){
            if (tablicaJadnowymiarowa[i]==5){
                licznikPowtórzeń++;
            }
        }
        System.out.println("Liczba powtórzeń 5: " + licznikPowtórzeń);
    }
}
