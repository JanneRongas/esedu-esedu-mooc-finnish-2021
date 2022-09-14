
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti?");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä lähtien?");
        int toka = Integer.valueOf(lukija.nextLine());
        for (int i = toka; i <= eka; i++) {
            System.out.println(i);
        }
    }
}