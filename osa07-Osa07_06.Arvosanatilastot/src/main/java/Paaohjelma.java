
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Arvosanatilastot arvosanatilastot = new Arvosanatilastot();
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(lukija, arvosanatilastot);

        kayttoliittyma.kaynnista();

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
    }
}
