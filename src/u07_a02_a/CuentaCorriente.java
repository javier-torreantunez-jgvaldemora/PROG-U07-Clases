package u07_a02_a;

class CuentaCorriente {
   String dni; 
   String nombre; 
   double saldo; 
   
   CuentaCorriente(String dni, double saldo) { 
      this.dni = dni;
      nombre = "Sin asignar"; //no es parámentro, no hay conflicto de nombrado, sin this
      this.saldo = saldo;
   }
   
   CuentaCorriente(String dni, String nombre, double saldo) { 
      this.dni = dni;
      this.nombre = nombre;
      this.saldo = saldo;
   }

   CuentaCorriente(String dni, String nombre) { 
      this.dni = dni; 
      this.nombre = nombre; 
      saldo = 0; //no es parámentro, no hay conflicto de nombrado, sin this
   }

   boolean egreso(double cant) { 
      boolean operacionPosible;
      if (saldo >= cant) { 
         saldo -= cant;
         operacionPosible = true;
      } else { //no hay saldo disponible
         System.out.println("No hay dinero suficiente");
         operacionPosible = false;
      }
      return (operacionPosible); 
   }
   void ingreso(double cant) { 
      saldo += cant;
   }

   void mostrarInformacion() { 
      System.out.println("Nombre: " + nombre);
      System.out.println("Dni: " + dni);
      System.out.println("Saldo: " + saldo + " euros");
   }
}
