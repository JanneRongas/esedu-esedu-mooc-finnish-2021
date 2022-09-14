
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int vanhin = 0;
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] palat = luettu.split(",");
            if (vanhin < Integer.valueOf(palat[1])) {
                vanhin = Integer.valueOf(palat[1]);
            }
        }
        System.out.println("Vanhimman ikä: " + vanhin);

    }
}
