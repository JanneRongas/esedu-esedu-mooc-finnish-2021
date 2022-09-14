

import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int maara = 0;
        int summa = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0){
                break;
            }
            maara += 1;
            summa += luku;
        }
        double keskiarvo = (double) summa/maara;
        System.out.println("Lukujen keskiarvo " + keskiarvo);
    }
}