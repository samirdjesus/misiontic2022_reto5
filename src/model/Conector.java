package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Conector {
    private Connection connect;
    public Conector(String url) {
        super();
        connectDB(url);
    }

    public ResultSet getReq1DB() {
 
        String sql = "SELECT ID_Proyecto, Pagado, Proveedor, SUM(Cantidad) AS total FROM Compra WHERE Pagado='No' GROUP BY ID_Proyecto HAVING SUM(Cantidad)>50";
        return executeQuery(sql);
    }
    public ResultSet getReq2DB() {
 
        String sql = "SELECT Tipo.Estrato, Proyecto.Fecha_Inicio as fechaInicio, Tipo.Financiable,  Proyecto.Porcentaje_Cuota_Inicial * 100 AS porcentaje FROM Proyecto JOIN Tipo ON(Tipo.ID_Tipo=Proyecto.ID_Tipo) WHERE Tipo.Estrato>=5 AND Tipo.Financiable=0 AND Proyecto.Porcentaje_Cuota_Inicial * 100 >= 30 ORDER BY Fecha_Inicio ASC";
        return executeQuery(sql);
    }
    public ResultSet getReq3DB() {
 
        String sql = "SELECT Proyecto.Clasificacion, Proyecto.ID_Proyecto, Compra.Pagado FROM Compra JOIN Proyecto ON(Compra.ID_Proyecto=Proyecto.ID_Proyecto) JOIN MaterialConstruccion ON(MaterialConstruccion.ID_MaterialConstruccion=Compra.ID_MaterialConstruccion) WHERE (Proyecto.Clasificacion = 'Apartamento' OR  Proyecto.Clasificacion = 'Apartaestudio') AND Compra.Pagado!='Si'   AND MaterialConstruccion.Importado ='Si' AND Proyecto.Acabados = 'No' GROUP BY Proyecto.ID_Proyecto ORDER BY Proyecto.ID_Proyecto";
        return executeQuery(sql);
    }
    public Connection connectDB(String url) {
        try {
                connect = DriverManager.getConnection(url, "root", "");
                if(connect.isValid(30)){
                    System.out.println("Conectado");
                }
                
        } catch (Exception e) {

                System.out.println(e.getMessage());
        }
       
        return connect;
    }
    public ResultSet executeQuery(String sql) {
        ResultSet rs = null;
        try {
            Statement stmt = connect.createStatement();
            rs = stmt.executeQuery(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    
}