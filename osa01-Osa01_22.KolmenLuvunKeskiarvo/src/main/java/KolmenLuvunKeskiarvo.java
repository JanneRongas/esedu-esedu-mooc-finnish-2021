
import java.util.Scanner;

public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä ensimmäinen luku!");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int toka = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        int kolmas = Integer.valueOf(lukija.nextLine());
        int jakaja = 3;
        double tulos = 1.0 * (eka + toka + kolmas) / jakaja;
        System.out.println("Syötettyjen lukujen keskiarvo on " + tulos);


        // toteuta ohjelma tänne

    }
}
