import java.util.Scanner;

public class Kayttoliittyma {
    private Scanner lukija;
    private Sailio ensimmainen;
    private Sailio toinen;

    public Kayttoliittyma(Scanner lukija, Sailio ensimmainen, Sailio toinen) {
        this.lukija = lukija;
        this.ensimmainen = ensimmainen;
        this.toinen = toinen;
    }

    public void kaynnista() {

        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen);
            System.out.println("Toinen: " + toinen);

            String syote = lukija.nextLine();
            if(syote.equals("lopeta")) {
                break;
            }
            String[] arvot = syote.split(" ");
            int arvo = Integer.valueOf(arvot[1]);
            if(arvo < 0) {
                continue;
            }
            String komento = arvot[0];
            if (komento.equals("lisaa")) {
                ensimmainen.lisaa(arvo);
            } else if (komento.equals("siirra")) {
                if(arvo > ensimmainen.sisalto()) {
                    toinen.lisaa(ensimmainen.sisalto());
                    ensimmainen.asetaMaara(0);
                } else {
                    ensimmainen.poista(arvo);
                    toinen.lisaa(arvo);
                }
            } else if (komento.equals("poista")) {
                if (arvo > toinen.sisalto()) {
                    toinen.asetaMaara(0);
                } else {
                    toinen.poista(arvo);
                }
            }
        }
    }
}