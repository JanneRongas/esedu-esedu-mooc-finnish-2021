
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String joukkue = lukija.nextLine();
        int pelatutOttelut = 0;
        int havitytOttelut = 0;
        int voitetutOttelut = 0;
        try {
            Scanner luku = new Scanner(Paths.get(tiedosto));
            while (luku.hasNextLine()) {
                String[] tasa = luku.nextLine().split(",");

                if(tasa[0].equals(joukkue)) {
                    pelatutOttelut++;
                    if(Integer.valueOf(tasa[2]) > Integer.valueOf(tasa[3])) {
                        voitetutOttelut++;
                    } else {
                        havitytOttelut++;
                    }
                } else if (tasa[1].equals(joukkue)) {
                    pelatutOttelut++;
                    if(Integer.valueOf(tasa[3]) > Integer.valueOf(tasa[2])) {
                        voitetutOttelut++;
                    } else {
                        havitytOttelut++;
                    }
                }
            }
        } catch (Exception e) {

        }
        System.out.println("Otteluita: " + pelatutOttelut);
        System.out.println("Voittoja: " + voitetutOttelut);
        System.out.println("Tappioita: " + havitytOttelut);
    }
}