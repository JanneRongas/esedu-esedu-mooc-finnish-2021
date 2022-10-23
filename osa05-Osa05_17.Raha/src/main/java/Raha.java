
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia);
        return uusi;
    }

    public boolean vahemman(Raha verrattava) {
        if (this.eurot() < verrattava.eurot()) {
            return true;

        }

        if (this.eurot() == verrattava.eurot()) {
            if (this.sentit() < verrattava.sentit()) {
                return true;
            }
        }

        return false;
    }

    public Raha miinus(Raha vahentaja) {
        int vahennaEurot = this.euroa - vahentaja.euroa;
        int vahennaSentit = this.senttia - vahentaja.senttia;

        if (vahennaEurot >= 0) {
            if (vahennaSentit < 0) {
                vahennaEurot = vahennaEurot - 1;
                vahennaSentit = vahennaSentit + 100;
            }
        } else {
            vahennaEurot = 0;
            vahennaSentit = 0;
        }
        Raha raha = new Raha(vahennaEurot, vahennaSentit);

        return raha;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

}
