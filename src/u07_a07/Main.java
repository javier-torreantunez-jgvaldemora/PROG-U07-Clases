package u07_a07;

public class Main {

   public static void main(String[] args) {
      Texto t = new Texto(5);
      t.mostrar();
      
      t.addPrincipio("HO");
      t.addPrincipio(';');
      t.addFinal("L�");
      t.addFinal('X');

      t.mostrar();
      System.out.println("N�mero de vocales: " + t.numVocales());
   }
}
