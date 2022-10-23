import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {

        int[] luvut = { 8, 3, 7, 9, 1, 2, 4 };
        Paaohjelma.jarjesta(luvut);
        int[] taulukko = { 3, 1, 5, 99, 3, 12 };
    }

    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];

        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
            }
        }
        return pienin;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = taulukko[0];
        int index = 0;

        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                index = i;
            }
        }
        return index;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int index = aloitusIndeksi;
        int pienin = taulukko[index];

        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                index = i;
            }
        }
        return index;
    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int vaihto = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = vaihto;
    }

    public static void jarjesta(int[] taulukko) {
        int index = 0;
        System.out.println(Arrays.toString(taulukko));

        while (index < taulukko.length) {

            vaihda(taulukko, index, pienimmanIndeksiAlkaen(taulukko, index));
            System.out.println(Arrays.toString(taulukko));

            index += 1;
        }
    }
}
