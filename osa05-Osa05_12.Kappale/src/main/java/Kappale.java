
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }
    
    public boolean equals(Object verrattava) {
        if(this.nimi == verrattava) {
            return true;
        } 

        if (!(verrattava instanceof Kappale)) {
            return false;
        }

        Kappale verrattavaKappale = (Kappale) verrattava;

        if (this.esittaja == verrattavaKappale.esittaja &&
            this.nimi == verrattavaKappale.nimi &&
            this.pituusSekunteina == verrattavaKappale.pituusSekunteina) {
                return true;
            }

            return false;
        }
    

    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }


}
