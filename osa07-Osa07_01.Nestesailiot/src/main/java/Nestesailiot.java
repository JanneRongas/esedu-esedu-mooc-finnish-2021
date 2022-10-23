
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int max = 100;
        int ensimmainen = 0;
        int toinen = 0;

        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen + "/100");
            System.out.println("Toinen: " + toinen + "/100");

            String syote = lukija.nextLine();
            if (syote.equals("lopeta")) {
                break;
            }
            String[] maarat = syote.split(" ");
            int maara = Integer.valueOf(maarat[1]);
            if (maara < 0) {
                continue;
            }
            String komento = maarat[0];
            if (komento.equals("lisaa")) {
                if (ensimmainen + maara > max) {
                    ensimmainen = max;
                } else {
                    ensimmainen += maara;
                }
            } else if (komento.equals("siirra")) {
                if (maara > ensimmainen) {
                    toinen = ensimmainen;
                    ensimmainen = 0;
                } else {
                    ensimmainen -= maara;
                    toinen += maara;
                }
                if (toinen > max) {
                    toinen = max;
                }
            } else if (komento.equals("poista")) {
                if (maara > toinen) {
                    toinen = 0;
                } else {
                    toinen -= maara;
                }
            }
        }
    }
}