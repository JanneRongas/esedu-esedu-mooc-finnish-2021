
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.println("Etunimi:");
            String etunimi = lukija.nextLine();
            if (etunimi.isEmpty()) {
                break;
            }
            System.out.println("Sukunimi:");
            String sukunimi = lukija.nextLine();
            System.out.println("Henkilötunnus:");
            String hetu = lukija.nextLine();

            henkilotiedot.add(new Henkilotieto(etunimi, sukunimi, hetu));
        }
        System.out.println("");
        for (Henkilotieto henkilo: henkilotiedot) {
            System.out.println(henkilo.getEtunimi() + " " + henkilo.getSukunimi());
        }

    }
}
