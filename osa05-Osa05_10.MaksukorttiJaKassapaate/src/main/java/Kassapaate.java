
public class Kassapaate {

    private double rahaa; // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat; // myytyjen maukkaiden lounaiden määrä

    public Kassapaate() {
        this.rahaa = 1000;
        // kassassa on aluksi 1000 euroa rahaa
    }

    public double syoEdullisesti(double maksu) {
        if (maksu >= 2.50) {
            this.edulliset++;
            this.rahaa += 2.50;
            maksu -= 2.50;
            return maksu;
        } else {
            return maksu;
        }
        // edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja
        // metodi palauttaa koko summan
    }

    public double syoMaukkaasti(double maksu) {
        if (maksu >= 4.30) {
            this.maukkaat++;
            this.rahaa += 4.30;
            maksu -= 4.30;
            return maksu;
        } else {
            return maksu;
        }
    }

    public boolean syoEdullisesti(Maksukortti kortti) {
        if (kortti.saldo() >= 2.50) {
            this.edulliset++;
            kortti.otaRahaa(2.50);
            return true;
        } else {
            return false;
        }
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        if (kortti.saldo() >= 4.30) {
            this.maukkaat++;
            kortti.otaRahaa(4.30);
            return true;
        } else {
            return false;
        }
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa >= 0) {
            this.rahaa = this.rahaa + summa;
            kortti.lataaRahaa(summa);
        }
    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
                edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
