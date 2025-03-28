package u07_a05;

public class Main {

   public static void main(String[] args) {
      CuentaCorriente c1, c2, c3;
      
      //creación de gestores
      Gestor g1 = new Gestor("Antonio González", "666 555 444");
      Gestor g2 = new Gestor("Bea Rodrí­guez", "987 543 210", 12000.0);
      
      //creación de cuentas
      c1 = new CuentaCorriente("12345678-A","Pepita", g1);
      c2 = new CuentaCorriente("98765432-Z", "Ana", g1); 
      c3 = new CuentaCorriente("11222333-B", "Sancho");
      
      System.out.println("\n--C1--");
      c1.mostrarInformacion();      
      System.out.println("\n--C2--");
      c2.mostrarInformacion();      
      System.out.println("\n--C3--");
      c3.mostrarInformacion();
      System.out.println("\n--C1+G2--");
      c1.setGestor(g2); 
      c1.mostrarInformacion();
   }
}
