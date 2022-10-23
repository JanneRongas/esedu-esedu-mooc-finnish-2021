import java.util.ArrayList;

public class Pakka {
    private ArrayList<String> pakka;

    public Pakka() {
        this.pakka = new ArrayList<>();
    }

    public boolean onTyhja() {
        return this.pakka.isEmpty();
    }

    public void lisaa(String arvo) {
        this.pakka.add(0, arvo);

    }

    public ArrayList<String> arvot() {
        return this.pakka;
    }

    public String ota() {
        return this.pakka.remove(0);
    }
}
