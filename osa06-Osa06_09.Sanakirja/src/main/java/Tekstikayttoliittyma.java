import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja kirja;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja kirja) {
        this.lukija = lukija;
        this.kirja = kirja;
    }

    public void kaynnista() {

        while (true) {
            System.out.println("Komento: ");
            String komento = lukija.nextLine();

            if (komento.contains("lopeta")) {
                System.out.println("Hei hei!");
                break;
            } else if (komento.equals("lisaa")) {
                System.out.println("Sana:");
                String sana = lukija.nextLine();
                System.out.println("Käännös:");
                String kaannos = lukija.nextLine();
                kirja.lisaa(sana, kaannos);
            } else if (komento.equals("hae")) {
                System.out.println("Haettava:");
                String haettava = lukija.nextLine();
                String haettavanKaannos = kirja.kaanna(haettava);
                if (haettavanKaannos == null) {
                    System.out.println("Sanaa " + haettava + " ei löydy");
                } else {
                    System.out.println("Käännös: " + haettavanKaannos);
                }
            } else {
                System.out.println("Tuntematon komento");
                continue;
            }
        }
    }
}
