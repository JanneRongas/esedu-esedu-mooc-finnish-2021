
import java.util.ArrayList;

public class Arvosanarekisteri {

    private ArrayList<Integer> arvosanat;
    private ArrayList<Integer> pisteet;

    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
        this.pisteet = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
        this.pisteet.add(pisteet);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        int lkm = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                lkm++;
            }
        }

        return lkm;
    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }

    public double arvosanojenKeskiarvo() {
        int koko = this.arvosanat.size();
        int maara = 0;

        if (this.arvosanat.isEmpty()) {
            return -1;
        } else {
            for (Integer arvosana : this.arvosanat) {
                maara += arvosana;
            }
        }
        return 1.0 * maara / koko;
    }

    public double koepisteidenKeskiarvo() {
        int koko = this.pisteet.size();
        int maara = 0;

        if(this.pisteet.isEmpty()) {
            return -1;
        } else {
            for (Integer piste : this.pisteet) {
                maara += piste;
            }
        }
        return 1.0 * maara / koko;
    }
}
