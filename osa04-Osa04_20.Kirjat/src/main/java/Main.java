
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Kirja> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.println("Sivuja: ");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.println("Julkaisuvuosi: ");
            int julkaisuvuosi = Integer.valueOf(lukija.nextLine());

            kirjat.add(new Kirja(nimi, sivuja, julkaisuvuosi));
        }
        System.out.println("");
        System.out.println("Mitä tulostetaan? ");
        String sana = lukija.nextLine();

        if (sana.equals("nimi")) {
            for (Kirja kirja : kirjat) {
                System.out.println(kirja.getNimi());
            }
        }
        if (sana.equals("kaikki")) {
            for (Kirja kirja: kirjat) {
                System.out.println(kirja);
            }
        }

    }
}