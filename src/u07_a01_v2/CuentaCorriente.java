package u07_a01_v2;

class CuentaCorriente {
   String dni; 
   String nombre; 
   double saldo; 

   CuentaCorriente(String dni, String nombre, double saldo) { 
      this.dni = dni; 
      this.nombre = nombre; 
      this.saldo = saldo;  
   }
   
   CuentaCorriente(String dni, String nombre) { 
      this.dni = dni; 
      this.nombre = nombre; 
      saldo = 0.0;  
   }

   boolean retirar(double cant) { 
      boolean operacionPosible;
      if (saldo >= cant) { 
         saldo -= cant;     
         operacionPosible = true;
      } else { 
         System.out.println("No hay dinero suficiente");
         operacionPosible = false;
      }
      return (operacionPosible); 
   }

   void ingresar(double cant) { 
      saldo += cant;
   }

   void mostrarInformacion() {  
      System.out.println("Nombre: " + nombre);
      System.out.println("Dni: " + dni);
      System.out.println("Saldo: " + saldo + " euros");
   }
}