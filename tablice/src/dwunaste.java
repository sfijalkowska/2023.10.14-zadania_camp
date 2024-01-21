/*
Napisz program który symuluje rzuty dwiema kostkami do gry (takie zwykłe białe kości jak w monopoly).
Program ma wykonać 10 000 rzutów i wypisać liczbę która wypadała najczęściej (ta liczba jest oczywiście sumą oczek na dwóch kościach które symulujemy.
 */

import java.util.Random;

public class dwunaste {
    public static void main(String[] args) {
        Random random = new Random();
        int[] licznikOczek = new int[13]; // indeksy od 0 do 12, ale sumy oczek są od 2 do 12


        // Symulacja 10 000 rzutów dwiema kostkami
        for (int i = 0; i < 10000; i++) {
            int rzut1 = random.nextInt(6) + 1; // losowanie liczby od 1 do 6
            int rzut2 = random.nextInt(6) + 1;
            int sumaOczek = rzut1 + rzut2;
            licznikOczek[sumaOczek]++;
        }

        // Znalezienie sumy oczek, która wypadła najczęściej
        int najczestszaSuma = 2;
        for (int i = 3; i <= 12; i++) {
            if (licznikOczek[i] > licznikOczek[najczestszaSuma]) {
                najczestszaSuma = i;
            }
        }
        // Wypisanie liczby, która wypadła najczęściej
        System.out.println("Liczba, która wypadła najczęściej: " + najczestszaSuma);

    }
}
