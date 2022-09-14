
import java.util.Scanner;

public class Viesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kirjoita merkkijono!");
        // toteuta ohjelma tänne
        // Luetaan käyttäjän syöttämä merkkijono ja asetetaan se
        // ohjelman muistiin "String viesti = (luettu sisältö)"
        String viesti = lukija.nextLine();

        System.out.println(viesti);
        
        


    }
}
