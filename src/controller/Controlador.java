package controller;

import model.Req1;
import model.Req2;
import model.Req3;
import model.Conector;

//import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.sql.Statement;  


public class Controlador {
    private ArrayList<Req1> req1s;
    private ArrayList<Req2> req2s;
    private ArrayList<Req3> req3s;
    private Conector conectorDB;
    public Controlador(String url) {


        super();
        this.req1s = new ArrayList<>();
        this.req2s = new ArrayList<>();
        this.req3s = new ArrayList<>();
        conectorDB = new Conector(url);

    }
    public Controlador() {
        super();
    }
    
    public ArrayList<Req1> getReq1s(){
        return req1s;
    }
    public ArrayList<Req2> getReq2s(){
        return req2s;
    }
    public ArrayList<Req3> getReq3s(){
        return req3s;
    }

    public void req1() {

        
        ResultSet rs =conectorDB.getReq1DB();
        try {
            while (rs.next()) {
                Req1 req1 = new Req1(rs.getInt("ID_Proyecto"), rs.getString("Pagado"), rs.getString("Proveedor"), rs.getInt("total")); 
                req1s.add(req1);
                
            }
        } catch (SQLException e) {
           
        }
          
       
               
                

    }
   

    public void req2() {
        ResultSet rs= conectorDB.getReq2DB();
        try {
            while (rs.next()) {
               
                
                req2s.add(new Req2(rs.getInt("Estrato"), rs.getString("fechaInicio"), rs.getInt("Financiable"), rs.getInt("porcentaje")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void req3() {
        ResultSet rs= conectorDB.getReq3DB();
        try {
            while (rs.next()) {
               
                
                req3s.add(new Req3(rs.getString("Clasificacion"), rs.getInt("ID_proyecto"), rs.getString("Pagado")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public String printReq1() {
        String listReq1="";
        for (Req1 req1 : req1s) {
            listReq1+=req1+"\n";
        }
        return listReq1;
    }

    public String printReq2() {
        String listReq2="";
        for (Req2 req2 : req2s) {
            listReq2+=req2+"\n";
        }
        return listReq2;
    }

    public String printReq3() {
        String listReq3="";
        for (Req3 req3 : req3s) {
            listReq3+=req3+"\n";
        }
        return listReq3;
    }
}
