
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kuinka vanha olet?");
        int eka = Integer.valueOf(lukija.nextLine());
        int luku = 18;
        if (eka < luku) {
            System.out.println("Et ole täysi-ikäïnen!");
        } else  {
            System.out.println("Olet täysi-ikäinen!");
        }
    }
}
