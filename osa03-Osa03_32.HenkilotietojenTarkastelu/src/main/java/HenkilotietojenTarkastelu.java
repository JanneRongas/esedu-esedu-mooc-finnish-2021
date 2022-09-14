
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int i = 0;
        String nimi = "";
        int summa = 0;
        int maara = 0;
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            String[] palat = luettu.split(",");
            if (i < palat[0].length()) {
                i = palat[0].length();
                nimi = palat[0];
            }
            summa += Integer.valueOf(palat[1]);
            maara += 1;
        }
        double keskiarvo = (double) summa / maara;
        System.out.println("Pisin nimi:" + nimi);
        System.out.println("Syntymävuosien keskiarvo: " + keskiarvo);
    }
}
