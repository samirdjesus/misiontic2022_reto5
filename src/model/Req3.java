package model;


public class Req3 {
    private String clasificacion;
    private int idProyecto;
    private String pagado;
    
    public Req3(String clasificacion, int idProyecto, String pagado)
   {
        this.clasificacion=clasificacion;
        this.idProyecto=idProyecto;
        this.pagado=pagado;
        
    }
    public int getIdProyecto() {
        return idProyecto;
    }
    public String getPagado() {
        return pagado;
    }
  
    public String getClasificacion() {
        return clasificacion;
    }
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
    public void setPagado(String pagado) {
        this.pagado = pagado;
    }
   public void setClasificacion(String clasificacion) {
       this.clasificacion = clasificacion;
   }
   
    public String toString() {
        return "Req3 [clasificación=" + clasificacion + ", idProyecto=" + idProyecto + ", pagado=" + pagado +"]";
    }
}
      