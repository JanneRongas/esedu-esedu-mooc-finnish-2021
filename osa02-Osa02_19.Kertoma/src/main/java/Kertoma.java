
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luku:");
        int luku = Integer.valueOf(lukija.nextLine());
        int kertoma = 1;
        for (int luku1 = 1; luku1 <= luku; luku1++) {
            kertoma *= luku1;
        }
        System.out.println("Kertoma on " + kertoma);
    }
}