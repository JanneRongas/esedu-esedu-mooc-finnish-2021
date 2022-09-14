
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna vuosi:");
        int luku = Integer.valueOf(lukija.nextLine());
        if (luku % 4 == 0 && (luku % 100 != 0 || luku % 400 == 0)) {
            System.out.println("Vuosi on karkausvuosi.");
        } else {
            System.out.println("Vuosi ei ole karkausvuosi.");
        }
    }
}