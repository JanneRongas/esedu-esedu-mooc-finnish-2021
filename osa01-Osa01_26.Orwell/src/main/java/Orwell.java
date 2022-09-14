
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luku:");
        int eka = Integer.valueOf(lukija.nextLine());
        int luku = 1984;
        if (eka == luku) {
            System.out.println("Orwell");
        } else if (eka > luku) {
            System.out.println(" ");
        } else if (eka < luku) {
            System.out.println(" ");
        }

    }
}
