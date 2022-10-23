import java.util.ArrayList;

public class Pakkaus {
    
    private ArrayList<Lahja> lahjat;
    

    public Pakkaus () {
        this.lahjat = new ArrayList<>();
    }

    public void lisaaLahja(Lahja lahja) {
        this.lahjat.add(lahja);
    }

    public int yhteispaino() {
        if(lahjat.isEmpty()) {
            return -1;
        }
        
        int yhteispaino = 0;

        for(Lahja lahja: lahjat) {
            yhteispaino += lahja.getPaino();
        }

        return yhteispaino;
    }
}
