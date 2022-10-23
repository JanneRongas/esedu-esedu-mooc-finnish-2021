import java.util.Scanner;

public class Kayttoliittyma {
    private Scanner lukija;
    private Linnut lint;

    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
        lint = new Linnut();
    }

    public void kaynnista() {
        while (true) {
            System.out.println("?");
            String komento = lukija.nextLine();

            if(komento.equals("Lopeta")) {
                break;
            }
            if(komento.equals("Lisaa")) {
                System.out.println("Nimi:");
                String nimi = lukija.nextLine();
                System.out.println("Latinankielinen nimi:");
                String latina = lukija.nextLine();
                lint.lisaa(new Lintu(nimi, latina));
            } else if (komento.equals("Havainto")) {
                System.out.println("Lintu?");
                String lintu = lukija.nextLine();
                if(lint.onAvain(lintu)) {
                    lint.lisaaHavainto(lintu);
                } else {
                  System.out.println("Ei ole lintu!");  
                }
            } else if (komento.equals("Tilasto")) {
                lint.listaLinnuista();
            } else if (komento.equals("Nayta")) {
                System.out.println("Lintu?");
                String nimi = lukija.nextLine();
                lint.tulostaLintu(nimi);
            } else {
                System.out.println("Väärä komento.");
            }
        }
    }
}
