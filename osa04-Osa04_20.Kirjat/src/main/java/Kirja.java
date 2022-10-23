public class Kirja {
    private String nimi;
    private int sivuja;
    private int julkaisuvuosi;

    public Kirja(String nimi, int sivuja, int julkaisuvuosi) {
        this.nimi = nimi;
        this.sivuja = sivuja;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public String toString() {
        return this.nimi + ", " + this.sivuja + " sivua, " + this.julkaisuvuosi;
    }
}
