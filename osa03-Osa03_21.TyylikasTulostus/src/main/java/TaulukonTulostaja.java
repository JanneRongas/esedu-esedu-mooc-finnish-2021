

public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        
        int index = 0;
        while (index < taulukko.length-1) {
            int numero = taulukko[index];
            System.out.print(numero + ", ");
            index = index + 1;
        }
        System.out.print(taulukko[taulukko.length-1]);
    }
}