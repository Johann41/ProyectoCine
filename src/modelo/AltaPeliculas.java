
package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AltaPeliculas extends JFrame implements ActionListener{
private final JLabel eti1,eti2,eti3,eti4;
private final JTextField txtNombrePelicula,txtHorario;
private final JButton add;
private final JPanel panel;

public AltaPeliculas(){//constructor
    this.setLocationRelativeTo(null);
    eti1=new JLabel("ALTA DE PELÍCULAS");
    eti1.setBounds(140,10,200,20);
    
    eti2=new JLabel("Nombre de Película: ");
    eti2.setBounds(40,60,180,20);
    
    eti3=new JLabel("Horario: ");
    eti3.setBounds(40,100,80,20);
    
    eti4=new JLabel("Ingrese Película y Horario:");
    eti4.setBounds(120,30,200,20);
    
    txtNombrePelicula= new JTextField();
    txtNombrePelicula.setBounds(155,60,200,20);
    
    txtHorario= new JTextField();
    txtHorario.setBounds(87,100,120,20);
    
    add = new JButton("Añadir");
    add.setBounds(225,100,80,20);
    
    panel = new JPanel();
    panel.setLayout(null);
    
    panel.add(eti1);
    panel.add(eti2);
    panel.add(eti3);
    panel.add(eti4);
    panel.add(txtNombrePelicula);
    panel.add(txtHorario);
    panel.add(add);
    
    add(panel);
    setSize(400,200);
    setVisible(true);
    
}

    
    public static void main(String[] args) {
        AltaPeliculas alta = new AltaPeliculas();
        alta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  
    @Override
    public void actionPerformed(ActionEvent e) {}
    
}