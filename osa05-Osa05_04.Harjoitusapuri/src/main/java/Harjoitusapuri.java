public class Harjoitusapuri {
    private int ika;
    private int leposyke;

    public Harjoitusapuri(int ika, int leposyke) {
        this.ika = ika;
        this.leposyke = leposyke;
    }
    public double maksimisyke(){
        return 206.3 - (0.711 * ika);
    }

    public double tavoitesyke(double prosenttiaMaksimista) {
       return (maksimisyke() - leposyke) * (prosenttiaMaksimista) + leposyke;

    }
}
