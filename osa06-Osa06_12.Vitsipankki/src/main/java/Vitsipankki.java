import java.util.ArrayList;
import java.util.Random;

public class Vitsipankki {
    
    private ArrayList<String> vitsit;

    public Vitsipankki() {
        this.vitsit = new ArrayList<>();
    }

    public void lisaaVitsi(String vitsi) {
        this.vitsit.add(vitsi);
    }

    public String arvoVitsi() {
        if(this.vitsit.isEmpty()) {
            return "Vitsit vähissä.";
        } else {
            Random arvo = new Random();
            int index = arvo.nextInt(vitsit.size());
            return vitsit.get(index);
        }
    }

    public void tulostaVitsit() {
        for(String vitsi : vitsit) {
            System.out.println(vitsi);
        }
    }
}
