
package modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;
import javafx.scene.control.ScrollBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ventana_Principal extends JFrame{
    
    private JPanel panel = new JPanel(); 
    private JPanel menu = new JPanel();
    private JPanel catalogo = new JPanel();
    private JScrollPane scroll=new JScrollPane(catalogo);
    
    public Ventana_Principal(){        
        super("CINEMA");      
        getContentPane().add(panel);
        panel.setLayout(new BorderLayout());
        menu.setLayout(new GridBagLayout());      
        panel.add(scroll,BorderLayout.WEST);
        menu();
        catalogo();
        catalogo.setLayout(new GridBagLayout());
        panel.add(menu,BorderLayout.NORTH);               
        panel.add(catalogo,BorderLayout.CENTER);
        
    }
    
    private void menu(){
         
        menu.setBackground(Color.yellow);
        
        //Botones
         JButton b1;
         JButton b2;
         JButton b3;
         JButton b4;     
         
         //Imagenes
         ImageIcon imag1 = new ImageIcon("movie.png");
         ImageIcon imag2 = new ImageIcon("tikect.png");
         ImageIcon imag3 = new ImageIcon("asiento.png");
         ImageIcon imag4 = new ImageIcon("catalogo.png");
         
 
         b1 = new JButton("Catalogo de películas"); 
         b1.setIcon(new ImageIcon(imag4.getImage().getScaledInstance
        (100, 30,Image.SCALE_SMOOTH)));         
         //catalogo
         menu.add(b1);
        
         b2 = new JButton("Alta de Películas");
         b2.setIcon(new ImageIcon(imag1.getImage().getScaledInstance
         (100, 30,Image.SCALE_SMOOTH)));
         //movie
         menu.add(b2);
         
         b3 = new JButton("Venta de Tikects");
         b3.setIcon(new ImageIcon(imag2.getImage().getScaledInstance
        (100, 30,Image.SCALE_SMOOTH)));
         //tikets
         menu.add(b3);
         
         b4 = new JButton("Selección de Lugares"); 
         b4.setIcon(new ImageIcon(imag3.getImage().getScaledInstance
        (100, 30,Image.SCALE_SMOOTH)));
         //asiento
         menu.add(b4);
 
    }
    private void catalogo(){
        catalogo.setBackground(Color.BLUE);
        JLabel m1 = new JLabel(new ImageIcon("movie1.jpg"));  
        catalogo.add(m1);
        
        JLabel m2 = new JLabel(new ImageIcon("movie2.jpg"));  
        catalogo.add(m2);
        
        JLabel m3 = new JLabel(new ImageIcon("movie3.jpg"));  
        catalogo.add(m3);
        
        JLabel m4 = new JLabel(new ImageIcon("movie4.jpeg"));  
        catalogo.add(m4);
       
        JLabel m5 = new JLabel("Adios");  
        catalogo.add(m5);
   
        
    }
}
