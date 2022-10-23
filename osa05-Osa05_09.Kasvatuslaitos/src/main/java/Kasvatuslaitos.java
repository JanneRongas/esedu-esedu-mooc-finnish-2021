
public class Kasvatuslaitos {
    private int punnituksienmaara;

    public int punnitse(Henkilo henkilo) {
        punnituksienmaara++;
        return henkilo.getPaino();

    }
    public int punnitukset() {
        return punnituksienmaara;
    }
    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino() + 1);

    }

}
