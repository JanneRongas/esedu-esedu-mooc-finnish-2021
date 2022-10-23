
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Lukutilasto yhteensa = new Lukutilasto();
        Lukutilasto parilliset = new Lukutilasto();
        Lukutilasto parittomat = new Lukutilasto();
        System.out.println("Anna lukuja:");
        while (true) {
            int annettuluku = Integer.valueOf(lukija.nextLine());
            if (annettuluku == -1) {
                break;
            }
            yhteensa.lisaaLuku(annettuluku);
            if (annettuluku % 2 == 0) {
                parilliset.lisaaLuku(annettuluku);
            } else {
                parittomat.lisaaLuku(annettuluku);
            }
        }
        System.out.println("Summa: " + yhteensa.summa());
        System.out.println("Parillisten summa: " + parilliset.summa());
        System.out.println("Parittomien summa: " + parittomat.summa());
    }
}