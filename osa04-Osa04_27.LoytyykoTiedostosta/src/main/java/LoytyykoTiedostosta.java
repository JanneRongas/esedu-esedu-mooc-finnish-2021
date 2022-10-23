
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();

        ArrayList<String> lista = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(tiedosto))) {
            while (scanner.hasNextLine()) {
                lista.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        }
        if (lista.contains(etsittava)) {
            System.out.println("Löytyi!");
        } else {
            System.out.println("Ei löytynyt.");
        }

    }
}
