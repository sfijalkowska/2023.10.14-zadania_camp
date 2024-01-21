import java.util.Random;

/*
Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
Program ma wygenerować druga tablicę która jest pierwszą tablicą w odwrotnej kolejności.
Wynikiem działania programu ma być wyświetlona pierwsza i druga tablica. Przykłady:
3, 23, 2, 23, 53
53, 23, 2, 23, 3
45, 23, 65, 1, 54
54, 1, 65, 23, 45
Zakres losowych liczb 0 - 100.
 */
public class szóste {
    public static void main(String[] args) {
        int[] tablica1 = new int[10];
        int[] tablica2 = new int[10];
        Random random = new Random();

        for (int i = 0; i < tablica1.length; i++) {
            int liczba = random.nextInt(101);
            tablica1[i] = liczba;
        }
        for (int i = 0; i < tablica1.length; i++) {
            System.out.print(tablica1[i] + " ");
        }
        for (int i = 0; i < tablica1.length; i++) {
            tablica2[i] = tablica1[tablica1.length - 1 - i];
        }
        System.out.println();
        for (int i = 0; i < tablica1.length; i++) {
            System.out.print(tablica2[i] + " ");
        }
    }
}
