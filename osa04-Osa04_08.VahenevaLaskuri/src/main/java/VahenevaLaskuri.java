
public class VahenevaLaskuri {

    private int arvo;

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        this.arvo = this.arvo - 1;
        if (this.arvo < 0) {
            this.arvo = 0;

        }

    }

    // kirjoita tänne metodin toteutus
    // laskurin arvon on siis tarkoitus vähentyä yhdellä

    public void nollaa() {
        this.arvo = 0;

    }

}
