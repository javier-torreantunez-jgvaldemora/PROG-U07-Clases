package u07_a10.personal;

public class Mecanico {
   private String nombre;
   private String telefono;
   private enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}
   private Especialidad especialidad;

   public Mecanico(String nombre, String telefono, String especialidad) {
      this.nombre = nombre;
      this.telefono = telefono;
      this.especialidad = Especialidad.valueOf(especialidad);
   }
}


