package model;



public class Req2 {
    private int estrato;
    private String fechaInicio;
    private int financiable;
    private int porcentaje;
    public Req2(int estrato, String fechaInicio, int financiable, int porcentaje)
   {
        this.estrato=estrato;
        this.fechaInicio=fechaInicio;
        this.financiable=financiable;
        this.porcentaje=porcentaje;
    }
   public void setEstrato(int estrato) {
       this.estrato = estrato;
   }
   public void setFechaInicio(String fechaInicio) {
       this.fechaInicio = fechaInicio;
   }
   public void setFinanciable(int financiable) {
       this.financiable = financiable;
   }
   public void setPorcentaje(int porcentaje) {
       this.porcentaje = porcentaje;
   }
   public int getEstrato() {
       return estrato;
   }
   public String getFechaInicio() {
       return fechaInicio;
   }
   public int getFinanciable() {
       return financiable;
   }
   public int getPorcentaje() {
       return porcentaje;
   }
    @Override
    public String toString() {
        return "Req2 [estrato=" + estrato + ", fechaInicio=" + fechaInicio + ", financiable=" + financiable + ", porcentaje=" + porcentaje + "]";
    }
}
      