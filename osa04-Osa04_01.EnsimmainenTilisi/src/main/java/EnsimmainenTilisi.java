
public class EnsimmainenTilisi {

    public static void main(String[] args) {
        Tili artonTili = new Tili("Arto", 100.0);

        System.out.println(artonTili);
        artonTili.pano(20);

        System.out.println("Lopputilanne");
        System.out.println(artonTili);
    }
}
