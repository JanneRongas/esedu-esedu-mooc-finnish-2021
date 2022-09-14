
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukumaara = 0;
        int summa = 0;
        int luku1 = 0;
        int parillinen = 0;
        int pariton = 0;
        while (true) {
            System.out.println("Syötä luvut:");
            int luku = Integer.valueOf(lukija.nextLine());

            if (luku == -1) {
                System.out.println("Kiitos ja näkemiin!");
                break;
            }
            summa += luku;
            lukumaara += 1;
            if (luku % 2 == 0) {
                parillinen += 1;
            } else {
                pariton += 1;
            }
        }
        double keskiarvo = (double) summa / lukumaara;
        System.out.println("Summa " + summa);
        System.out.println("Lukuja " + lukumaara);
        System.out.println("Keskiarvo " + keskiarvo);
        System.out.println("Parillisia " + parillinen);
        System.out.println("Parittomia " + pariton);
    }
}