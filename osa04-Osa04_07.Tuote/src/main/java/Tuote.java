public class Tuote {
    private double hinta;
    private String nimi;
    private int maara;

    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.nimi = nimiAlussa;
        this.hinta = hintaAlussa;
        this.maara = maaraAlussa;
    }
    public void tulostaTuote() {
        System.out.println(this.nimi + ", hinta " + this.hinta + ", " + this.maara + " kpl");
    }
}
