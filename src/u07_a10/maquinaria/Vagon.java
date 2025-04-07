package u07_a10.maquinaria;

class Vagon { 
   private int numIdentificativo;
   private int cargaMax;
   private int cargaActual;
   private String mercancia;

   public Vagon(int numIdentificativo, int cargaMax, int cargaActual, String mercancia) {
      this.numIdentificativo = numIdentificativo;
      this.cargaMax = cargaMax;
      this.cargaActual = cargaActual;
      this.mercancia = mercancia;
   }
}
