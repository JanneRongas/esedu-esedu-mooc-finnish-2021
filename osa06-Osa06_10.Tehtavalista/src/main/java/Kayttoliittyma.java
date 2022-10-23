import java.util.Scanner;

public class Kayttoliittyma {
    private Tehtavalista tehtavalista;
    private Scanner lukija;

    public Kayttoliittyma(Tehtavalista tehtavalista, Scanner lukija) {
        this.tehtavalista = tehtavalista;
        this.lukija = lukija;
    }

    public void kaynnista() {

        while (true) {
            System.out.println("Komento:");
            String komento = lukija.nextLine();

            if (komento.contains("lopeta")) {
                break;
            } else if (komento.equals("lisaa")) {
                System.out.println("Lisättävä:");
                String tehtava = lukija.nextLine();
                tehtavalista.lisaa(tehtava);
            } else if (komento.equals("listaa")) {
                tehtavalista.tulosta();
            } else if (komento.equals("poista")) {
                System.out.println("Mikä poistetaan?");
                int poistettava = Integer.valueOf(lukija.nextLine());
                tehtavalista.poista(poistettava);
            }
        }
    }
}
