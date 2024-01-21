/*
Napisz program który ma 3 zmienna a, b i c. Te zmienne to długości boków trójkąta.
Program ma sprawdzić czy z podanych boków da się zbudować trójkąt.
Jeśli się da to program ma wypisać na ekranie true (w przeciwnym wypadku false) i obliczyć obwód tego trójkąta.
Jak sprawdzić czy z podanych boków da się zbudować trójkąt znajdziecie w google pod hasłem: "Nierówność trójkąta".
 */

import java.util.Scanner;

public class dziesiąte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość boku a: ");
        int a = scanner.nextInt();

        System.out.println("Podaj długość boku b: ");
        int b = scanner.nextInt();

        System.out.println("Podaj długość boku c: ");
        int c = scanner.nextInt();

        if (a + b >= c && a + c >= b && b + c >= a) {
            System.out.println("True");
            }
        else {
            System.out.println("False");
        }
        int obwódTrójkąta = a + b + c;
        System.out.println("Obwód trójkąta: " + obwódTrójkąta);
        }
    }
