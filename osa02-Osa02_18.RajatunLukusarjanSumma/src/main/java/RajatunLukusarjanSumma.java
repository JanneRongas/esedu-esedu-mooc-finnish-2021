
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Ensimmäinen:");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen:");
        int toka = Integer.valueOf(lukija.nextLine());
        int summa = 0;
        for (int luku = eka; luku <= toka; luku++) {
            summa += luku;
        }
        System.out.println("Summa on " + summa);
    }
}