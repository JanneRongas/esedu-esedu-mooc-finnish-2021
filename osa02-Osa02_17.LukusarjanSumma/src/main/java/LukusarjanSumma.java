
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mihin asti?");
        int luku = Integer.valueOf(lukija.nextLine());
        int summa = 0;
        for (int luku1 = 1; luku1 <= luku; luku1++) {
            summa += luku1;
        }
        System.out.println("Summa on " + summa);
    }
}