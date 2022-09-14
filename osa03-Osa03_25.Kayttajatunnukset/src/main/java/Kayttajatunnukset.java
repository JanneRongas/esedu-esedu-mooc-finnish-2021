
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna tunnus: ");
        String kayttaja = lukija.nextLine();
        System.out.print("Anna salasana: ");
        String salasana = lukija.nextLine();

        if (((kayttaja.equals("aleksi")) && (salasana.equals("tappara"))) ||
                ((kayttaja.equals("elina")) && (salasana.equals("kissa")))) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }

    }
}