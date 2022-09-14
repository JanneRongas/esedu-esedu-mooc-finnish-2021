
import java.util.Scanner;

import javax.swing.SpinnerDateModel;

public class ParitonVaiParillinen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luku:");
        int luku = Integer.valueOf(lukija.nextLine());
        int jakojaannos = luku % 2;
        if (jakojaannos == 0) {
            System.out.println("Luku " + luku + " on parillinen.");
        } else {
            System.out.println("Luku " + luku + " on pariton.");
        }
    }
}