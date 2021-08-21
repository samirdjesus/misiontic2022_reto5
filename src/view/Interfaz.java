package view;

import javax.swing.JFrame;
//import javax.swing.border.Border;

import controller.Controlador;


import java.awt.BorderLayout;
//import java.util.ArrayList;


public class Interfaz extends JFrame{

private PanelOpciones panelOpciones;
private Controlador controla;
private PanelRequest panelRequest;
    public Interfaz() {
        
        super();
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("RETO 5");
        panelOpciones = new PanelOpciones(this);
        panelRequest = new PanelRequest(this);
        controla = new Controlador("jdbc:sqlite:ProyectosConstruccion.db");

        add(panelOpciones, BorderLayout.SOUTH);
        add(panelRequest, BorderLayout.CENTER);
    }
    
      public String request1(){
          
          controla.req1();
          return controla.printReq1();
      }
      public String request2(){
          
        controla.req2();
        return controla.printReq2();
    }
    public String request3(){
          
        controla.req3();
        return controla.printReq3();
    }
    public static void main(String[] args) {
        Interfaz inter = new Interfaz();
        inter.setVisible(true);
    }

}
