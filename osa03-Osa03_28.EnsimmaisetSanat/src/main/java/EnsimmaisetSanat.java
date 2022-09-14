
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String luettu = lukija.nextLine();
            String[] palat = luettu.split(" ");

            if (luettu.equals("")) {
                break;
            }

            System.out.println(palat[0]);
        }

    }
}
