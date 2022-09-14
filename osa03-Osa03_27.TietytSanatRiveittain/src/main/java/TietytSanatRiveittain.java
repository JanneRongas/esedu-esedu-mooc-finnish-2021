
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String merkkijono = lukija.nextLine();
            String[] palat = merkkijono.split(" ");
            if (merkkijono.equals("")) {
                break;
            }

            for (int i = 0; i < palat.length; i++) {
                if (palat[i].contains("av")) {
                    System.out.println(palat[i]);
                }
            }
        }

    }
}
