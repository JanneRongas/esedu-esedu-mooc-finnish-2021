
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        int numero = 0;
        while (numero < luku +1) {
            System.out.println(numero);
            numero++;
        }
    }
}