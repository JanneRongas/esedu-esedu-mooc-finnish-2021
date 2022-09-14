
import java.util.Scanner;

public class ToiseenPotenssiin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int eka = Integer.valueOf(lukija.nextLine());
        int tulos = eka * eka;
        System.out.println(tulos);
    }
}