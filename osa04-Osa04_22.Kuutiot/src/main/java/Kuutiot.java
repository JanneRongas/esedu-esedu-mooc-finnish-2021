
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String merkkijono = lukija.nextLine();
            if (merkkijono.equals("loppu")) {
                break;
            }
            int numero = Integer.valueOf(merkkijono);
            System.out.println(numero * numero * numero);
        }
    }
}
