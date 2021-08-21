package view;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.GridLayout;
//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;

public class PanelRequest extends JPanel{
    private JList listRequest;
    private Interfaz interfaz;
    public PanelRequest(Interfaz inter){
        super();
        
        interfaz = inter;
        setLayout(new GridLayout());

        String[] datos = {"Estamos", "En", "Construccion"};
        listRequest =new JList<>(datos);
        add(listRequest);   
    }
}
