package u07_a01_v2;

public class Main {

   public static void main(String[] args) {
      CuentaCorriente c1, c2;
      c1 = new CuentaCorriente("12345678A", "Pepe"); 
      c2 = new CuentaCorriente("77886655J", "Javi", 157.33);
      
      c1.ingresar(1000); 
      c1.retirar(300);  
      c1.mostrarInformacion(); 

      System.out.println("Puedo sacar 700 euros: " + c1.retirar(700)); 
      System.out.println("Puedo sacar 500 euros: " + c1.retirar(500));

      c1.mostrarInformacion(); 

      c2.ingresar(2050.77); 
      c2.retirar(50);  
      c2.mostrarInformacion();
      
      System.out.println("Puedo sacar 2000 euros: " + c2.retirar(2000));
      System.out.println("Puedo sacar 100 euros: " + c2.retirar(100));
      c2.mostrarInformacion();
   }
}
