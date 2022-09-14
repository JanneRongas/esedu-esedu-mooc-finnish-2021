
import java.util.ArrayList;

public class TulostaRajatut {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
    }
    public static void tulostaRajatutLuvut(ArrayList<Integer> luvut, int alaraja, int ylaraja) {
        for (int i = 0; i < luvut.size(); i++) {
            if ((luvut.get(i) >= alaraja) && (luvut.get(i) <= ylaraja)) {
                System.out.println(luvut.get(i));
            }
        }
    }

}
