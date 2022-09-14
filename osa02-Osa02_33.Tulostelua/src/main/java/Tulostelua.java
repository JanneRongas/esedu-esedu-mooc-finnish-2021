

public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
        for (int i = 1; i<= maara; i++){
            System.out.print("*");
        }
        System.out.println("");
        
    }

    public static void tulostaNelio(int sivunpituus) {
        for (int i = 1; i<= sivunpituus; i++){
            tulostaTahtia(sivunpituus);
        } 
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {

        for (int i = 1; i<= korkeus; i++){
            tulostaTahtia(leveys);
        } 
    }

    public static void tulostaKolmio(int koko) {

        for (int i = 1; i<= koko; i++){
            tulostaTahtia(i);
        } 
    }
}