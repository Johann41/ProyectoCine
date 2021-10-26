
package modelo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JFrame;


public class CatalogoPeliculas extends JDialog implements ActionListener{
     
    private JScrollPane scroll;
    private JPanel panel;
    public CatalogoPeliculas() {
                              
        
    }

    CatalogoPeliculas(Ventana_Principal parent, boolean modal) {
       super(parent,modal);
       setTitle("Catalogo de Peliculas");
       panel = new JPanel();
       panel.setLayout((new GridLayout(2,2)));
       panel.setPreferredSize(new Dimension(1100,600));     
       catalogo(); 
       scroll = new JScrollPane(panel);   
       setBounds(600,400,1100,600);
       add(scroll);         
    }
    
    private void catalogo(){
        
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
        m1.setSize(100,200);
        m1.setIcon(new ImageIcon(imag1.getImage().getScaledInstance               
        (m1.getWidth(), m1.getHeight(),Image.SCALE_SMOOTH)));            
        panel.add(m1);       
        
        m2 = new JButton(new ImageIcon());  
        m2.setIcon(new ImageIcon(imag2.getImage().getScaledInstance
        (50,150,Image.SCALE_SMOOTH)));                
        panel.add(m2);     
        
        m3 = new JButton(new ImageIcon());  
        m3.setIcon(new ImageIcon(imag3.getImage().getScaledInstance
        (50, 150,Image.SCALE_SMOOTH)));                
        panel.add(m3);     
        
        m4 = new JButton(new ImageIcon());  
        m4.setIcon(new ImageIcon(imag4.getImage().getScaledInstance
        (50, 150,Image.SCALE_SMOOTH)));                
        panel.add(m4);     

        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
    }
}
