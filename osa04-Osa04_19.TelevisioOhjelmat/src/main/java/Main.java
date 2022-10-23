
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Nimi:");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.println("Pituus:");
            int pituus = Integer.valueOf(lukija.nextLine());
            ohjelmat.add(new TelevisioOhjelma(nimi, pituus));
        }
        System.out.println("Ohjelman maksimipituus:");
        int max = Integer.valueOf(lukija.nextLine());
        for (TelevisioOhjelma nimi: ohjelmat) {
            if (nimi.getPituus() <= max){
                System.out.println(nimi);
            }
        }
    }
}
