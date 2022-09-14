import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Lahjan suuruus?");
        int luku = Integer.valueOf(lukija.nextLine());
       
        if (luku < 5000) {
            System.out.println("Ei veroa!"); 
        } else if (5000 <= luku && luku < 25000) {
            double tulos = (double) (luku - 5000)*0.08 + 100;
            System.out.println("Vero: " + tulos);
        } else if (25000 <= luku && luku < 55000) {
            double tulos = (double) (luku - 25000)*0.1 + 1700;
            System.out.println("Vero: " + tulos);
        } else if (55000 <= luku && luku < 200000) {
            double tulos = (double) (luku - 55000)*0.12 + 4700;
            System.out.println("Vero: " + tulos);
        } else if (200000 <= luku && luku < 1000000) {
            double tulos = (double) (luku - 200000)*0.15 + 22100;
            System.out.println("Vero: " + tulos);
        } else {
            double tulos = (double) (luku - 1000000)*0.17 + 142100;
            System.out.println("Vero: " + tulos);
        }
        
    }
}