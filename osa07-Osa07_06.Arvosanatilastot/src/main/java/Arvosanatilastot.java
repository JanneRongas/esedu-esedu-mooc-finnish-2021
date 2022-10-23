import java.util.ArrayList;

public class Arvosanatilastot {
    private ArrayList<Integer> pisteet;
    private ArrayList<Integer> hyvaksytytPisteet;
    private ArrayList<Integer> arvosanat;

    public Arvosanatilastot() {
        this.pisteet = new ArrayList<>();
        this.hyvaksytytPisteet = new ArrayList<>();
        this.arvosanat = new ArrayList<>();
    }

    public void lisaaPisteet(int pisteet) {
        this.pisteet.add(pisteet);

        if(pisteet >= 50) {
            this.hyvaksytytPisteet.add(pisteet);
        }
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
    }

    public double kaikkienPisteidenKeskiarvo() {

        int pisteidenMaara = this.pisteet.size();
        int yhteensa = 0;

        if(this.pisteet.isEmpty()) {
            return -1;
        } else {
            for (Integer piste : this.pisteet) {
                yhteensa += piste;
            }
        }
        return 1.0 * yhteensa / pisteidenMaara;
    }

    public double hyvaksyttyjenPisteidenKeskiarvo() {

        int hyvaksyttyjenPisteidenMaara = hyvaksytytPisteet.size();
        int yhteensa = 0;

        if(hyvaksytytPisteet.isEmpty()) {
            return 0.00;
        } else {
            for(Integer hyväksytytPisteet : hyvaksytytPisteet) {
                yhteensa += hyväksytytPisteet;
            }
        }
        return 1.0 * yhteensa / hyvaksyttyjenPisteidenMaara;

    }

    public double hyvaksyttyjenOsuus() {

        int osallistujat = pisteet.size();
        int hyvaksytyt = hyvaksytytPisteet.size();
        double hyvaksyttyjenProsenttiOsuus = (double) hyvaksytyt / osallistujat;

        if(osallistujat == 0) {
            return -1;
        } else {
            return 100.00 * hyvaksyttyjenProsenttiOsuus;
        }

    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;

        if(pisteet < 50) {
            arvosana = 0;
        }else if(pisteet < 60) {
            arvosana = 1;
        }else if(pisteet < 70) {
            arvosana = 2;
        }else if(pisteet < 80) {
            arvosana = 3;
        }else if(pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }
        return arvosana;
    }
    
    public int arvosanatPisteista(int arvosana) {

        int yhteensa = 0;
        for (int lasketut : this.arvosanat) {
            if(lasketut == arvosana) {
                yhteensa++;
            }
        }
        return yhteensa;
    }
}
