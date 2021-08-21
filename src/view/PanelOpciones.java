package view;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * PanelOpciones
 */
public class PanelOpciones extends JPanel implements ActionListener{
    public final static String BTN_REQ1="Requerimiento 1";
    public final static String BTN_REQ2="Requerimiento 2";
    public final static String BTN_REQ3="Requerimiento 3";
    
    
    private JButton req1btn;
    private JButton req2btn;
    private JButton req3btn;

    private Interfaz interfaz;

    public PanelOpciones(Interfaz inter) {
        super();

        interfaz=inter;
        setLayout(new GridLayout(3,1));
        setBorder(new TitledBorder("Requerimiento"));
        req1btn=new JButton(BTN_REQ1);
        req2btn=new JButton(BTN_REQ2);
        req3btn=new JButton(BTN_REQ3);

        req1btn.setActionCommand(BTN_REQ1);
        req2btn.setActionCommand(BTN_REQ2);
        req3btn.setActionCommand(BTN_REQ3);
        
        req1btn.addActionListener(this);
        req2btn.addActionListener(this);
        req3btn.addActionListener(this);

        add(req1btn);
        add(req2btn);
        add(req3btn);

            
        }
        public void request1(){
            JOptionPane.showMessageDialog(interfaz, interfaz.request1(), "Requerimiento 1", JOptionPane.PLAIN_MESSAGE);
        }
        public void request2(){
            JOptionPane.showMessageDialog(interfaz, interfaz.request2(), "Requerimiento 1", JOptionPane.PLAIN_MESSAGE);
        }
        public void request3(){
            JOptionPane.showMessageDialog(interfaz, interfaz.request3(), "Requerimiento 1", JOptionPane.PLAIN_MESSAGE);
        }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(BTN_REQ1)){
            request1();
            //System.out.println("Requerimiento1");
        }
        if(e.getActionCommand().equals(BTN_REQ2)){
            request2();
            //System.out.println("Requerimiento2");
        }
        if(e.getActionCommand().equals(BTN_REQ3)){
            request3();
            //System.out.println("Requerimiento3");
        }
        
    } 
}