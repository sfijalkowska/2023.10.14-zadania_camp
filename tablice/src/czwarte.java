/*
Napisz program w którym jest zmienna 'w'. Zmienna ta oznacza wysokość choinki.
Program wyświetla na ekranie wypisaną choinkę o danej wysokości. Przykłady:
dla w = 3 program wypisuje
  *
 ***
*****
pierwszy wiersz to: spacja spacja gwiazdka spacja spacja
drugi wiersz to: spacja gwiazdka gwiazdka gwiazdka spacja
trzeci wiersz to: gwiazdka gwiazdka gwiazdka gwiazdka gwiazdka
dla w = 5
    *
  ***
  *****
 *******
*********
 */

import java.util.Scanner;

public class czwarte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość choinki: ");
        System.out.println();
        int w = scanner.nextInt();

        for (int i = 0; i < w; i++) { //Ta pętla kontroluje, ile wierszy choinki zostanie wygenerowanych. Zmienna i reprezentuje numer aktualnego wiersza, zaczynając od 0. Pętla kontynuuje działanie, dopóki i jest mniejsze niż w, czyli wysokość choinki.
            for (int j = 0; j<w -i-1; j++) {
                System.out.print(" ");
            }
            for (int a = 0; a < 2 * i + 1; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
