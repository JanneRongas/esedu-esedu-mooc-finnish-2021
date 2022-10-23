
import java.util.ArrayList;
import java.util.PrimitiveIterator.OfDouble;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    public void lisaaAteria(String ateria) {
        if (this.ateriat.contains(ateria)) {
            return;
        } else {
            this.ateriat.add(ateria);
        }
    }

    public void tulostaAteriat() {
        for(String ateria : this.ateriat) {
            System.out.println(ateria);
        }
    }

    public void tyhjennaRuokalista() {
        ateriat.clear();
    }
}
