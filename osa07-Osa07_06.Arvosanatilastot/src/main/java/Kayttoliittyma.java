import java.util.Scanner;

public class Kayttoliittyma {
    private Scanner lukija;
    private Arvosanatilastot arvosanatilastot;

    public Kayttoliittyma(Scanner lukija, Arvosanatilastot arvosanatilastot) {
        this.lukija = lukija;
        this.arvosanatilastot = arvosanatilastot;
    }

    public void kaynnista() {
        luePisteet();
        System.out.println("");
        tulostaKeskiarvoPisteistaKaikilta();
        tulostaHyvaksyttyjenPisteetKeskiarvo();
        tulostaHyvaksymisprosentti();
        tulostaArvosanajakauma();
    }

    public void luePisteet() {
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");

        while (true) {

            String syotetty = lukija.nextLine();
            int pisteet = Integer.valueOf(syotetty);

            if (pisteet == -1) {
                break;
            }
            if (pisteet < 0 || pisteet > 100) {
                continue;
            }
            this.arvosanatilastot.lisaaPisteet(pisteet);
        }

    }

    public void tulostaKeskiarvoPisteistaKaikilta() {
        System.out.println("Pisteiden keskiarvo (kaikki): " + arvosanatilastot.kaikkienPisteidenKeskiarvo());
    }

    public void tulostaHyvaksyttyjenPisteetKeskiarvo() {

        String eiHyvaksytyt = "-";

        if (arvosanatilastot.hyvaksyttyjenPisteidenKeskiarvo() == 0) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): " + eiHyvaksytyt);
        } else {
            System.out
                    .println("Pisteiden keskiarvo (hyväksytyt): " + arvosanatilastot.hyvaksyttyjenPisteidenKeskiarvo());
        }
    }

    public void tulostaHyvaksymisprosentti() {
        System.out.println("Hyväksymisprosentti: " + arvosanatilastot.hyvaksyttyjenOsuus());
    }

    public void tulostaArvosanajakauma() {

        System.out.println("Arvosanajakauma:");
        int arvosana = 5;

        while (arvosana >= 0) {
            int tahdet = arvosanatilastot.arvosanatPisteista(arvosana);
            System.out.print(arvosana + ": ");
            tulostaTahdet(tahdet);
            System.out.println("");
            arvosana--;
        }
    }

    public static void tulostaTahdet(int tahdet) {
        while (tahdet > 0) {
            System.out.print("*");
            tahdet--;
        }
    }
}
