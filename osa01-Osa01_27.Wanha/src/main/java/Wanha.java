
import java.util.Scanner;

public class Wanha {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna vuosiluku:");
        int eka = Integer.valueOf(lukija.nextLine());
        int luku = 2015;
        if (eka == luku) {
            System.out.println(" ");
        } else if (eka > luku) {
            System.out.println(" ");
        } else if (eka < luku) {
            System.out.println("Wanha!");
        }

    }
}

