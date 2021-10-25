
package modelo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class CatalogoPeliculas extends JPanel{
     
    private JScrollPane scroll;
    
    public CatalogoPeliculas() {
                  
        setLayout((new GridLayout(2,2)));
        setPreferredSize(new Dimension(460,500));     
        catalogo(); 
        scroll = new JScrollPane(new CatalogoPeliculas());                 
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
        add(m1);       
        
        m2 = new JButton(new ImageIcon());  
        m2.setIcon(new ImageIcon(imag2.getImage().getScaledInstance
        (50,150,Image.SCALE_SMOOTH)));                
        add(m2);     
        
        m3 = new JButton(new ImageIcon());  
        m3.setIcon(new ImageIcon(imag3.getImage().getScaledInstance
        (50, 150,Image.SCALE_SMOOTH)));                
        add(m3);     
        
        m4 = new JButton(new ImageIcon());  
        m4.setIcon(new ImageIcon(imag4.getImage().getScaledInstance
        (50, 150,Image.SCALE_SMOOTH)));                
        add(m4);     

        
    }
}
