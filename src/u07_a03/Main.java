package u07_a03;

public class Main {

   public static void main(String[] args) {
      CuentaCorriente c;
      
      //CuentaCorriente de ejemplo
      c = new CuentaCorriente("12345678-A", "Pepe");

      //produce un error, ya que el saldo no es visible desde fuera de la clase CuentaCorriente
      //c.saldo = 2000;
      c.dni = "11111111-T";
      
      //nombre es visible desde cualquier clase
      c.nombre = "Antonio";
   }
}
