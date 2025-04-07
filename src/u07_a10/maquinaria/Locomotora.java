package u07_a10.maquinaria;

import u07_a10.personal.Mecanico;

public class Locomotora {
   private String matricula;
   private int potencia;
   private int añoFabricacion;
   private Mecanico mec;

   public Locomotora(String matricula, int potencia, int añoFabricacion, Mecanico mec) {
      this.matricula = matricula;
      this.potencia = potencia;
      this.añoFabricacion = añoFabricacion;
      this.mec = mec;
   }
}
