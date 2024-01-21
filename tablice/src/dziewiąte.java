/*
Napisac program w którym są 3 zmienne:
s - liczba całkowita - oznacza pierwszą liczbę ciągu arytmetycznego
k - liczba całkowita - oznacza krok w ciągu arytmetycznym
n - liczba całkowita - oznacza ilość elementów ciągu.
Program ma zwracać sumę elementów takiego ciągu. Przykład:
s = 3, k = 5, n = 4
program ma wygenerować 4 elementy (n), które wyglądają dla podanych s i k tak:
3, 8, 13, 18
następnie je sumuje i podaje wynik: 42.
Info o tym jak działa ciąg arytmetyczny jest na wikipedii :)
 */

import java.util.Scanner;

public class dziewiąte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę ciągu arytmetycznego: ");
        int s = scanner.nextInt();

        System.out.println("Podaj krok w ciągu arytmetycznym: ");
        int k = scanner.nextInt();

        System.out.println("Podaj ilość elementów ciągu: ");
        int n = scanner.nextInt();

        System.out.println("Elementy n ciągu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(s + i * k + " ");
        }
        /*
        Wzór na sumę n pierwszych elementów ciągu arytmetycznego: S_n = n * (a_1 + a_n) / 2
        S_n to suma n pierwszych elementów ciągu / n to liczba elementów / a_1 to pierwszy wyraz ciągu / a_n to n-ty wyraz ciągu

        Wzór na n-ty wyraz ciągu arytmetycznego: a_n = a_1 + (n - 1) * k
        a_1 to pierwszy wyraz ciągu / k to różnica ciągu arytmetycznego / n to numer elementu ciągu (pierwszy wyraz ma numer 1)

        Podstawiając wyraz a_n do wzoru na sumę, otrzymujemy: S_n = n * (a_1 + a_1 + (n - 1) * k) / 2
         */
        System.out.println();
        System.out.println("Suma elementów ciągu:");
        int suma = n * (s + s + (n - 1) * k) / 2;
        System.out.println(suma);
    }
}

