public class Lintu {
    private String nimi;
    private String latina;
    private int havainnot;

    public Lintu(String nimi, String latina) {
        this.nimi = nimi;
        this.latina = latina;
        havainnot = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public void lisaaHavainnot() {
        havainnot++;
    }

    public String toString() {
        return nimi + "(" + latina + "): " + havainnot + "havaintoa";
    }
}
