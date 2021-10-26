
package modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
 
class CompraTick extends JDialog implements ActionListener{
    
    JPanel panel  = new JPanel();

    CompraTick(Ventana_Principal parent, boolean modal) {
        super(parent,modal);       
        setTitle("Tickets");
        panel.setLayout(null);
        getContentPane().add(panel);
        setLocation(500,250); //localizacion en medio
        setSize(600,275); // tamaÃ±o de la ventana
        componentes();
    }
    private void componentes(){
        etiquetas();
        jcomobox();
        botones(); 
        campotexto();
    }
    private void botones(){
        JButton boton1 = new JButton("Comprar");     
        boton1.setBounds(255,10,100,25);
        panel.add(boton1);
        
        JButton boton2 = new JButton("Cancelar"); 
         boton2.setBounds(255,45,100,25);
        panel.add(boton2);
    }
    private void jcomobox(){       
        String numBoletos[] = {"","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22"};
        JComboBox caja = new JComboBox(numBoletos);
        caja.setBounds(135, 15, 60, 20);
        panel.add(caja);
        String numBoletos2[] = {"","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22"};
        JComboBox caja1 = new JComboBox(numBoletos2);
        caja1.setBounds(135, 45, 60, 20);
        panel.add(caja1);
    }
    private void etiquetas(){
        JLabel etiqueta1 = new JLabel("Boletos Adultos: ");
        etiqueta1.setBounds(25,15,200,20);
        panel.add(etiqueta1);
        
        JLabel etiqueta2 = new JLabel("Boletos Niños: ");
        etiqueta2.setBounds(25,45,200,20);  //primer numero sangria, 2do arriba abajo, posiicones
        panel.add(etiqueta2);
        
        JLabel etiqueta3 = new JLabel("Total: ");
        etiqueta3.setBounds(25,75,200,20);  //primer numero sangria, 2do arriba abajo, posiicones
        panel.add(etiqueta3);
        
        JLabel etiqueta4 = new JLabel("TICKETS");
        etiqueta4.setBounds(175,100,200,20);  //primer numero sangria, 2do arriba abajo, posiicones
        panel.add(etiqueta4);
    }
    private void campotexto(){
        JTextField campotexto1 = new JTextField("$ ");
        campotexto1.setBounds(80,75,100,20);
        panel.add(campotexto1);
        JTextField campotexto2 = new JTextField(" ");
        campotexto2.setBounds(25,125,325,100);
        panel.add(campotexto2);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
   
}
