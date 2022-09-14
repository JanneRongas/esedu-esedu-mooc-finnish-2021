
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku1 = 0;
        int maara = 0;
        int summa = 0;
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0){
                break;
            }
            luku1 += 1;
            if (luku > 0){
                maara += 1;
                summa += luku;
            }
        }
        if (luku1 == 0){
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        } else {
            double keskiarvo = (double) summa / maara;
            System.out.println(keskiarvo);
        }
    }
}