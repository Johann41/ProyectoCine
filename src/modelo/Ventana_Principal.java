
package modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ventana_Principal extends JFrame implements ActionListener{   
       
    private JPanel menu;            
    private JScrollPane scrollpaneles1;
    private JScrollPane scrollpaneles2;    
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;   
    
    public Ventana_Principal(){                                     
        
        setTitle("CINEMA");
        setLayout(new BorderLayout()); 
        menu = new JPanel(new GridLayout());
        add(menu,BorderLayout.NORTH); 
        menu();
        menu.setBackground(new java.awt.Color(0, 124, 255));
        setSize(1150,600);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);      
    }
   
    private void menu(){
                
         //Imagenes
         ImageIcon imag1 = new ImageIcon("movie.png");
         ImageIcon imag2 = new ImageIcon("tikect.png");
         ImageIcon imag3 = new ImageIcon("asiento.png");
         ImageIcon imag4 = new ImageIcon("catalogo.png");
           
         b1 = new JButton("Catalogo de películas");     
         b1.setBackground(Color.ORANGE);
         b1.setFont(new Font("Agency FB",Font.BOLD,20)); 
         b1.setIcon(new ImageIcon(imag4.getImage().getScaledInstance
        (100, 40,Image.SCALE_SMOOTH)));         
         //catalogo
         menu.add(b1);
         
   
         b2 = new JButton("Alta de Películas");
         b2.setBackground(Color.ORANGE);
         b2.setFont(new Font("Agency FB",Font.BOLD,20)); 
         b2.setIcon(new ImageIcon(imag1.getImage().getScaledInstance
         (100, 40,Image.SCALE_SMOOTH)));
         //movie
         menu.add(b2);
         
         
         b3 = new JButton("Venta de Tikects");
         b3.setBackground(Color.ORANGE);
         b3.setFont(new Font("Agency FB",Font.BOLD,20)); 
         b3.setIcon(new ImageIcon(imag2.getImage().getScaledInstance
        (100, 40,Image.SCALE_SMOOTH)));
         //tikets
         menu.add(b3);
         
         
         
         b4 = new JButton("Selección de Lugares"); 
         b4.setBackground(Color.ORANGE);
         b4.setFont(new Font("Agency FB",Font.BOLD,20)); 
         b4.setIcon(new ImageIcon(imag3.getImage().getScaledInstance
        (100, 40,Image.SCALE_SMOOTH)));
         //asiento
         menu.add(b4);
         
         
         
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1) //Catalogo          
       new CatalogoPeliculas(this,true).setVisible(true);               
       if(e.getSource()==b2) // AltaP
       new AltaPeliculas(this,true).setVisible(true);     
       if(e.getSource()==b3) //AltaT 
       new CompraTick(this,true).setVisible(true);      
       if(e.getSource()==b4) //Lugares           
       new Lugar(this,true).setVisible(true);          
    }
    
}
