/*
Napisz program który ma dwie zmienne:
weight - waga, liczba całkowita
height - wzrost, liczba całkowita
program ma obliczać BMI (wskaźnik masy ciała,
wzór do znalezienia w internecie, gdybyście nie znaleźli to piszcie) i na podstawie wyliczonego BMI wypisywać "Nadwaga, Niedowaga, W normie itp.
 */

import java.util.Scanner;

public class jedenaste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wagę w kg:");
        double weight = scanner.nextDouble();

        System.out.println("Podaj wzrost w m:");
        double height = scanner.nextDouble();

        System.out.println("Zakres wartości BMI: ");
        double wartośćBMI = weight / (height * height);
        System.out.println(wartośćBMI);
        System.out.println();

        if (wartośćBMI <= 18.49) {
            System.out.println("Niedowaga");
        } else if (wartośćBMI >= 18.5 && wartośćBMI <= 24.99) {
            System.out.println("Optimum");
        } else if (wartośćBMI >= 25) {
            System.out.println("Nadwaga");
        }
    }
}
