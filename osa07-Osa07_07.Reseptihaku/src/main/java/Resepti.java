import java.util.ArrayList;

public class Resepti {
    private String nimi;
    private int keittoaika;
    private ArrayList<String> raakaaineet;

    public Resepti(String nimi, int keittoaika) {
        this.nimi = nimi;
        this.keittoaika = keittoaika;
        raakaaineet = new ArrayList<>();
    }

    public String getNimi() {
        return nimi;
    }

    public int getKeittoaika() {
        return keittoaika;
    }

    public ArrayList<String> getRaakaaineet() {
        return raakaaineet;
    }

    public void lisaaRaakaaine(String raakaaine) {
        raakaaineet.add(raakaaine);
    }

    public String toString() {
        return nimi + ", keittoaika: " + keittoaika;
    }
}
