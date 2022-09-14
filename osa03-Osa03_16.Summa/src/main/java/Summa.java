
import java.util.ArrayList;

public class Summa {

    public static void main(String[] args) {

    }

    public static int summa(ArrayList<Integer> luvut) {
        int summa = 0;
        for (int i = 0; i < luvut.size(); i++) {
            summa += luvut.get(i);
        }
        return summa;
    }
}
