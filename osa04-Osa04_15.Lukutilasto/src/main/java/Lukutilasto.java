
public class Lukutilasto {
    private int lukujenMaara;
    private int summa = 0;

    public Lukutilasto() {
        this.lukujenMaara = 0;
    }

    public void lisaaLuku(int luku) {
        this.lukujenMaara += 1;
        this.summa += luku;
    }

    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }

    public int summa() {
        return this.summa;
    }

    public double keskiarvo() {
        if (this.lukujenMaara == 0) {
            return 0.0;
        }
        return 1.0 * this.summa / this.lukujenMaara;
    }
}
