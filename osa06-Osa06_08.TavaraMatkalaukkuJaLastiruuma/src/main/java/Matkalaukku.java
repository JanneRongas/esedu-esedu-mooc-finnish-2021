import java.util.ArrayList;

public class Matkalaukku {
    private int maksimipaino;
    private ArrayList<Tavara> tavarat;

    public Matkalaukku(int maksimimipaino) {
        this.maksimipaino = maksimimipaino;
        this.tavarat = new ArrayList<Tavara>();
    }

    public void lisaaTavara(Tavara tavara) {
        if (this.yhteispaino() + tavara.getPaino() <= maksimipaino) {
            this.tavarat.add(tavara);
        }
    }

    public void tulostaTavarat() {
        for (Tavara tavara : tavarat) {
            System.out.println(tavara);
        }
    }

    public String listaTavaroista() {

        String listaTavaroista = "";

        for (Tavara tavara : tavarat) {
            listaTavaroista += tavara.toString() + "\n";
        }

        return listaTavaroista;
    }

    public Tavara raskainTavara() {
        if (this.tavarat.isEmpty()) {
            return null;
        }

        Tavara raskainTavara = this.tavarat.get(0);

        for (Tavara tavara : tavarat) {
            if (raskainTavara.getPaino() < tavara.getPaino()) {
                raskainTavara = tavara;
            }
        }

        return raskainTavara;
    }

    public int yhteispaino() {
        int painotYhteensa = 0;
        for (Tavara paino : tavarat) {
            painotYhteensa += paino.getPaino();
        }

        return painotYhteensa;
    }

    public String toString() {

        String tavaraString = "";

        if (tavarat.size() == 0) {
            tavaraString = "ei tavaroita" + " (" + this.yhteispaino() + " kg)";
        } else if (tavarat.size() == 1) {
            tavaraString = this.tavarat.size() + " tavara (" + this.yhteispaino() + " kg)";
        } else {
            tavaraString = this.tavarat.size() + " tavaraa (" + this.yhteispaino() + " kg)";
        }

        return tavaraString;

    }

}
