import java.util.ArrayList;
import java.util.ArrayList;

public class Huone {
    private ArrayList<Henkilo> henkilot;

    public Huone () {
        this.henkilot = new ArrayList<>();
    }

    public void lisaa(Henkilo henkilo) {
        this.henkilot.add(henkilo);
    }

    public boolean onTyhja() {
        return this.henkilot.isEmpty();
    }

    public ArrayList<Henkilo> getHenkilot() {
        return this.henkilot;
    }

    public Henkilo lyhin() {
        if(this.henkilot.isEmpty()) {
            return null;
        }

        Henkilo palautettavaHenkilo = this.henkilot.get(0);

        for (Henkilo henkilo : henkilot) {
            if (palautettavaHenkilo.getPituus() > henkilo.getPituus()) {
                palautettavaHenkilo = henkilo;
            }
        }
        return palautettavaHenkilo;
    }

    public Henkilo ota() {
        if (this.henkilot.isEmpty()) {
            return null;
        }

        Henkilo otaHenkilo = this.henkilot.get(0);

        for (Henkilo henkilo : henkilot) {
            if(otaHenkilo.getPituus() > henkilo.getPituus()) {
                otaHenkilo = henkilo;
            }
        }

        this.henkilot.remove(otaHenkilo);
        return otaHenkilo;
    }
}
