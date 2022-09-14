
import java.util.Scanner;

public class Tunnussana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Tunnussana?");
        String eka = lukija.nextLine();
        if (eka.equals("Wattlebird")) {
            System.out.println("Hus siitä!");
        }
        if (eka.equals("Caput Draconis")){
            System.out.println("Tervetuloa!");
        }
    } 
}

