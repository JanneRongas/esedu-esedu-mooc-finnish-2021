
import java.util.Scanner;

public class PositiivinenLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luku:");
        int eka = Integer.valueOf(lukija.nextLine());
        int luku = 0;
        if (eka + luku > 0) {
            System.out.println("Luku on positiivinen.");
        } else {
            System.out.println("Lukusi ei ole positiivinen.");
        }
    }
}

