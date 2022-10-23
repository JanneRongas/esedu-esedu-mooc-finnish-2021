public class Varasto {
    private String tunnus;
    private String nimi;

    public Varasto (String esineenTunnus, String esineenNimi) {
        this.tunnus = esineenTunnus;
        this.nimi = esineenNimi;
    }

    public String getTunnus() {
        return tunnus;
    }

    public String getNimi() {
        return nimi;
    }

    public boolean equals(Object verrattava) {
        if(this == verrattava) {
            return true;
        }
        if(!(verrattava instanceof Varasto)) {
            return false;
        }

        Varasto verrattavaEsine = (Varasto) verrattava;

        return this.tunnus.equals(verrattavaEsine.tunnus);
    }



}
