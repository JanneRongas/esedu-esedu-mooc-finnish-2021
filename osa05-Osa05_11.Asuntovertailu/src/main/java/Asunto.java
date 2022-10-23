
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }

    public boolean suurempi(Asunto verrattava) {
        if (this.nelioita > verrattava.nelioita) {
            return true;
        } else {
            return false;
        }
    }

    public int hintaero(Asunto verrattava) {
        int eka = this.neliohinta * this.nelioita;
        int toka = verrattava.neliohinta * verrattava.nelioita;
        int erotus = eka - toka;

        if (erotus >= 0) {
            return erotus;
        } else {
            return -1 * erotus;
        }
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        if (this.neliohinta > verrattava.neliohinta) {
            return true;
        } else {
            return false;
        }
    }

}
