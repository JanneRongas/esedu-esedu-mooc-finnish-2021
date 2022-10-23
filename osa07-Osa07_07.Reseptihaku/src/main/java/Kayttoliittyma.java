import java.nio.file.Paths;
import java.util.Scanner;

public class Kayttoliittyma {
    private Scanner lukija;

    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
    }

    public void kaynnista() {
        System.out.println("Mistä luetaan?");
        String lueTiedosto = lukija.nextLine();
        Reseptit reseptit = new Reseptit();
        reseptit.lueTiedostosta(lueTiedosto);

        tulostaKomentoLista();

        while (true) {
            System.out.println("Syötä komento: ");
            String komento = lukija.nextLine();
            System.out.println("");
            if(komento.equals("lopeta")) {
                break;
            }
            if(komento.equals("listaa")) {
                System.out.println("Reseptit:");
                reseptit.tulostaReseptiLista();
            } else if (komento.equals("hae nimi")) {
                System.out.println("Mitä haetaan: ");
                String sana = lukija.nextLine();
                System.out.println("Reseptit:");
                reseptit.etsiNimella(sana);
            } else if (komento.equals("hae keittoaika")) {
                System.out.println("Keittoaika korkeintaan: ");
                int keittoaikaKorkeintaan = Integer.valueOf(lukija.nextLine());
                System.out.println("Reseptit:");
                reseptit.etsiKeittoajalla(keittoaikaKorkeintaan);
            } else if (komento.equals("hae aine")) {
                System.out.println("Mitä raaka-ainetta haetaan:");
                String aine = lukija.nextLine();
                System.out.println("Reseptit:");
                reseptit.etsiRaakaaineella(aine); 
            }
        }
    }

    private void tulostaKomentoLista() {
        System.out.println("Komennot:");
        System.out.println("listaa - listaa reseptit");
        System.out.println("lopeta - lopettaa ohjelman");
        System.out.println("hae nimi - hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella");
        System.out.println("hae aine - hakee reseptiä raaka-aineen perusteella");
    }
}