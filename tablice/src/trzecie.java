import java.util.Random;

/*
Napisz program generujący jednowymiarową tablicę (10 elementów) liczb w której każda liczba jest losowa ale nie jest mniejsza niż poprzednia liczba.
Przykłady:
23, 34, 53, 60, 80
0, 10, 70, 70, 70
nieprawidłowy wynik:
34, 56, 34, 78, 99 - trzecia liczba jest mniejsza niż poprzednia (druga).
Wynikiem działania programu ma być wyświetlona wygenerowana tablica. Zakres losowych liczb 0 - 20.
 */
public class trzecie {
    public static void main(String[] args) {
        int[] tablicaJednowymiarowa = new int[10];
        Random losowaLiczba = new Random();
        tablicaJednowymiarowa[0] = losowaLiczba.nextInt(21);

        for (int i = 1; i < tablicaJednowymiarowa.length; i++) {
            int liczba = losowaLiczba.nextInt(21 - tablicaJednowymiarowa[i - 1]) + tablicaJednowymiarowa[i - 1];
            tablicaJednowymiarowa[i]=liczba;
        }
        for (int i = 0; i < tablicaJednowymiarowa.length; i++) {
            System.out.print(tablicaJednowymiarowa[i] + " ");
        }
    }
}

