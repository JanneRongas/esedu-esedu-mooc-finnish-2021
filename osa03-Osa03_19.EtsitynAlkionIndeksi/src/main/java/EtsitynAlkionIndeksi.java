
import java.util.ArrayList;
import java.util.Scanner;

public class EtsitynAlkionIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] taulukko = new int[10];
        taulukko[0] = 6;
        taulukko[1] = 2;
        taulukko[2] = 8;
        taulukko[3] = 1;
        taulukko[4] = 3;
        taulukko[5] = 0;
        taulukko[6] = 9;
        taulukko[7] = 7;

        System.out.print("Mitä etsitään? ");
        int etsittava = Integer.valueOf(lukija.nextLine());

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] == etsittava) {
                System.out.println("Luku " + etsittava + " löytyy indeksistä " + i + ".");
                lista.add(taulukko[i]);
            }
        }
        if (lista.size() == 0) {
            System.out.println("Lukua " + etsittava + " ei löydy.");
        }
    }

}
