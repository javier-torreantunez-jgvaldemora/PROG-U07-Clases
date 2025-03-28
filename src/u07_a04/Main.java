package u07_a04;

public class Main {

   public static void main(String[] args) {
      CuentaCorriente c1, c2;
      c1 = new CuentaCorriente("12345678-A", "Pepe"); 
      c2 = new CuentaCorriente("999999999-E", "Ana"); 
      
      c1.mostrarInformacion();
      c2.mostrarInformacion();

      //en la clase
      CuentaCorriente.setBanco("Banco Central");
      System.out.println("Banco: " + CuentaCorriente.getBanco());
     
      CuentaCorriente.setBanco("Caja de Ahorros de Do-While");
      System.out.println("Banco: " + CuentaCorriente.getBanco());

      //en objetos
      c1.setBanco("Banco Central");
      System.out.println("Banco C1: " + c1.getBanco());
     
      c2.setBanco("Caja de Ahorros de Do-While");
      System.out.println("Banco C2: " + c2.getBanco());
   }
}
