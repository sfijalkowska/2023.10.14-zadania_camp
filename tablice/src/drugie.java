import java.util.Random;

/*
Napisz program generujący dwuwymiarową tablice (5x5) losowych liczb.
Wynikiem działania programu ma być wyświetlona tablica oraz najmniejsza liczba z tej tablicy.
Zakres losowych liczb 0 - 100.
 */
public class drugie {
    public static void main(String[] args) {
        int[][] tablicaDwuwymiarowa = new int[5][5];
        Random losoweLiczbyWTablicy = new Random();

        for (int i = 0; i < tablicaDwuwymiarowa.length; i++) {
            for (int j = 0; j < tablicaDwuwymiarowa[i].length; j++) {
                tablicaDwuwymiarowa[i][j] = losoweLiczbyWTablicy.nextInt(101);
            }
        }
        for (int i = 0; i < tablicaDwuwymiarowa.length; i++) {
            for (int j = 0; j < tablicaDwuwymiarowa[i].length; j++) {
                System.out.print(tablicaDwuwymiarowa[i][j] + " ");
            }
            System.out.println();
        }
        int najmniejszaLiczba = tablicaDwuwymiarowa[0][0];
        for (int i = 0; i < tablicaDwuwymiarowa.length; i++) {
            for (int j = 0; j < tablicaDwuwymiarowa[i].length; j++) {
                if (tablicaDwuwymiarowa[i][j] < najmniejszaLiczba) {
                    najmniejszaLiczba = tablicaDwuwymiarowa[i][j];
                }
            }
        }
        System.out.println("Najmniejsza liczba: " + najmniejszaLiczba);
    }
}




