
import java.nio.file.Paths;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        int numerotYhteensa = 0;

        try (Scanner scanner = new Scanner(Paths.get(tiedosto))) {
            while (scanner.hasNextLine()) {
                int numero = Integer.valueOf(scanner.nextLine());
                if (numero >= alaraja && numero <= ylaraja) {
                    numerotYhteensa++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Lukuja: " + numerotYhteensa);
    }

}