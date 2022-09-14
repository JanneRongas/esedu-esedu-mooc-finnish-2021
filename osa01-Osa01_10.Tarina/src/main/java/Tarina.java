
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne

        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.");
        System.out.println("Minkä niminen tarinassa esiintyvä hahmo on?");
        String eka = lukija.nextLine();
        System.out.println("Mikä hahmon ammatti on?");
        String toka = lukija.nextLine();
        System.out.println("Tässä tarina:");
        System.out.println("Olipa kerran " + eka + ", joka oli ammatiltaan " + toka + "." );
        System.out.println("Matkatessaan töihin, " + eka + " mietti arkeaan.");
        System.out.println("Ehkäpä " + eka + " ei olekaan koko elämäänsä " + toka + ".");





    }
}
