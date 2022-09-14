
import java.util.ArrayList;

public class PoistaViimeinen {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
    }

    public static void poistaViimeinen(ArrayList<String> merkkijonot) {
        if (merkkijonot.size() == 0) {
            return;
        }
        int index = merkkijonot.size() -1;
        merkkijonot.remove(index);
    }

}