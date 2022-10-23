public class Kuutio {
    private int sarmanpituus;

    public Kuutio(int sarmanPituus) {
        this.sarmanpituus = sarmanPituus;
    }

    public int tilavuus() {
        return this.sarmanpituus * this.sarmanpituus * this.sarmanpituus;
    }

    public String toString() {
        return "Kuution särmän pituus on " + this.sarmanpituus + ", tilavuus on " + tilavuus();
    }
}

