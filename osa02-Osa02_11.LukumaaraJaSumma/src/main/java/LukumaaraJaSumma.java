
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukumaara = 0;
        int summa = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            if (luku != 0) {
                lukumaara = lukumaara + 1;
                summa = luku + summa;
            }
        }
        System.out.println("Lukuja yhteensä " + lukumaara);
        System.out.println("Lukujen summa " + summa);
    }
}