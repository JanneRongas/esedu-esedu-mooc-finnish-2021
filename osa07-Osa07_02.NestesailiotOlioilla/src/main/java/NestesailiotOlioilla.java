import java.util.Scanner;

public class NestesailiotOlioilla {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(lukija, new Sailio(), new Sailio());
        kayttoliittyma.kaynnista();
        
    }
}
