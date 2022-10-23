import java.util.ArrayList;

public class Lastiruuma {
    private int maksimimipaino;
    private ArrayList<Matkalaukku> matkalaukut;

    public Lastiruuma(int maksimipaino) {
        this.maksimimipaino = maksimipaino;
        this.matkalaukut = new ArrayList<Matkalaukku>();
    }

    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if(this.yhteispaino() + laukku.yhteispaino() <= maksimimipaino) {
            this.matkalaukut.add(laukku);
        }
    }

    public int yhteispaino() {
        int painotYhteensa = 0;

        for(Matkalaukku laukku : matkalaukut) {
            painotYhteensa += laukku.yhteispaino();
        }

        return painotYhteensa;
    }

    public void tulostaTavarat() {
        for(Matkalaukku laukku : matkalaukut) {
            System.out.println(laukku.listaTavaroista());
        }
    }

    public String toString() {
        
        return this.matkalaukut.size() + " matkalaukkua (" + this.yhteispaino() + " kg)";
    }

}
