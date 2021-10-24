
package modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
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
    private JScrollPane scroll = new JScrollPane();
    
    public Ventana_Principal(){        
        super("CINEMA");      
        getContentPane().add(panel);
        
        //Acomodo de paneles              
        menu.setLayout(new GridBagLayout());             
        catalogo.setLayout(new GridLayout(2,2));
        panel.add(menu,BorderLayout.NORTH);               
        panel.add(catalogo,BorderLayout.CENTER);
        catalogo.add(scroll);
        componentes();
        
    }
    
    private void componentes(){
      menu();
      catalogo();       
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
         b1.setFont(new Font("Agency FB",Font.PLAIN,20)); 
         b1.setIcon(new ImageIcon(imag4.getImage().getScaledInstance
        (100, 40,Image.SCALE_SMOOTH)));         
         //catalogo
         menu.add(b1);
        
         b2 = new JButton("Alta de Películas");
         b2.setFont(new Font("Agency FB",Font.PLAIN,20)); 
         b2.setIcon(new ImageIcon(imag1.getImage().getScaledInstance
         (100, 40,Image.SCALE_SMOOTH)));
         //movie
         menu.add(b2);
         
         b3 = new JButton("Venta de Tikects");
         b3.setFont(new Font("Agency FB",Font.PLAIN,20)); 
         b3.setIcon(new ImageIcon(imag2.getImage().getScaledInstance
        (100, 40,Image.SCALE_SMOOTH)));
         //tikets
         menu.add(b3);
         
         b4 = new JButton("Selección de Lugares"); 
         b4.setFont(new Font("Agency FB",Font.PLAIN,20)); 
         b4.setIcon(new ImageIcon(imag3.getImage().getScaledInstance
        (100, 40,Image.SCALE_SMOOTH)));
         //asiento
         menu.add(b4);
 
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
        catalogo.add(m1);       
        
        m2 = new JButton(new ImageIcon());  
        m2.setIcon(new ImageIcon(imag2.getImage().getScaledInstance
        (50,150,Image.SCALE_SMOOTH)));                
        catalogo.add(m2);     
        
        m3 = new JButton(new ImageIcon());  
        m3.setIcon(new ImageIcon(imag3.getImage().getScaledInstance
        (50, 150,Image.SCALE_SMOOTH)));                
        catalogo.add(m3);     
        
        m4 = new JButton(new ImageIcon());  
        m4.setIcon(new ImageIcon(imag4.getImage().getScaledInstance
        (50, 150,Image.SCALE_SMOOTH)));                
        catalogo.add(m4);     

        
    }
}
