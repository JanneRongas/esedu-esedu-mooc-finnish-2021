
import java.util.Scanner;

public class Jatketaanko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Jatketaanko?");
            String teksti = lukija.nextLine();
            if (teksti.equals("ei")) {
                break;
            }
        }
    }
}   