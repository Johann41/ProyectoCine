
package modelo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class CatalogoPeliculas extends JDialog implements ActionListener{
     
    private JScrollPane scroll;
    private JPanel panel;
    public CatalogoPeliculas() {
                              
        
    }

    CatalogoPeliculas(Ventana_Principal parent, boolean modal) {
       super(parent,modal);
       setTitle("Catalogo de Peliculas");
       panel = new JPanel();
       panel.setLayout((new GridBagLayout()));   
       panel.setPreferredSize(new Dimension(1100,1800));     
       catalogo(); 
       scroll = new JScrollPane(panel);   
       setBounds(600,400,1100,600);
       setBackground(new java.awt.Color(0, 124, 255));
       add(scroll);         
    }
    
    private void catalogo(){
         
        GridBagConstraints c = new GridBagConstraints();           
        
        //Botones de peliculas  
         JButton m1;
         JButton m2;
         JButton m3;
         JButton m4;  
         
         //Imagen de pelicula
         ImageIcon imag1 = new ImageIcon("movie1.jpg");
         ImageIcon imag2 = new ImageIcon("movie2.jpg");
         ImageIcon imag3 = new ImageIcon("movie3.jpg");
         ImageIcon imag4 = new ImageIcon("movie4.jpeg");
           
        m1 = new JButton(new ImageIcon());                 
        m1.setIcon(new ImageIcon(imag1.getImage().getScaledInstance               
        (500, 900,Image.SCALE_SMOOTH)));      
        m1.setBackground(Color.ORANGE);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(m1,c);       
        
        m2 = new JButton(new ImageIcon());  
        m2.setIcon(new ImageIcon(imag2.getImage().getScaledInstance
        (500, 900,Image.SCALE_SMOOTH)));   
        m2.setBackground(Color.ORANGE);
        c.gridx = 0;
        c.gridy = 1;
        panel.add(m2,c);     
        
        m3 = new JButton(new ImageIcon());  
        m3.setIcon(new ImageIcon(imag3.getImage().getScaledInstance
        (500, 900,Image.SCALE_SMOOTH)));    
        m3.setBackground(Color.ORANGE);
        c.gridx = 1;
        c.gridy = 0;
        panel.add(m3,c);     
        
        m4 = new JButton(new ImageIcon());  
        m4.setIcon(new ImageIcon(imag4.getImage().getScaledInstance
        (500, 900,Image.SCALE_SMOOTH)));       
        m4.setBackground(Color.ORANGE);
        c.gridx = 1;
        c.gridy = 1;
        panel.add(m4,c);     

        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
    }
}
