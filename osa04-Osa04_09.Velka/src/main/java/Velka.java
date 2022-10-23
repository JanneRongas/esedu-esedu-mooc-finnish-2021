public class Velka {
    private double saldo;
    private double korkokerroin;

    public Velka(double velkaAlussa, double korkokerroinAlussa) {
        this.saldo = velkaAlussa;
        this.korkokerroin = korkokerroinAlussa;
    }

    public void tulostaSaldo() {
        System.out.println(this.saldo);
    }

    public void odotaVuosi() {
        this.saldo *= this.korkokerroin;
    }
    
}
