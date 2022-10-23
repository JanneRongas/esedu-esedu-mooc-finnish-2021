import java.util.ArrayList;

public class Tehtavalista {

    private ArrayList<String> tehtavat;
    
    public Tehtavalista() {
        this.tehtavat = new ArrayList<>();
    }

    public void lisaa(String tehtava) {
        this.tehtavat.add(tehtava);
    }
    
    public void poista(int numero) {
        this.tehtavat.remove(numero - 1);
    }

    public void tulosta() {
        for(String tehtavalista : tehtavat) {
            System.out.println((tehtavat.indexOf(tehtavalista) + 1) + ": " + tehtavalista);
        }
    }
}
