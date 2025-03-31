package u07_a07;

public class Main {

   public static void main(String[] args) {
      Texto t = new Texto(5);
      t.mostrar();
      
      t.addPrincipio("HO");
      t.addPrincipio(';');
      t.addFinal("LÁ");
      t.addFinal('X');

      t.mostrar();
      System.out.println("Número de vocales: " + t.numVocales());
   }
}
