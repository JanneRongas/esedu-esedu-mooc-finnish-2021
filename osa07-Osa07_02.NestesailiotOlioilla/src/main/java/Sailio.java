public class Sailio {
    private int sisalto;

    public Sailio() {
        sisalto = 0;
    }

    public void lisaa(int maara) {
        if (maara < 0) {
            return;
        }
        sisalto += maara;
        if (sisalto > 100) {
            sisalto = 100;
        }
    }

    public int sisalto() {
        return sisalto;
    }

    public void asetaMaara(int maara) {
        this.sisalto = maara;
    }

    public void poista(int maara) {
        if (maara > sisalto) {
            sisalto = 0;
        } else {
            sisalto -= maara;
        }
    }

    public String toString() {
        return sisalto + "/100";
    }

}
