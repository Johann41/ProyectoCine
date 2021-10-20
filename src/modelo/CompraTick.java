
package modelo;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class CompraTick extends JFrame{
    JPanel panel = new JPanel(); //genera el panel
    private final JComboBox<String> numboletos,numboletos2;
    private static final String[]numBoletos={"","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
                                              "16","17","18","19","20","21","22"};
    
    public CompraTick(){
        super("Venta de Tickets");     //nombre de la ventana          
        
        setLayout(new FlowLayout());
        getContentPane().add(panel);
        componentes();
        
        numboletos = new JComboBox<String>(numBoletos);
        numboletos.setBounds(10,30,150,40);
        numboletos.setMaximumRowCount(7);
        
        numboletos.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent evento) {
            }
        });
        add(numboletos);
        
        numboletos2 = new JComboBox<String>(numBoletos);
        numboletos2.setBounds(10,90,150,40);
        numboletos2.setMaximumRowCount(7);
        
        numboletos2.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent evento) {
            }
        });
        add(numboletos2);
    }

    private void componentes() {
        etiquetas();
        total();
    }

    private void etiquetas() {
        JLabel adultos = new JLabel("Adultos: ");
        adultos.setBounds(160,38,20,20);
        panel.add(adultos);
        JLabel ninos = new JLabel("Niños: ");
        ninos.setBounds(160,90,20,20);
        panel.add(ninos);
        JLabel total = new JLabel("TOTAL");
        total.setBounds(160,90,20,20);
        panel.add(total);
    }

    private void total() {
        JTextField campotexto1 = new JTextField("$",20);
        campotexto1.setBounds(180,35,50,30);
        panel.add(campotexto1);
    }

  
    
}

