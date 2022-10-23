import java.util.HashMap;
import java.util.HashMap;


public class Linnut {
    private HashMap<String, Lintu> linnut;

    public Linnut() {
        linnut = new HashMap<>();
    }

    public void lisaa(Lintu lintu) {
        linnut.put(lintu.getNimi(), lintu);
    }

    public void listaLinnuista() {
        for (Lintu ltu : linnut.values()) {
            System.out.println(ltu);
        }
    }

    public void tulostaLintu(String nimi) {
        System.out.println(linnut.get(nimi));
    }

    public boolean onAvain(String avain) {
        if(linnut.containsKey(avain)) {
            return true;
        }
        return false;
    }

    public void lisaaHavainto(String avain) {
        Lintu lintu = linnut.get(avain);
        lintu.lisaaHavainnot();
        linnut.put(avain, lintu);
    }
}
