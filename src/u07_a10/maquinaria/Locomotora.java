package u07_a10.maquinaria;

import u07_a10.personal.Mecanico;

public class Locomotora {
   private String matricula;
   private int potencia;
   private int a�oFabricacion;
   private Mecanico mec;

   public Locomotora(String matricula, int potencia, int a�oFabricacion, Mecanico mec) {
      this.matricula = matricula;
      this.potencia = potencia;
      this.a�oFabricacion = a�oFabricacion;
      this.mec = mec;
   }
}
