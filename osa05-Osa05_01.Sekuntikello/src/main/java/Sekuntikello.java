public class Sekuntikello {
   private Viisari sadasosasekunti;
   private Viisari sekunti; 

   public Sekuntikello() {
    this.sadasosasekunti = new Viisari(100);
    this.sekunti = new Viisari(60);
   }

   public void etene() {
    this.sadasosasekunti.etene();

    if(this.sadasosasekunti.arvo() == 0) {
        this.sekunti.etene();
    }
   }

   public String toString() {
    return this.sekunti + ":" + this.sadasosasekunti;
   }
}
