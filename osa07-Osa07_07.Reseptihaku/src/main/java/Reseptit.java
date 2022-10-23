import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptit {
    private ArrayList<Resepti> reseptit;

    public Reseptit() {
        reseptit = new ArrayList<>();
    }

    public void lisaa(Resepti res) {
        reseptit.add(res);
    }

    public void tulostaReseptiLista() {
        for (Resepti res : reseptit) {
            System.out.println(res);
        }
    }

    public void lueTiedostosta(String tiedostonimi) {
        ArrayList<ArrayList<String>> tiedot = new ArrayList<>();
        try (Scanner lukija = new Scanner(Paths.get((tiedostonimi)))) {
            while (lukija.hasNextLine()) {
                ArrayList<String> tieto = new ArrayList<>();
                while (true) {
                    String rivi = lukija.nextLine();
                    if(rivi.isEmpty() || !lukija.hasNextLine()) {
                        tiedot.add(tieto);
                        break;
                    }
                    tieto.add(rivi);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (ArrayList<String> res : tiedot) {
            Resepti resepti = new Resepti(res.get(0), Integer.valueOf(res.get(1)));
            for (int i = 2; i < res.size(); i++) {
                resepti.lisaaRaakaaine(res.get(i));
            }
            reseptit.add(resepti);
        }
    }

    public void etsiNimella(String nimi) {
        for (Resepti res : reseptit) {
            if(res.getNimi().contains(nimi)) {
                System.out.println(res);
            }
        }
    }

    public void etsiKeittoajalla(int keittoaika) {
        for (Resepti res : reseptit) {
            if(res.getKeittoaika() <= keittoaika) {
                System.out.println(res);
            }
        }
    }

    public void etsiRaakaaineella(String raakaaine) {
        for (Resepti res : reseptit) {
            if(res.getRaakaaineet().contains(raakaaine)) {
                System.out.println(res);
            }
        }
    }
}
