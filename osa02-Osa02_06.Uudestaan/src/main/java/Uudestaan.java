
import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Syötä luku");
            String numero = lukija.nextLine();
            if (numero.equals("4")) {
                break;
            }
        }
    }
}