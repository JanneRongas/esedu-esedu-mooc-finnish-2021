
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {

        for (int i = 1; i <= maara; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        for (int i = 1; i <= maara; i++) {
            System.out.print(" ");
        }
    }

    public static void tulostaKolmio(int koko) {

        for (int i = 1; i <= koko; i++) {
            tulostaTyhjaa(koko - i);
            tulostaTahtia(i);
        }
    }

    public static void jouluKuusi(int korkeus) {
        
        for (int i = 1; i <= korkeus; i++) {
            tulostaTyhjaa(korkeus - i);
            tulostaTahtia(i * 2 - 1);
        }
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(3);
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(3);
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}