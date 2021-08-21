package model;
public class Req1 {
    private int total;
    private int idProyecto;
    private String pagado;
    private String proveedor;
    public Req1( int idProyecto, String pagado, String proveedor,  int total)
   {
        this.total=total;
        this.idProyecto=idProyecto;
        this.pagado=pagado;
        this.proveedor=proveedor;
    }
    public int getIdProyecto() {
        return idProyecto;
    }
    public String getPagado() {
        return pagado;
    }
    public String getProveedor() {
        return proveedor;
    }
    public int getTotal() {
        return total;
    }
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
    public void setPagado(String pagado) {
        this.pagado = pagado;
    }
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return "Req1 [idProyecto=" + idProyecto + ", pagado=" + pagado + ", proveedor=" + proveedor + ", total=" + total
                + "]";
    }
}
      