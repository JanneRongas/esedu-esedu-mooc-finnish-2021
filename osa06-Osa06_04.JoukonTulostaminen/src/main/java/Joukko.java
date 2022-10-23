
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }

    public String toString() {
        String tulostus = "Joukossa " + this.nimi;


        if (this.alkiot.isEmpty()) {
            return "Joukko " + this.nimi + " on tyhjä.";
        }

        String tulostaArvot = "";

        for (String alkio : alkiot) {

            if(alkiot.size() <= 1) {
                tulostaArvot = alkio;
            } else {
                tulostaArvot = tulostaArvot + alkio + "\n";
            }
        }

        String alkioString = "";

        if(alkiot.size() > 1) {
            alkioString = "alkiota:\n";
        } else {
            alkioString = "alkio:\n";
        }

        return tulostus + " on " + alkiot.size() + " " + alkioString + tulostaArvot;
    }
    
}
