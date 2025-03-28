package u07_a04;

public class CuentaCorriente {
    
    //CÓDIGO NUEVO
    static private String nombreBanco = "International Java Bank"; 

    static void setBanco(String nuevoNombre) {
        nombreBanco = nuevoNombre;
    }
   
    static String getBanco() {
        return nombreBanco;
    }

    //CÓDIGO ANTIGUO
    String dni;
    public String nombre;
    private double saldo;

   void mostrarInformacion() { 
      System.out.println("Nombre: " + nombre);
      System.out.println("Dni: " + dni);
      System.out.println("Saldo: " + saldo + " euros");
   }

   CuentaCorriente(String dni, String nombre) { 
      this(dni, nombre, 0); 
   }

   CuentaCorriente(String dni, String nombre, double saldo) {
      this.dni = dni;
      this.nombre = nombre;
      this.saldo = saldo;
   }
}
